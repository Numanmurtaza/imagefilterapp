package com.numanmurtaza.photoediting.filters

import ja.numanmurtaza.photoeditor.PhotoFilter

interface FilterListener {
    fun onFilterSelected(photoFilter: PhotoFilter)
}