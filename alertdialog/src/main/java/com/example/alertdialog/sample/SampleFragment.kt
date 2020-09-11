package com.example.alertdialog.sample

import AlertDialogTest
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.example.alertdialog.R
import com.example.alertdialog.sample.dummy.DummyContent
import com.example.alertdialog.sample.dummy.Titles

/**
 * A fragment representing a list of Items.
 */
class SampleFragment : Fragment() {
    private var columnCount = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            columnCount = it.getInt(ARG_COLUMN_COUNT)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sample_list, container, false)

        // Set the adapter
        if (view is RecyclerView) {
            with(view) {
                adapter = object : MyItemRecyclerViewAdapter(DummyContent.ITEMS) {
                    override fun clickItem(dummyItem: DummyContent.DummyItem) {
                        test(dummyItem)
                    }
                }
            }
        }
        return view
    }

    companion object {

        // TODO: Customize parameter argument names
        const val ARG_COLUMN_COUNT = "column-count"

        // TODO: Customize parameter initialization
        @JvmStatic
        fun newInstance(columnCount: Int) =
            SampleFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_COLUMN_COUNT, columnCount)
                }
            }

        fun enter(fragmentManager: FragmentManager, containerId: Int) {
            fragmentManager.beginTransaction().replace(containerId, newInstance(100)).commit()
        }
    }

    fun test(dummyItem: DummyContent.DummyItem) {
        when (Titles.valueOf(dummyItem.content)) {
            Titles.ONLY_TITLE -> AlertDialogTest().onlyTitle(context!!)
            Titles.ONLY_MESSAGE -> AlertDialogTest().onlyMessage(context!!)
            Titles.ONLY_POSITIVE_BUTTON -> AlertDialogTest().onlyPositiveButton(context!!)
            Titles.ONLY_NEGATIVE_BUTTON -> AlertDialogTest().onlyNegativeButton(context!!)
            Titles.ONLY_NATURAL_BUTTON -> AlertDialogTest().onlyNaturalButton(context!!)
            Titles.POSITIVE_NEGATIVE_NATURAL -> AlertDialogTest().positiveNegativeNatural(context!!)

        }
    }
}