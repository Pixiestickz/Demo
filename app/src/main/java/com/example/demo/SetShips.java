package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SetShips extends AppCompatActivity {

    Ocean p1 = new Ocean();
    Button button;
    Point selection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_ships);

        //Call of end of match after game has ended
        endOfMatch();

    }

    public void endOfMatch() {
        //Check to make sure all ships are sunk

        //Run Damage Report

    }

    public void markShip (View v) {
        //get the id of the grid clicked on

        //call the setboats function from ocean

        //update the grid to change colors of where the boat was set

    }

    public void attackShip (View v) {

        //Get the id of the grid clicked on

        //Call oceans fire function

        //if a boat has been hit, update the button by changing color

        //if a boat has been sunk, update the button by disabling
        v.setEnabled(false);
    }

    public static Point getCoord(View v) {
        Point p = null;
        switch(v.getId()) {
            case R.id.button12:

                p = new Point(1,1);
                break;

            case R.id.button13:
                p = new Point(1,2);
                break;

            case R.id.button14:
                p = new Point(1,3);
                break;

            case R.id.button15:
                p = new Point(1,4);
                break;
            case R.id.button16:
                p = new Point(1,5);
                break;

            case R.id.button17:
                p = new Point(1,6);
                break;

            case R.id.button18:
                p = new Point(1,7);
                break;

            case R.id.button19:
                p = new Point(1,8);
                break;

            case R.id.button20:
                p = new Point(2,1);
                break;

            case R.id.button21:
                p = new Point(2,2);
                break;

            case R.id.button22:
                p = new Point(2,3);
                break;

            case R.id.button23:
                p = new Point(2,4);
                break;
            case R.id.button24:
                p = new Point(2,5);
                break;

            case R.id.button25:
                p = new Point(2,6);
                break;

            case R.id.button26:
                p = new Point(2,7);
                break;

            case R.id.button27:
                p = new Point(2,8);
                break;

            case R.id.button28:
                p = new Point(3,1);
                break;

            case R.id.button29:
                p = new Point(3,2);
                break;

            case R.id.button30:
                p = new Point(3,3);
                break;

            case R.id.button31:
                p = new Point(3,4);
                break;

            case R.id.button32:
                p = new Point(3,5);
                break;

            case R.id.button33:
                p = new Point(3,6);
                break;

            case R.id.button34:
                p = new Point(3,7);
                break;

            case R.id.button35:
                p = new Point(3,8);
                break;
            case R.id.button36:
                p = new Point(4,1);
                break;

            case R.id.button37:
                p = new Point(4,2);
                break;

            case R.id.button38:
                p = new Point(4,3);
                break;

            case R.id.button39:
                p = new Point(4,4);
                break;
            case R.id.button40:
                p = new Point(4,5);
                break;

            case R.id.button41:
                p = new Point(4,6);
                break;

            case R.id.button42:
                p = new Point(4,7);
                break;

            case R.id.button43:
                p = new Point(4,8);
                break;

            case R.id.button44:
                p = new Point(5,1);
                break;

            case R.id.button45:
                p = new Point(5,2);
                break;

            case R.id.button46:
                p = new Point(5,3);
                break;

            case R.id.button47:
                p = new Point(5,4);
                break;
            case R.id.button48:
                p = new Point(5,5);
                break;

            case R.id.button49:
                p = new Point(5,6);
                break;

            case R.id.button50:
                p = new Point(5,7);
                break;

            case R.id.button51:
                p = new Point(5,8);
                break;
            case R.id.button52:
                p = new Point(6,1);
                break;

            case R.id.button53:
                p = new Point(6,2);
                break;

            case R.id.button54:
                p = new Point(6,3);
                break;

            case R.id.button55:
                p = new Point(6,4);
                break;
            case R.id.button56:
                p = new Point(6,5);
                break;

            case R.id.button57:
                p = new Point(6,6);
                break;

            case R.id.button58:
                p = new Point(6,7);
                break;

            case R.id.button59:
                p = new Point(6,8);
                break;

            case R.id.button60:
                p = new Point(7,1);
                break;

            case R.id.button61:
                p = new Point(7,2);
                break;

            case R.id.button62:
                p = new Point(7,3);
                break;

            case R.id.button63:
                p = new Point(7,4);
                break;
            case R.id.button64:
                p = new Point(7,5);
                break;

            case R.id.button65:
                p = new Point(7,6);
                break;

            case R.id.button66:
                p = new Point(7,7);
                break;

            case R.id.button67:
                p = new Point(7,8);
                break;
            case R.id.button68:
                p = new Point(8,1);
                break;

            case R.id.button69:
                p = new Point(8,2);
                break;

            case R.id.button70:
                p = new Point(8,3);
                break;

            case R.id.button71:
                p = new Point(8,4);
                break;
            case R.id.button72:
                p = new Point(8,5);
                break;

            case R.id.button73:
                p = new Point(8,6);
                break;

            case R.id.button74:
                p = new Point(8,7);
                break;

            case R.id.button75:
                p = new Point(8,8);
                break;


            //GRID 2

            case R.id.button4:

                p = new Point(1,1);
                break;

            case R.id.button5:
                p = new Point(1,2);
                break;

            case R.id.button8:
                p = new Point(1,3);
                break;

            case R.id.button9:
                p = new Point(1,4);
                break;
            case R.id.button10:
                p = new Point(1,5);
                break;

            case R.id.button11:
                p = new Point(1,6);
                break;

            case R.id.button76:
                p = new Point(1,7);
                break;

            case R.id.button77:
                p = new Point(1,8);
                break;

            case R.id.button78:
                p = new Point(2,1);
                break;

            case R.id.button79:
                p = new Point(2,2);
                break;

            case R.id.button80:
                p = new Point(2,3);
                break;

            case R.id.button81:
                p = new Point(2,4);
                break;
            case R.id.button82:
                p = new Point(2,5);
                break;

            case R.id.button83:
                p = new Point(2,6);
                break;

            case R.id.button84:
                p = new Point(2,7);
                break;

            case R.id.button85:
                p = new Point(2,8);
                break;

            case R.id.button86:
                p = new Point(3,1);
                break;

            case R.id.button87:
                p = new Point(3,2);
                break;

            case R.id.button88:
                p = new Point(3,3);
                break;

            case R.id.button89:
                p = new Point(3,4);
                break;

            case R.id.button90:
                p = new Point(3,5);
                break;

            case R.id.button91:
                p = new Point(3,6);
                break;

            case R.id.button92:
                p = new Point(3,7);
                break;

            case R.id.button93:
                p = new Point(3,8);
                break;
            case R.id.button94:
                p = new Point(4,1);
                break;

            case R.id.button95:
                p = new Point(4,2);
                break;

            case R.id.button96:
                p = new Point(4,3);
                break;

            case R.id.button97:
                p = new Point(4,4);
                break;
            case R.id.button98:
                p = new Point(4,5);
                break;

            case R.id.button99:
                p = new Point(4,6);
                break;

            case R.id.button100:
                p = new Point(4,7);
                break;

            case R.id.button101:
                p = new Point(4,8);
                break;

            case R.id.button102:
                p = new Point(5,1);
                break;

            case R.id.button103:
                p = new Point(5,2);
                break;

            case R.id.button104:
                p = new Point(5,3);
                break;

            case R.id.button105:
                p = new Point(5,4);
                break;
            case R.id.button106:
                p = new Point(5,5);
                break;

            case R.id.button107:
                p = new Point(5,6);
                break;

            case R.id.button108:
                p = new Point(5,7);
                break;

            case R.id.button109:
                p = new Point(5,8);
                break;
            case R.id.button110:
                p = new Point(6,1);
                break;

            case R.id.button111:
                p = new Point(6,2);
                break;

            case R.id.button112:
                p = new Point(6,3);
                break;

            case R.id.button113:
                p = new Point(6,4);
                break;
            case R.id.button114:
                p = new Point(6,5);
                break;

            case R.id.button115:
                p = new Point(6,6);
                break;

            case R.id.button116:
                p = new Point(6,7);
                break;

            case R.id.button117:
                p = new Point(6,8);
                break;

            case R.id.button118:
                p = new Point(7,1);
                break;

            case R.id.button119:
                p = new Point(7,2);
                break;

            case R.id.button120:
                p = new Point(7,3);
                break;

            case R.id.button121:
                p = new Point(7,4);
                break;
            case R.id.button122:
                p = new Point(7,5);
                break;

            case R.id.button123:
                p = new Point(7,6);
                break;

            case R.id.button124:
                p = new Point(7,7);
                break;

            case R.id.button125:
                p = new Point(7,8);
                break;
            case R.id.button126:
                p = new Point(8,1);
                break;

            case R.id.button127:
                p = new Point(8,2);
                break;

            case R.id.button128:
                p = new Point(8,3);
                break;

            case R.id.button129:
                p = new Point(8,4);
                break;
            case R.id.button130:
                p = new Point(8,5);
                break;

            case R.id.button131:
                p = new Point(8,6);
                break;

            case R.id.button132:
                p = new Point(8,7);
                break;

            case R.id.button133:
                p = new Point(8,8);
                break;
            default:
                break;
        }
        return p;
    }



}