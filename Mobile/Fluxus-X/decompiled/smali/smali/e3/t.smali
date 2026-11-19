.class public final Le3/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le3/t$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0019\u0008\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J!\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0019\u0010\u000c\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ\'\u0010\u0014\u001a\u0004\u0018\u00010\t2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR*\u0010!\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00078G@GX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010 R.\u0010&\u001a\u0004\u0018\u00010\t2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\t8G@GX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010\"\u001a\u0004\u0008#\u0010\u000f\"\u0004\u0008$\u0010%R.\u0010*\u001a\u0004\u0018\u00010\t2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\t8G@GX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\'\u0010\"\u001a\u0004\u0008(\u0010\u000f\"\u0004\u0008)\u0010%\u00a8\u0006+"
    }
    d2 = {
        "Le3/t;",
        "",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "request",
        "",
        "shouldFallbackToPreU",
        "Le3/s;",
        "b",
        "(Ljava/lang/Object;Z)Le3/s;",
        "c",
        "(Z)Le3/s;",
        "f",
        "()Le3/s;",
        "g",
        "",
        "",
        "classNames",
        "e",
        "(Ljava/util/List;Landroid/content/Context;)Le3/s;",
        "a",
        "(Landroid/content/Context;)Ljava/util/List;",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "value",
        "Z",
        "getTestMode",
        "()Z",
        "setTestMode",
        "(Z)V",
        "testMode",
        "Le3/s;",
        "getTestPostUProvider",
        "setTestPostUProvider",
        "(Le3/s;)V",
        "testPostUProvider",
        "d",
        "getTestPreUProvider",
        "setTestPreUProvider",
        "testPreUProvider",
        "credentials_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final e:Le3/t$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:Z

.field public c:Le3/s;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public d:Le3/s;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le3/t$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le3/t$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Le3/t;->e:Le3/t$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le3/t;->a:Landroid/content/Context;

    return-void
.end method

.method public static synthetic d(Le3/t;Ljava/lang/Object;ZILjava/lang/Object;)Le3/s;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2}, Le3/t;->b(Ljava/lang/Object;Z)Le3/s;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    const/16 v1, 0x84

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object p1, p1, Landroid/content/pm/PackageInfo;->services:[Landroid/content/pm/ServiceInfo;

    if-eqz p1, :cond_1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p1, v2

    iget-object v3, v3, Landroid/content/pm/ServiceInfo;->metaData:Landroid/os/Bundle;

    if-eqz v3, :cond_0

    const-string v4, "androidx.credentials.CREDENTIAL_PROVIDER_KEY"

    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->M0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/Object;Z)Le3/s;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Le3/k;

    if-nez v0, :cond_7

    const-string v0, "androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Le3/k0;

    if-eqz v0, :cond_3

    check-cast p1, Le3/k0;

    invoke-virtual {p1}, Le3/k0;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le3/r;

    instance-of v1, v0, Le3/q0;

    if-nez v1, :cond_2

    instance-of v0, v0, Le3/n0;

    if-eqz v0, :cond_1

    :cond_2
    invoke-virtual {p0}, Le3/t;->f()Le3/s;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of v0, p1, Le3/w0;

    if-nez v0, :cond_6

    instance-of v0, p1, Le3/i;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Le3/i;

    invoke-virtual {v0}, Le3/i;->h()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_0

    :cond_4
    instance-of p1, p1, Le3/e;

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Le3/t;->f()Le3/s;

    move-result-object p1

    return-object p1

    :cond_5
    invoke-virtual {p0, p2}, Le3/t;->c(Z)Le3/s;

    move-result-object p1

    return-object p1

    :cond_6
    :goto_0
    invoke-virtual {p0}, Le3/t;->f()Le3/s;

    move-result-object p1

    return-object p1

    :cond_7
    :goto_1
    invoke-virtual {p0}, Le3/t;->f()Le3/s;

    move-result-object p1

    return-object p1
.end method

.method public final c(Z)Le3/s;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Le3/t;->a:Landroid/content/Context;

    invoke-static {v0}, Lj3/b;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Le3/t;->a:Landroid/content/Context;

    invoke-static {v0}, Lj3/b;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_2

    invoke-virtual {p0}, Le3/t;->g()Le3/s;

    move-result-object v0

    if-nez v0, :cond_1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Le3/t;->f()Le3/s;

    move-result-object p1

    return-object p1

    :cond_1
    return-object v0

    :cond_2
    const/16 p1, 0x21

    if-gt v0, p1, :cond_3

    invoke-virtual {p0}, Le3/t;->f()Le3/s;

    move-result-object p1

    return-object p1

    :cond_3
    const/4 p1, 0x0

    return-object p1

    :cond_4
    :goto_0
    invoke-virtual {p0}, Le3/t;->f()Le3/s;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ljava/util/List;Landroid/content/Context;)Le3/s;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/content/Context;",
            ")",
            "Le3/s;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    move-object v1, v0

    :catchall_0
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    :try_start_0
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const-class v3, Landroid/content/Context;

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type androidx.credentials.CredentialProvider"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Le3/s;

    invoke-interface {v2}, Le3/s;->isAvailableOnDevice()Z

    move-result v3

    if-eqz v3, :cond_0

    if-eqz v1, :cond_1

    const-string v2, "CredProviderFactory"

    const-string v3, "Only one active OEM CredentialProvider allowed"

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :cond_1
    move-object v1, v2

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public final f()Le3/s;
    .locals 3

    iget-boolean v0, p0, Le3/t;->b:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Le3/t;->d:Le3/s;

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0}, Le3/s;->isAvailableOnDevice()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Le3/t;->d:Le3/s;

    return-object v0

    :cond_1
    return-object v1

    :cond_2
    iget-object v0, p0, Le3/t;->a:Landroid/content/Context;

    invoke-virtual {p0, v0}, Le3/t;->a(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    return-object v1

    :cond_3
    iget-object v1, p0, Le3/t;->a:Landroid/content/Context;

    invoke-virtual {p0, v0, v1}, Le3/t;->e(Ljava/util/List;Landroid/content/Context;)Le3/s;

    move-result-object v0

    return-object v0
.end method

.method public final g()Le3/s;
    .locals 3

    iget-boolean v0, p0, Le3/t;->b:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Le3/t;->c:Le3/s;

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0}, Le3/s;->isAvailableOnDevice()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Le3/t;->c:Le3/s;

    return-object v0

    :cond_1
    return-object v1

    :cond_2
    new-instance v0, Le3/d0;

    iget-object v2, p0, Le3/t;->a:Landroid/content/Context;

    invoke-direct {v0, v2}, Le3/d0;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Le3/d0;->isAvailableOnDevice()Z

    move-result v2

    if-eqz v2, :cond_3

    return-object v0

    :cond_3
    return-object v1
.end method
