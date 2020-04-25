# ViewSet_helper
偷懒神器，在field 上使用注解 绑定id， 为textview，imageview设置展示数据




例：

public class shoplistbean extends Context_IF{

    @ViewSet(id = R.id.price,head = "¥")//设置textview（head: 前缀 foot:后缀  都可空值）
    private String price;
    
    @ViewSet(id= R.id.pic,isiv = true)//设置imageview
    private String focusImg;
    
    @ViewSet(id=R.id.title)
    private String title;
    
    @viewonclick(R.id.adress)
    public void click(){//adress 控件的点击事件
       //dosomething
    }
    @DoSomething_logic
    public void setview(){
        //可进行复杂操作
        例：
        if(hospitalName.contains("杭州")){
             hospitalName=hospitalName.replace("杭州","已替换");
        }
        ((TextView)getView_IF().findViewById(R.id.name)).setText(hospitalName);
    }
    ...
}

@setContext
public class Context_IF {
    public transient View view_IF = null;
    public transient Activity activity_IF = null;
    public transient Context CONTEXT_IF = null;

    public View getView_IF() {
        if(view_IF != null){
            return view_IF;
        }
        if(activity_IF != null){
            return activity_IF.getWindow().getDecorView();
        }
        try {
            if(CONTEXT_IF != null){
                return ((Activity)CONTEXT_IF).getWindow().getDecorView();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public void setView_IF(View view_IF) {
        this.view_IF = view_IF;
    }
    public Activity getActivity_IF() {
        if(activity_IF != null){
            return activity_IF;
        }
        try {
            if(view_IF !=null){
                return (Activity) view_IF.getContext();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if(CONTEXT_IF != null){
                return (Activity) CONTEXT_IF;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public void setActivity_IF(Activity activity_IF) {
        this.activity_IF = activity_IF;
    }
    public Context getCONTEXT_IF() {
        if(CONTEXT_IF != null){
            return CONTEXT_IF;
        }
        if(view_IF != null){
            return view_IF.getContext();
        }
        if(activity_IF != null){
            return activity_IF;
        }
        return null;
    }
    public void setCONTEXT_IF(Context CONTEXT_IF) {
        this.CONTEXT_IF = CONTEXT_IF;
    }
}



shoplistbean item；


GuiBhelp.bind(item.getClass(),context,item);//具体实现查看GuiBhelp 类
GuiBhelp.setview(item.getClass(),context,item);
