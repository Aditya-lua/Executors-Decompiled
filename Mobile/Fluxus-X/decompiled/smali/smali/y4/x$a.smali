.class public final Ly4/x$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly4/x;->d(Ly4/u;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lav/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lav/n<",
            "TR;>;"
        }
    .end annotation
.end field

.field public final synthetic b:Ly4/u;

.field public final synthetic c:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Lav/p0;",
            "Leu/b<",
            "-TR;>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lav/n;Ly4/u;Lkotlin/jvm/functions/Function2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lav/n<",
            "-TR;>;",
            "Ly4/u;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lav/p0;",
            "-",
            "Leu/b<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ly4/x$a;->a:Lav/n;

    iput-object p2, p0, Ly4/x$a;->b:Ly4/u;

    iput-object p3, p0, Ly4/x$a;->c:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    :try_start_0
    iget-object v0, p0, Ly4/x$a;->a:Lav/n;

    invoke-interface {v0}, Leu/b;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    sget-object v1, Lkotlin/coroutines/d;->No:Lkotlin/coroutines/d$b;

    invoke-interface {v0, v1}, Lkotlin/coroutines/CoroutineContext;->minusKey(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    new-instance v1, Ly4/x$a$a;

    iget-object v2, p0, Ly4/x$a;->b:Ly4/u;

    iget-object v3, p0, Ly4/x$a;->a:Lav/n;

    iget-object v4, p0, Ly4/x$a;->c:Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x0

    invoke-direct {v1, v2, v3, v4, v5}, Ly4/x$a$a;-><init>(Ly4/u;Lav/n;Lkotlin/jvm/functions/Function2;Leu/b;)V

    invoke-static {v0, v1}, Lav/i;->e(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Ly4/x$a;->a:Lav/n;

    invoke-interface {v1, v0}, Lav/n;->t(Ljava/lang/Throwable;)Z

    return-void
.end method
