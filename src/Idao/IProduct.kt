package Idao

import Model.Product

interface IProduct {

    fun insert(product : Product) : Boolean

    fun delete(product : Product) : Boolean

    fun update(product : Product) : Boolean

    fun findAll() : ArrayList<Product>

    fun findByName(product : Product) : Boolean


}