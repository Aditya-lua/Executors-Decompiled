package p323o6;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p096e7.C4854e;
import p096e7.C4862i;
import p096e7.C4863i0;
import p096e7.C4878x;
import p229jt.C7334d;
import p239k6.C7466h0;
import p239k6.C7468i0;
import p239k6.C7482v;
import p239k6.InterfaceC7479s;
import p287m6.C8446t;
import p287m6.C8447u;
import p287m6.EnumC8432f;
import p315nt.InterfaceC9557b;
import p537x6.C12749j;
import p537x6.Options;
import p560xu.C12919b0;
import p568y6.EnumC13104c;

/* JADX INFO: renamed from: o6.n */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"Lo6/n;", "Lo6/j;", "Lk6/h0;", "data", "Lx6/p;", "options", "<init>", "(Lk6/h0;Lx6/p;)V", "Lo6/i;", "a", "(Lnt/b;)Ljava/lang/Object;", "", "b", "(Lk6/h0;)Ljava/lang/Void;", "Lk6/h0;", "Lx6/p;", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C9706n implements InterfaceC9702j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C7466h0 data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Options options;

    /* JADX INFO: renamed from: o6.n$a */
    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"Lo6/n$a;", "Lo6/j$a;", "Lk6/h0;", "<init>", "()V", "data", "", "c", "(Lk6/h0;)Z", "Lx6/p;", "options", "Lk6/s;", "imageLoader", "Lo6/j;", "b", "(Lk6/h0;Lx6/p;Lk6/s;)Lo6/j;", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements InterfaceC9702j.a<C7466h0> {
        /* JADX INFO: renamed from: c */
        private final boolean m38331c(C7466h0 data) {
            return Intrinsics.m31980c(data.getScheme(), "android.resource");
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lx6/p;Lk6/s;)Lo6/j; */
        @Override // p323o6.InterfaceC9702j.a
        @Nullable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC9702j mo38311a(@NotNull C7466h0 data, @NotNull Options options, @NotNull InterfaceC7479s imageLoader) {
            if (m38331c(data)) {
                return new C9706n(data, options);
            }
            return null;
        }
    }

    public C9706n(@NotNull C7466h0 c7466h0, @NotNull Options options) {
        this.data = c7466h0;
        this.options = options;
    }

    @Override // p323o6.InterfaceC9702j
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo38310a(@NotNull InterfaceC9557b<? super InterfaceC9701i> interfaceC9557b) {
        Integer intOrNull;
        String authority = this.data.getAuthority();
        if (authority != null) {
            if (StringsKt.m32182p0(authority)) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) CollectionsKt.m31718p0(C7468i0.m31027f(this.data));
                if (str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) {
                    m38330b(this.data);
                    throw new C7334d();
                }
                int iIntValue = intOrNull.intValue();
                Context context = this.options.getContext();
                Resources resources = Intrinsics.m31980c(authority, context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
                TypedValue typedValue = new TypedValue();
                resources.getValue(iIntValue, typedValue, true);
                String strM23501b = C4878x.f19580a.m23501b(typedValue.string.toString());
                if (!Intrinsics.m31980c(strM23501b, "text/xml")) {
                    TypedValue typedValue2 = new TypedValue();
                    return new SourceFetchResult(C8446t.m34217a(C12919b0.m47961c(C12919b0.m47968j(resources.openRawResource(iIntValue, typedValue2))), this.options.getFileSystem(), new C8447u(authority, iIntValue, typedValue2.density)), strM23501b, EnumC8432f.DISK);
                }
                Drawable drawableM23427c = Intrinsics.m31980c(authority, context.getPackageName()) ? C4854e.m23427c(context, iIntValue) : C4854e.m23430f(context, resources, iIntValue);
                boolean zM23464j = C4863i0.m23464j(drawableM23427c);
                if (zM23464j) {
                    drawableM23427c = new BitmapDrawable(context.getResources(), C4862i.f19549a.m23452a(drawableM23427c, C12749j.m47593j(this.options), this.options.getSize(), this.options.getScale(), this.options.getPrecision() == EnumC13104c.INEXACT));
                }
                return new ImageFetchResult(C7482v.m31088c(drawableM23427c), zM23464j, EnumC8432f.DISK);
            }
        }
        m38330b(this.data);
        throw new C7334d();
    }

    /* JADX INFO: renamed from: b */
    public final Void m38330b(C7466h0 data) {
        throw new IllegalStateException("Invalid android.resource URI: " + data);
    }
}
