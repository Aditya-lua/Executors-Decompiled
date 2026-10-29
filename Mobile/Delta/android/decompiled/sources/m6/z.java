package m6;

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
import x6.Options;
import xu.h0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lm6/s;", "Lx6/p;", "options", "", "animated", "Landroid/graphics/ImageDecoder$Source;", "b", "(Lm6/s;Lx6/p;Z)Landroid/graphics/ImageDecoder$Source;", "coil-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class z {
    @Nullable
    public static final ImageDecoder.Source b(@NotNull s sVar, @NotNull Options options, boolean z10) {
        h0 h0VarX2;
        if (sVar.getFileSystem() == xu.l.SYSTEM && (h0VarX2 = sVar.X2()) != null) {
            return ImageDecoder.createSource(h0VarX2.toFile());
        }
        s.a metadata = sVar.getMetadata();
        if (metadata instanceof a) {
            return ImageDecoder.createSource(options.getContext().getAssets(), ((a) metadata).getFilePath());
        }
        if ((metadata instanceof e) && Build.VERSION.SDK_INT >= 29) {
            try {
                final AssetFileDescriptor assetFileDescriptor = ((e) metadata).getAssetFileDescriptor();
                Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), OsConstants.SEEK_SET);
                return ImageDecoder.createSource((Callable<AssetFileDescriptor>) new Callable() { // from class: m6.y
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return z.c(assetFileDescriptor);
                    }
                });
            } catch (ErrnoException unused) {
                return null;
            }
        }
        if (metadata instanceof u) {
            u uVar = (u) metadata;
            if (Intrinsics.c(uVar.getPackageName(), options.getContext().getPackageName())) {
                return ImageDecoder.createSource(options.getContext().getResources(), uVar.getResId());
            }
        }
        if (!(metadata instanceof d)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30 || !z10 || ((d) metadata).getByteBuffer().isDirect()) {
            return ImageDecoder.createSource(((d) metadata).getByteBuffer());
        }
        return null;
    }

    public static final AssetFileDescriptor c(AssetFileDescriptor assetFileDescriptor) {
        return assetFileDescriptor;
    }
}
