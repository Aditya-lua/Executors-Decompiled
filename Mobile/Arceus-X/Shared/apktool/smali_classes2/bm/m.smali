.class public final Lbm/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbm/m$a;,
        Lbm/m$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ%\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\r\u0010\u000cJ%\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000e\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0014"
    }
    d2 = {
        "Lbm/m;",
        "",
        "<init>",
        "()V",
        "Landroid/app/Activity;",
        "activity",
        "Lorg/json/JSONObject;",
        "params",
        "Lbm/m$a;",
        "callback",
        "",
        "m",
        "(Landroid/app/Activity;Lorg/json/JSONObject;Lbm/m$a;)V",
        "y",
        "t",
        "Le9/b;",
        "x",
        "(Landroid/app/Activity;)Le9/b;",
        "a",
        "b",
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
.field public static final a:Lbm/m$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbm/m$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbm/m$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lbm/m;->a:Lbm/m$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final A(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final B(Lbm/m$a;Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "BlockStoreManager"

    const-string v1, "Error retrieving from Block Store: "

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v0, 0x0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lbm/m$a;->b(ILjava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Lbm/m$a;Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1}, Lbm/m;->s(Lbm/m$a;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lbm/m;->r(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic c(Lbm/m$a;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lbm/m;->u(Lbm/m$a;Ljava/lang/Boolean;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lbm/m$a;Ljava/lang/Integer;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lbm/m;->o(Lbm/m$a;Ljava/lang/Integer;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/String;Lbm/m$a;Lcom/google/android/gms/auth/blockstore/RetrieveBytesResponse;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lbm/m;->z(Ljava/lang/String;Lbm/m$a;Lcom/google/android/gms/auth/blockstore/RetrieveBytesResponse;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/google/android/gms/auth/blockstore/StoreBytesData$a;Le9/b;Lbm/m$a;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lbm/m;->n(Lcom/google/android/gms/auth/blockstore/StoreBytesData$a;Le9/b;Lbm/m$a;Ljava/lang/Boolean;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lbm/m$a;Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1}, Lbm/m;->w(Lbm/m$a;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lbm/m;->A(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic i(Lbm/m$a;Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1}, Lbm/m;->B(Lbm/m$a;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lbm/m;->p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lbm/m;->v(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic l(Lbm/m$a;Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1}, Lbm/m;->q(Lbm/m$a;Ljava/lang/Exception;)V

    return-void
.end method

.method public static final n(Lcom/google/android/gms/auth/blockstore/StoreBytesData$a;Le9/b;Lbm/m$a;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 1

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    const-string v0, "BlockStoreManager"

    if-eqz p3, :cond_0

    const/4 p3, 0x1

    invoke-virtual {p0, p3}, Lcom/google/android/gms/auth/blockstore/StoreBytesData$a;->d(Z)Lcom/google/android/gms/auth/blockstore/StoreBytesData$a;

    const-string p3, "E2EE is available, enable backing up bytes to the cloud."

    invoke-static {v0, p3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    const-string p3, "E2EE is not available, only store bytes for D2D restore."

    invoke-static {v0, p3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/auth/blockstore/StoreBytesData$a;->a()Lcom/google/android/gms/auth/blockstore/StoreBytesData;

    move-result-object p0

    const-string p3, "build(...)"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0}, Le9/b;->h(Lcom/google/android/gms/auth/blockstore/StoreBytesData;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    new-instance p1, Lbm/l;

    invoke-direct {p1, p2}, Lbm/l;-><init>(Lbm/m$a;)V

    new-instance p3, Lbm/b;

    invoke-direct {p3, p1}, Lbm/b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, p3}, Lcom/google/android/gms/tasks/Task;->g(Lsb/g;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    new-instance p1, Lbm/c;

    invoke-direct {p1, p2}, Lbm/c;-><init>(Lbm/m$a;)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/tasks/Task;->e(Lsb/f;)Lcom/google/android/gms/tasks/Task;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final o(Lbm/m$a;Ljava/lang/Integer;)Lkotlin/Unit;
    .locals 1

    const-string p1, ""

    const-string v0, "keystore"

    invoke-interface {p0, p1, v0}, Lbm/m$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final q(Lbm/m$a;Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "BlockStoreManager"

    const-string v1, "Error storing to Block Store: "

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v0, 0x0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lbm/m$a;->b(ILjava/lang/String;)V

    return-void
.end method

.method public static final r(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final s(Lbm/m$a;Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "BlockStoreManager"

    const-string v1, "Error retrieving from Block Store: "

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v0, 0x0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lbm/m$a;->b(ILjava/lang/String;)V

    return-void
.end method

.method public static final u(Lbm/m$a;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 1

    const-string p1, ""

    const-string v0, "keystore"

    invoke-interface {p0, p1, v0}, Lbm/m$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final v(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final w(Lbm/m$a;Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "BlockStoreManager"

    const-string v1, "Error deleting from Block Store: "

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v0, 0x0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lbm/m$a;->b(ILjava/lang/String;)V

    return-void
.end method

.method public static final z(Ljava/lang/String;Lbm/m$a;Lcom/google/android/gms/auth/blockstore/RetrieveBytesResponse;)Lkotlin/Unit;
    .locals 6

    invoke-virtual {p2}, Lcom/google/android/gms/auth/blockstore/RetrieveBytesResponse;->v3()Ljava/util/Map;

    move-result-object p2

    invoke-interface {p2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/auth/blockstore/RetrieveBytesResponse$BlockstoreData;

    if-nez p0, :cond_0

    const/4 p0, 0x6

    const-string p2, "No credentials found in Block Store."

    invoke-interface {p1, p0, p2}, Lbm/m$a;->b(ILjava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/auth/blockstore/RetrieveBytesResponse$BlockstoreData;->v3()[B

    move-result-object v0

    const-string p0, "getBytes(...)"

    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static/range {v0 .. v5}, Lkotlin/text/x;->A([BIIZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p2, "keystore"

    invoke-interface {p1, p0, p2}, Lbm/m$a;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x4

    const-string p2, "Failed to decode Block Store data."

    invoke-interface {p1, p0, p2}, Lbm/m$a;->b(ILjava/lang/String;)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final m(Landroid/app/Activity;Lorg/json/JSONObject;Lbm/m$a;)V
    .locals 4
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lbm/m$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "key"

    const-string v1, "activity"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "params"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "callback"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    const-string v1, "roblox_credentials"

    const-string v2, "parameters"

    invoke-virtual {p2, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v0, "getString(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "toString(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v2, "UTF_8"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p2

    const-string v0, "getBytes(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/auth/blockstore/StoreBytesData$a;

    invoke-direct {v0}, Lcom/google/android/gms/auth/blockstore/StoreBytesData$a;-><init>()V

    invoke-virtual {v0, p2}, Lcom/google/android/gms/auth/blockstore/StoreBytesData$a;->b([B)Lcom/google/android/gms/auth/blockstore/StoreBytesData$a;

    move-result-object p2

    invoke-virtual {p2, v1}, Lcom/google/android/gms/auth/blockstore/StoreBytesData$a;->c(Ljava/lang/String;)Lcom/google/android/gms/auth/blockstore/StoreBytesData$a;

    move-result-object p2
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lbm/m;->x(Landroid/app/Activity;)Le9/b;

    move-result-object p1

    invoke-interface {p1}, Le9/b;->p()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v1, Lbm/i;

    invoke-direct {v1, p2, p1, p3}, Lbm/i;-><init>(Lcom/google/android/gms/auth/blockstore/StoreBytesData$a;Le9/b;Lbm/m$a;)V

    new-instance p1, Lbm/j;

    invoke-direct {p1, v1}, Lbm/j;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/Task;->g(Lsb/g;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p2, Lbm/k;

    invoke-direct {p2, p3}, Lbm/k;-><init>(Lbm/m$a;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->e(Lsb/f;)Lcom/google/android/gms/tasks/Task;

    return-void

    :goto_1
    const-string p2, "BlockStoreManager"

    const-string v0, "JSON Exception retrieving key from parameters: "

    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 p2, 0x4

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p2, p1}, Lbm/m$a;->b(ILjava/lang/String;)V

    return-void
.end method

.method public final t(Landroid/app/Activity;Lorg/json/JSONObject;Lbm/m$a;)V
    .locals 3
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lbm/m$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "key"

    const-string v1, "activity"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "params"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "callback"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    const-string v1, "roblox_credentials"

    const-string v2, "parameters"

    invoke-virtual {p2, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string p2, "getString(...)"

    invoke-static {v1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    new-instance p2, Lcom/google/android/gms/auth/blockstore/DeleteBytesRequest$a;

    invoke-direct {p2}, Lcom/google/android/gms/auth/blockstore/DeleteBytesRequest$a;-><init>()V

    invoke-static {v1}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/auth/blockstore/DeleteBytesRequest$a;->b(Ljava/util/List;)Lcom/google/android/gms/auth/blockstore/DeleteBytesRequest$a;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/auth/blockstore/DeleteBytesRequest$a;->a()Lcom/google/android/gms/auth/blockstore/DeleteBytesRequest;

    move-result-object p2
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lbm/m;->x(Landroid/app/Activity;)Le9/b;

    move-result-object p1

    invoke-interface {p1, p2}, Le9/b;->i(Lcom/google/android/gms/auth/blockstore/DeleteBytesRequest;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p2, Lbm/f;

    invoke-direct {p2, p3}, Lbm/f;-><init>(Lbm/m$a;)V

    new-instance v0, Lbm/g;

    invoke-direct {v0, p2}, Lbm/g;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->g(Lsb/g;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p2, Lbm/h;

    invoke-direct {p2, p3}, Lbm/h;-><init>(Lbm/m$a;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->e(Lsb/f;)Lcom/google/android/gms/tasks/Task;

    return-void

    :goto_1
    const-string p2, "BlockStoreManager"

    const-string v0, "JSON Exception retrieving key from parameters: "

    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 p2, 0x4

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p2, p1}, Lbm/m$a;->b(ILjava/lang/String;)V

    return-void
.end method

.method public final x(Landroid/app/Activity;)Le9/b;
    .locals 1

    invoke-static {p1}, Le9/a;->a(Landroid/content/Context;)Le9/b;

    move-result-object p1

    const-string v0, "getClient(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final y(Landroid/app/Activity;Lorg/json/JSONObject;Lbm/m$a;)V
    .locals 3
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lbm/m$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "key"

    const-string v1, "activity"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "params"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "callback"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    const-string v1, "parameters"

    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    const-string p2, "roblox_credentials"

    :goto_0
    new-instance v0, Lkotlin/Pair;

    new-instance v1, Lcom/google/android/gms/auth/blockstore/RetrieveBytesRequest$a;

    invoke-direct {v1}, Lcom/google/android/gms/auth/blockstore/RetrieveBytesRequest$a;-><init>()V

    invoke-static {p2}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/auth/blockstore/RetrieveBytesRequest$a;->b(Ljava/util/List;)Lcom/google/android/gms/auth/blockstore/RetrieveBytesRequest$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/auth/blockstore/RetrieveBytesRequest$a;->a()Lcom/google/android/gms/auth/blockstore/RetrieveBytesRequest;

    move-result-object v1

    invoke-direct {v0, p2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0}, Lkotlin/Pair;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {v0}, Lkotlin/Pair;->b()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "component2(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/google/android/gms/auth/blockstore/RetrieveBytesRequest;

    invoke-virtual {p0, p1}, Lbm/m;->x(Landroid/app/Activity;)Le9/b;

    move-result-object p1

    invoke-interface {p1, v0}, Le9/b;->e(Lcom/google/android/gms/auth/blockstore/RetrieveBytesRequest;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Lbm/a;

    invoke-direct {v0, p2, p3}, Lbm/a;-><init>(Ljava/lang/String;Lbm/m$a;)V

    new-instance p2, Lbm/d;

    invoke-direct {p2, v0}, Lbm/d;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->g(Lsb/g;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p2, Lbm/e;

    invoke-direct {p2, p3}, Lbm/e;-><init>(Lbm/m$a;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->e(Lsb/f;)Lcom/google/android/gms/tasks/Task;

    return-void

    :goto_1
    const-string p2, "BlockStoreManager"

    const-string v0, "JSON Exception retrieving key from parameters: "

    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 p2, 0x4

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p2, p1}, Lbm/m$a;->b(ILjava/lang/String;)V

    return-void
.end method
