package p140g0;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p296n0.AbstractC8745e2;
import p296n0.C8742e;
import p533x2.C12637g;

/* JADX INFO: renamed from: g0.s */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0012B!\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028G¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058G¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001b\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0011¨\u0006\u001c"}, m31665d2 = {"Lg0/s;", "", "", "", "cameraIds", "Ln0/e2;", "compatibilityId", "<init>", "(Ljava/util/List;Ln0/e2;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/util/List;", "getCameraIds", "()Ljava/util/List;", "b", "Ln0/e2;", "getCompatibilityId", "()Ln0/e2;", "c", "internalId", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C5933s {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<String> cameraIds;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final AbstractC8745e2 compatibilityId;

    /* JADX INFO: renamed from: g0.s$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m31665d2 = {"Lg0/s$a;", "", "<init>", "()V", "", "", "cameraIds", "Ln0/e2;", "compatibilityId", "Lg0/s;", "c", "(Ljava/util/List;Ln0/e2;)Lg0/s;", "primaryCameraId", "secondaryCameraId", "b", "(Ljava/lang/String;Ljava/lang/String;Ln0/e2;)Lg0/s;", "Ln0/e;", "primaryInfo", "secondaryInfo", "e", "(Ln0/e;Ln0/e;)Lg0/s;", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: g0.s.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ C5933s m26577d(Companion companion, String str, String str2, AbstractC8745e2 abstractC8745e2, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            if ((i10 & 4) != 0) {
                abstractC8745e2 = null;
            }
            return companion.m26579b(str, str2, abstractC8745e2);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C5933s m26578a(@NotNull String primaryCameraId) {
            Intrinsics.checkNotNullParameter(primaryCameraId, "primaryCameraId");
            return m26577d(this, primaryCameraId, null, null, 6, null);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C5933s m26579b(@NotNull String primaryCameraId, @Nullable String secondaryCameraId, @Nullable AbstractC8745e2 compatibilityId) {
            Intrinsics.checkNotNullParameter(primaryCameraId, "primaryCameraId");
            List<String> listM31897p = C7699p.m31897p(primaryCameraId);
            if (secondaryCameraId != null) {
                listM31897p.add(secondaryCameraId);
            }
            return m26580c(listM31897p, compatibilityId);
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final C5933s m26580c(@NotNull List<String> cameraIds, @Nullable AbstractC8745e2 compatibilityId) {
            Intrinsics.checkNotNullParameter(cameraIds, "cameraIds");
            return new C5933s(cameraIds, compatibilityId, null);
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final C5933s m26581e(@NotNull C8742e primaryInfo, @Nullable C8742e secondaryInfo) {
            Intrinsics.checkNotNullParameter(primaryInfo, "primaryInfo");
            String strMo6750e = secondaryInfo != null ? secondaryInfo.mo6750e() : null;
            AbstractC8745e2 abstractC8745e2Mo35135b0 = primaryInfo.m35068C().mo35135b0();
            Intrinsics.checkNotNullExpressionValue(abstractC8745e2Mo35135b0, "getCompatibilityId(...)");
            String strMo6750e2 = primaryInfo.mo6750e();
            Intrinsics.checkNotNullExpressionValue(strMo6750e2, "getCameraId(...)");
            return m26579b(strMo6750e2, strMo6750e, abstractC8745e2Mo35135b0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.util.List), (r2v0 n0.e2) A[MD:(java.util.List<java.lang.String>, n0.e2):void (m)] (LINE:1) call: g0.s.<init>(java.util.List, n0.e2):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5933s(List list, AbstractC8745e2 abstractC8745e2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, abstractC8745e2);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final C5933s m26574a(@NotNull String str) {
        return INSTANCE.m26578a(str);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final C5933s m26575b(@NotNull C8742e c8742e, @Nullable C8742e c8742e2) {
        return INSTANCE.m26581e(c8742e, c8742e2);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m26576c() {
        C12637g.m47078j(this.cameraIds.size() == 1, "getInternalId() is only available for single-camera identifiers.");
        return (String) CollectionsKt.m31706d0(this.cameraIds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C5933s)) {
            return false;
        }
        C5933s c5933s = (C5933s) other;
        return Intrinsics.m31980c(this.cameraIds, c5933s.cameraIds) && Intrinsics.m31980c(this.compatibilityId, c5933s.compatibilityId);
    }

    public int hashCode() {
        int iHashCode = this.cameraIds.hashCode() * 31;
        AbstractC8745e2 abstractC8745e2 = this.compatibilityId;
        return iHashCode + (abstractC8745e2 != null ? abstractC8745e2.hashCode() : 0);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0037  */
    @NotNull
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CameraIdentifier{cameraIds=");
        sb2.append(CollectionsKt.m31715m0(this.cameraIds, ",", null, null, 0, null, null, 62, null));
        AbstractC8745e2 abstractC8745e2 = this.compatibilityId;
        if (abstractC8745e2 != null) {
            str = ", compatId=" + abstractC8745e2;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C5933s(List<String> list, AbstractC8745e2 abstractC8745e2) {
        this.cameraIds = list;
        this.compatibilityId = abstractC8745e2;
        C12637g.m47070b(!list.isEmpty(), "Camera ID set cannot be empty.");
    }
}
