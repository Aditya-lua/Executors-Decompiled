package p287m6;

import android.content.res.AssetFileDescriptor;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p537x6.Options;
import p560xu.AbstractC12938l;
import p560xu.C12931h0;

/* JADX INFO: renamed from: m6.z */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lm6/s;", "Lx6/p;", "options", "", "animated", "Landroid/graphics/ImageDecoder$Source;", "b", "(Lm6/s;Lx6/p;Z)Landroid/graphics/ImageDecoder$Source;", "coil-core_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8452z {
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final ImageDecoder.Source m34231b(@NotNull InterfaceC8445s interfaceC8445s, @NotNull Options options, boolean z10) {
        C12931h0 c12931h0Mo34213X2;
        if (interfaceC8445s.getFileSystem() == AbstractC12938l.SYSTEM && (c12931h0Mo34213X2 = interfaceC8445s.mo34213X2()) != null) {
            return ImageDecoder.createSource(c12931h0Mo34213X2.toFile());
        }
        InterfaceC8445s.a metadata = interfaceC8445s.getMetadata();
        if (metadata instanceof C8427a) {
            return ImageDecoder.createSource(options.getContext().getAssets(), ((C8427a) metadata).getFilePath());
        }
        if ((metadata instanceof C8431e) && Build.VERSION.SDK_INT >= 29) {
            try {
                final AssetFileDescriptor assetFileDescriptor = ((C8431e) metadata).getAssetFileDescriptor();
                Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), OsConstants.SEEK_SET);
                return ImageDecoder.createSource((Callable<AssetFileDescriptor>) new Callable() { // from class: m6.y
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C8452z.m34232c(assetFileDescriptor);
                    }
                });
            } catch (ErrnoException unused) {
                return null;
            }
        }
        if (metadata instanceof C8447u) {
            C8447u c8447u = (C8447u) metadata;
            if (Intrinsics.m31980c(c8447u.getPackageName(), options.getContext().getPackageName())) {
                return ImageDecoder.createSource(options.getContext().getResources(), c8447u.getResId());
            }
        }
        if (!(metadata instanceof C8430d)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30 || !z10 || ((C8430d) metadata).getByteBuffer().isDirect()) {
            return ImageDecoder.createSource(((C8430d) metadata).getByteBuffer());
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final AssetFileDescriptor m34232c(AssetFileDescriptor assetFileDescriptor) {
        return assetFileDescriptor;
    }
}
