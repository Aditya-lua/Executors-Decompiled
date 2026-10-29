package o6;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import e7.x;
import k6.h0;
import k6.i0;
import k6.s;
import k6.v;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m6.t;
import m6.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x6.Options;
import xu.b0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0010"}, d2 = {"Lo6/n;", "Lo6/j;", "Lk6/h0;", "data", "Lx6/p;", "options", "<init>", "(Lk6/h0;Lx6/p;)V", "Lo6/i;", "a", "(Lnt/b;)Ljava/lang/Object;", "", "b", "(Lk6/h0;)Ljava/lang/Void;", "Lk6/h0;", "Lx6/p;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h0 data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Options options;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lo6/n$a;", "Lo6/j$a;", "Lk6/h0;", "<init>", "()V", "data", "", "c", "(Lk6/h0;)Z", "Lx6/p;", "options", "Lk6/s;", "imageLoader", "Lo6/j;", "b", "(Lk6/h0;Lx6/p;Lk6/s;)Lo6/j;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements j.a<h0> {
        private final boolean c(h0 data) {
            return Intrinsics.c(data.getScheme(), "android.resource");
        }

        @Override // o6.j.a
        @Nullable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(@NotNull h0 data, @NotNull Options options, @NotNull s imageLoader) {
            if (c(data)) {
                return new n(data, options);
            }
            return null;
        }
    }

    public n(@NotNull h0 h0Var, @NotNull Options options) {
        this.data = h0Var;
        this.options = options;
    }

    @Override // o6.j
    @Nullable
    public Object a(@NotNull nt.b<? super i> bVar) {
        Integer intOrNull;
        String authority = this.data.getAuthority();
        if (authority != null) {
            if (StringsKt.p0(authority)) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) CollectionsKt.p0(i0.f(this.data));
                if (str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) {
                    b(this.data);
                    throw new jt.d();
                }
                int iIntValue = intOrNull.intValue();
                Context context = this.options.getContext();
                Resources resources = Intrinsics.c(authority, context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
                TypedValue typedValue = new TypedValue();
                resources.getValue(iIntValue, typedValue, true);
                String strB = x.f15217a.b(typedValue.string.toString());
                if (!Intrinsics.c(strB, "text/xml")) {
                    TypedValue typedValue2 = new TypedValue();
                    return new SourceFetchResult(t.a(b0.c(b0.j(resources.openRawResource(iIntValue, typedValue2))), this.options.getFileSystem(), new u(authority, iIntValue, typedValue2.density)), strB, m6.f.DISK);
                }
                Drawable drawableC = Intrinsics.c(authority, context.getPackageName()) ? e7.e.c(context, iIntValue) : e7.e.f(context, resources, iIntValue);
                boolean zJ = e7.i0.j(drawableC);
                if (zJ) {
                    drawableC = new BitmapDrawable(context.getResources(), e7.i.f15192a.a(drawableC, x6.j.j(this.options), this.options.getSize(), this.options.getScale(), this.options.getPrecision() == y6.c.INEXACT));
                }
                return new ImageFetchResult(v.c(drawableC), zJ, m6.f.DISK);
            }
        }
        b(this.data);
        throw new jt.d();
    }

    public final Void b(h0 data) {
        throw new IllegalStateException("Invalid android.resource URI: " + data);
    }
}
