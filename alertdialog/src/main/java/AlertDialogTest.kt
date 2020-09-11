import android.app.AlertDialog
import android.content.Context
import com.example.alertdialog.R

class AlertDialogTest {
    fun test(context: Context) {
        AlertDialog.Builder(context, R.style.CustomAlertDialog)
            .setTitle("abc")
            .setMessage("def")
            .setPositiveButton("null", null)
            .setNegativeButton("null", null)
            .show()
    }

    fun onlyTitle(context: Context) {
        AlertDialog.Builder(context)
            .setTitle("title")
            .show()
    }

    fun onlyMessage(context: Context) {
        AlertDialog.Builder(context)
            .setMessage("message")
            .show()
    }

    fun onlyPositiveButton(context: Context) {
        AlertDialog.Builder(context)
            .setPositiveButton("positive", null)
            .show()
    }

    fun onlyNegativeButton(context: Context) {
        AlertDialog.Builder(context)
            .setNegativeButton("negative", null)
            .show()
    }

    fun onlyNaturalButton(context: Context) {
        AlertDialog.Builder(context)
            .setNeutralButton("natural", null)
            .show()
    }

    fun positiveNegativeNatural(context: Context) {
        AlertDialog.Builder(context)
            .setPositiveButton("positive", null)
            .setNegativeButton("negative", null)
            .setNeutralButton("natural", null)
            .show()
    }
}