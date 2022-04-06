package com.example.whistleblower


 import android.os.Bundle
 import android.widget.Button
 import androidx.appcompat.app.AlertDialog
 import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var btnn : Button
    
    
    
    //These commented belong to POST method
    

    /*private lateinit var locn : EditText
    private lateinit var names : EditText
    private lateinit var infra : EditText
    private lateinit var btnn : Button */
    //should have var authenticate with firebase

    private lateinit var builder : AlertDialog.Builder




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //IGNORE
       /*locn = findViewById(R.id.loc)
        names = findViewById(R.id.nam)
        infra = findViewById(R.id.rate)
        btnn = findViewById(R.id.btn)

        btnn.setOnClickListener {
            val locnn = locn.text.toString()
            val nnames = names.text.toString()
            val infraa = infra.text.toString()

        } */
        //listener method ends here

        //btn id onclick open alert box
        btnn = findViewById(R.id.btn)


        builder = AlertDialog.Builder(this)

        btnn.setOnClickListener {
            builder.setTitle("Crime Alert")
                .setMessage("Do You want to Report")
                .setCancelable(true)
                .setPositiveButton("Yes"){dialogInterface,it ->
                    dialogInterface.cancel()

                }

                .setNegativeButton("No"){dialogInterface,it ->
                    finish() //close up

                }
                .setNeutralButton( "Sync Help"){dialogInterface,it ->
                    finish()

                    //Toast.makeText(this@MainActivity, "SYNC With FIREBASE",Toast.LENGHT_SHORT).show()

                }

                .show()


        }


    }//Last line to comment if returning to POST Method
}