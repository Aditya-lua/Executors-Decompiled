.class public final Lcom/roblox/client/ossearch/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/ossearch/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\r\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\u0003J\u0015\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\r\u0010\u000e\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000e\u0010\u0003J\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0008J\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/roblox/client/ossearch/a;",
        "",
        "<init>",
        "()V",
        "",
        "deeplink",
        "",
        "c",
        "(Ljava/lang/String;)V",
        "e",
        "Lcom/roblox/client/ossearch/a$a;",
        "metrics",
        "d",
        "(Lcom/roblox/client/ossearch/a$a;)V",
        "g",
        "f",
        "ctx",
        "b",
        "a",
        "(Ljava/lang/String;Lcom/roblox/client/ossearch/a$a;)V",
        "NativeShell_googleProdRelease"
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
.field public static final a:Lcom/roblox/client/ossearch/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/roblox/client/ossearch/a;

    invoke-direct {v0}, Lcom/roblox/client/ossearch/a;-><init>()V

    sput-object v0, Lcom/roblox/client/ossearch/a;->a:Lcom/roblox/client/ossearch/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final c(Ljava/lang/String;)V
    .locals 3
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "deeplink"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/roblox/client/datastructures/NameValuePair;

    invoke-direct {v2, v0, p0}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    filled-new-array {v2}, [Lcom/roblox/client/datastructures/NameValuePair;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/p;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    if-eqz v1, :cond_0

    new-instance v0, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v2, "placeId"

    invoke-direct {v0, v2, v1}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    const-string v0, "AndroidSearch"

    const/4 v1, 0x0

    const-string v2, "OSSearchClick"

    invoke-static {v2, v0, p0, v1}, Lvg/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/roblox/client/ossearch/a$a;)V
    .locals 6

    new-instance v0, Lcom/roblox/client/datastructures/NameValuePair;

    invoke-virtual {p2}, Lcom/roblox/client/ossearch/a$a;->d()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "itemsReceived"

    invoke-direct {v0, v2, v1}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lcom/roblox/client/datastructures/NameValuePair;

    invoke-virtual {p2}, Lcom/roblox/client/ossearch/a$a;->e()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "thumbnailURLsReceived"

    invoke-direct {v1, v3, v2}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lcom/roblox/client/datastructures/NameValuePair;

    invoke-virtual {p2}, Lcom/roblox/client/ossearch/a$a;->f()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "thumbnailsDownloaded"

    invoke-direct {v2, v4, v3}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Lcom/roblox/client/datastructures/NameValuePair;

    invoke-virtual {p2}, Lcom/roblox/client/ossearch/a$a;->c()I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "itemsAttached"

    invoke-direct {v3, v5, v4}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    filled-new-array {v0, v1, v2, v3}, [Lcom/roblox/client/datastructures/NameValuePair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/p;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->i0()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lcom/roblox/client/datastructures/NameValuePair;

    invoke-virtual {p2}, Lcom/roblox/client/ossearch/a$a;->h()Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "thumbnailsFromCache"

    invoke-direct {v1, v3, v2}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/roblox/client/datastructures/NameValuePair;

    invoke-virtual {p2}, Lcom/roblox/client/ossearch/a$a;->g()Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v2, "thumbnailsFailed"

    invoke-direct {v1, v2, p2}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    const/4 p2, 0x0

    const-string v1, "OSSearchUpdate"

    invoke-static {v1, p1, v0, p2}, Lvg/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 3

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "OSSearchUpdate"

    invoke-static {v2, p1, v0, v1}, Lvg/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    return-void
.end method

.method public final d(Lcom/roblox/client/ossearch/a$a;)V
    .locals 1
    .param p1    # Lcom/roblox/client/ossearch/a$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "metrics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "osSearch.refresh.done"

    invoke-virtual {p0, v0, p1}, Lcom/roblox/client/ossearch/a;->a(Ljava/lang/String;Lcom/roblox/client/ossearch/a$a;)V

    return-void
.end method

.method public final e()V
    .locals 1

    const-string v0, "osSearch.refresh.start"

    invoke-virtual {p0, v0}, Lcom/roblox/client/ossearch/a;->b(Ljava/lang/String;)V

    return-void
.end method

.method public final f(Lcom/roblox/client/ossearch/a$a;)V
    .locals 1
    .param p1    # Lcom/roblox/client/ossearch/a$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "metrics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "osSearch.refreshOne.done"

    invoke-virtual {p0, v0, p1}, Lcom/roblox/client/ossearch/a;->a(Ljava/lang/String;Lcom/roblox/client/ossearch/a$a;)V

    return-void
.end method

.method public final g()V
    .locals 1

    const-string v0, "osSearch.refreshOne.start"

    invoke-virtual {p0, v0}, Lcom/roblox/client/ossearch/a;->b(Ljava/lang/String;)V

    return-void
.end method
