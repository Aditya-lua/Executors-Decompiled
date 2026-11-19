.class public final Lzr/c$e;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzr/c;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
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
    c = "com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$downloadFont$1"
    f = "RealFontDownloader.kt"
    l = {
        0x54,
        0x5a
    }
    m = "invokeSuspend"
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
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:I

.field public final synthetic w:Lzr/c;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroid/graphics/Typeface;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lzr/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzr/c;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/graphics/Typeface;",
            "Lkotlin/Unit;",
            ">;",
            "Leu/b<",
            "-",
            "Lzr/c$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lzr/c$e;->w:Lzr/c;

    iput-object p2, p0, Lzr/c$e;->x:Ljava/lang/String;

    iput-object p3, p0, Lzr/c$e;->y:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method

.method public static synthetic m(Ljava/lang/String;Lzr/c$b;)Z
    .locals 0

    invoke-static {p0, p1}, Lzr/c$e;->p(Ljava/lang/String;Lzr/c$b;)Z

    move-result p0

    return p0
.end method

.method public static final p(Ljava/lang/String;Lzr/c$b;)Z
    .locals 0

    invoke-virtual {p1}, Lzr/c$b;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
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

    new-instance p1, Lzr/c$e;

    iget-object v0, p0, Lzr/c$e;->w:Lzr/c;

    iget-object v1, p0, Lzr/c$e;->x:Ljava/lang/String;

    iget-object v2, p0, Lzr/c$e;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p1, v0, v1, v2, p2}, Lzr/c$e;-><init>(Lzr/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Leu/b;)V

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
    invoke-virtual {p0, p1, p2}, Lzr/c$e;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lzr/c$e;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lzr/c$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lzr/c$e;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lzr/c$e;->v:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lzr/c$e;->u:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Typeface;

    iget-object v0, p0, Lzr/c$e;->t:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    :try_start_0
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lzr/c$e;->t:Ljava/lang/Object;

    check-cast v1, Ljava/io/File;

    :try_start_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    :try_start_2
    iget-object p1, p0, Lzr/c$e;->w:Lzr/c;

    invoke-static {p1}, Lzr/c;->i(Lzr/c;)Ljava/io/File;

    move-result-object v1

    iget-object p1, p0, Lzr/c$e;->w:Lzr/c;

    iget-object v4, p0, Lzr/c$e;->x:Ljava/lang/String;

    iput-object v1, p0, Lzr/c$e;->t:Ljava/lang/Object;

    iput v3, p0, Lzr/c$e;->v:I

    invoke-static {p1, v4, v1, p0}, Lzr/c;->g(Lzr/c;Ljava/lang/String;Ljava/io/File;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    invoke-static {v1}, Landroid/graphics/Typeface;->createFromFile(Ljava/io/File;)Landroid/graphics/Typeface;

    move-result-object v5

    iget-object p1, p0, Lzr/c$e;->w:Lzr/c;

    invoke-static {p1}, Lzr/c;->h(Lzr/c;)Ljava/util/Map;

    move-result-object p1

    iget-object v3, p0, Lzr/c$e;->x:Ljava/lang/String;

    new-instance v4, Lzr/c$d$a;

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {v4, v5}, Lzr/c$d$a;-><init>(Landroid/graphics/Typeface;)V

    invoke-interface {p1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    invoke-static {}, Lav/g1;->c()Lav/n2;

    move-result-object p1

    new-instance v3, Lzr/c$e$a;

    iget-object v4, p0, Lzr/c$e;->y:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lzr/c$e;->w:Lzr/c;

    iget-object v7, p0, Lzr/c$e;->x:Ljava/lang/String;

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v8}, Lzr/c$e$a;-><init>(Lkotlin/jvm/functions/Function1;Landroid/graphics/Typeface;Lzr/c;Ljava/lang/String;Leu/b;)V

    invoke-static {v1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lzr/c$e;->t:Ljava/lang/Object;

    invoke-static {v5}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lzr/c$e;->u:Ljava/lang/Object;

    iput v2, p0, Lzr/c$e;->v:I

    invoke-static {p1, v3, p0}, Lav/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :catch_0
    iget-object p1, p0, Lzr/c$e;->w:Lzr/c;

    invoke-static {p1}, Lzr/c;->h(Lzr/c;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Lzr/c$e;->x:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lzr/c$e;->w:Lzr/c;

    invoke-static {p1}, Lzr/c;->j(Lzr/c;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lzr/c$e;->x:Ljava/lang/String;

    new-instance v1, Lzr/d;

    invoke-direct {v1, v0}, Lzr/d;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v1}, Lkotlin/collections/u;->F(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    :cond_4
    :goto_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
