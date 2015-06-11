import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Nolasco on 01/06/2015.
 */
public class conexion extends SQLiteOpenHelper {
    public conexion(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    //creacion de la base de datos
    public void onCreate(SQLiteDatabase bd) {
        bd.execSQL("create table abarrotes (id_abarrote integer primary key unique, nombre text, apellidos text, direccion text, telefono integer,mercancia text_)");
        ;

    }

    @Override
    public void onUpgrade(SQLiteDatabase bd, int i, int i2) {
        bd.execSQL("drop table if exists venta");
        bd.execSQL("create table abarrotes (id_abarrote integer primary key unique, nombre text, apellidos text, direccion text, telefono integer,mercancia text_)");


    }
}
