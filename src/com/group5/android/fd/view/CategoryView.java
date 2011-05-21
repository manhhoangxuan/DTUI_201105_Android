package com.group5.android.fd.view;

import android.content.Context;

import com.group5.android.fd.entity.CategoryEntity;

public class CategoryView extends AbstractView {
	public CategoryEntity category = null;

	public CategoryView(Context context, CategoryEntity category) {
		super(context);
		setCategory(category);
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
		setTextView(category.categoryName);
		setImage(category.imageM, m_vwImg);
	}

}
