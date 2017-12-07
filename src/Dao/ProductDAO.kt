package Dao

import Idao.IProduct
import Model.Product
import java.sql.PreparedStatement
import java.sql.ResultSet

class ProductDAO : IProduct{
    override fun insert(product: Product): Boolean {
        var result = false
        if(product == null){
            return result
        }

        val con = Utils.ConnectionManager.getInstance().connection
        var statement : PreparedStatement? = null

        return false
    }

    override fun delete(product: Product): Boolean {
        return false
    }

    override fun update(product: Product): Boolean {
        return false
    }


    /**
     * 遍历数据库中所有产品的信息;
     * */
    override fun findAll(): ArrayList<Product> {

        val list = ArrayList<Product>()
        var info : Product

        val conn = Utils.ConnectionManager.getInstance().connection
        var statement : PreparedStatement? = null
        var rs : ResultSet? = null

        try{
            statement = conn!!.prepareStatement("select * from product")
            rs = statement.executeQuery()

            while(rs.next()){
                info = Product()
                info.id = rs.getString("id")
                info.name = rs.getString("name")
                info.p_code = rs.getString("p_code")
                info.unit = rs.getString("unit")
                info.price = rs.getDouble("price")
                info.imagfile = rs.getString("imagfile")
                info.note = rs.getString("note")
                list.add(info)
            }
        }catch (e : Exception){
            e.printStackTrace()
        }finally {
            Utils.ConnectionManager.close(rs,statement,conn)
            return list
        }

    }

    override fun findByName(product: Product): Boolean {
        return false
    }

}