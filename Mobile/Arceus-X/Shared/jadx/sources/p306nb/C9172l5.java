package p306nb;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.AbstractC1981b1;
import java.util.Objects;

/* JADX INFO: renamed from: nb.l5 */
/* JADX INFO: loaded from: classes.dex */
public final class C9172l5 extends AbstractC1981b1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9204n5 f33176a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9172l5(C9204n5 c9204n5, Context context, String str) {
        super(context, "google_app_measurement_local.db", null, 1);
        Objects.requireNonNull(c9204n5);
        this.f33176a = c9204n5;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e10) {
            throw e10;
        } catch (SQLiteException unused) {
            C9094g7 c9094g7 = this.f33176a.f33067a;
            c9094g7.mo36321a().m37003o().m36911a("Opening the local database failed, dropping and recreating it");
            c9094g7.m36338w();
            if (!c9094g7.mo36324d().getDatabasePath("google_app_measurement_local.db").delete()) {
                c9094g7.mo36321a().m37003o().m36912b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e11) {
                this.f33176a.f33067a.mo36321a().m37003o().m36912b("Failed to open local database. Events will bypass local storage", e11);
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C9310u.m36910b(this.f33176a.f33067a.mo36321a(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        C9310u.m36909a(this.f33176a.f33067a.mo36321a(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", C9204n5.f33258e);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
