package xj;

import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import bh.q0;
import bi.h;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import rj.n;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'k' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001Bs\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0019\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u001b\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b\u001f\u00104j\u0002\b,j\u0002\b5j\u0002\b)j\u0002\b6j\u0002\b&j\u0002\b0j\u0002\b#j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@¨\u0006A"}, d2 = {"Lxj/b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "id", BuildConfig.FLAVOR, "nameId", "importance", "description", BuildConfig.FLAVOR, "isFlagEnabled", "useDefaultChannelAttributes", "Landroid/net/Uri;", "ringtoneUri", "Landroid/media/AudioAttributes;", "ringtoneAttributes", BuildConfig.FLAVOR, "vibrationPattern", "Lxj/c;", "group", "<init>", "(Ljava/lang/String;ILjava/lang/String;IILjava/lang/Integer;ZZLandroid/net/Uri;Landroid/media/AudioAttributes;[JLxj/c;)V", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "I", "h", "()I", "c", "e", "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Z", "q", "()Z", "f", "o", "g", "Landroid/net/Uri;", "m", "()Landroid/net/Uri;", "Landroid/media/AudioAttributes;", "k", "()Landroid/media/AudioAttributes;", "i", "[J", "p", "()[J", "j", "Lxj/c;", "()Lxj/c;", "l", "n", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final b A;
    public static final /* synthetic */ b[] B;
    public static final /* synthetic */ hu.a C;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f36730k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f36731l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f36732m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f36733n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f36734o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f36735p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f36736q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f36737r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f36738s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f36739t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f36740u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f36741v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f36742w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b f36743x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final b f36744y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final b f36745z;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int nameId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int importance;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer description;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean isFlagEnabled;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean useDefaultChannelAttributes;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Uri ringtoneUri;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final AudioAttributes ringtoneAttributes;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final long[] vibrationPattern;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final c group;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        c cVar = c.SOCIAL;
        int i10 = 488;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i11 = 3;
        Integer num = null;
        boolean z10 = false;
        Uri uri = null;
        AudioAttributes audioAttributes = null;
        long[] jArr = null;
        f36730k = new b("CONNECTION_REQUEST_RECEIVED", 0, "channel_connection_request_received", q0.f4259n0, i11, num, h.a().v0(), z10, uri, audioAttributes, jArr, cVar, i10, defaultConstructorMarker);
        f36731l = new b("CONNECTION_REQUEST_ACCEPTED", 1, "channel_connection_request_accepted", q0.f4256m0, i11, num, h.a().v0(), z10, uri, audioAttributes, jArr, cVar, i10, defaultConstructorMarker);
        f36732m = new b("EXPERIENCE_INVITE", 2, "channel_exp_invite", q0.f4241h0, i11, num, h.a().v0(), z10, uri, audioAttributes, jArr, cVar, i10, defaultConstructorMarker);
        f36733n = new b("PARTY_INVITE", 3, "channel_party_invite", q0.f4262o0, i11, num, h.a().v0(), z10, uri, audioAttributes, jArr, cVar, i10, defaultConstructorMarker);
        f36734o = new b("CHAT", 4, "channel_chat", q0.f4235f0, i11, num, h.a().v0(), z10, uri, audioAttributes, jArr, cVar, i10, defaultConstructorMarker);
        int i12 = 488;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        Integer num2 = null;
        boolean z11 = false;
        Uri uri2 = null;
        AudioAttributes audioAttributes2 = null;
        long[] jArr2 = null;
        f36735p = new b("FRIEND_PRESENCE", 5, "channel_friend_presence", q0.f4253l0, 4, num2, h.a().v0() && h.a().U(), z11, uri2, audioAttributes2, jArr2, cVar, i12, defaultConstructorMarker2);
        c cVar2 = c.EXPERIENCES;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        int i13 = 3;
        Integer num3 = null;
        boolean z12 = false;
        Uri uri3 = null;
        AudioAttributes audioAttributes3 = null;
        long[] jArr3 = null;
        f36736q = new b("EXPERIENCE_EVENTS", 6, "channel_experience_events", q0.f4238g0, i13, num3, h.a().v0(), z12, uri3, audioAttributes3, jArr3, cVar2, 488, defaultConstructorMarker3);
        f36737r = new b("RECOMMENDED_EXPERIENCES", 7, "channel_recommended", q0.f4265p0, i13, num3, false, z12, uri3, audioAttributes3, jArr3, cVar2, 472, defaultConstructorMarker3);
        c cVar3 = c.COMMUNITIES;
        int i14 = 3;
        f36738s = new b("ANNOUNCEMENTS", 8, "channel_announcements", q0.f4232e0, i14, num2, h.a().v0(), z11, uri2, audioAttributes2, jArr2, cVar3, i12, defaultConstructorMarker2);
        f36739t = new b("FORUM_REPLIES", 9, "channel_forum_replies", q0.f4250k0, i14, num2, h.a().v0(), z11, uri2, audioAttributes2, jArr2, cVar3, i12, defaultConstructorMarker2);
        f36740u = new b("FORUM_COMMENTS", 10, "channel_forum_comments", q0.f4244i0, i14, num2, h.a().v0(), z11, uri2, audioAttributes2, jArr2, cVar3, i12, defaultConstructorMarker2);
        f36741v = new b("FORUM_POST_SUBSCRIPTIONS", 11, "channel_forum_post_subscriptions", q0.f4247j0, i14, num2, h.a().v0(), z11, uri2, audioAttributes2, jArr2, cVar3, i12, defaultConstructorMarker2);
        String str = "ROBLOX_COMMUNITY_EVENTS";
        f36742w = new b(str, 12, "channel_virtual_event", q0.f4268q0, i13, num3, h.a().v0(), z12, uri3, audioAttributes3, jArr3, c.PLATFORM_NEWS, 488, defaultConstructorMarker3);
        int i15 = 13;
        int i16 = 1;
        String str2 = "DND";
        String str3 = "channel_dnd";
        f36743x = new b(str2, i15, str3, q0.f4260n1, i16, Integer.valueOf(q0.f4242h1), h.a().v0(), z11, uri2, audioAttributes2, jArr2, null, 992, defaultConstructorMarker2);
        f36744y = new b("SECURITY", 14, "channel_security", q0.f4278t1, 5, Integer.valueOf(q0.f4248j1), false, z12, uri3, audioAttributes3, jArr3, null, 1008, defaultConstructorMarker3);
        int i17 = 15;
        int i18 = 4;
        boolean z13 = false;
        String str4 = "CALLS";
        String str5 = "channel_calls";
        f36745z = new b(str4, i17, str5, q0.f4254l1, i18, Integer.valueOf(q0.f4239g1), z13, z11, RingtoneManager.getDefaultUri(1), new AudioAttributes.Builder().setUsage(6).setContentType(4).build(), n.b, 0 == true ? 1 : 0, 528, defaultConstructorMarker2);
        int i19 = q0.f4275s1;
        int i20 = q0.f4245i1;
        String str6 = "OTHER";
        String str7 = "channel_others";
        A = new b(str6, 16, str7, i19, 3, Integer.valueOf(i20), h.a().v0(), false, null, null, 0 == true ? 1 : 0, null, 992, null);
        b[] bVarArrA = a();
        B = bVarArrA;
        C = hu.b.a(bVarArrA);
    }

    public b(String str, int i10, String str2, int i11, int i12, Integer num, boolean z10, boolean z11, Uri uri, AudioAttributes audioAttributes, long[] jArr, c cVar) {
        super(str, i10);
        this.id = str2;
        this.nameId = i11;
        this.importance = i12;
        this.description = num;
        this.isFlagEnabled = z10;
        this.useDefaultChannelAttributes = z11;
        this.ringtoneUri = uri;
        this.ringtoneAttributes = audioAttributes;
        this.vibrationPattern = jArr;
        this.group = cVar;
    }

    public static final /* synthetic */ b[] a() {
        return new b[]{f36730k, f36731l, f36732m, f36733n, f36734o, f36735p, f36736q, f36737r, f36738s, f36739t, f36740u, f36741v, f36742w, f36743x, f36744y, f36745z, A};
    }

    @NotNull
    public static hu.a<b> c() {
        return C;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) B.clone();
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final c getGroup() {
        return this.group;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getImportance() {
        return this.importance;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getNameId() {
        return this.nameId;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final AudioAttributes getRingtoneAttributes() {
        return this.ringtoneAttributes;
    }

    @Nullable
    /* JADX INFO: renamed from: m, reason: from getter */
    public final Uri getRingtoneUri() {
        return this.ringtoneUri;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getUseDefaultChannelAttributes() {
        return this.useDefaultChannelAttributes;
    }

    @Nullable
    /* JADX INFO: renamed from: p, reason: from getter */
    public final long[] getVibrationPattern() {
        return this.vibrationPattern;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getIsFlagEnabled() {
        return this.isFlagEnabled;
    }

    public /* synthetic */ b(String str, int i10, String str2, int i11, int i12, Integer num, boolean z10, boolean z11, Uri uri, AudioAttributes audioAttributes, long[] jArr, c cVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, str2, i11, i12, (i13 & 8) != 0 ? null : num, (i13 & 16) != 0 ? true : z10, (i13 & 32) != 0 ? true : z11, (i13 & 64) != 0 ? null : uri, (i13 & Barcode.FORMAT_ITF) != 0 ? null : audioAttributes, (i13 & Barcode.FORMAT_QR_CODE) != 0 ? null : jArr, (i13 & Barcode.FORMAT_UPC_A) != 0 ? null : cVar);
    }
}
