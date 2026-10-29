package gp;

import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gp.x, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0012\u0010\n¨\u0006\u0018"}, d2 = {"Lgp/x;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "", "localizationKey", "idClass", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "c", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "b", "Ljava/lang/String;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LocalizedTextKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final IdConfig.b side;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String localizationKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String idClass;

    public LocalizedTextKey(@NotNull IdConfig.b side, @NotNull String localizationKey, @Nullable String str) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(localizationKey, "localizationKey");
        this.side = side;
        this.localizationKey = localizationKey;
        this.idClass = str;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getIdClass() {
        return this.idClass;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLocalizationKey() {
        return this.localizationKey;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final IdConfig.b getSide() {
        return this.side;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalizedTextKey)) {
            return false;
        }
        LocalizedTextKey localizedTextKey = (LocalizedTextKey) other;
        return this.side == localizedTextKey.side && Intrinsics.c(this.localizationKey, localizedTextKey.localizationKey) && Intrinsics.c(this.idClass, localizedTextKey.idClass);
    }

    public int hashCode() {
        int iHashCode = ((this.side.hashCode() * 31) + this.localizationKey.hashCode()) * 31;
        String str = this.idClass;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "LocalizedTextKey(side=" + this.side + ", localizationKey=" + this.localizationKey + ", idClass=" + this.idClass + ")";
    }

    public /* synthetic */ LocalizedTextKey(IdConfig.b bVar, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, str, (i10 & 4) != 0 ? null : str2);
    }
}
