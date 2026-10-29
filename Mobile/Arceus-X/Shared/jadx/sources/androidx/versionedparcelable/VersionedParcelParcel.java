package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
class VersionedParcelParcel extends VersionedParcel {
    private static final boolean DEBUG = false;
    private static final String TAG = "VersionedParcelParcel";
    private int mCurrentField;
    private final int mEnd;
    private int mNextRead;
    private final int mOffset;
    private final Parcel mParcel;
    private final SparseIntArray mPositionLookup;
    private final String mPrefix;

    VersionedParcelParcel(Parcel p8) {
        this(p8, p8.dataPosition(), p8.dataSize(), "");
    }

    VersionedParcelParcel(Parcel p8, int offset, int end, String prefix) {
        this.mPositionLookup = new SparseIntArray();
        this.mCurrentField = -1;
        this.mNextRead = 0;
        this.mParcel = p8;
        this.mOffset = offset;
        this.mEnd = end;
        this.mNextRead = offset;
        this.mPrefix = prefix;
    }

    private int readUntilField(int fieldId) {
        int fid;
        do {
            int i10 = this.mNextRead;
            if (i10 < this.mEnd) {
                this.mParcel.setDataPosition(i10);
                int size = this.mParcel.readInt();
                fid = this.mParcel.readInt();
                this.mNextRead += size;
            } else {
                return -1;
            }
        } while (fid != fieldId);
        return this.mParcel.dataPosition();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean readField(int fieldId) {
        int position = readUntilField(fieldId);
        if (position == -1) {
            return false;
        }
        this.mParcel.setDataPosition(position);
        return true;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void setOutputField(int fieldId) {
        closeField();
        this.mCurrentField = fieldId;
        this.mPositionLookup.put(fieldId, this.mParcel.dataPosition());
        writeInt(0);
        writeInt(fieldId);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void closeField() {
        int i10 = this.mCurrentField;
        if (i10 >= 0) {
            int currentFieldPosition = this.mPositionLookup.get(i10);
            int position = this.mParcel.dataPosition();
            int size = position - currentFieldPosition;
            this.mParcel.setDataPosition(currentFieldPosition);
            this.mParcel.writeInt(size);
            this.mParcel.setDataPosition(position);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected VersionedParcel createSubParcel() {
        Parcel parcel = this.mParcel;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.mNextRead;
        if (i10 == this.mOffset) {
            i10 = this.mEnd;
        }
        return new VersionedParcelParcel(parcel, iDataPosition, i10, this.mPrefix + "  ");
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeByteArray(byte[] b) {
        if (b != null) {
            this.mParcel.writeInt(b.length);
            this.mParcel.writeByteArray(b);
        } else {
            this.mParcel.writeInt(-1);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeByteArray(byte[] b, int offset, int len) {
        if (b != null) {
            this.mParcel.writeInt(b.length);
            this.mParcel.writeByteArray(b, offset, len);
        } else {
            this.mParcel.writeInt(-1);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeInt(int val) {
        this.mParcel.writeInt(val);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeLong(long val) {
        this.mParcel.writeLong(val);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeFloat(float val) {
        this.mParcel.writeFloat(val);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeDouble(double val) {
        this.mParcel.writeDouble(val);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeString(String val) {
        this.mParcel.writeString(val);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeStrongBinder(IBinder val) {
        this.mParcel.writeStrongBinder(val);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeParcelable(Parcelable p8) {
        this.mParcel.writeParcelable(p8, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeBoolean(boolean z10) {
        this.mParcel.writeInt(z10 ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeStrongInterface(IInterface val) {
        this.mParcel.writeStrongInterface(val);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeBundle(Bundle val) {
        this.mParcel.writeBundle(val);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int readInt() {
        return this.mParcel.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public long readLong() {
        return this.mParcel.readLong();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public float readFloat() {
        return this.mParcel.readFloat();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public double readDouble() {
        return this.mParcel.readDouble();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String readString() {
        return this.mParcel.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public IBinder readStrongBinder() {
        return this.mParcel.readStrongBinder();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] readByteArray() {
        int len = this.mParcel.readInt();
        if (len < 0) {
            return null;
        }
        byte[] bytes = new byte[len];
        this.mParcel.readByteArray(bytes);
        return bytes;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public <T extends Parcelable> T readParcelable() {
        return (T) this.mParcel.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public Bundle readBundle() {
        return this.mParcel.readBundle(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean readBoolean() {
        return this.mParcel.readInt() != 0;
    }
}
