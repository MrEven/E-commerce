package com.taotao.service;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.common.utlis.TaotaoResult;
import com.taotao.pojo.TbItem;

public interface ItemService {
	// 根据商品ID获取商品
	TbItem getItemById(long itemId);

	// 获取商品列表带分页
	EUDataGridResult getItemList(int page, int rows);

	// 添加商品
	TaotaoResult createItem(TbItem item);
}
