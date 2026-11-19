.class public final Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener$CppProxy;
.super Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CppProxy"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private final destroyed:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final nativeRef:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(J)V
    .locals 2

    invoke-direct {p0}, Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener$CppProxy;->destroyed:Ljava/util/concurrent/atomic/AtomicBoolean;

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    iput-wide p1, p0, Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener$CppProxy;->nativeRef:J

    invoke-static {p0, p1, p2}, Lcom/snapchat/djinni/NativeObjectManager;->register(Ljava/lang/Object;J)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "nativeRef is zero"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static native nativeDestroy(J)V
.end method

.method private native native_answerIncomingCall(JLjava/lang/String;)V
.end method

.method private native native_createCall(JLjava/util/ArrayList;Ljava/lang/String;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Long;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation
.end method

.method private native native_endCall(JLjava/lang/String;Ljava/lang/String;)V
.end method

.method private native native_receiveIncomingCall(JLjava/lang/String;)V
.end method


# virtual methods
.method public answerIncomingCall(Ljava/lang/String;)V
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1, p1}, Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener$CppProxy;->native_answerIncomingCall(JLjava/lang/String;)V

    return-void
.end method

.method public createCall(Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Long;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iget-wide v0, p0, Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener$CppProxy;->native_createCall(JLjava/util/ArrayList;Ljava/lang/String;)V

    return-void
.end method

.method public endCall(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener$CppProxy;->native_endCall(JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public receiveIncomingCall(Ljava/lang/String;)V
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1, p1}, Lcom/roblox/protocols/callingplatforminterface/generated/ICallingCoreListener$CppProxy;->native_receiveIncomingCall(JLjava/lang/String;)V

    return-void
.end method
