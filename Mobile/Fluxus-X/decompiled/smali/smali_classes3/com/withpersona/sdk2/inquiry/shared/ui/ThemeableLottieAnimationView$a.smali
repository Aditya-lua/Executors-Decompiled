.class public final Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView$a;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;->G(Ljava/lang/String;)Lav/d2;
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
    c = "com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView$loadFromUrl$1"
    f = "ThemeableLottieAnimationView.kt"
    l = {
        0x42,
        0x4f
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

.field public u:I

.field public final synthetic v:Ljava/lang/String;

.field public final synthetic w:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;",
            "Leu/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView$a;->v:Ljava/lang/String;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView$a;->w:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method

.method public static synthetic m(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView$a;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final p(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/net/URL;

    invoke-direct {v1, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p0}, Lew/v;->j(Ljava/io/InputStream;)Lew/l0;

    move-result-object v1

    invoke-static {v1}, Lew/v;->c(Lew/l0;)Lew/g;

    move-result-object v1

    invoke-interface {v1}, Lew/g;->V2()Ljava/lang/String;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {p0, v0}, Llu/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v2

    :try_start_4
    invoke-static {p0, v1}, Llu/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    return-object v0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 2
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

    new-instance p1, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView$a;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView$a;->v:Ljava/lang/String;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView$a;->w:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    invoke-direct {p1, v0, v1, p2}, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView$a;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;Leu/b;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView$a;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView$a;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView$a;->u:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView$a;->t:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    invoke-static {}, Lav/g1;->b()Lav/l0;

    move-result-object p1

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView$a;->v:Ljava/lang/String;

    new-instance v4, Lkr/y;

    invoke-direct {v4, v1}, Lkr/y;-><init>(Ljava/lang/String;)V

    iput v3, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView$a;->u:I

    invoke-static {p1, v4, p0}, Lav/a2;->b(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_4

    invoke-static {}, Lav/g1;->c()Lav/n2;

    move-result-object v1

    new-instance v3, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView$a$a;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView$a;->w:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    const/4 v5, 0x0

    invoke-direct {v3, v4, p1, v5}, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView$a$a;-><init>(Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;Ljava/lang/String;Leu/b;)V

    invoke-static {p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView$a;->t:Ljava/lang/Object;

    iput v2, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView$a;->u:I

    invoke-static {v1, v3, p0}, Lav/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    :goto_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
