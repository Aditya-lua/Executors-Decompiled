package il;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p337ol.EnumC9799a;

/* JADX INFO: renamed from: il.a, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u0017"}, m31665d2 = {"Lil/a;", "", "", "light", "dark", "<init>", "(II)V", "Lol/a;", "theme", "c", "(Lol/a;)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class AndroidColorToken {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int light;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int dark;

    public AndroidColorToken(int i10, int i11) {
        this.light = i10;
        this.dark = i11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getDark() {
        return this.dark;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getLight() {
        return this.light;
    }

    /* JADX INFO: renamed from: c */
    public final int m29188c(@NotNull EnumC9799a theme) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        return theme == EnumC9799a.DARK ? this.dark : this.light;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AndroidColorToken)) {
            return false;
        }
        AndroidColorToken androidColorToken = (AndroidColorToken) other;
        return this.light == androidColorToken.light && this.dark == androidColorToken.dark;
    }

    public int hashCode() {
        return (Integer.hashCode(this.light) * 31) + Integer.hashCode(this.dark);
    }

    @NotNull
    public String toString() {
        return "AndroidColorToken(light=" + this.light + ", dark=" + this.dark + ")";
    }
}
