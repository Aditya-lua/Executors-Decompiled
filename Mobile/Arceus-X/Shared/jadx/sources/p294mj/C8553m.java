package p294mj;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151gk.C6114g;
import p222jj.C7183h;
import th.C11659h;

/* JADX INFO: renamed from: mj.m */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b$\b\u0016\u0018\u0000 ;2\u00020\u0001:\u0001\u001bB\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014B/\b\u0016\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0016B-\b\u0017\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010 R(\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b'\u0010\u001f\u0012\u0004\b+\u0010,\u001a\u0004\b(\u0010 \"\u0004\b)\u0010*R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u001c\u001a\u0004\b.\u0010\u001e\"\u0004\b/\u00100R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\u001c\u001a\u0004\b2\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\u001c\u001a\u0004\b4\u0010\u001eR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u0010\u001c\u001a\u0004\b6\u0010\u001eR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u0010\u001c\u001a\u0004\b8\u0010\u001eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u0010\u001c\u001a\u0004\b:\u0010\u001e¨\u0006<"}, m31665d2 = {"Lmj/m;", "Lmj/j0;", "", "notificationId", "", "time", "senderName", "senderDisplayName", "senderId", "conversationId", "conversationGuid", "conversationTitle", "conversationType", "messageId", "messageContent", "category", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lmj/f0;", "metadata", "(Lmj/f0;)V", "categoryName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "", "H", "(Ljava/lang/String;)Z", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "J", "()J", "c", "G", "d", "getSenderDisplayName", "e", "F", "f", "A", "setConversationId", "(J)V", "getConversationId$annotations", "()V", "g", "z", "setConversationGuid", "(Ljava/lang/String;)V", "h", "B", "i", "C", "j", "E", "k", "D", "l", "y", "m", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public class C8553m implements InterfaceC8549j0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String notificationId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final long time;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String senderName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final String senderDisplayName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final long senderId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public long conversationId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public String conversationGuid;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public final String conversationTitle;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public final String conversationType;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public final String messageId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public final String messageContent;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public final String category;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8553m(@NotNull String notificationId, long j10, @Nullable String str, @Nullable String str2, long j11, long j12, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        this.notificationId = notificationId;
        this.time = j10;
        this.senderName = str;
        this.senderDisplayName = str2;
        this.senderId = j11;
        this.conversationId = j12;
        this.conversationGuid = str3;
        this.conversationTitle = str4;
        this.conversationType = str5;
        this.messageId = str6;
        this.messageContent = str7;
        this.category = str8;
    }

    /* JADX INFO: renamed from: n */
    public static final String m34454n() {
        return "ChatNewMessageNotification senderName is null or empty";
    }

    /* JADX INFO: renamed from: o */
    public static final String m34455o() {
        return "ChatNewMessageNotification senderId <= 0";
    }

    /* JADX INFO: renamed from: p */
    public static final String m34456p() {
        return "ChatNewMessageNotification conversationType is invalid";
    }

    /* JADX INFO: renamed from: q */
    public static final String m34457q() {
        return "ChatNewMessageNotification category is null or empty";
    }

    /* JADX INFO: renamed from: r */
    public static final String m34458r() {
        return "ChatNewMessageNotification date is null or empty";
    }

    /* JADX INFO: renamed from: s */
    public static final String m34459s() {
        return "ChatNewMessageNotification conversationTitle is null or empty";
    }

    /* JADX INFO: renamed from: t */
    public static final String m34460t() {
        return "ChatNewMessageNotification conversationGuid is null or empty";
    }

    /* JADX INFO: renamed from: u */
    public static final String m34461u() {
        return "ChatNewMessageNotification conversationId is null or empty";
    }

    /* JADX INFO: renamed from: v */
    public static final String m34462v() {
        return "ChatNewMessageNotification messageId is null or empty";
    }

    /* JADX INFO: renamed from: w */
    public static final String m34463w() {
        return "ChatNewMessageNotification messageContent is null or empty";
    }

    /* JADX INFO: renamed from: x */
    public static final String m34464x() {
        return "ChatNewMessageNotification conversationType is null or empty";
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final long getConversationId() {
        return this.conversationId;
    }

    @Nullable
    /* JADX INFO: renamed from: B, reason: from getter */
    public final String getConversationTitle() {
        return this.conversationTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: C, reason: from getter */
    public final String getConversationType() {
        return this.conversationType;
    }

    @Nullable
    /* JADX INFO: renamed from: D, reason: from getter */
    public final String getMessageContent() {
        return this.messageContent;
    }

    @Nullable
    /* JADX INFO: renamed from: E, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final long getSenderId() {
        return this.senderId;
    }

    @Nullable
    /* JADX INFO: renamed from: G, reason: from getter */
    public final String getSenderName() {
        return this.senderName;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m34472H(String conversationType) {
        return Intrinsics.m31980c(conversationType, "OneToOneConversation") || Intrinsics.m31980c(conversationType, "MultiUserConversation");
    }

    @Override // p294mj.InterfaceC8549j0
    /* JADX INFO: renamed from: a, reason: from getter */
    public long getTime() {
        return this.time;
    }

    @Override // p294mj.InterfaceC8549j0
    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public String getNotificationId() {
        return this.notificationId;
    }

    @Nullable
    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    /* JADX INFO: renamed from: z, reason: from getter */
    public final String getConversationGuid() {
        return this.conversationGuid;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0065: CONSTRUCTOR 
      (r21v0 java.lang.String A[IMMUTABLE_TYPE, METHOD_ARGUMENT])
      (wrap long:?: TERNARY null = ((wrap int:0x0002: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r22v0 long))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x000c: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0015: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
      (wrap long:?: TERNARY null = ((wrap int:0x001d: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r26v0 long))
      (wrap long:?: TERNARY null = ((wrap int:0x0025: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r28v0 long))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x002d: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
      (r31v0 java.lang.String A[IMMUTABLE_TYPE, METHOD_ARGUMENT])
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0035: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x003e: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0047: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0050: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
     A[MD:(java.lang.String, long, java.lang.String, java.lang.String, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:14) call: mj.m.<init>(java.lang.String, long, java.lang.String, java.lang.String, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C8553m(String str, long j10, String str2, String str3, long j11, long j12, String str4, String str5, String str6, String str7, String str8, String str9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? -1L : j10, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? -1L : j11, (i10 & 32) != 0 ? -1L : j12, (i10 & 64) != 0 ? null : str4, str5, (i10 & 256) != 0 ? null : str6, (i10 & 512) != 0 ? null : str7, (i10 & 1024) != 0 ? null : str8, (i10 & 2048) != 0 ? null : str9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C8553m(@NotNull PushNotificationMetadata metadata) throws C7183h {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        String notificationId = metadata.getNotificationId();
        String strM34500a = C8563w.m34500a(metadata.getDetail(), "EventDate");
        this(notificationId, strM34500a != null ? C6114g.m27033a(strM34500a) : -1L, C8563w.m34500a(metadata.getDetail(), "SenderUserName"), C8563w.m34500a(metadata.getDetail(), "SenderDisplayName"), metadata.getDetail().optLong("SenderUserId"), 0L, null, C8563w.m34500a(metadata.getDetail(), "ConversationTitle"), C8563w.m34500a(metadata.getDetail(), "ConversationType"), C8563w.m34500a(metadata.getDetail(), "MessageId"), C8563w.m34500a(metadata.getDetail(), "MessageContent"), C8563w.m34500a(metadata.getDetail(), "Category"), 96, null);
        if (C11659h.m43403a().mo43718s2()) {
            this.conversationGuid = C8563w.m34500a(metadata.getDetail(), "ConversationId");
        } else {
            this.conversationId = metadata.getDetail().optLong("ConversationId");
        }
        String str = this.senderName;
        C8563w.m34501b(!(str == null || str.length() == 0), new Function0() { // from class: mj.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C8553m.m34454n();
            }
        });
        C8563w.m34501b(this.senderId > 0, new Function0() { // from class: mj.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C8553m.m34455o();
            }
        });
        String str2 = this.category;
        C8563w.m34501b(!(str2 == null || str2.length() == 0), new Function0() { // from class: mj.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C8553m.m34457q();
            }
        });
        C8563w.m34501b(getTime() > 0, new Function0() { // from class: mj.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C8553m.m34458r();
            }
        });
        String str3 = this.conversationTitle;
        C8563w.m34501b(!(str3 == null || str3.length() == 0), new Function0() { // from class: mj.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C8553m.m34459s();
            }
        });
        if (C11659h.m43403a().mo43718s2()) {
            String str4 = this.conversationGuid;
            C8563w.m34501b(!(str4 == null || str4.length() == 0), new Function0() { // from class: mj.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C8553m.m34460t();
                }
            });
        } else {
            C8563w.m34501b(this.conversationId > 0, new Function0() { // from class: mj.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C8553m.m34461u();
                }
            });
        }
        String str5 = this.messageId;
        C8563w.m34501b(!(str5 == null || str5.length() == 0), new Function0() { // from class: mj.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C8553m.m34462v();
            }
        });
        String str6 = this.messageContent;
        C8563w.m34501b(!(str6 == null || str6.length() == 0), new Function0() { // from class: mj.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C8553m.m34463w();
            }
        });
        String str7 = this.conversationType;
        C8563w.m34501b(!(str7 == null || str7.length() == 0), new Function0() { // from class: mj.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C8553m.m34464x();
            }
        });
        String str8 = this.conversationType;
        Intrinsics.checkNotNull(str8);
        C8563w.m34501b(m34472H(str8), new Function0() { // from class: mj.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C8553m.m34456p();
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8553m(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String notificationId) {
        this(notificationId, 0L, null, null, 0L, 0L, str2, str3, null, null, null, str, 1854, null);
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8553m(@Nullable String str, long j10, @Nullable String str2, @NotNull String notificationId) {
        this(notificationId, 0L, null, null, 0L, j10, null, str2, null, null, null, str, 1886, null);
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
    }
}
