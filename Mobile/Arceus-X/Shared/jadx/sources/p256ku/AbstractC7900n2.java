package p256ku;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p395qu.C10734m;

/* JADX INFO: renamed from: ku.n2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0005¢\u0006\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m31665d2 = {"Lku/n2;", "Lku/l0;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "parallelism", "name", "P", "(ILjava/lang/String;)Lku/l0;", "Y", "X", "()Lku/n2;", "immediate", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public abstract class AbstractC7900n2 extends AbstractC7888l0 {
    @Override // p256ku.AbstractC7888l0
    @NotNull
    /* JADX INFO: renamed from: P */
    public AbstractC7888l0 mo32677P(int parallelism, @Nullable String name) {
        C10734m.m40890a(parallelism);
        return C10734m.m40891b(this, name);
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public abstract AbstractC7900n2 mo32847X();

    @Nullable
    /* JADX INFO: renamed from: Y */
    public final String m32848Y() {
        AbstractC7900n2 abstractC7900n2Mo32847X;
        AbstractC7900n2 abstractC7900n2M32645c = C7864g1.m32645c();
        if (this == abstractC7900n2M32645c) {
            return "Dispatchers.Main";
        }
        try {
            abstractC7900n2Mo32847X = abstractC7900n2M32645c.mo32847X();
        } catch (UnsupportedOperationException unused) {
            abstractC7900n2Mo32847X = null;
        }
        if (this == abstractC7900n2Mo32847X) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // p256ku.AbstractC7888l0
    @NotNull
    public String toString() {
        String strM32848Y = m32848Y();
        if (strM32848Y != null) {
            return strM32848Y;
        }
        return C7922t0.m32908a(this) + '@' + C7922t0.m32909b(this);
    }
}
