package pj;

import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import com.google.mlkit.vision.barcode.common.Barcode;
import jj.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sg.q0;
import th.h;

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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001Bs\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0019\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u001b\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b,\u00102\u001a\u0004\b\u001f\u00103j\u0002\b4j\u0002\b)j\u0002\b5j\u0002\b&j\u0002\b0j\u0002\b6j\u0002\b#j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@¨\u0006A"}, d2 = {"Lpj/b;", "", "", "id", "", "nameId", "importance", "description", "", "isFlagEnabled", "useDefaultChannelAttributes", "Landroid/net/Uri;", "ringtoneUri", "Landroid/media/AudioAttributes;", "ringtoneAttributes", "", "vibrationPattern", "Lpj/c;", "group", "<init>", "(Ljava/lang/String;ILjava/lang/String;IILjava/lang/Integer;ZZLandroid/net/Uri;Landroid/media/AudioAttributes;[JLpj/c;)V", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "I", "h", "()I", "c", "e", "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Z", "q", "()Z", "f", "n", "g", "Landroid/net/Uri;", "l", "()Landroid/net/Uri;", "Landroid/media/AudioAttributes;", "j", "()Landroid/media/AudioAttributes;", "i", "[J", "o", "()[J", "Lpj/c;", "()Lpj/c;", "k", "m", "p", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final b A;
    public static final /* synthetic */ b[] B;
    public static final /* synthetic */ qt.a C;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f28667k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f28668l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f28669m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f28670n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f28671o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f28672p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f28673q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f28674r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f28675s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f28676t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f28677u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f28678v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f28679w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b f28680x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final b f28681y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final b f28682z;

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
        f28667k = new b("CONNECTION_REQUEST_RECEIVED", 0, "channel_connection_request_received", q0.f30943k0, i11, num, h.a().o0(), z10, uri, audioAttributes, jArr, cVar, i10, defaultConstructorMarker);
        f28668l = new b("CONNECTION_REQUEST_ACCEPTED", 1, "channel_connection_request_accepted", q0.f30940j0, i11, num, h.a().o0(), z10, uri, audioAttributes, jArr, cVar, i10, defaultConstructorMarker);
        f28669m = new b("EXPERIENCE_INVITE", 2, "channel_exp_invite", q0.f30925e0, i11, num, h.a().o0(), z10, uri, audioAttributes, jArr, cVar, i10, defaultConstructorMarker);
        f28670n = new b("PARTY_INVITE", 3, "channel_party_invite", q0.f30946l0, i11, num, h.a().o0(), z10, uri, audioAttributes, jArr, cVar, i10, defaultConstructorMarker);
        f28671o = new b("CHAT", 4, "channel_chat", q0.f30919c0, i11, num, h.a().o0(), z10, uri, audioAttributes, jArr, cVar, i10, defaultConstructorMarker);
        int i12 = 488;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        Integer num2 = null;
        boolean z11 = false;
        Uri uri2 = null;
        AudioAttributes audioAttributes2 = null;
        long[] jArr2 = null;
        f28672p = new b("FRIEND_PRESENCE", 5, "channel_friend_presence", q0.f30937i0, 4, num2, h.a().o0() && h.a().Q(), z11, uri2, audioAttributes2, jArr2, cVar, i12, defaultConstructorMarker2);
        c cVar2 = c.EXPERIENCES;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        int i13 = 3;
        Integer num3 = null;
        boolean z12 = false;
        Uri uri3 = null;
        AudioAttributes audioAttributes3 = null;
        long[] jArr3 = null;
        f28673q = new b("EXPERIENCE_EVENTS", 6, "channel_experience_events", q0.f30922d0, i13, num3, h.a().o0(), z12, uri3, audioAttributes3, jArr3, cVar2, 488, defaultConstructorMarker3);
        f28674r = new b("RECOMMENDED_EXPERIENCES", 7, "channel_recommended", q0.f30949m0, i13, num3, false, z12, uri3, audioAttributes3, jArr3, cVar2, 472, defaultConstructorMarker3);
        c cVar3 = c.COMMUNITIES;
        int i14 = 3;
        f28675s = new b("ANNOUNCEMENTS", 8, "channel_announcements", q0.f30916b0, i14, num2, h.a().o0(), z11, uri2, audioAttributes2, jArr2, cVar3, i12, defaultConstructorMarker2);
        f28676t = new b("FORUM_REPLIES", 9, "channel_forum_replies", q0.f30934h0, i14, num2, h.a().o0(), z11, uri2, audioAttributes2, jArr2, cVar3, i12, defaultConstructorMarker2);
        f28677u = new b("FORUM_COMMENTS", 10, "channel_forum_comments", q0.f30928f0, i14, num2, h.a().o0(), z11, uri2, audioAttributes2, jArr2, cVar3, i12, defaultConstructorMarker2);
        f28678v = new b("FORUM_POST_SUBSCRIPTIONS", 11, "channel_forum_post_subscriptions", q0.f30931g0, i14, num2, h.a().o0(), z11, uri2, audioAttributes2, jArr2, cVar3, i12, defaultConstructorMarker2);
        String str = "ROBLOX_COMMUNITY_EVENTS";
        f28679w = new b(str, 12, "channel_virtual_event", q0.f30952n0, i13, num3, h.a().o0(), z12, uri3, audioAttributes3, jArr3, c.PLATFORM_NEWS, 488, defaultConstructorMarker3);
        int i15 = 13;
        int i16 = 1;
        String str2 = "DND";
        String str3 = "channel_dnd";
        f28680x = new b(str2, i15, str3, q0.f30926e1, i16, Integer.valueOf(q0.X0), h.a().o0(), z11, uri2, audioAttributes2, jArr2, null, 992, defaultConstructorMarker2);
        int i17 = 14;
        int i18 = 5;
        String str4 = "SECURITY";
        String str5 = "channel_security";
        f28681y = new b(str4, i17, str5, q0.f30941j1, i18, Integer.valueOf(q0.Z0), h.a().E4(), z12, uri3, audioAttributes3, jArr3, null, 992, defaultConstructorMarker3);
        int i19 = 15;
        int i20 = 4;
        boolean z13 = false;
        String str6 = "CALLS";
        String str7 = "channel_calls";
        f28682z = new b(str6, i19, str7, q0.f30920c1, i20, Integer.valueOf(q0.W0), z13, z11, RingtoneManager.getDefaultUri(1), new AudioAttributes.Builder().setUsage(6).setContentType(4).build(), n.b, 0 == true ? 1 : 0, 528, defaultConstructorMarker2);
        int i21 = q0.f30938i1;
        int i22 = q0.Y0;
        String str8 = "OTHER";
        String str9 = "channel_others";
        A = new b(str8, 16, str9, i21, 3, Integer.valueOf(i22), h.a().o0(), false, null, null, 0 == true ? 1 : 0, null, 992, null);
        b[] bVarArrA = a();
        B = bVarArrA;
        C = qt.b.a(bVarArrA);
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
        return new b[]{f28667k, f28668l, f28669m, f28670n, f28671o, f28672p, f28673q, f28674r, f28675s, f28676t, f28677u, f28678v, f28679w, f28680x, f28681y, f28682z, A};
    }

    @NotNull
    public static qt.a<b> c() {
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
