package p360pj;

import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p222jj.C7189n;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;
import sg.C11347q0;
import th.C11659h;

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
/* JADX INFO: renamed from: pj.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001Bs\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0019\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u001b\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b,\u00102\u001a\u0004\b\u001f\u00103j\u0002\b4j\u0002\b)j\u0002\b5j\u0002\b&j\u0002\b0j\u0002\b6j\u0002\b#j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@¨\u0006A"}, m31665d2 = {"Lpj/b;", "", "", "id", "", "nameId", "importance", "description", "", "isFlagEnabled", "useDefaultChannelAttributes", "Landroid/net/Uri;", "ringtoneUri", "Landroid/media/AudioAttributes;", "ringtoneAttributes", "", "vibrationPattern", "Lpj/c;", "group", "<init>", "(Ljava/lang/String;ILjava/lang/String;IILjava/lang/Integer;ZZLandroid/net/Uri;Landroid/media/AudioAttributes;[JLpj/c;)V", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "I", "h", "()I", "c", "e", "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Z", "q", "()Z", "f", "n", "g", "Landroid/net/Uri;", "l", "()Landroid/net/Uri;", "Landroid/media/AudioAttributes;", "j", "()Landroid/media/AudioAttributes;", "i", "[J", "o", "()[J", "Lpj/c;", "()Lpj/c;", "k", "m", "p", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class EnumC10286b {

    /* JADX INFO: renamed from: A */
    public static final EnumC10286b f36929A;

    /* JADX INFO: renamed from: B */
    public static final /* synthetic */ EnumC10286b[] f36930B;

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ InterfaceC10707a f36931C;

    /* JADX INFO: renamed from: k */
    public static final EnumC10286b f36932k;

    /* JADX INFO: renamed from: l */
    public static final EnumC10286b f36933l;

    /* JADX INFO: renamed from: m */
    public static final EnumC10286b f36934m;

    /* JADX INFO: renamed from: n */
    public static final EnumC10286b f36935n;

    /* JADX INFO: renamed from: o */
    public static final EnumC10286b f36936o;

    /* JADX INFO: renamed from: p */
    public static final EnumC10286b f36937p;

    /* JADX INFO: renamed from: q */
    public static final EnumC10286b f36938q;

    /* JADX INFO: renamed from: r */
    public static final EnumC10286b f36939r;

    /* JADX INFO: renamed from: s */
    public static final EnumC10286b f36940s;

    /* JADX INFO: renamed from: t */
    public static final EnumC10286b f36941t;

    /* JADX INFO: renamed from: u */
    public static final EnumC10286b f36942u;

    /* JADX INFO: renamed from: v */
    public static final EnumC10286b f36943v;

    /* JADX INFO: renamed from: w */
    public static final EnumC10286b f36944w;

    /* JADX INFO: renamed from: x */
    public static final EnumC10286b f36945x;

    /* JADX INFO: renamed from: y */
    public static final EnumC10286b f36946y;

    /* JADX INFO: renamed from: z */
    public static final EnumC10286b f36947z;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int nameId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int importance;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final Integer description;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean isFlagEnabled;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final boolean useDefaultChannelAttributes;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public final Uri ringtoneUri;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public final AudioAttributes ringtoneAttributes;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public final long[] vibrationPattern;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public final EnumC10287c group;

    /* JADX DEBUG: Multi-variable search result rejected for r12v3, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r12v4, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    static {
        EnumC10287c enumC10287c = EnumC10287c.SOCIAL;
        int i10 = 488;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i11 = 3;
        Integer num = null;
        boolean z10 = false;
        Uri uri = null;
        AudioAttributes audioAttributes = null;
        long[] jArr = null;
        f36932k = new EnumC10286b("CONNECTION_REQUEST_RECEIVED", 0, "channel_connection_request_received", C11347q0.f39984k0, i11, num, C11659h.m43403a().mo43716s0(), z10, uri, audioAttributes, jArr, enumC10287c, i10, defaultConstructorMarker);
        f36933l = new EnumC10286b("CONNECTION_REQUEST_ACCEPTED", 1, "channel_connection_request_accepted", C11347q0.f39981j0, i11, num, C11659h.m43403a().mo43716s0(), z10, uri, audioAttributes, jArr, enumC10287c, i10, defaultConstructorMarker);
        f36934m = new EnumC10286b("EXPERIENCE_INVITE", 2, "channel_exp_invite", C11347q0.f39966e0, i11, num, C11659h.m43403a().mo43716s0(), z10, uri, audioAttributes, jArr, enumC10287c, i10, defaultConstructorMarker);
        f36935n = new EnumC10286b("PARTY_INVITE", 3, "channel_party_invite", C11347q0.f39987l0, i11, num, C11659h.m43403a().mo43716s0(), z10, uri, audioAttributes, jArr, enumC10287c, i10, defaultConstructorMarker);
        f36936o = new EnumC10286b("CHAT", 4, "channel_chat", C11347q0.f39960c0, i11, num, C11659h.m43403a().mo43716s0(), z10, uri, audioAttributes, jArr, enumC10287c, i10, defaultConstructorMarker);
        int i12 = 488;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        Integer num2 = null;
        boolean z11 = false;
        Uri uri2 = null;
        AudioAttributes audioAttributes2 = null;
        long[] jArr2 = null;
        f36937p = new EnumC10286b("FRIEND_PRESENCE", 5, "channel_friend_presence", C11347q0.f39978i0, 4, num2, C11659h.m43403a().mo43716s0() && C11659h.m43403a().mo43535T(), z11, uri2, audioAttributes2, jArr2, enumC10287c, i12, defaultConstructorMarker2);
        EnumC10287c enumC10287c2 = EnumC10287c.EXPERIENCES;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        int i13 = 3;
        Integer num3 = null;
        boolean z12 = false;
        Uri uri3 = null;
        AudioAttributes audioAttributes3 = null;
        long[] jArr3 = null;
        f36938q = new EnumC10286b("EXPERIENCE_EVENTS", 6, "channel_experience_events", C11347q0.f39963d0, i13, num3, C11659h.m43403a().mo43716s0(), z12, uri3, audioAttributes3, jArr3, enumC10287c2, 488, defaultConstructorMarker3);
        f36939r = new EnumC10286b("RECOMMENDED_EXPERIENCES", 7, "channel_recommended", C11347q0.f39990m0, i13, num3, false, z12, uri3, audioAttributes3, jArr3, enumC10287c2, 472, defaultConstructorMarker3);
        EnumC10287c enumC10287c3 = EnumC10287c.COMMUNITIES;
        int i14 = 3;
        f36940s = new EnumC10286b("ANNOUNCEMENTS", 8, "channel_announcements", C11347q0.f39957b0, i14, num2, C11659h.m43403a().mo43716s0(), z11, uri2, audioAttributes2, jArr2, enumC10287c3, i12, defaultConstructorMarker2);
        f36941t = new EnumC10286b("FORUM_REPLIES", 9, "channel_forum_replies", C11347q0.f39975h0, i14, num2, C11659h.m43403a().mo43716s0(), z11, uri2, audioAttributes2, jArr2, enumC10287c3, i12, defaultConstructorMarker2);
        f36942u = new EnumC10286b("FORUM_COMMENTS", 10, "channel_forum_comments", C11347q0.f39969f0, i14, num2, C11659h.m43403a().mo43716s0(), z11, uri2, audioAttributes2, jArr2, enumC10287c3, i12, defaultConstructorMarker2);
        f36943v = new EnumC10286b("FORUM_POST_SUBSCRIPTIONS", 11, "channel_forum_post_subscriptions", C11347q0.f39972g0, i14, num2, C11659h.m43403a().mo43716s0(), z11, uri2, audioAttributes2, jArr2, enumC10287c3, i12, defaultConstructorMarker2);
        String str = "ROBLOX_COMMUNITY_EVENTS";
        f36944w = new EnumC10286b(str, 12, "channel_virtual_event", C11347q0.f39993n0, i13, num3, C11659h.m43403a().mo43716s0(), z12, uri3, audioAttributes3, jArr3, EnumC10287c.PLATFORM_NEWS, 488, defaultConstructorMarker3);
        int i15 = 13;
        int i16 = 1;
        String str2 = "DND";
        String str3 = "channel_dnd";
        f36945x = new EnumC10286b(str2, i15, str3, C11347q0.f39967e1, i16, Integer.valueOf(C11347q0.f39948X0), C11659h.m43403a().mo43716s0(), z11, uri2, audioAttributes2, jArr2, null, 992, defaultConstructorMarker2);
        int i17 = 14;
        int i18 = 5;
        String str4 = "SECURITY";
        String str5 = "channel_security";
        f36946y = new EnumC10286b(str4, i17, str5, C11347q0.f39982j1, i18, Integer.valueOf(C11347q0.f39952Z0), C11659h.m43403a().mo43472J4(), z12, uri3, audioAttributes3, jArr3, null, 992, defaultConstructorMarker3);
        int i19 = 15;
        int i20 = 4;
        boolean z13 = false;
        String str6 = "CALLS";
        String str7 = "channel_calls";
        f36947z = new EnumC10286b(str6, i19, str7, C11347q0.f39961c1, i20, Integer.valueOf(C11347q0.f39946W0), z13, z11, RingtoneManager.getDefaultUri(1), new AudioAttributes.Builder().setUsage(6).setContentType(4).build(), C7189n.f27872b, 0 == true ? 1 : 0, 528, defaultConstructorMarker2);
        int i21 = C11347q0.f39979i1;
        int i22 = C11347q0.f39950Y0;
        String str8 = "OTHER";
        String str9 = "channel_others";
        f36929A = new EnumC10286b(str8, 16, str9, i21, 3, Integer.valueOf(i22), C11659h.m43403a().mo43716s0(), false, null, null, 0 == true ? 1 : 0, null, 992, null);
        EnumC10286b[] enumC10286bArrM39509a = m39509a();
        f36930B = enumC10286bArrM39509a;
        f36931C = C10708b.m40805a(enumC10286bArrM39509a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public EnumC10286b(String str, int i10, String str2, int i11, int i12, Integer num, boolean z10, boolean z11, Uri uri, AudioAttributes audioAttributes, long[] jArr, EnumC10287c enumC10287c) {
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
        this.group = enumC10287c;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC10286b[] m39509a() {
        return new EnumC10286b[]{f36932k, f36933l, f36934m, f36935n, f36936o, f36937p, f36938q, f36939r, f36940s, f36941t, f36942u, f36943v, f36944w, f36945x, f36946y, f36947z, f36929A};
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static InterfaceC10707a<EnumC10286b> m39510c() {
        return f36931C;
    }

    public static EnumC10286b valueOf(String str) {
        return (EnumC10286b) Enum.valueOf(EnumC10286b.class, str);
    }

    public static EnumC10286b[] values() {
        return (EnumC10286b[]) f36930B.clone();
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC10287c getGroup() {
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

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0049: CONSTRUCTOR 
      (r17v0 java.lang.String)
      (r18v0 int)
      (r19v0 java.lang.String)
      (r20v0 int)
      (r21v0 int)
      (wrap java.lang.Integer:?: TERNARY null = ((wrap int:0x0002: ARITH (r29v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r22v0 java.lang.Integer))
      (wrap boolean:?: TERNARY null = ((wrap int:0x000b: ARITH (r29v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r23v0 boolean))
      (wrap boolean:?: TERNARY null = ((wrap int:0x0014: ARITH (r29v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? true : (r24v0 boolean))
      (wrap android.net.Uri:?: TERNARY null = ((wrap int:0x001c: ARITH (r29v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null android.net.Uri) : (r25v0 android.net.Uri))
      (wrap android.media.AudioAttributes:?: TERNARY null = ((wrap int:0x0024: ARITH (r29v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null android.media.AudioAttributes) : (r26v0 android.media.AudioAttributes))
      (wrap long[]:?: TERNARY null = ((wrap int:0x002c: ARITH (r29v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null long[]) : (r27v0 long[]))
      (wrap pj.c:?: TERNARY null = ((wrap int:0x0034: ARITH (r29v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null pj.c) : (r28v0 pj.c))
     A[MD:(java.lang.String, int, java.lang.String, int, int, java.lang.Integer, boolean, boolean, android.net.Uri, android.media.AudioAttributes, long[], pj.c):void (m)] (LINE:12) call: pj.b.<init>(java.lang.String, int, java.lang.String, int, int, java.lang.Integer, boolean, boolean, android.net.Uri, android.media.AudioAttributes, long[], pj.c):void type: THIS */
    public /* synthetic */ EnumC10286b(String str, int i10, String str2, int i11, int i12, Integer num, boolean z10, boolean z11, Uri uri, AudioAttributes audioAttributes, long[] jArr, EnumC10287c enumC10287c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, str2, i11, i12, (i13 & 8) != 0 ? null : num, (i13 & 16) != 0 ? true : z10, (i13 & 32) != 0 ? true : z11, (i13 & 64) != 0 ? null : uri, (i13 & 128) != 0 ? null : audioAttributes, (i13 & 256) != 0 ? null : jArr, (i13 & 512) != 0 ? null : enumC10287c);
    }
}
