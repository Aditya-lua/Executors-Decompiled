package androidx.versionedparcelable;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.NetworkOnMainThreadException;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseBooleanArray;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArraySet;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class VersionedParcel {
    private static final int EX_BAD_PARCELABLE = -2;
    private static final int EX_ILLEGAL_ARGUMENT = -3;
    private static final int EX_ILLEGAL_STATE = -5;
    private static final int EX_NETWORK_MAIN_THREAD = -6;
    private static final int EX_NULL_POINTER = -4;
    private static final int EX_PARCELABLE = -9;
    private static final int EX_SECURITY = -1;
    private static final int EX_UNSUPPORTED_OPERATION = -7;
    private static final String TAG = "VersionedParcel";
    private static final int TYPE_BINDER = 5;
    private static final int TYPE_PARCELABLE = 2;
    private static final int TYPE_SERIALIZABLE = 3;
    private static final int TYPE_STRING = 4;
    private static final int TYPE_VERSIONED_PARCELABLE = 1;

    protected abstract void closeField();

    protected abstract VersionedParcel createSubParcel();

    protected abstract boolean readBoolean();

    protected abstract Bundle readBundle();

    protected abstract byte[] readByteArray();

    protected abstract double readDouble();

    protected abstract boolean readField(int i10);

    protected abstract float readFloat();

    protected abstract int readInt();

    protected abstract long readLong();

    protected abstract <T extends Parcelable> T readParcelable();

    protected abstract String readString();

    protected abstract IBinder readStrongBinder();

    protected abstract void setOutputField(int i10);

    protected abstract void writeBoolean(boolean z10);

    protected abstract void writeBundle(Bundle bundle);

    protected abstract void writeByteArray(byte[] bArr);

    protected abstract void writeByteArray(byte[] bArr, int i10, int i11);

    protected abstract void writeDouble(double d10);

    protected abstract void writeFloat(float f10);

    protected abstract void writeInt(int i10);

    protected abstract void writeLong(long j10);

    protected abstract void writeParcelable(Parcelable parcelable);

    protected abstract void writeString(String str);

    protected abstract void writeStrongBinder(IBinder iBinder);

    protected abstract void writeStrongInterface(IInterface iInterface);

    public boolean isStream() {
        return false;
    }

    public void setSerializationFlags(boolean allowSerialization, boolean ignoreParcelables) {
    }

    public void writeStrongInterface(IInterface val, int fieldId) {
        setOutputField(fieldId);
        writeStrongInterface(val);
    }

    public void writeBundle(Bundle val, int fieldId) {
        setOutputField(fieldId);
        writeBundle(val);
    }

    public void writeBoolean(boolean val, int fieldId) {
        setOutputField(fieldId);
        writeBoolean(val);
    }

    public void writeByteArray(byte[] b, int fieldId) {
        setOutputField(fieldId);
        writeByteArray(b);
    }

    public void writeByteArray(byte[] b, int offset, int len, int fieldId) {
        setOutputField(fieldId);
        writeByteArray(b, offset, len);
    }

    public void writeInt(int val, int fieldId) {
        setOutputField(fieldId);
        writeInt(val);
    }

    public void writeLong(long val, int fieldId) {
        setOutputField(fieldId);
        writeLong(val);
    }

    public void writeFloat(float val, int fieldId) {
        setOutputField(fieldId);
        writeFloat(val);
    }

    public void writeDouble(double val, int fieldId) {
        setOutputField(fieldId);
        writeDouble(val);
    }

    public void writeString(String val, int fieldId) {
        setOutputField(fieldId);
        writeString(val);
    }

    public void writeStrongBinder(IBinder val, int fieldId) {
        setOutputField(fieldId);
        writeStrongBinder(val);
    }

    public void writeParcelable(Parcelable p8, int fieldId) {
        setOutputField(fieldId);
        writeParcelable(p8);
    }

    public boolean readBoolean(boolean def, int fieldId) {
        if (!readField(fieldId)) {
            return def;
        }
        return readBoolean();
    }

    public int readInt(int def, int fieldId) {
        if (!readField(fieldId)) {
            return def;
        }
        return readInt();
    }

    public long readLong(long def, int fieldId) {
        if (!readField(fieldId)) {
            return def;
        }
        return readLong();
    }

    public float readFloat(float def, int fieldId) {
        if (!readField(fieldId)) {
            return def;
        }
        return readFloat();
    }

    public double readDouble(double def, int fieldId) {
        if (!readField(fieldId)) {
            return def;
        }
        return readDouble();
    }

    public String readString(String def, int fieldId) {
        if (!readField(fieldId)) {
            return def;
        }
        return readString();
    }

    public IBinder readStrongBinder(IBinder def, int fieldId) {
        if (!readField(fieldId)) {
            return def;
        }
        return readStrongBinder();
    }

    public byte[] readByteArray(byte[] def, int fieldId) {
        if (!readField(fieldId)) {
            return def;
        }
        return readByteArray();
    }

    public <T extends Parcelable> T readParcelable(T t8, int i10) {
        if (!readField(i10)) {
            return t8;
        }
        return (T) readParcelable();
    }

    public Bundle readBundle(Bundle def, int fieldId) {
        if (!readField(fieldId)) {
            return def;
        }
        return readBundle();
    }

    public void writeByte(byte val, int fieldId) {
        setOutputField(fieldId);
        writeInt(val);
    }

    @RequiresApi(api = 21)
    public void writeSize(Size val, int fieldId) {
        setOutputField(fieldId);
        writeBoolean(val != null);
        if (val != null) {
            writeInt(val.getWidth());
            writeInt(val.getHeight());
        }
    }

    @RequiresApi(api = 21)
    public void writeSizeF(SizeF val, int fieldId) {
        setOutputField(fieldId);
        writeBoolean(val != null);
        if (val != null) {
            writeFloat(val.getWidth());
            writeFloat(val.getHeight());
        }
    }

    public void writeSparseBooleanArray(SparseBooleanArray val, int fieldId) {
        setOutputField(fieldId);
        if (val == null) {
            writeInt(-1);
            return;
        }
        int n10 = val.size();
        writeInt(n10);
        for (int i10 = 0; i10 < n10; i10++) {
            writeInt(val.keyAt(i10));
            writeBoolean(val.valueAt(i10));
        }
    }

    public void writeBooleanArray(boolean[] val, int fieldId) {
        setOutputField(fieldId);
        writeBooleanArray(val);
    }

    protected void writeBooleanArray(boolean[] zArr) {
        if (zArr != null) {
            writeInt(zArr.length);
            for (boolean z10 : zArr) {
                writeInt(z10 ? 1 : 0);
            }
            return;
        }
        writeInt(-1);
    }

    public boolean[] readBooleanArray(boolean[] def, int fieldId) {
        if (!readField(fieldId)) {
            return def;
        }
        return readBooleanArray();
    }

    protected boolean[] readBooleanArray() {
        int n10 = readInt();
        if (n10 < 0) {
            return null;
        }
        boolean[] val = new boolean[n10];
        for (int i10 = 0; i10 < n10; i10++) {
            val[i10] = readInt() != 0;
        }
        return val;
    }

    public void writeCharArray(char[] val, int fieldId) {
        setOutputField(fieldId);
        if (val != null) {
            int n10 = val.length;
            writeInt(n10);
            for (char c10 : val) {
                writeInt(c10);
            }
            return;
        }
        writeInt(-1);
    }

    public char[] readCharArray(char[] def, int fieldId) {
        if (!readField(fieldId)) {
            return def;
        }
        int n10 = readInt();
        if (n10 < 0) {
            return null;
        }
        char[] val = new char[n10];
        for (int i10 = 0; i10 < n10; i10++) {
            val[i10] = (char) readInt();
        }
        return val;
    }

    public void writeIntArray(int[] val, int fieldId) {
        setOutputField(fieldId);
        writeIntArray(val);
    }

    protected void writeIntArray(int[] val) {
        if (val != null) {
            int n10 = val.length;
            writeInt(n10);
            for (int i10 : val) {
                writeInt(i10);
            }
            return;
        }
        writeInt(-1);
    }

    public int[] readIntArray(int[] def, int fieldId) {
        if (!readField(fieldId)) {
            return def;
        }
        return readIntArray();
    }

    protected int[] readIntArray() {
        int n10 = readInt();
        if (n10 < 0) {
            return null;
        }
        int[] val = new int[n10];
        for (int i10 = 0; i10 < n10; i10++) {
            val[i10] = readInt();
        }
        return val;
    }

    public void writeLongArray(long[] val, int fieldId) {
        setOutputField(fieldId);
        writeLongArray(val);
    }

    protected void writeLongArray(long[] val) {
        if (val != null) {
            int n10 = val.length;
            writeInt(n10);
            for (long j10 : val) {
                writeLong(j10);
            }
            return;
        }
        writeInt(-1);
    }

    public long[] readLongArray(long[] def, int fieldId) {
        if (!readField(fieldId)) {
            return def;
        }
        return readLongArray();
    }

    protected long[] readLongArray() {
        int n10 = readInt();
        if (n10 < 0) {
            return null;
        }
        long[] val = new long[n10];
        for (int i10 = 0; i10 < n10; i10++) {
            val[i10] = readLong();
        }
        return val;
    }

    public void writeFloatArray(float[] val, int fieldId) {
        setOutputField(fieldId);
        writeFloatArray(val);
    }

    protected void writeFloatArray(float[] val) {
        if (val != null) {
            int n10 = val.length;
            writeInt(n10);
            for (float f10 : val) {
                writeFloat(f10);
            }
            return;
        }
        writeInt(-1);
    }

    public float[] readFloatArray(float[] def, int fieldId) {
        if (!readField(fieldId)) {
            return def;
        }
        return readFloatArray();
    }

    protected float[] readFloatArray() {
        int n10 = readInt();
        if (n10 < 0) {
            return null;
        }
        float[] val = new float[n10];
        for (int i10 = 0; i10 < n10; i10++) {
            val[i10] = readFloat();
        }
        return val;
    }

    public void writeDoubleArray(double[] val, int fieldId) {
        setOutputField(fieldId);
        writeDoubleArray(val);
    }

    protected void writeDoubleArray(double[] val) {
        if (val != null) {
            int n10 = val.length;
            writeInt(n10);
            for (double d10 : val) {
                writeDouble(d10);
            }
            return;
        }
        writeInt(-1);
    }

    public double[] readDoubleArray(double[] def, int fieldId) {
        if (!readField(fieldId)) {
            return def;
        }
        return readDoubleArray();
    }

    protected double[] readDoubleArray() {
        int n10 = readInt();
        if (n10 < 0) {
            return null;
        }
        double[] val = new double[n10];
        for (int i10 = 0; i10 < n10; i10++) {
            val[i10] = readDouble();
        }
        return val;
    }

    public <T> void writeSet(Set<T> val, int fieldId) {
        writeCollection(val, fieldId);
    }

    public <T> void writeList(List<T> val, int fieldId) {
        writeCollection(val, fieldId);
    }

    private <T> void writeCollection(Collection<T> collection, int i10) {
        setOutputField(i10);
        if (collection == null) {
            writeInt(-1);
        }
        int size = collection.size();
        writeInt(size);
        if (size > 0) {
            int type = getType(collection.iterator().next());
            writeInt(type);
            switch (type) {
                case 1:
                    Iterator<T> it = collection.iterator();
                    while (it.hasNext()) {
                        writeVersionedParcelable((VersionedParcelable) it.next());
                    }
                    break;
                case 2:
                    Iterator<T> it2 = collection.iterator();
                    while (it2.hasNext()) {
                        writeParcelable((Parcelable) it2.next());
                    }
                    break;
                case 3:
                    Iterator<T> it3 = collection.iterator();
                    while (it3.hasNext()) {
                        writeSerializable((Serializable) it3.next());
                    }
                    break;
                case 4:
                    Iterator<T> it4 = collection.iterator();
                    while (it4.hasNext()) {
                        writeString((String) it4.next());
                    }
                    break;
                case 5:
                    Iterator<T> it5 = collection.iterator();
                    while (it5.hasNext()) {
                        writeStrongBinder((IBinder) it5.next());
                    }
                    break;
            }
        }
    }

    public <T> void writeArray(T[] val, int fieldId) {
        setOutputField(fieldId);
        writeArray(val);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r3v8, resolved type: java.lang.Object[] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    protected <T> void writeArray(T[] tArr) {
        if (tArr == 0) {
            writeInt(-1);
        }
        int n10 = tArr.length;
        int i10 = 0;
        writeInt(n10);
        if (n10 > 0) {
            int type = getType(tArr[0]);
            writeInt(type);
            switch (type) {
                case 1:
                    while (i10 < n10) {
                        writeVersionedParcelable((VersionedParcelable) tArr[i10]);
                        i10++;
                    }
                    break;
                case 2:
                    while (i10 < n10) {
                        writeParcelable((Parcelable) tArr[i10]);
                        i10++;
                    }
                    break;
                case 3:
                    while (i10 < n10) {
                        writeSerializable((Serializable) tArr[i10]);
                        i10++;
                    }
                    break;
                case 4:
                    while (i10 < n10) {
                        writeString((String) tArr[i10]);
                        i10++;
                    }
                    break;
                case 5:
                    while (i10 < n10) {
                        writeStrongBinder((IBinder) tArr[i10]);
                        i10++;
                    }
                    break;
            }
        }
    }

    private <T> int getType(T t8) {
        if (t8 instanceof String) {
            return 4;
        }
        if (t8 instanceof Parcelable) {
            return 2;
        }
        if (t8 instanceof VersionedParcelable) {
            return 1;
        }
        if (t8 instanceof Serializable) {
            return 3;
        }
        if (t8 instanceof IBinder) {
            return 5;
        }
        throw new IllegalArgumentException(t8.getClass().getName() + " cannot be VersionedParcelled");
    }

    public void writeVersionedParcelable(VersionedParcelable p8, int fieldId) {
        setOutputField(fieldId);
        writeVersionedParcelable(p8);
    }

    protected void writeVersionedParcelable(VersionedParcelable p8) {
        if (p8 == null) {
            writeString(null);
            return;
        }
        writeVersionedParcelableCreator(p8);
        VersionedParcel subParcel = createSubParcel();
        writeToParcel(p8, subParcel);
        subParcel.closeField();
    }

    private void writeVersionedParcelableCreator(VersionedParcelable p8) {
        try {
            Class name = findParcelClass((Class<? extends VersionedParcelable>) p8.getClass());
            writeString(name.getName());
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(p8.getClass().getSimpleName() + " does not have a Parcelizer", e10);
        }
    }

    public void writeSerializable(Serializable s8, int fieldId) {
        setOutputField(fieldId);
        writeSerializable(s8);
    }

    private void writeSerializable(Serializable s8) {
        if (s8 == null) {
            writeString(null);
            return;
        }
        String name = s8.getClass().getName();
        writeString(name);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(s8);
            oos.close();
            writeByteArray(baos.toByteArray());
        } catch (IOException ioe) {
            throw new RuntimeException("VersionedParcelable encountered IOException writing serializable object (name = " + name + ")", ioe);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.lang.Exception */
    /* JADX WARN: Multi-variable type inference failed */
    public void writeException(Exception exc, int fieldId) {
        setOutputField(fieldId);
        if (exc == 0) {
            writeNoException();
            return;
        }
        int code = 0;
        if ((exc instanceof Parcelable) && exc.getClass().getClassLoader() == Parcelable.class.getClassLoader()) {
            code = EX_PARCELABLE;
        } else if (exc instanceof SecurityException) {
            code = -1;
        } else if (exc instanceof BadParcelableException) {
            code = -2;
        } else if (exc instanceof IllegalArgumentException) {
            code = -3;
        } else if (exc instanceof NullPointerException) {
            code = -4;
        } else if (exc instanceof IllegalStateException) {
            code = EX_ILLEGAL_STATE;
        } else if (exc instanceof NetworkOnMainThreadException) {
            code = EX_NETWORK_MAIN_THREAD;
        } else if (exc instanceof UnsupportedOperationException) {
            code = EX_UNSUPPORTED_OPERATION;
        }
        writeInt(code);
        if (code == 0) {
            if (exc instanceof RuntimeException) {
                throw ((RuntimeException) exc);
            }
            throw new RuntimeException(exc);
        }
        writeString(exc.getMessage());
        switch (code) {
            case EX_PARCELABLE /* -9 */:
                writeParcelable((Parcelable) exc);
                return;
            default:
                return;
        }
    }

    protected void writeNoException() {
        writeInt(0);
    }

    public Exception readException(Exception def, int fieldId) {
        int code;
        if (readField(fieldId) && (code = readExceptionCode()) != 0) {
            String msg = readString();
            return readException(code, msg);
        }
        return def;
    }

    private int readExceptionCode() {
        int code = readInt();
        return code;
    }

    private Exception readException(int code, String msg) {
        Exception e10 = createException(code, msg);
        return e10;
    }

    @NonNull
    protected static Throwable getRootCause(@NonNull Throwable t8) {
        while (t8.getCause() != null) {
            t8 = t8.getCause();
        }
        return t8;
    }

    private Exception createException(int code, String msg) {
        switch (code) {
            case EX_PARCELABLE /* -9 */:
                return (Exception) readParcelable();
            case -8:
            default:
                return new RuntimeException("Unknown exception code: " + code + " msg " + msg);
            case EX_UNSUPPORTED_OPERATION /* -7 */:
                return new UnsupportedOperationException(msg);
            case EX_NETWORK_MAIN_THREAD /* -6 */:
                return new NetworkOnMainThreadException();
            case EX_ILLEGAL_STATE /* -5 */:
                return new IllegalStateException(msg);
            case -4:
                return new NullPointerException(msg);
            case -3:
                return new IllegalArgumentException(msg);
            case -2:
                return new BadParcelableException(msg);
            case -1:
                return new SecurityException(msg);
        }
    }

    public byte readByte(byte def, int fieldId) {
        if (!readField(fieldId)) {
            return def;
        }
        return (byte) (readInt() & 255);
    }

    @RequiresApi(api = 21)
    public Size readSize(Size def, int fieldId) {
        if (!readField(fieldId)) {
            return def;
        }
        if (readBoolean()) {
            int width = readInt();
            int height = readInt();
            return new Size(width, height);
        }
        return null;
    }

    @RequiresApi(api = 21)
    public SizeF readSizeF(SizeF def, int fieldId) {
        if (!readField(fieldId)) {
            return def;
        }
        if (readBoolean()) {
            float width = readFloat();
            float height = readFloat();
            return new SizeF(width, height);
        }
        return null;
    }

    public SparseBooleanArray readSparseBooleanArray(SparseBooleanArray def, int fieldId) {
        if (!readField(fieldId)) {
            return def;
        }
        int n10 = readInt();
        if (n10 < 0) {
            return null;
        }
        SparseBooleanArray sa2 = new SparseBooleanArray(n10);
        for (int i10 = 0; i10 < n10; i10++) {
            sa2.put(readInt(), readBoolean());
        }
        return sa2;
    }

    public <T> Set<T> readSet(Set<T> def, int fieldId) {
        if (!readField(fieldId)) {
            return def;
        }
        return (Set) readCollection(fieldId, new ArraySet());
    }

    public <T> List<T> readList(List<T> def, int fieldId) {
        if (!readField(fieldId)) {
            return def;
        }
        return (List) readCollection(fieldId, new ArrayList());
    }

    private <T, S extends Collection<T>> S readCollection(int fieldId, S list) {
        int n10 = readInt();
        if (n10 < 0) {
            return null;
        }
        if (n10 != 0) {
            int type = readInt();
            if (n10 < 0) {
                return null;
            }
            switch (type) {
                case 1:
                    while (n10 > 0) {
                        list.add(readVersionedParcelable());
                        n10--;
                    }
                    break;
                case 2:
                    while (n10 > 0) {
                        list.add(readParcelable());
                        n10--;
                    }
                    break;
                case 3:
                    while (n10 > 0) {
                        list.add(readSerializable());
                        n10--;
                    }
                    break;
                case 4:
                    while (n10 > 0) {
                        list.add(readString());
                        n10--;
                    }
                    break;
                case 5:
                    while (n10 > 0) {
                        list.add(readStrongBinder());
                        n10--;
                    }
                    break;
            }
        }
        return list;
    }

    public <T> T[] readArray(T[] tArr, int i10) {
        if (!readField(i10)) {
            return tArr;
        }
        return (T[]) readArray(tArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    protected <T> T[] readArray(T[] tArr) {
        int i10 = readInt();
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i10);
        if (i10 != 0) {
            int i11 = readInt();
            if (i10 < 0) {
                return null;
            }
            switch (i11) {
                case 1:
                    while (i10 > 0) {
                        arrayList.add(readVersionedParcelable());
                        i10--;
                    }
                    break;
                case 2:
                    while (i10 > 0) {
                        arrayList.add(readParcelable());
                        i10--;
                    }
                    break;
                case 3:
                    while (i10 > 0) {
                        arrayList.add(readSerializable());
                        i10--;
                    }
                    break;
                case 4:
                    while (i10 > 0) {
                        arrayList.add(readString());
                        i10--;
                    }
                    break;
                case 5:
                    while (i10 > 0) {
                        arrayList.add(readStrongBinder());
                        i10--;
                    }
                    break;
            }
        }
        return (T[]) arrayList.toArray(tArr);
    }

    public <T extends VersionedParcelable> T readVersionedParcelable(T t8, int i10) {
        if (!readField(i10)) {
            return t8;
        }
        return (T) readVersionedParcelable();
    }

    protected <T extends VersionedParcelable> T readVersionedParcelable() {
        String string = readString();
        if (string == null) {
            return null;
        }
        return (T) readFromParcel(string, createSubParcel());
    }

    protected Serializable readSerializable() {
        String name = readString();
        if (name == null) {
            return null;
        }
        byte[] serializedData = readByteArray();
        ByteArrayInputStream bais = new ByteArrayInputStream(serializedData);
        try {
            ObjectInputStream ois = new ObjectInputStream(bais) { // from class: androidx.versionedparcelable.VersionedParcel.1
                @Override // java.io.ObjectInputStream
                protected Class<?> resolveClass(ObjectStreamClass osClass) throws ClassNotFoundException {
                    Class<?> c10 = Class.forName(osClass.getName(), false, getClass().getClassLoader());
                    if (c10 != null) {
                        return c10;
                    }
                    return super.resolveClass(osClass);
                }
            };
            return (Serializable) ois.readObject();
        } catch (IOException ioe) {
            throw new RuntimeException("VersionedParcelable encountered IOException reading a Serializable object (name = " + name + ")", ioe);
        } catch (ClassNotFoundException cnfe) {
            throw new RuntimeException("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = " + name + ")", cnfe);
        }
    }

    protected static <T extends VersionedParcelable> T readFromParcel(String parcelCls, VersionedParcel versionedParcel) {
        try {
            return (T) Class.forName(parcelCls, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class).invoke(null, versionedParcel);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    protected static <T extends VersionedParcelable> void writeToParcel(T val, VersionedParcel versionedParcel) {
        try {
            Class cls = findParcelClass(val);
            cls.getDeclaredMethod("write", val.getClass(), VersionedParcel.class).invoke(null, val, versionedParcel);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    private static <T extends VersionedParcelable> Class findParcelClass(T val) {
        return findParcelClass((Class<? extends VersionedParcelable>) val.getClass());
    }

    private static Class findParcelClass(Class<? extends VersionedParcelable> cls) {
        String pkg = cls.getPackage().getName();
        String c10 = String.format("%s.%sParcelizer", pkg, cls.getSimpleName());
        return Class.forName(c10, false, cls.getClassLoader());
    }

    public static class ParcelException extends RuntimeException {
        public ParcelException(Throwable source) {
            super(source);
        }
    }
}
