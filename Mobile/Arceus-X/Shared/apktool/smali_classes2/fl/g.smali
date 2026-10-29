.class public final Lfl/g;
.super Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IPlatformAppAgeSignals;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/f;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Lfl/g;",
        "Landroidx/lifecycle/f;",
        "Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IPlatformAppAgeSignals;",
        "<init>",
        "()V",
        "Lpd/e;",
        "result",
        "Ljava/util/HashMap;",
        "",
        "c",
        "(Lpd/e;)Ljava/util/HashMap;",
        "",
        "status",
        "h",
        "(I)Ljava/lang/String;",
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
        "f",
        "(Ljava/lang/String;)I",
        "Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;",
        "b",
        "Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;",
        "appAgeSignalsCore",
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
.field public static final a:Lfl/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static b:Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfl/g;

    invoke-direct {v0}, Lfl/g;-><init>()V

    sput-object v0, Lfl/g;->a:Lfl/g;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IPlatformAppAgeSignals;-><init>()V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lfl/g;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;Lpd/e;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lfl/g;->d(Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;Lpd/e;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lpd/e;)Ljava/util/HashMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpd/e;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p1}, Lpd/e;->f()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    sget-object v2, Lfl/g;->a:Lfl/g;

    invoke-direct {v2, v1}, Lfl/g;->h(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "userStatus"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {p1}, Lpd/e;->a()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    const-string v2, "ageLower"

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-virtual {p1}, Lpd/e;->b()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    const-string v2, "ageUpper"

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-virtual {p1}, Lpd/e;->d()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    const-string v1, "installId"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-object v0
.end method

.method private static final d(Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;Lpd/e;)Lkotlin/Unit;
    .locals 2

    sget-object v0, Lfl/g;->a:Lfl/g;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {v0, p1}, Lfl/g;->c(Lpd/e;)Ljava/util/HashMap;

    move-result-object p1

    new-instance v0, Lcom/roblox/protocols/appagesignalsplatforminterface/generated/AppAgeSignalsPlatformSuccess;

    sget-object v1, Lcom/roblox/protocols/appagesignalsplatforminterface/generated/AppAgeSignalsProvider;->GOOGLE:Lcom/roblox/protocols/appagesignalsplatforminterface/generated/AppAgeSignalsProvider;

    invoke-direct {v0, v1, p1}, Lcom/roblox/protocols/appagesignalsplatforminterface/generated/AppAgeSignalsPlatformSuccess;-><init>(Lcom/roblox/protocols/appagesignalsplatforminterface/generated/AppAgeSignalsProvider;Ljava/util/HashMap;)V

    invoke-virtual {p0, v0}, Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;->onGetAgeSignalSucceeded(Lcom/roblox/protocols/appagesignalsplatforminterface/generated/AppAgeSignalsPlatformSuccess;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final h(I)Ljava/lang/String;
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


# virtual methods
.method public final f(Ljava/lang/String;)I
    .locals 1

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toUpperCase(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "SUPERVISED_APPROVAL_DENIED"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x3

    return p1

    :sswitch_1
    const-string v0, "SUPERVISED_APPROVAL_PENDING"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x2

    return p1

    :sswitch_2
    const-string v0, "VERIFIED"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    return p1

    :sswitch_3
    const-string v0, "SUPERVISED"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    :cond_2
    :goto_0
    const/4 p1, 0x4

    return p1

    :cond_3
    const/4 p1, 0x1

    return p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x483fc1dc -> :sswitch_3
        -0x4839f138 -> :sswitch_2
        -0x3452fca -> :sswitch_1
        0x6749e0fc -> :sswitch_0
    .end sparse-switch
.end method

.method public getAgeSignal()Z
    .locals 5

    sget-object v0, Lfl/g;->b:Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;

    if-nez v0, :cond_0

    const-string v0, "FakeAppAgeSignalsHandler"

    const-string v1, "getAgeSignal: protocol not yet initialized"

    invoke-static {v0, v1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->Y()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->S2()I

    move-result v2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v3

    invoke-interface {v3}, Lth/i;->d2()I

    move-result v3

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p0, v1}, Lfl/g;->f(Ljava/lang/String;)I

    move-result v1

    invoke-static {}, Lpd/e;->c()Lpd/e$a;

    move-result-object v4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v1}, Lpd/e$a;->f(Ljava/lang/Integer;)Lpd/e$a;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lpd/e$a;->b(Ljava/lang/Integer;)Lpd/e$a;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lpd/e$a;->c(Ljava/lang/Integer;)Lpd/e$a;

    move-result-object v1

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lpd/e$a;->d(Ljava/lang/String;)Lpd/e$a;

    move-result-object v1

    invoke-virtual {v1}, Lpd/e$a;->a()Lpd/e;

    move-result-object v1

    const-string v2, "build(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lrd/a;

    invoke-direct {v2}, Lrd/a;-><init>()V

    invoke-virtual {v2, v1}, Lrd/a;->b(Lpd/e;)V

    invoke-static {}, Lpd/d;->a()Lpd/d$a;

    move-result-object v1

    invoke-virtual {v1}, Lpd/d$a;->a()Lpd/d;

    move-result-object v1

    invoke-virtual {v2, v1}, Lrd/a;->a(Lpd/d;)Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    new-instance v2, Lfl/e;

    invoke-direct {v2, v0}, Lfl/e;-><init>(Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;)V

    new-instance v0, Lfl/f;

    invoke-direct {v0, v2}, Lfl/f;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/Task;->g(Lsb/g;)Lcom/google/android/gms/tasks/Task;

    const/4 v0, 0x1

    return v0
.end method

.method public isAgeSignalAvailable()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public onCreate(Landroidx/lifecycle/s;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;->setPlatformImpl(Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IPlatformAppAgeSignals;)Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;

    move-result-object p1

    sput-object p1, Lfl/g;->b:Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;

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

    sput-object p1, Lfl/g;->b:Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;

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
