package rl;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lrl/a;", "", "", "wireCode", "<init>", "(Ljava/lang/String;II)V", "a", "I", "b", "()I", "c", "d", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum a {
    Rewarded(0),
    Interstitial(1);


    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int wireCode;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ot.a f30768f = ot.b.a(a());

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: rl.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lrl/a$a;", "", "<init>", "()V", "", "wireCode", "Lrl/a;", "a", "(I)Lrl/a;", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final a a(int wireCode) {
            a aVar = a.Rewarded;
            if (wireCode != aVar.getWireCode()) {
                a aVar2 = a.Interstitial;
                if (wireCode == aVar2.getWireCode()) {
                    return aVar2;
                }
            }
            return aVar;
        }

        public Companion() {
        }
    }

    a(int i10) {
        this.wireCode = i10;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getWireCode() {
        return this.wireCode;
    }
}
