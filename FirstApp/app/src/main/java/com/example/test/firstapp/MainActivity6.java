package com.example.test.firstapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class MainActivity6 extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main10);

        ExpandableListAdapter adapter=new BaseExpandableListAdapter() {
            int [] logos=new int[]{
              R.drawable.blue,R.drawable.btn_minus,R.drawable.btn_plus
            };
            private String[] armTypes=new String[]{"神族兵种","人族兵种","虫族兵种"};
            private String[][] arms=new String[][]{
                    {"狂战士","龙骑士","黑暗圣堂","电兵"},
                    {"机枪兵","护士","幽灵"},
                    {"小狗","刺蛇","飞龙","自爆飞机"}
            };

            private TextView getTextView(){
                AbsListView.LayoutParams lp=new AbsListView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,64);
                TextView textView=new TextView(MainActivity6.this);
                textView.setLayoutParams(lp);
                textView.setGravity(Gravity.CENTER_VERTICAL|Gravity.LEFT);
                textView.setPadding(36,0,0,0);
                textView.setTextSize(20);
                return textView;
            }
            @Override
            public int getGroupCount() {
                return armTypes.length;
            }

            @Override
            public int getChildrenCount(int i) {
                return arms[i].length;
            }

            @Override
            public Object getGroup(int i) {
                return armTypes[i];
            }

            @Override
            public Object getChild(int i, int i1) {
                return arms[i][i1];
            }

            @Override
            public long getGroupId(int i) {
                return i;
            }

            @Override
            public long getChildId(int i, int i1) {
                return i1;
            }

            @Override
            public boolean hasStableIds() {
                return true;
            }

            @Override
            public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
                LinearLayout l1=new LinearLayout(MainActivity6.this);
                l1.setOrientation(LinearLayout.HORIZONTAL);
                ImageView logo=new ImageView(MainActivity6.this);
                logo.setImageResource(logos[i]);
                l1.addView(logo);
                TextView textView=getTextView();
                textView.setText(getGroup(i).toString());
                l1.addView(textView);
                return l1;
            }

            @Override
            public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
                TextView textView=getTextView();
                textView.setText(getChild(groupPosition,childPosition).toString());
                return textView;
            }

            @Override
            public boolean isChildSelectable(int i, int i1) {
                return true;
            }
        };
        ExpandableListView expandableListView=findViewById(R.id.list3);
        expandableListView.setAdapter(adapter);
    }
}
