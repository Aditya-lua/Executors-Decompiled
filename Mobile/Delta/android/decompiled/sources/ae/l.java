package ae;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.util.Log;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements zd.k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f343a;
    public final yd.f b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yd.t f346e;

    public l(Context context, Executor executor, n nVar, yd.f fVar, yd.t tVar) {
        this.f343a = context;
        this.b = fVar;
        this.f344c = nVar;
        this.f345d = executor;
        this.f346e = tVar;
    }

    public static /* bridge */ /* synthetic */ void c(l lVar, List list, zd.i0 i0Var) {
        Integer numE = lVar.e(list);
        if (numE == null) {
            return;
        }
        if (numE.intValue() == 0) {
            i0Var.zzc();
        } else {
            i0Var.a(numE.intValue());
        }
    }

    public static /* bridge */ /* synthetic */ void d(l lVar, zd.i0 i0Var) {
        try {
            if (yd.a.f(n0.a(lVar.f343a))) {
                Log.i("SplitCompat", "Splits installed.");
                i0Var.zza();
            } else {
                Log.e("SplitCompat", "Emulating splits failed.");
                i0Var.a(-12);
            }
        } catch (Exception e10) {
            Log.e("SplitCompat", "Error emulating splits.", e10);
            i0Var.a(-12);
        }
    }

    @Override // zd.k0
    public final void a(List list, zd.i0 i0Var) {
        if (!yd.a.g()) {
            throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        }
        this.f345d.execute(new k(this, list, i0Var));
    }

    public final Integer e(List list) {
        FileLock fileLockTryLock;
        int i10;
        try {
            FileChannel channel = new RandomAccessFile(this.b.d(), "rw").getChannel();
            Integer numValueOf = null;
            try {
                try {
                    fileLockTryLock = channel.tryLock();
                } catch (OverlappingFileLockException unused) {
                    fileLockTryLock = null;
                }
                if (fileLockTryLock != null) {
                    try {
                        Log.i("SplitCompat", "Copying splits.");
                        Iterator it = list.iterator();
                        while (true) {
                            i10 = 0;
                            if (!it.hasNext()) {
                                break;
                            }
                            Intent intent = (Intent) it.next();
                            String stringExtra = intent.getStringExtra("split_id");
                            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.f343a.getContentResolver().openAssetFileDescriptor(intent.getData(), "r");
                            try {
                                File fileE = this.b.e(stringExtra);
                                if ((fileE.exists() && fileE.length() != assetFileDescriptorOpenAssetFileDescriptor.getLength()) || !fileE.exists()) {
                                    if (!this.b.g(stringExtra).exists()) {
                                        BufferedInputStream bufferedInputStream = new BufferedInputStream(assetFileDescriptorOpenAssetFileDescriptor.createInputStream());
                                        try {
                                            FileOutputStream fileOutputStream = new FileOutputStream(fileE);
                                            try {
                                                byte[] bArr = new byte[Barcode.FORMAT_AZTEC];
                                                while (true) {
                                                    int i11 = bufferedInputStream.read(bArr);
                                                    if (i11 <= 0) {
                                                        break;
                                                    }
                                                    fileOutputStream.write(bArr, 0, i11);
                                                    try {
                                                        bufferedInputStream.close();
                                                    } catch (Throwable th2) {
                                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                                    }
                                                    throw th;
                                                }
                                                fileOutputStream.close();
                                                bufferedInputStream.close();
                                            } catch (Throwable th3) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (Throwable th4) {
                                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                                                }
                                                throw th3;
                                            }
                                        } catch (Throwable th5) {
                                            bufferedInputStream.close();
                                            throw th5;
                                        }
                                    }
                                }
                                if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                                    assetFileDescriptorOpenAssetFileDescriptor.close();
                                }
                            } catch (Throwable th6) {
                                if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                                    try {
                                        assetFileDescriptorOpenAssetFileDescriptor.close();
                                    } catch (Throwable th7) {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th6, th7);
                                    }
                                }
                                throw th6;
                            }
                            Log.e("SplitCompat", "Error locking files.", e);
                            return -13;
                        }
                        Log.i("SplitCompat", "Splits copied.");
                        try {
                            File[] fileArrListFiles = this.b.b().listFiles();
                            try {
                                if (this.f344c.c(fileArrListFiles) && this.f344c.a(fileArrListFiles)) {
                                    try {
                                        File[] fileArrListFiles2 = this.b.b().listFiles();
                                        Arrays.sort(fileArrListFiles2);
                                        int length = fileArrListFiles2.length;
                                        while (true) {
                                            length--;
                                            if (length < 0) {
                                                break;
                                            }
                                            yd.f.m(fileArrListFiles2[length]);
                                            File file = fileArrListFiles2[length];
                                            file.renameTo(this.b.f(file));
                                        }
                                        Log.i("SplitCompat", "Splits verified.");
                                    } catch (IOException e10) {
                                        Log.e("SplitCompat", "Cannot write verified split.", e10);
                                        i10 = -13;
                                    }
                                } else {
                                    Log.e("SplitCompat", "Split verification failed.");
                                    i10 = -11;
                                }
                            } catch (Exception e11) {
                                Log.e("SplitCompat", "Error verifying splits.", e11);
                            }
                        } catch (IOException e12) {
                            Log.e("SplitCompat", "Cannot access directory for unverified splits.", e12);
                        }
                    } catch (Exception e13) {
                        Log.e("SplitCompat", "Error copying splits.", e13);
                    }
                    numValueOf = Integer.valueOf(i10);
                    fileLockTryLock.release();
                }
                if (channel != null) {
                    channel.close();
                }
                return numValueOf;
            } catch (Throwable th8) {
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (Throwable th9) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th8, th9);
                    }
                }
                throw th8;
            }
        } catch (Exception e14) {
            Log.e("SplitCompat", "Error locking files.", e14);
            return -13;
        }
    }
}
