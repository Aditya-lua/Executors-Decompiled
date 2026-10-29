package p347p0;

import androidx.p616lifecycle.AbstractC0940a0;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p436t.InterfaceC11464a;

/* JADX INFO: renamed from: p0.m */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"Lp0/m;", "", "<init>", "()V", "I", "O", "Landroidx/lifecycle/a0;", Payload.SOURCE, "Lt/a;", "mapFunction", "a", "(Landroidx/lifecycle/a0;Lt/a;)Landroidx/lifecycle/a0;", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C10097m {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C10097m f36381a = new C10097m();

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <I, O> AbstractC0940a0<O> m38987a(@NotNull AbstractC0940a0<I> source, @NotNull InterfaceC11464a<I, O> mapFunction) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(mapFunction, "mapFunction");
        C10103s c10103s = new C10103s(mapFunction.apply(source.mo4854f()), mapFunction);
        c10103s.m38997u(source);
        return c10103s;
    }
}
