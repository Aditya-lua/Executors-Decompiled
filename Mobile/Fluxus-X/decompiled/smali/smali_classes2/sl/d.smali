.class public final Lsl/d;
.super Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IPlatformAppAgeSignals;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/f;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\n\u0010\tJ\u000f\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\rJ#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\u00152\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008#\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Lsl/d;",
        "Landroidx/lifecycle/f;",
        "Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IPlatformAppAgeSignals;",
        "<init>",
        "()V",
        "Landroidx/lifecycle/s;",
        "owner",
        "",
        "onCreate",
        "(Landroidx/lifecycle/s;)V",
        "onDestroy",
        "",
        "getAgeSignal",
        "()Z",
        "isAgeSignalAvailable",
        "Lrd/e;",
        "result",
        "Ljava/util/HashMap;",
        "",
        "d",
        "(Lrd/e;)Ljava/util/HashMap;",
        "",
        "status",
        "j",
        "(I)Ljava/lang/String;",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "exception",
        "e",
        "(Ljava/lang/Exception;)I",
        "Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;",
        "b",
        "Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;",
        "appAgeSignalsCore",
        "Landroid/content/Context;",
        "c",
        "Landroid/content/Context;",
        "applicationContext",
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
.field public static final a:Lsl/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static b:Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public static c:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lsl/d;

    invoke-direct {v0}, Lsl/d;-><init>()V

    sput-object v0, Lsl/d;->a:Lsl/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IPlatformAppAgeSignals;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1}, Lsl/d;->i(Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lsl/d;->h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic c(Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;Lrd/e;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lsl/d;->f(Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;Lrd/e;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;Lrd/e;)Lkotlin/Unit;
    .locals 2

    sget-object v0, Lsl/d;->a:Lsl/d;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lsl/d;->d(Lrd/e;)Ljava/util/HashMap;

    move-result-object p1

    new-instance v0, Lcom/roblox/protocols/appagesignalsplatforminterface/generated/AppAgeSignalsPlatformSuccess;

    sget-object v1, Lcom/roblox/protocols/appagesignalsplatforminterface/generated/AppAgeSignalsProvider;->GOOGLE:Lcom/roblox/protocols/appagesignalsplatforminterface/generated/AppAgeSignalsProvider;

    invoke-direct {v0, v1, p1}, Lcom/roblox/protocols/appagesignalsplatforminterface/generated/AppAgeSignalsPlatformSuccess;-><init>(Lcom/roblox/protocols/appagesignalsplatforminterface/generated/AppAgeSignalsProvider;Ljava/util/HashMap;)V

    invoke-virtual {p0, v0}, Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;->onGetAgeSignalSucceeded(Lcom/roblox/protocols/appagesignalsplatforminterface/generated/AppAgeSignalsPlatformSuccess;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final i(Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;Ljava/lang/Exception;)V
    .locals 3

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lsl/d;->a:Lsl/d;

    invoke-virtual {v0, p1}, Lsl/d;->e(Ljava/lang/Exception;)I

    move-result v0

    new-instance v1, Lcom/roblox/protocols/appagesignalsplatforminterface/generated/AppAgeSignalsPlatformError;

    sget-object v2, Lcom/roblox/protocols/appagesignalsplatforminterface/generated/AppAgeSignalsProvider;->GOOGLE:Lcom/roblox/protocols/appagesignalsplatforminterface/generated/AppAgeSignalsProvider;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "Unknown error"

    :cond_0
    invoke-direct {v1, v2, v0, p1}, Lcom/roblox/protocols/appagesignalsplatforminterface/generated/AppAgeSignalsPlatformError;-><init>(Lcom/roblox/protocols/appagesignalsplatforminterface/generated/AppAgeSignalsProvider;ILjava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;->onGetAgeSignalFailed(Lcom/roblox/protocols/appagesignalsplatforminterface/generated/AppAgeSignalsPlatformError;)V

    return-void
.end method


# virtual methods
.method public final d(Lrd/e;)Ljava/util/HashMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrd/e;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p1}, Lrd/e;->f()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    sget-object v2, Lsl/d;->a:Lsl/d;

    invoke-virtual {v2, v1}, Lsl/d;->j(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "userStatus"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {p1}, Lrd/e;->a()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    const-string v2, "ageLower"

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-virtual {p1}, Lrd/e;->b()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    const-string v2, "ageUpper"

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-virtual {p1}, Lrd/e;->d()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    const-string v1, "installId"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-object v0
.end method

.method public final e(Ljava/lang/Exception;)I
    .locals 1

    instance-of v0, p1, Lrd/a;

    if-eqz v0, :cond_0

    check-cast p1, Lrd/a;

    invoke-virtual {p1}, Lrd/a;->c()I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public getAgeSignal()Z
    .locals 6

    sget-object v0, Lsl/d;->c:Landroid/content/Context;

    sget-object v1, Lsl/d;->b:Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;

    const/4 v2, 0x0

    const-string v3, "AppAgeSignalsHandler"

    if-eqz v0, :cond_1

    if-nez v1, :cond_0

    goto :goto_3

    :cond_0
    :try_start_0
    invoke-static {v0}, Lrd/c;->a(Landroid/content/Context;)Lrd/b;

    move-result-object v0

    const-string v4, "create(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lrd/d;->a()Lrd/d$a;

    move-result-object v4

    invoke-virtual {v4}, Lrd/d$a;->a()Lrd/d;

    move-result-object v4

    const-string v5, "build(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v4}, Lrd/b;->a(Lrd/d;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v4, Lsl/a;

    invoke-direct {v4, v1}, Lsl/a;-><init>(Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;)V

    new-instance v5, Lsl/b;

    invoke-direct {v5, v4}, Lsl/b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v5}, Lcom/google/android/gms/tasks/Task;->g(Ltb/g;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v4, Lsl/c;

    invoke-direct {v4, v1}, Lsl/c;-><init>(Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;)V

    invoke-virtual {v0, v4}, Lcom/google/android/gms/tasks/Task;->e(Ltb/f;)Lcom/google/android/gms/tasks/Task;
    :try_end_0
    .catch Lrd/a; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v0

    goto :goto_2

    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "getAgeSignal: unexpected "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1, v0}, Lok/q;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return v2

    :goto_1
    const-string v1, "getAgeSignal: IllegalStateException"

    invoke-static {v3, v1, v0}, Lok/q;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return v2

    :goto_2
    const-string v1, "getAgeSignal: AgeSignalsException"

    invoke-static {v3, v1, v0}, Lok/q;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return v2

    :cond_1
    :goto_3
    const-string v0, "getAgeSignal: protocol not yet initialized"

    invoke-static {v3, v0}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v2
.end method

.method public isAgeSignalAvailable()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final j(I)Ljava/lang/String;
    .locals 2

    if-eqz p1, :cond_4

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UNRECOGNIZED_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "UNKNOWN"

    return-object p1

    :cond_1
    const-string p1, "SUPERVISED_APPROVAL_DENIED"

    return-object p1

    :cond_2
    const-string p1, "SUPERVISED_APPROVAL_PENDING"

    return-object p1

    :cond_3
    const-string p1, "SUPERVISED"

    return-object p1

    :cond_4
    const-string p1, "VERIFIED"

    return-object p1
.end method

.method public onCreate(Landroidx/lifecycle/s;)V
    .locals 2
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Landroid/content/ContextWrapper;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Landroid/content/ContextWrapper;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    :cond_1
    sput-object v1, Lsl/d;->c:Landroid/content/Context;

    invoke-static {p0}, Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;->setPlatformImpl(Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IPlatformAppAgeSignals;)Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;

    move-result-object p1

    sput-object p1, Lsl/d;->b:Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;

    return-void
.end method

.method public onDestroy(Landroidx/lifecycle/s;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    sput-object p1, Lsl/d;->b:Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;

    sput-object p1, Lsl/d;->c:Landroid/content/Context;

    return-void
.end method

.method public bridge onPause(Landroidx/lifecycle/s;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onPause(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public bridge onResume(Landroidx/lifecycle/s;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onResume(Landroidx/lifecycle/s;)V

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
