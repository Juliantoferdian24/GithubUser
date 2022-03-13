package com.ferdian.githubusersubmission1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ferdian.githubusersubmission1.databinding.ActivityUserDetailBinding
import com.ferdian.githubusersubmission1.model.User

class UserDetailActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityUserDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityUserDetailBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        val user = intent.getParcelableExtra<User>(EXTRA_USER) as User
        mBinding.tvName.text = user.name
        mBinding.tvUsername.text = user.username
        mBinding.tvLocation.text = user.location
        mBinding.tvRepository.text = user.repository
    }

    companion object{
        const val EXTRA_USER = "extra_user"
    }
}