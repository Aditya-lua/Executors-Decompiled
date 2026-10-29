.class public final Lcom/roblox/protocols/externalidentityplatforminterface/generated/IPlatformExternalIdentity$CppProxy;
.super Lcom/roblox/protocols/externalidentityplatforminterface/generated/IPlatformExternalIdentity;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/protocols/externalidentityplatforminterface/generated/IPlatformExternalIdentity;
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

    invoke-direct {p0}, Lcom/roblox/protocols/externalidentityplatforminterface/generated/IPlatformExternalIdentity;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/IPlatformExternalIdentity$CppProxy;->destroyed:Ljava/util/concurrent/atomic/AtomicBoolean;

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    iput-wide p1, p0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/IPlatformExternalIdentity$CppProxy;->nativeRef:J

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

.method private native native_acquireProof(JJLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;)V
.end method

.method private native native_cancel(JJ)V
.end method

.method private native native_getCapabilities(JJ)V
.end method


# virtual methods
.method public acquireProof(JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;)V
    .locals 6

    iget-wide v1, p0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/IPlatformExternalIdentity$CppProxy;->nativeRef:J

    move-object v0, p0

    move-wide v3, p1

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/roblox/protocols/externalidentityplatforminterface/generated/IPlatformExternalIdentity$CppProxy;->native_acquireProof(JJLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;)V

    return-void
.end method

.method public cancel(J)V
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/IPlatformExternalIdentity$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/roblox/protocols/externalidentityplatforminterface/generated/IPlatformExternalIdentity$CppProxy;->native_cancel(JJ)V

    return-void
.end method

.method public getCapabilities(J)V
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/IPlatformExternalIdentity$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/roblox/protocols/externalidentityplatforminterface/generated/IPlatformExternalIdentity$CppProxy;->native_getCapabilities(JJ)V

    return-void
.end method
