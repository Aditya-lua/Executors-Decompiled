.class public final Lhj/a$c;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhj/a;->c(Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;Lcom/roblox/client/ossearch/c;Lav/l0;Landroid/content/Context;Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lav/p0;",
        "Leu/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.roblox.client.ossearch.OSSearchUtilKt$getThumbnail$fetched$1$1"
    f = "OSSearchUtil.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lav/p0;",
        "",
        "<anonymous>",
        "(Lav/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lcom/roblox/client/ossearch/c;

.field public final synthetic v:Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;

.field public final synthetic w:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(Lcom/roblox/client/ossearch/c;Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;Landroid/graphics/Bitmap;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roblox/client/ossearch/c;",
            "Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;",
            "Landroid/graphics/Bitmap;",
            "Leu/b<",
            "-",
            "Lhj/a$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lhj/a$c;->u:Lcom/roblox/client/ossearch/c;

    iput-object p2, p0, Lhj/a$c;->v:Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;

    iput-object p3, p0, Lhj/a$c;->w:Landroid/graphics/Bitmap;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Leu/b<",
            "*>;)",
            "Leu/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lhj/a$c;

    iget-object v0, p0, Lhj/a$c;->u:Lcom/roblox/client/ossearch/c;

    iget-object v1, p0, Lhj/a$c;->v:Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;

    iget-object v2, p0, Lhj/a$c;->w:Landroid/graphics/Bitmap;

    invoke-direct {p1, v0, v1, v2, p2}, Lhj/a$c;-><init>(Lcom/roblox/client/ossearch/c;Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;Landroid/graphics/Bitmap;Leu/b;)V

    return-object p1
.end method

.method public final invoke(Lav/p0;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lav/p0;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lhj/a$c;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lhj/a$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lhj/a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lhj/a$c;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    iget v0, p0, Lhj/a$c;->t:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lhj/a$c;->u:Lcom/roblox/client/ossearch/c;

    iget-object v0, p0, Lhj/a$c;->v:Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;

    invoke-virtual {v0}, Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;->getThumbnailCacheKey()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lhj/a$c;->w:Landroid/graphics/Bitmap;

    invoke-virtual {p1, v0, v1}, Lcom/roblox/client/ossearch/c;->k(Ljava/lang/String;Landroid/graphics/Bitmap;)Z

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
