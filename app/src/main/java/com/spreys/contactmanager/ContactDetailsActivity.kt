package com.spreys.contactmanager

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import com.spreys.contactmanager.R.layout.content_contact_details

import kotlinx.android.synthetic.main.activity_contact_details.*

class ContactDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_details)
        setSupportActionBar(toolbar)

        val contact = intent.getStringExtra("CONTACT") as Contact
        contactName.text = contact.firstName
        contactEmail.text = contact.email
        contactPhone.text = contact.mobile

        fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                    .setAction("Action", null).show()
       //     val intent = Intent(Intent.ACTION_, Uri.parse("tel:$this"))
            startActivity(intent)

        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

}
9