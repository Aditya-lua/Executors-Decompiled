package g0;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0012B!\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028G¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058G¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001b\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0011¨\u0006\u001c"}, d2 = {"Lg0/s;", "", "", "", "cameraIds", "Ln0/e2;", "compatibilityId", "<init>", "(Ljava/util/List;Ln0/e2;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/util/List;", "getCameraIds", "()Ljava/util/List;", "b", "Ln0/e2;", "getCompatibilityId", "()Ln0/e2;", "c", "internalId", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> cameraIds;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final n0.e2 compatibilityId;

    /* JADX INFO: renamed from: g0.s$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lg0/s$a;", "", "<init>", "()V", "", "", "cameraIds", "Ln0/e2;", "compatibilityId", "Lg0/s;", "c", "(Ljava/util/List;Ln0/e2;)Lg0/s;", "primaryCameraId", "secondaryCameraId", "b", "(Ljava/lang/String;Ljava/lang/String;Ln0/e2;)Lg0/s;", "Ln0/e;", "primaryInfo", "secondaryInfo", "e", "(Ln0/e;Ln0/e;)Lg0/s;", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ s d(Companion companion, String str, String str2, n0.e2 e2Var, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            if ((i10 & 4) != 0) {
                e2Var = null;
            }
            return companion.b(str, str2, e2Var);
        }

        @NotNull
        public final s a(@NotNull String primaryCameraId) {
            Intrinsics.checkNotNullParameter(primaryCameraId, "primaryCameraId");
            return d(this, primaryCameraId, null, null, 6, null);
        }

        @NotNull
        public final s b(@NotNull String primaryCameraId, @Nullable String secondaryCameraId, @Nullable n0.e2 compatibilityId) {
            Intrinsics.checkNotNullParameter(primaryCameraId, "primaryCameraId");
            List<String> listP = kotlin.collections.p.p(primaryCameraId);
            if (secondaryCameraId != null) {
                listP.add(secondaryCameraId);
            }
            return c(listP, compatibilityId);
        }

        @NotNull
        public final s c(@NotNull List<String> cameraIds, @Nullable n0.e2 compatibilityId) {
            Intrinsics.checkNotNullParameter(cameraIds, "cameraIds");
            return new s(cameraIds, compatibilityId, null);
        }

        @NotNull
        public final s e(@NotNull n0.e primaryInfo, @Nullable n0.e secondaryInfo) {
            Intrinsics.checkNotNullParameter(primaryInfo, "primaryInfo");
            String strE = secondaryInfo != null ? secondaryInfo.e() : null;
            n0.e2 e2VarB0 = primaryInfo.C().b0();
            Intrinsics.checkNotNullExpressionValue(e2VarB0, "getCompatibilityId(...)");
            String strE2 = primaryInfo.e();
            Intrinsics.checkNotNullExpressionValue(strE2, "getCameraId(...)");
            return b(strE2, strE, e2VarB0);
        }

        public Companion() {
        }
    }

    public /* synthetic */ s(List list, n0.e2 e2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, e2Var);
    }

    @NotNull
    public static final s a(@NotNull String str) {
        return INSTANCE.a(str);
    }

    @NotNull
    public static final s b(@NotNull n0.e eVar, @Nullable n0.e eVar2) {
        return INSTANCE.e(eVar, eVar2);
    }

    @NotNull
    public final String c() {
        x2.g.j(this.cameraIds.size() == 1, "getInternalId() is only available for single-camera identifiers.");
        return (String) CollectionsKt.d0(this.cameraIds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof s)) {
            return false;
        }
        s sVar = (s) other;
        return Intrinsics.c(this.cameraIds, sVar.cameraIds) && Intrinsics.c(this.compatibilityId, sVar.compatibilityId);
    }

    public int hashCode() {
        int iHashCode = this.cameraIds.hashCode() * 31;
        n0.e2 e2Var = this.compatibilityId;
        return iHashCode + (e2Var != null ? e2Var.hashCode() : 0);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0037  */
    @NotNull
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CameraIdentifier{cameraIds=");
        sb2.append(CollectionsKt.m0(this.cameraIds, ",", null, null, 0, null, null, 62, null));
        n0.e2 e2Var = this.compatibilityId;
        if (e2Var != null) {
            str = ", compatId=" + e2Var;
            if (str == null) {
                str = "";
            }
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append('}');
        return sb2.toString();
    }

    public s(List<String> list, n0.e2 e2Var) {
        this.cameraIds = list;
        this.compatibilityId = e2Var;
        x2.g.b(!list.isEmpty(), "Camera ID set cannot be empty.");
    }
}
