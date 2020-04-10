# ViewSet_helper
偷懒神器，在field 上使用注解 绑定id， 为textview，imageview设置展示数据




例：

public class shoplistbean {
    @TextviewSetUtil(id = R.id.price,head = "¥")
    private String price;
    @TextviewSetUtil(id= R.id.pic,isiv = true)
    private String focusImg;
    @TextviewSetUtil(id=R.id.title)
    private String title;
    ...
}

shoplistbean item；

TextviewSethelp.bind(item.getClass(),context,item);
