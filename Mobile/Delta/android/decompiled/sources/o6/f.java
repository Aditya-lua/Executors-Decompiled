package o6;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.io.FileNotFoundException;
import java.util.List;
import k6.h0;
import k6.i0;
import k6.j0;
import k6.s;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m6.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x6.Options;
import xu.b0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000e\u0010\rJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013¨\u0006\u0014"}, d2 = {"Lo6/f;", "Lo6/j;", "Lk6/h0;", "data", "Lx6/p;", "options", "<init>", "(Lk6/h0;Lx6/p;)V", "Lo6/i;", "a", "(Lnt/b;)Ljava/lang/Object;", "", "b", "(Lk6/h0;)Z", "c", "Landroid/os/Bundle;", "d", "()Landroid/os/Bundle;", "Lk6/h0;", "Lx6/p;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h0 data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Options options;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lo6/f$a;", "Lo6/j$a;", "Lk6/h0;", "<init>", "()V", "data", "Lx6/p;", "options", "Lk6/s;", "imageLoader", "Lo6/j;", "b", "(Lk6/h0;Lx6/p;Lk6/s;)Lo6/j;", "", "c", "(Lk6/h0;)Z", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements j.a<h0> {
        @Override // o6.j.a
        @Nullable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(@NotNull h0 data, @NotNull Options options, @NotNull s imageLoader) {
            if (c(data)) {
                return new f(data, options);
            }
            return null;
        }

        public final boolean c(h0 data) {
            return Intrinsics.c(data.getScheme(), "content");
        }
    }

    public f(@NotNull h0 h0Var, @NotNull Options options) {
        this.data = h0Var;
        this.options = options;
    }

    @Override // o6.j
    @Nullable
    public Object a(@NotNull nt.b<? super i> bVar) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        Uri uriA = j0.a(this.data);
        ContentResolver contentResolver = this.options.getContext().getContentResolver();
        if (b(this.data)) {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriA, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + uriA + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT < 29 || !c(this.data)) {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriA, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to open '" + uriA + "'.").toString());
            }
        } else {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFile(uriA, "image/*", d(), null);
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + uriA + "'.").toString());
            }
        }
        return new SourceFetchResult(t.a(b0.c(b0.j(assetFileDescriptorOpenAssetFileDescriptor.createInputStream())), this.options.getFileSystem(), new m6.e(this.data, assetFileDescriptorOpenAssetFileDescriptor)), contentResolver.getType(uriA), m6.f.DISK);
    }

    public final boolean b(@NotNull h0 data) {
        return Intrinsics.c(data.getAuthority(), "com.android.contacts") && Intrinsics.c(CollectionsKt.p0(i0.f(data)), "display_photo");
    }

    public final boolean c(@NotNull h0 data) {
        List<String> listF;
        int size;
        return Intrinsics.c(data.getAuthority(), "media") && (size = (listF = i0.f(data)).size()) >= 3 && Intrinsics.c(listF.get(size + (-3)), "audio") && Intrinsics.c(listF.get(size + (-2)), "albums");
    }

    public final Bundle d() {
        y6.a aVarD = this.options.getSize().d();
        y6.a.C0655a c0655a = aVarD instanceof y6.a.C0655a ? (y6.a.C0655a) aVarD : null;
        if (c0655a == null) {
            return null;
        }
        int px = c0655a.getPx();
        y6.a aVarC = this.options.getSize().c();
        y6.a.C0655a c0655a2 = aVarC instanceof y6.a.C0655a ? (y6.a.C0655a) aVarC : null;
        if (c0655a2 == null) {
            return null;
        }
        int px2 = c0655a2.getPx();
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("android.content.extra.SIZE", new Point(px, px2));
        return bundle;
    }
}
