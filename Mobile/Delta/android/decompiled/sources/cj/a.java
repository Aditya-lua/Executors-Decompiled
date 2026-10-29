package cj;

import android.database.AbstractCursor;

/* JADX INFO: loaded from: classes2.dex */
public class a extends AbstractCursor {
    @Override // android.database.AbstractCursor, android.database.Cursor
    public String[] getColumnNames() {
        return new String[]{"Payload"};
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public int getCount() {
        return 1;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public double getDouble(int i10) {
        return 0.0d;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public float getFloat(int i10) {
        return 0.0f;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public int getInt(int i10) {
        return 0;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public long getLong(int i10) {
        return 0L;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public short getShort(int i10) {
        return (short) 0;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public String getString(int i10) {
        return null;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public boolean isNull(int i10) {
        return false;
    }
}
