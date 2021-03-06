package com.submisi2.githubuser.database

import android.net.Uri
import android.provider.BaseColumns

object DatabaseContract {
    const val AUTHORITY = "com.submisi2.githubuser"
    const val SCHEME = "content"

    class FavoriteColumns : BaseColumns {
        companion object {
            const val TABLE_NAME = "github_user"
            const val _ID = "_id"
            const val USERNAME = "username"
            const val NAME = "name"
            const val AVATAR_URL = "avatar_url"
            const val COMPANY = "company"
            const val LOCATION = "location"
            const val PUBLIC_REPOS = "public_repos"
            const val FOLLOWING = "following"
            const val FOLLOWERS = "followers"


            val CONTENT_URI: Uri = Uri.Builder().scheme(SCHEME)
                .authority(AUTHORITY)
                .appendPath(TABLE_NAME)
                .build()
        }
    }
}