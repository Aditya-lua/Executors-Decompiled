package be;

import ae.InterfaceC0168i0;
import ae.InterfaceC0172k0;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.util.Log;
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
import p601zd.C13772a;
import p601zd.C13777f;
import p601zd.C13791t;

/* JADX INFO: renamed from: be.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C1338l implements InterfaceC0172k0 {

    /* JADX INFO: renamed from: a */
    public final Context f5379a;

    /* JADX INFO: renamed from: b */
    public final C13777f f5380b;

    /* JADX INFO: renamed from: c */
    public final C1344n f5381c;

    /* JADX INFO: renamed from: d */
    public final Executor f5382d;

    /* JADX INFO: renamed from: e */
    public final C13791t f5383e;

    public C1338l(Context context, Executor executor, C1344n c1344n, C13777f c13777f, C13791t c13791t) {
        this.f5379a = context;
        this.f5380b = c13777f;
        this.f5381c = c1344n;
        this.f5382d = executor;
        this.f5383e = c13791t;
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ void m7181c(C1338l c1338l, List list, InterfaceC0168i0 interfaceC0168i0) {
        Integer numM7183e = c1338l.m7183e(list);
        if (numM7183e == null) {
            return;
        }
        if (numM7183e.intValue() == 0) {
            interfaceC0168i0.zzc();
        } else {
            interfaceC0168i0.mo524a(numM7183e.intValue());
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ void m7182d(C1338l c1338l, InterfaceC0168i0 interfaceC0168i0) {
        try {
            if (C13772a.m50193f(C1345n0.m7192a(c1338l.f5379a))) {
                Log.i("SplitCompat", "Splits installed.");
                interfaceC0168i0.zza();
            } else {
                Log.e("SplitCompat", "Emulating splits failed.");
                interfaceC0168i0.mo524a(-12);
            }
        } catch (Exception e10) {
            Log.e("SplitCompat", "Error emulating splits.", e10);
            interfaceC0168i0.mo524a(-12);
        }
    }

    @Override // ae.InterfaceC0172k0
    /* JADX INFO: renamed from: a */
    public final void mo528a(List list, InterfaceC0168i0 interfaceC0168i0) {
        if (!C13772a.m50194g()) {
            throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        }
        this.f5382d.execute(new RunnableC1335k(this, list, interfaceC0168i0));
    }

    /* JADX INFO: renamed from: e */
    public final Integer m7183e(List list) {
        FileLock fileLockTryLock;
        int i10;
        try {
            FileChannel channel = new RandomAccessFile(this.f5380b.m50215d(), "rw").getChannel();
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
                            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.f5379a.getContentResolver().openAssetFileDescriptor(intent.getData(), "r");
                            try {
                                File fileM50216e = this.f5380b.m50216e(stringExtra);
                                if ((fileM50216e.exists() && fileM50216e.length() != assetFileDescriptorOpenAssetFileDescriptor.getLength()) || !fileM50216e.exists()) {
                                    if (!this.f5380b.m50218g(stringExtra).exists()) {
                                        BufferedInputStream bufferedInputStream = new BufferedInputStream(assetFileDescriptorOpenAssetFileDescriptor.createInputStream());
                                        try {
                                            FileOutputStream fileOutputStream = new FileOutputStream(fileM50216e);
                                            try {
                                                byte[] bArr = new byte[4096];
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
                            File[] fileArrListFiles = this.f5380b.m50213b().listFiles();
                            try {
                                if (this.f5381c.m7190c(fileArrListFiles) && this.f5381c.m7188a(fileArrListFiles)) {
                                    try {
                                        File[] fileArrListFiles2 = this.f5380b.m50213b().listFiles();
                                        Arrays.sort(fileArrListFiles2);
                                        int length = fileArrListFiles2.length;
                                        while (true) {
                                            length--;
                                            if (length < 0) {
                                                break;
                                            }
                                            C13777f.m50207m(fileArrListFiles2[length]);
                                            File file = fileArrListFiles2[length];
                                            file.renameTo(this.f5380b.m50217f(file));
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
