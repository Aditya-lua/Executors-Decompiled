package sp;

import android.content.Context;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lsp/d;", "Lsp/f;", "<init>", "()V", "Landroid/content/Context;", "context", "Lvd/c;", "create", "(Landroid/content/Context;)Lvd/c;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f {
    @Override // sp.f
    @NotNull
    public vd.c create(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        vd.c cVarA = IntegrityManagerFactory.a(context);
        Intrinsics.checkNotNullExpressionValue(cVarA, "createStandard(...)");
        return cVarA;
    }
}
