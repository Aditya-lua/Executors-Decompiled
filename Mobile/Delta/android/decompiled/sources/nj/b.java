package nj;

import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import com.google.mlkit.vision.barcode.common.Barcode;
import hj.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rg.q0;
import rh.h;

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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001Bs\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0019\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u001b\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b,\u00102\u001a\u0004\b\u001f\u00103j\u0002\b4j\u0002\b)j\u0002\b5j\u0002\b&j\u0002\b0j\u0002\b6j\u0002\b#j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@¨\u0006A"}, d2 = {"Lnj/b;", "", "", "id", "", "nameId", "importance", "description", "", "isFlagEnabled", "useDefaultChannelAttributes", "Landroid/net/Uri;", "ringtoneUri", "Landroid/media/AudioAttributes;", "ringtoneAttributes", "", "vibrationPattern", "Lnj/c;", "group", "<init>", "(Ljava/lang/String;ILjava/lang/String;IILjava/lang/Integer;ZZLandroid/net/Uri;Landroid/media/AudioAttributes;[JLnj/c;)V", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "I", "h", "()I", "c", "e", "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Z", "q", "()Z", "f", "n", "g", "Landroid/net/Uri;", "l", "()Landroid/net/Uri;", "Landroid/media/AudioAttributes;", "j", "()Landroid/media/AudioAttributes;", "i", "[J", "o", "()[J", "Lnj/c;", "()Lnj/c;", "k", "m", "p", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final b A;
    public static final /* synthetic */ b[] B;
    public static final /* synthetic */ ot.a C;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f27261k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f27262l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f27263m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f27264n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f27265o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f27266p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f27267q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f27268r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f27269s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f27270t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f27271u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f27272v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f27273w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b f27274x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final b f27275y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final b f27276z;

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
        f27261k = new b("CONNECTION_REQUEST_RECEIVED", 0, "channel_connection_request_received", q0.f30548k0, i11, num, h.a().t0(), z10, uri, audioAttributes, jArr, cVar, i10, defaultConstructorMarker);
        f27262l = new b("CONNECTION_REQUEST_ACCEPTED", 1, "channel_connection_request_accepted", q0.f30545j0, i11, num, h.a().t0(), z10, uri, audioAttributes, jArr, cVar, i10, defaultConstructorMarker);
        f27263m = new b("EXPERIENCE_INVITE", 2, "channel_exp_invite", q0.f30530e0, i11, num, h.a().t0(), z10, uri, audioAttributes, jArr, cVar, i10, defaultConstructorMarker);
        f27264n = new b("PARTY_INVITE", 3, "channel_party_invite", q0.f30551l0, i11, num, h.a().t0(), z10, uri, audioAttributes, jArr, cVar, i10, defaultConstructorMarker);
        f27265o = new b("CHAT", 4, "channel_chat", q0.f30524c0, i11, num, h.a().t0(), z10, uri, audioAttributes, jArr, cVar, i10, defaultConstructorMarker);
        int i12 = 488;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        Integer num2 = null;
        boolean z11 = false;
        Uri uri2 = null;
        AudioAttributes audioAttributes2 = null;
        long[] jArr2 = null;
        f27266p = new b("FRIEND_PRESENCE", 5, "channel_friend_presence", q0.f30542i0, 4, num2, h.a().t0() && h.a().S(), z11, uri2, audioAttributes2, jArr2, cVar, i12, defaultConstructorMarker2);
        c cVar2 = c.EXPERIENCES;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        int i13 = 3;
        Integer num3 = null;
        boolean z12 = false;
        Uri uri3 = null;
        AudioAttributes audioAttributes3 = null;
        long[] jArr3 = null;
        f27267q = new b("EXPERIENCE_EVENTS", 6, "channel_experience_events", q0.f30527d0, i13, num3, h.a().t0(), z12, uri3, audioAttributes3, jArr3, cVar2, 488, defaultConstructorMarker3);
        f27268r = new b("RECOMMENDED_EXPERIENCES", 7, "channel_recommended", q0.f30554m0, i13, num3, false, z12, uri3, audioAttributes3, jArr3, cVar2, 472, defaultConstructorMarker3);
        c cVar3 = c.COMMUNITIES;
        int i14 = 3;
        f27269s = new b("ANNOUNCEMENTS", 8, "channel_announcements", q0.f30521b0, i14, num2, h.a().t0(), z11, uri2, audioAttributes2, jArr2, cVar3, i12, defaultConstructorMarker2);
        f27270t = new b("FORUM_REPLIES", 9, "channel_forum_replies", q0.f30539h0, i14, num2, h.a().t0(), z11, uri2, audioAttributes2, jArr2, cVar3, i12, defaultConstructorMarker2);
        f27271u = new b("FORUM_COMMENTS", 10, "channel_forum_comments", q0.f30533f0, i14, num2, h.a().t0(), z11, uri2, audioAttributes2, jArr2, cVar3, i12, defaultConstructorMarker2);
        f27272v = new b("FORUM_POST_SUBSCRIPTIONS", 11, "channel_forum_post_subscriptions", q0.f30536g0, i14, num2, h.a().t0(), z11, uri2, audioAttributes2, jArr2, cVar3, i12, defaultConstructorMarker2);
        String str = "ROBLOX_COMMUNITY_EVENTS";
        f27273w = new b(str, 12, "channel_virtual_event", q0.f30557n0, i13, num3, h.a().t0(), z12, uri3, audioAttributes3, jArr3, c.PLATFORM_NEWS, 488, defaultConstructorMarker3);
        int i15 = 13;
        int i16 = 1;
        String str2 = "DND";
        String str3 = "channel_dnd";
        f27274x = new b(str2, i15, str3, q0.f30531e1, i16, Integer.valueOf(q0.X0), h.a().t0(), z11, uri2, audioAttributes2, jArr2, null, 992, defaultConstructorMarker2);
        int i17 = 14;
        int i18 = 5;
        String str4 = "SECURITY";
        String str5 = "channel_security";
        f27275y = new b(str4, i17, str5, q0.f30546j1, i18, Integer.valueOf(q0.Z0), h.a().Q4(), z12, uri3, audioAttributes3, jArr3, null, 992, defaultConstructorMarker3);
        int i19 = 15;
        int i20 = 4;
        boolean z13 = false;
        String str6 = "CALLS";
        String str7 = "channel_calls";
        f27276z = new b(str6, i19, str7, q0.f30525c1, i20, Integer.valueOf(q0.W0), z13, z11, RingtoneManager.getDefaultUri(1), new AudioAttributes.Builder().setUsage(6).setContentType(4).build(), n.b, 0 == true ? 1 : 0, 528, defaultConstructorMarker2);
        int i21 = q0.f30543i1;
        int i22 = q0.Y0;
        String str8 = "OTHER";
        String str9 = "channel_others";
        A = new b(str8, 16, str9, i21, 3, Integer.valueOf(i22), h.a().t0(), false, null, null, 0 == true ? 1 : 0, null, 992, null);
        b[] bVarArrA = a();
        B = bVarArrA;
        C = ot.b.a(bVarArrA);
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
        return new b[]{f27261k, f27262l, f27263m, f27264n, f27265o, f27266p, f27267q, f27268r, f27269s, f27270t, f27271u, f27272v, f27273w, f27274x, f27275y, f27276z, A};
    }

    @NotNull
    public static ot.a<b> c() {
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
    /* JADX INFO: renamed from: j, reason: from getter */
    public final AudioAttributes getRingtoneAttributes() {
        return this.ringtoneAttributes;
    }

    @Nullable
    /* JADX INFO: renamed from: l, reason: from getter */
    public final Uri getRingtoneUri() {
        return this.ringtoneUri;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getUseDefaultChannelAttributes() {
        return this.useDefaultChannelAttributes;
    }

    @Nullable
    /* JADX INFO: renamed from: o, reason: from getter */
    public final long[] getVibrationPattern() {
        return this.vibrationPattern;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getIsFlagEnabled() {
        return this.isFlagEnabled;
    }

    public /* synthetic */ b(String str, int i10, String str2, int i11, int i12, Integer num, boolean z10, boolean z11, Uri uri, AudioAttributes audioAttributes, long[] jArr, c cVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, str2, i11, i12, (i13 & 8) != 0 ? null : num, (i13 & 16) != 0 ? true : z10, (i13 & 32) != 0 ? true : z11, (i13 & 64) != 0 ? null : uri, (i13 & 128) != 0 ? null : audioAttributes, (i13 & Barcode.FORMAT_QR_CODE) != 0 ? null : jArr, (i13 & Barcode.FORMAT_UPC_A) != 0 ? null : cVar);
    }
}
