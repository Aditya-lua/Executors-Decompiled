package p111ep;

import android.content.Context;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC11571c;

/* JADX INFO: renamed from: ep.d */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lep/d;", "Lep/f;", "<init>", "()V", "Landroid/content/Context;", "context", "Ltd/c;", "create", "(Landroid/content/Context;)Ltd/c;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5177d implements InterfaceC5179f {
    @Override // p111ep.InterfaceC5179f
    @NotNull
    public InterfaceC11571c create(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        InterfaceC11571c interfaceC11571cM13346a = IntegrityManagerFactory.m13346a(context);
        Intrinsics.checkNotNullExpressionValue(interfaceC11571cM13346a, "createStandard(...)");
        return interfaceC11571cM13346a;
    }
}
