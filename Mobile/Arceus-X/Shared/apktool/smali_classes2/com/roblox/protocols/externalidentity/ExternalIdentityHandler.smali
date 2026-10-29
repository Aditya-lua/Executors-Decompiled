.class public final Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;
.super Lcom/roblox/protocols/externalidentityplatforminterface/generated/IPlatformExternalIdentity;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/f;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u00c7\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0019\u0010\u0008\u001a\u00020\u00072\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u0013J\u001f\u0010\u001c\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJK\u0010#\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001e2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002\u00a2\u0006\u0004\u0008#\u0010$J\u001f\u0010%\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\u0008%\u0010\u001dJS\u0010\'\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u000f2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002\u00a2\u0006\u0004\u0008\'\u0010(J\u000f\u0010)\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008)\u0010*J\u000f\u0010+\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008+\u0010\u0004J\u000f\u0010,\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008,\u0010\u0004J\u001f\u0010-\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\u0008-\u0010\u001dJ\u000f\u0010.\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008.\u0010/J\u000f\u00100\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u00080\u0010/J\u0017\u00103\u001a\u00020\u000c2\u0006\u00102\u001a\u000201H\u0016\u00a2\u0006\u0004\u00083\u00104J\u0017\u00105\u001a\u00020\u000c2\u0006\u00102\u001a\u000201H\u0016\u00a2\u0006\u0004\u00085\u00104J\u0017\u00106\u001a\u00020\u000c2\u0006\u00102\u001a\u000201H\u0016\u00a2\u0006\u0004\u00086\u00104J\u0017\u00107\u001a\u00020\u000c2\u0006\u00102\u001a\u000201H\u0016\u00a2\u0006\u0004\u00087\u00104J\u0017\u00108\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u00088\u0010\u0015J\u001f\u0010;\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010:\u001a\u000209H\u0016\u00a2\u0006\u0004\u0008;\u0010<J\u0017\u0010=\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008=\u0010\u0015R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008?\u0010@R\u001e\u0010B\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010A8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008B\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008E\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008H\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008K\u0010LR\u0018\u0010M\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008M\u0010NR\u0018\u0010O\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008O\u0010PR\u0018\u0010Q\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008Q\u0010PR(\u0010S\u001a\u00020R8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008S\u0010T\u0012\u0004\u0008Y\u0010\u0004\u001a\u0004\u0008U\u0010V\"\u0004\u0008W\u0010X\u00a8\u0006Z"
    }
    d2 = {
        "Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;",
        "Landroidx/lifecycle/f;",
        "Lcom/roblox/protocols/externalidentityplatforminterface/generated/IPlatformExternalIdentity;",
        "<init>",
        "()V",
        "",
        "url",
        "",
        "onAppleRedirectReceived",
        "(Ljava/lang/String;)Z",
        "Lj/b;",
        "foregroundActivity",
        "",
        "bringHostToFront",
        "(Lj/b;)V",
        "",
        "operationId",
        "idToken",
        "onGoogleProofSuccess",
        "(JLjava/lang/String;)V",
        "onAppleDismissedWithoutRedirect",
        "(J)V",
        "errorClassName",
        "onAppleLaunchFailed",
        "onGoogleProofCancelled",
        "onGoogleProofError",
        "Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;",
        "provider",
        "beginInFlight",
        "(JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;)V",
        "Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;",
        "status",
        "Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;",
        "proofType",
        "errorClass",
        "completeInFlight",
        "(JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;Ljava/lang/String;Ljava/lang/String;)V",
        "cancelInFlight",
        "durationMs",
        "emitProofResult",
        "(JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;Ljava/lang/String;Ljava/lang/String;)V",
        "inFlightDurationMs",
        "()J",
        "clearInFlightTrackers",
        "abortInFlightProof",
        "reportUnavailable",
        "isGoogleSignInAvailable",
        "()Z",
        "isAppleSignInAvailable",
        "Landroidx/lifecycle/s;",
        "owner",
        "onCreate",
        "(Landroidx/lifecycle/s;)V",
        "onResume",
        "onPause",
        "onDestroy",
        "getCapabilities",
        "Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;",
        "request",
        "acquireProof",
        "(JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;)V",
        "cancel",
        "Lcom/roblox/protocols/externalidentityplatforminterface/generated/IExternalIdentityCoreListener;",
        "core",
        "Lcom/roblox/protocols/externalidentityplatforminterface/generated/IExternalIdentityCoreListener;",
        "Ljava/lang/ref/WeakReference;",
        "activityWeakRef",
        "Ljava/lang/ref/WeakReference;",
        "Lku/p0;",
        "scope",
        "Lku/p0;",
        "Lku/d2;",
        "runningJob",
        "Lku/d2;",
        "Lfm/d;",
        "appleSession",
        "Lfm/d;",
        "inFlightProofProvider",
        "Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;",
        "inFlightOperationId",
        "Ljava/lang/Long;",
        "inFlightStartedAtElapsedMs",
        "Lkl/a;",
        "eventReporter",
        "Lkl/a;",
        "getEventReporter$universalapp_googleProdRelease",
        "()Lkl/a;",
        "setEventReporter$universalapp_googleProdRelease",
        "(Lkl/a;)V",
        "getEventReporter$universalapp_googleProdRelease$annotations",
        "universalapp_googleProdRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static activityWeakRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lj/b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private static appleSession:Lfm/d;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private static core:Lcom/roblox/protocols/externalidentityplatforminterface/generated/IExternalIdentityCoreListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private static eventReporter:Lkl/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static inFlightOperationId:Ljava/lang/Long;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private static inFlightProofProvider:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private static inFlightStartedAtElapsedMs:Ljava/lang/Long;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private static runningJob:Lku/d2;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private static final scope:Lku/p0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;

    invoke-direct {v0}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;-><init>()V

    sput-object v0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->INSTANCE:Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, Lku/z2;->b(Lku/d2;ILjava/lang/Object;)Lku/a0;

    move-result-object v0

    invoke-static {}, Lku/g1;->c()Lku/n2;

    move-result-object v1

    invoke-virtual {v1}, Lku/n2;->X()Lku/n2;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-static {v0}, Lku/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lku/p0;

    move-result-object v0

    sput-object v0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->scope:Lku/p0;

    sget-object v0, Lkl/f;->a:Lkl/f;

    sput-object v0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->eventReporter:Lkl/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/protocols/externalidentityplatforminterface/generated/IPlatformExternalIdentity;-><init>()V

    return-void
.end method

.method public static synthetic a(JLjava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->acquireProof$lambda$2(JLjava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private final abortInFlightProof()V
    .locals 4

    sget-object v0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->inFlightOperationId:Ljava/lang/Long;

    sget-object v1, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->inFlightProofProvider:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-direct {p0, v2, v3, v1}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->cancelInFlight(JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;)V

    return-void

    :cond_0
    sget-object v0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->runningJob:Lku/d2;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lku/d2$a;->a(Lku/d2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_1
    sput-object v1, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->runningJob:Lku/d2;

    invoke-direct {p0}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->clearInFlightTrackers()V

    return-void
.end method

.method public static final synthetic access$onGoogleProofCancelled(Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->onGoogleProofCancelled(J)V

    return-void
.end method

.method public static final synthetic access$onGoogleProofError(Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;JLjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->onGoogleProofError(JLjava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$onGoogleProofSuccess(Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;JLjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->onGoogleProofSuccess(JLjava/lang/String;)V

    return-void
.end method

.method private static final acquireProof$lambda$1(J)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->INSTANCE:Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;

    invoke-direct {v0, p0, p1}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->onAppleDismissedWithoutRedirect(J)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method private static final acquireProof$lambda$2(JLjava/lang/String;)Lkotlin/Unit;
    .locals 1

    const-string v0, "errorClassName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->INSTANCE:Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;

    invoke-direct {v0, p0, p1, p2}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->onAppleLaunchFailed(JLjava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic b(J)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->acquireProof$lambda$1(J)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private final beginInFlight(JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;)V
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    sput-object p1, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->inFlightOperationId:Ljava/lang/Long;

    sput-object p3, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->inFlightProofProvider:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    sput-object p1, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->inFlightStartedAtElapsedMs:Ljava/lang/Long;

    sget-object p1, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->eventReporter:Lkl/a;

    invoke-interface {p1, p3}, Lkl/a;->b(Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;)V

    return-void
.end method

.method public static final bringHostToFront(Lj/b;)V
    .locals 2
    .param p0    # Lj/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "foregroundActivity"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->activityWeakRef:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj/b;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Landroid/content/Intent;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-direct {v1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v0, 0x24000000

    invoke-virtual {v1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "addFlags(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private final cancelInFlight(JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;)V
    .locals 12

    sget-object v4, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;->CANCELLED:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

    invoke-direct {p0}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->inFlightDurationMs()J

    move-result-wide v5

    const/16 v10, 0x70

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    invoke-static/range {v0 .. v11}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->emitProofResult$default(Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    sget-object p1, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->runningJob:Lku/d2;

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    const/4 p3, 0x1

    invoke-static {p1, p2, p3, p2}, Lku/d2$a;->a(Lku/d2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    sput-object p2, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->runningJob:Lku/d2;

    invoke-direct {p0}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->clearInFlightTrackers()V

    return-void
.end method

.method private final clearInFlightTrackers()V
    .locals 1

    sget-object v0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->appleSession:Lfm/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lfm/d;->e()V

    :cond_0
    const/4 v0, 0x0

    sput-object v0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->appleSession:Lfm/d;

    sput-object v0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->inFlightProofProvider:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    sput-object v0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->inFlightOperationId:Ljava/lang/Long;

    sput-object v0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->inFlightStartedAtElapsedMs:Ljava/lang/Long;

    return-void
.end method

.method private final completeInFlight(JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;Ljava/lang/String;Ljava/lang/String;)V
    .locals 10

    invoke-direct {p0}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->inFlightDurationMs()J

    move-result-wide v5

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    invoke-direct/range {v0 .. v9}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->emitProofResult(JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    sput-object p1, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->runningJob:Lku/d2;

    invoke-direct {p0}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->clearInFlightTrackers()V

    return-void
.end method

.method public static synthetic completeInFlight$default(Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p9, p8, 0x8

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move-object p5, v0

    :cond_0
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_1

    move-object p6, v0

    :cond_1
    and-int/lit8 p8, p8, 0x20

    if-eqz p8, :cond_2

    move-object p7, v0

    :cond_2
    invoke-direct/range {p0 .. p7}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->completeInFlight(JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final emitProofResult(JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    sget-object v0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->eventReporter:Lkl/a;

    sget-object v1, Lkl/f;->a:Lkl/f;

    invoke-virtual {v1, p4}, Lkl/f;->j(Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;)Ljava/lang/String;

    move-result-object v2

    move-object v1, p3

    move-wide v4, p5

    move-object v3, p8

    invoke-interface/range {v0 .. v5}, Lkl/a;->a(Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;Ljava/lang/String;Ljava/lang/String;J)V

    sget-object p3, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->core:Lcom/roblox/protocols/externalidentityplatforminterface/generated/IExternalIdentityCoreListener;

    if-eqz p3, :cond_0

    new-instance p5, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityResult;

    invoke-direct {p5, v1, p4, p7, v3}, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityResult;-><init>(Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;Ljava/lang/String;)V

    invoke-virtual {p3, p1, p2, p5, p9}, Lcom/roblox/protocols/externalidentityplatforminterface/generated/IExternalIdentityCoreListener;->onProofResult(JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityResult;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static synthetic emitProofResult$default(Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p11, p10, 0x10

    const/4 v0, 0x0

    if-eqz p11, :cond_0

    move-object p7, v0

    :cond_0
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_1

    move-object p8, v0

    :cond_1
    and-int/lit8 p10, p10, 0x40

    if-eqz p10, :cond_2

    move-object p9, v0

    :cond_2
    invoke-direct/range {p0 .. p9}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->emitProofResult(JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic getEventReporter$universalapp_googleProdRelease$annotations()V
    .locals 0

    return-void
.end method

.method private final inFlightDurationMs()J
    .locals 7

    sget-object v0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->inFlightStartedAtElapsedMs:Ljava/lang/Long;

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    sub-long/2addr v5, v3

    invoke-static {v5, v6, v1, v2}, Lkotlin/ranges/d;->d(JJ)J

    move-result-wide v0

    return-wide v0

    :cond_0
    return-wide v1
.end method

.method private final isAppleSignInAvailable()Z
    .locals 1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->O1()Z

    move-result v0

    return v0
.end method

.method private final isGoogleSignInAvailable()Z
    .locals 3

    sget-object v0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->activityWeakRef:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj/b;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lgk/l;->a(Landroid/content/Context;)Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->y5()Z

    move-result v2

    if-eqz v0, :cond_1

    if-eqz v2, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    return v1
.end method

.method private final onAppleDismissedWithoutRedirect(J)V
    .locals 2

    sget-object v0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->inFlightOperationId:Ljava/lang/Long;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    cmp-long v0, v0, p1

    if-nez v0, :cond_2

    sget-object v0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->inFlightProofProvider:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    sget-object v1, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;->APPLE:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->cancel(J)V

    :cond_2
    :goto_0
    return-void
.end method

.method private final onAppleLaunchFailed(JLjava/lang/String;)V
    .locals 11

    sget-object v0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->inFlightOperationId:Ljava/lang/Long;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    cmp-long v0, v0, p1

    if-nez v0, :cond_2

    sget-object v0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->inFlightProofProvider:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    sget-object v4, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;->APPLE:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    if-eq v0, v4, :cond_1

    goto :goto_0

    :cond_1
    sget-object v5, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;->FAILED:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

    const/16 v9, 0x28

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    move-wide v2, p1

    move-object v7, p3

    invoke-static/range {v1 .. v10}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->completeInFlight$default(Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static final onAppleRedirectReceived(Ljava/lang/String;)Z
    .locals 11
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    sget-object v0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->inFlightOperationId:Ljava/lang/Long;

    sget-object v4, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->inFlightProofProvider:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    if-eqz v0, :cond_3

    sget-object v1, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;->APPLE:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    if-eq v4, v1, :cond_0

    goto :goto_2

    :cond_0
    if-eqz p0, :cond_2

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p0}, Lcom/roblox/universalapp/linking/JNIWebLoginProtocol;->maybeHandleColdStartProtocolLaunch(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object v1

    invoke-virtual {v1, p0}, Lkm/f;->k(Ljava/lang/String;)V

    sget-object v1, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->INSTANCE:Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sget-object v5, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;->SUCCESS:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

    sget-object v6, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;->SESSIONESTABLISHED:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;

    const/16 v9, 0x30

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v10}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->completeInFlight$default(Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v1, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->INSTANCE:Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sget-object v5, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;->FAILED:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

    const/16 v9, 0x28

    const/4 v10, 0x0

    const/4 v6, 0x0

    const-string v7, "Apple sign in failed or missing ticket"

    const/4 v8, 0x0

    invoke-static/range {v1 .. v10}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->completeInFlight$default(Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    :goto_1
    const/4 p0, 0x1

    return p0

    :cond_3
    :goto_2
    const/4 p0, 0x0

    return p0
.end method

.method private final onGoogleProofCancelled(J)V
    .locals 11

    sget-object v0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->inFlightOperationId:Ljava/lang/Long;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    cmp-long v0, v0, p1

    if-eqz v0, :cond_1

    :goto_0
    return-void

    :cond_1
    sget-object v4, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;->GOOGLE:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    sget-object v5, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;->CANCELLED:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

    const/16 v9, 0x38

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    move-wide v2, p1

    invoke-static/range {v1 .. v10}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->completeInFlight$default(Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method private final onGoogleProofError(JLjava/lang/String;)V
    .locals 11

    sget-object v0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->inFlightOperationId:Ljava/lang/Long;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    cmp-long v0, v0, p1

    if-eqz v0, :cond_1

    :goto_0
    return-void

    :cond_1
    sget-object v4, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;->GOOGLE:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    sget-object v5, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;->FAILED:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

    const/16 v9, 0x28

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    move-wide v2, p1

    move-object v7, p3

    invoke-static/range {v1 .. v10}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->completeInFlight$default(Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method private final onGoogleProofSuccess(JLjava/lang/String;)V
    .locals 11

    sget-object v0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->inFlightOperationId:Ljava/lang/Long;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    cmp-long v0, v0, p1

    if-eqz v0, :cond_1

    :goto_0
    return-void

    :cond_1
    sget-object v4, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;->GOOGLE:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    sget-object v5, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;->SUCCESS:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

    sget-object v6, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;->IDTOKEN:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;

    const/16 v9, 0x10

    const/4 v10, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-wide v2, p1

    move-object v8, p3

    invoke-static/range {v1 .. v10}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->completeInFlight$default(Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method private final reportUnavailable(JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;)V
    .locals 12

    sget-object v4, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;->UNAVAILABLE:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

    const/16 v10, 0x70

    const/4 v11, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    invoke-static/range {v0 .. v11}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->emitProofResult$default(Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public acquireProof(JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;)V
    .locals 11
    .param p3    # Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "request"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->activityWeakRef:Ljava/lang/ref/WeakReference;

    const-string v1, "getProvider(...)"

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lj/b;

    if-nez v3, :cond_1

    :cond_0
    move-wide v5, p1

    move-object v4, p3

    goto/16 :goto_1

    :cond_1
    invoke-direct {p0}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->abortInFlightProof()V

    invoke-virtual {p3}, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;->getProvider()Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    move-result-object v0

    if-nez v0, :cond_2

    const/4 v0, -0x1

    goto :goto_0

    :cond_2
    sget-object v2, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    :goto_0
    const/4 v2, 0x1

    if-eq v0, v2, :cond_5

    const/4 v2, 0x2

    if-ne v0, v2, :cond_4

    invoke-direct {p0}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->isAppleSignInAvailable()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p3}, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;->getProvider()Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    move-result-object p3

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->reportUnavailable(JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;)V

    return-void

    :cond_3
    invoke-virtual {p3}, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;->getProvider()Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, v0}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->beginInFlight(JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;)V

    new-instance v4, Lfm/d;

    new-instance v7, Lfm/a;

    invoke-direct {v7, v3}, Lfm/a;-><init>(Lj/b;)V

    sget-object v8, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->scope:Lku/p0;

    new-instance v9, Lkl/b;

    invoke-direct {v9}, Lkl/b;-><init>()V

    new-instance v10, Lkl/c;

    invoke-direct {v10}, Lkl/c;-><init>()V

    move-wide v5, p1

    invoke-direct/range {v4 .. v10}, Lfm/d;-><init>(JLfm/a;Lku/p0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V

    sput-object v4, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->appleSession:Lfm/d;

    invoke-virtual {p3}, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;->getBrowserStartUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Lfm/d;->k(Ljava/lang/String;)V

    return-void

    :cond_4
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1

    :cond_5
    move-wide v5, p1

    invoke-direct {p0}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->isGoogleSignInAvailable()Z

    move-result p1

    if-nez p1, :cond_6

    invoke-virtual {p3}, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;->getProvider()Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v5, v6, p1}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->reportUnavailable(JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;)V

    return-void

    :cond_6
    invoke-virtual {p3}, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;->getProvider()Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v5, v6, p1}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->beginInFlight(JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;)V

    sget-object p1, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->scope:Lku/p0;

    new-instance v2, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler$b;

    const/4 v7, 0x0

    move-object v4, p3

    invoke-direct/range {v2 .. v7}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler$b;-><init>(Lj/b;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;JLnt/b;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v4, p1

    move-object v7, v2

    invoke-static/range {v4 .. v9}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    move-result-object p1

    sput-object p1, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->runningJob:Lku/d2;

    return-void

    :goto_1
    invoke-virtual {v4}, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;->getProvider()Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v5, v6, p1}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->reportUnavailable(JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;)V

    return-void
.end method

.method public cancel(J)V
    .locals 3

    sget-object v0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->inFlightProofProvider:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    sget-object v1, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->inFlightOperationId:Ljava/lang/Long;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    cmp-long v1, v1, p1

    if-nez v1, :cond_2

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1, p2, v0}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->cancelInFlight(JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public getCapabilities(J)V
    .locals 3

    new-instance v0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityCapabilities;

    invoke-direct {p0}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->isGoogleSignInAvailable()Z

    move-result v1

    invoke-direct {p0}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->isAppleSignInAvailable()Z

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityCapabilities;-><init>(ZZ)V

    sget-object v1, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->core:Lcom/roblox/protocols/externalidentityplatforminterface/generated/IExternalIdentityCoreListener;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1, p2, v0}, Lcom/roblox/protocols/externalidentityplatforminterface/generated/IExternalIdentityCoreListener;->onCapabilitiesResult(JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityCapabilities;)V

    :cond_0
    return-void
.end method

.method public final getEventReporter$universalapp_googleProdRelease()Lkl/a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->eventReporter:Lkl/a;

    return-object v0
.end method

.method public onCreate(Landroidx/lifecycle/s;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/roblox/protocols/externalidentityplatforminterface/generated/IExternalIdentityCoreListener;->setPlatformImpl(Lcom/roblox/protocols/externalidentityplatforminterface/generated/IPlatformExternalIdentity;)Lcom/roblox/protocols/externalidentityplatforminterface/generated/IExternalIdentityCoreListener;

    move-result-object v0

    sput-object v0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->core:Lcom/roblox/protocols/externalidentityplatforminterface/generated/IExternalIdentityCoreListener;

    instance-of v0, p1, Lj/b;

    if-eqz v0, :cond_0

    check-cast p1, Lj/b;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->activityWeakRef:Ljava/lang/ref/WeakReference;

    :cond_1
    return-void
.end method

.method public onDestroy(Landroidx/lifecycle/s;)V
    .locals 4
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->inFlightOperationId:Ljava/lang/Long;

    sget-object v0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->inFlightProofProvider:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-direct {p0, v2, v3, v0}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->cancelInFlight(JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;)V

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->runningJob:Lku/d2;

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    invoke-static {p1, v1, v0, v1}, Lku/d2$a;->a(Lku/d2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_1
    sput-object v1, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->runningJob:Lku/d2;

    :goto_0
    sput-object v1, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->core:Lcom/roblox/protocols/externalidentityplatforminterface/generated/IExternalIdentityCoreListener;

    sget-object p1, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->activityWeakRef:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->clear()V

    :cond_2
    sput-object v1, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->activityWeakRef:Ljava/lang/ref/WeakReference;

    invoke-direct {p0}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->clearInFlightTrackers()V

    return-void
.end method

.method public onPause(Landroidx/lifecycle/s;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->appleSession:Lfm/d;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lfm/d;->h()V

    :cond_0
    return-void
.end method

.method public onResume(Landroidx/lifecycle/s;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->appleSession:Lfm/d;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lfm/d;->i()V

    :cond_0
    return-void
.end method

.method public bridge onStart(Landroidx/lifecycle/s;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onStart(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public bridge onStop(Landroidx/lifecycle/s;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onStop(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public final setEventReporter$universalapp_googleProdRelease(Lkl/a;)V
    .locals 1
    .param p1    # Lkl/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->eventReporter:Lkl/a;

    return-void
.end method
