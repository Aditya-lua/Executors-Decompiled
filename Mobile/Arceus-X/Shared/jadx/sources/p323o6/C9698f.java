package p323o6;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.io.FileNotFoundException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p239k6.C7466h0;
import p239k6.C7468i0;
import p239k6.C7470j0;
import p239k6.InterfaceC7479s;
import p287m6.C8431e;
import p287m6.C8446t;
import p287m6.EnumC8432f;
import p315nt.InterfaceC9557b;
import p537x6.Options;
import p560xu.C12919b0;
import p568y6.InterfaceC13102a;

/* JADX INFO: renamed from: o6.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000e\u0010\rJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Lo6/f;", "Lo6/j;", "Lk6/h0;", "data", "Lx6/p;", "options", "<init>", "(Lk6/h0;Lx6/p;)V", "Lo6/i;", "a", "(Lnt/b;)Ljava/lang/Object;", "", "b", "(Lk6/h0;)Z", "c", "Landroid/os/Bundle;", "d", "()Landroid/os/Bundle;", "Lk6/h0;", "Lx6/p;", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C9698f implements InterfaceC9702j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C7466h0 data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Options options;

    /* JADX INFO: renamed from: o6.f$a */
    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"Lo6/f$a;", "Lo6/j$a;", "Lk6/h0;", "<init>", "()V", "data", "Lx6/p;", "options", "Lk6/s;", "imageLoader", "Lo6/j;", "b", "(Lk6/h0;Lx6/p;Lk6/s;)Lo6/j;", "", "c", "(Lk6/h0;)Z", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements InterfaceC9702j.a<C7466h0> {
        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lx6/p;Lk6/s;)Lo6/j; */
        @Override // p323o6.InterfaceC9702j.a
        @Nullable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC9702j mo38311a(@NotNull C7466h0 data, @NotNull Options options, @NotNull InterfaceC7479s imageLoader) {
            if (m38321c(data)) {
                return new C9698f(data, options);
            }
            return null;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m38321c(C7466h0 data) {
            return Intrinsics.m31980c(data.getScheme(), "content");
        }
    }

    public C9698f(@NotNull C7466h0 c7466h0, @NotNull Options options) {
        this.data = c7466h0;
        this.options = options;
    }

    @Override // p323o6.InterfaceC9702j
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo38310a(@NotNull InterfaceC9557b<? super InterfaceC9701i> interfaceC9557b) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        Uri uriM31053a = C7470j0.m31053a(this.data);
        ContentResolver contentResolver = this.options.getContext().getContentResolver();
        if (m38317b(this.data)) {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriM31053a, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + uriM31053a + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT < 29 || !m38318c(this.data)) {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriM31053a, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to open '" + uriM31053a + "'.").toString());
            }
        } else {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFile(uriM31053a, "image/*", m38319d(), null);
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + uriM31053a + "'.").toString());
            }
        }
        return new SourceFetchResult(C8446t.m34217a(C12919b0.m47961c(C12919b0.m47968j(assetFileDescriptorOpenAssetFileDescriptor.createInputStream())), this.options.getFileSystem(), new C8431e(this.data, assetFileDescriptorOpenAssetFileDescriptor)), contentResolver.getType(uriM31053a), EnumC8432f.DISK);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m38317b(@NotNull C7466h0 data) {
        return Intrinsics.m31980c(data.getAuthority(), "com.android.contacts") && Intrinsics.m31980c(CollectionsKt.m31718p0(C7468i0.m31027f(data)), "display_photo");
    }

    /* JADX INFO: renamed from: c */
    public final boolean m38318c(@NotNull C7466h0 data) {
        List<String> listM31027f;
        int size;
        return Intrinsics.m31980c(data.getAuthority(), "media") && (size = (listM31027f = C7468i0.m31027f(data)).size()) >= 3 && Intrinsics.m31980c(listM31027f.get(size + (-3)), "audio") && Intrinsics.m31980c(listM31027f.get(size + (-2)), "albums");
    }

    /* JADX INFO: renamed from: d */
    public final Bundle m38319d() {
        InterfaceC13102a interfaceC13102aM48711d = this.options.getSize().m48711d();
        InterfaceC13102a.a aVar = interfaceC13102aM48711d instanceof InterfaceC13102a.a ? (InterfaceC13102a.a) interfaceC13102aM48711d : null;
        if (aVar == null) {
            return null;
        }
        int px = aVar.getPx();
        InterfaceC13102a interfaceC13102aM48710c = this.options.getSize().m48710c();
        InterfaceC13102a.a aVar2 = interfaceC13102aM48710c instanceof InterfaceC13102a.a ? (InterfaceC13102a.a) interfaceC13102aM48710c : null;
        if (aVar2 == null) {
            return null;
        }
        int px2 = aVar2.getPx();
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("android.content.extra.SIZE", new Point(px, px2));
        return bundle;
    }
}
