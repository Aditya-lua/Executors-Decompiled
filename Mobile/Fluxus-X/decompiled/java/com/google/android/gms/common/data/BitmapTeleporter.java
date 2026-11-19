package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import n9.f;
import o9.s;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
public class BitmapTeleporter extends p9.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ParcelFileDescriptor f6135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Bitmap f6137i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6138j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public File f6139k;

    public BitmapTeleporter(int i10, ParcelFileDescriptor parcelFileDescriptor, int i11) {
        this.f6134f = i10;
        this.f6135g = parcelFileDescriptor;
        this.f6136h = i11;
    }

    public static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e10) {
            Log.w("BitmapTeleporter", "Could not close stream", e10);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        if (this.f6135g == null) {
            Bitmap bitmap = (Bitmap) s.l(this.f6137i);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(byteBufferAllocate);
            byte[] bArrArray = byteBufferAllocate.array();
            File file = this.f6139k;
            if (file == null) {
                throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
            }
            try {
                File fileCreateTempFile = File.createTempFile("teleporter", ".tmp", file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                    this.f6135g = ParcelFileDescriptor.open(fileCreateTempFile, 268435456);
                    fileCreateTempFile.delete();
                    DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(fileOutputStream));
                    try {
                        try {
                            dataOutputStream.writeInt(bArrArray.length);
                            dataOutputStream.writeInt(bitmap.getWidth());
                            dataOutputStream.writeInt(bitmap.getHeight());
                            dataOutputStream.writeUTF(bitmap.getConfig().toString());
                            dataOutputStream.write(bArrArray);
                            a(dataOutputStream);
                        } catch (IOException e10) {
                            throw new IllegalStateException("Could not write into unlinked file", e10);
                        }
                    } catch (Throwable th2) {
                        a(dataOutputStream);
                        throw th2;
                    }
                } catch (FileNotFoundException unused) {
                    throw new IllegalStateException("Temporary file is somehow already deleted");
                }
            } catch (IOException e11) {
                throw new IllegalStateException("Could not create temporary file", e11);
            }
        }
        int iA = c.a(parcel);
        c.n(parcel, 1, this.f6134f);
        c.t(parcel, 2, this.f6135g, i10 | 1, false);
        c.n(parcel, 3, this.f6136h);
        c.b(parcel, iA);
        this.f6135g = null;
    }
}
