.class public final Lzr/c$e$a;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzr/c$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader$downloadFont$1$1"
    f = "RealFontDownloader.kt"
    l = {}
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
.field public t:I

.field public final synthetic u:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroid/graphics/Typeface;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic v:Landroid/graphics/Typeface;

.field public final synthetic w:Lzr/c;

.field public final synthetic x:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Landroid/graphics/Typeface;Lzr/c;Ljava/lang/String;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/graphics/Typeface;",
            "Lkotlin/Unit;",
            ">;",
            "Landroid/graphics/Typeface;",
            "Lzr/c;",
            "Ljava/lang/String;",
            "Leu/b<",
            "-",
            "Lzr/c$e$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lzr/c$e$a;->u:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lzr/c$e$a;->v:Landroid/graphics/Typeface;

    iput-object p3, p0, Lzr/c$e$a;->w:Lzr/c;

    iput-object p4, p0, Lzr/c$e$a;->x:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method

.method public static synthetic m(Ljava/lang/String;Lzr/c$b;)Z
    .locals 0

    invoke-static {p0, p1}, Lzr/c$e$a;->p(Ljava/lang/String;Lzr/c$b;)Z

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
    .locals 6
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

    new-instance v0, Lzr/c$e$a;

    iget-object v1, p0, Lzr/c$e$a;->u:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lzr/c$e$a;->v:Landroid/graphics/Typeface;

    iget-object v3, p0, Lzr/c$e$a;->w:Lzr/c;

    iget-object v4, p0, Lzr/c$e$a;->x:Ljava/lang/String;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lzr/c$e$a;-><init>(Lkotlin/jvm/functions/Function1;Landroid/graphics/Typeface;Lzr/c;Ljava/lang/String;Leu/b;)V

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lzr/c$e$a;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lzr/c$e$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lzr/c$e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lzr/c$e$a;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    iget v0, p0, Lzr/c$e$a;->t:I

    if-nez v0, :cond_3

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lzr/c$e$a;->u:Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lzr/c$e$a;->v:Landroid/graphics/Typeface;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lzr/c$e$a;->w:Lzr/c;

    invoke-static {p1}, Lzr/c;->j(Lzr/c;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, Lzr/c$e$a;->x:Ljava/lang/String;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lzr/c$b;

    invoke-virtual {v3}, Lzr/c$b;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lzr/c$e$a;->w:Lzr/c;

    invoke-static {p1}, Lzr/c;->j(Lzr/c;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lzr/c$e$a;->x:Ljava/lang/String;

    new-instance v2, Lzr/e;

    invoke-direct {v2, v0}, Lzr/e;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v2}, Lkotlin/collections/u;->F(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p1, :cond_2

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v0, v0, 0x1

    check-cast v2, Lzr/c$b;

    invoke-virtual {v2}, Lzr/c$b;->a()Lkotlin/jvm/functions/Function1;

    move-result-object v2

    iget-object v3, p0, Lzr/c$e$a;->v:Landroid/graphics/Typeface;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
