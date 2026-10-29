.class public final Landroidx/lifecycle/j0$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/lifecycle/j0$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Landroidx/lifecycle/l$a;

.field public final synthetic b:Lkotlin/jvm/internal/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/c0<",
            "Lku/d2;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic c:Lku/p0;

.field public final synthetic d:Landroidx/lifecycle/l$a;

.field public final synthetic e:Lku/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lku/n<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic f:Luu/a;

.field public final synthetic g:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Lku/p0;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/lifecycle/l$a;Lkotlin/jvm/internal/c0;Lku/p0;Landroidx/lifecycle/l$a;Lku/n;Luu/a;Lkotlin/jvm/functions/Function2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/l$a;",
            "Lkotlin/jvm/internal/c0<",
            "Lku/d2;",
            ">;",
            "Lku/p0;",
            "Landroidx/lifecycle/l$a;",
            "Lku/n<",
            "-",
            "Lkotlin/Unit;",
            ">;",
            "Luu/a;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lku/p0;",
            "-",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/lifecycle/j0$a$a$a;->a:Landroidx/lifecycle/l$a;

    iput-object p2, p0, Landroidx/lifecycle/j0$a$a$a;->b:Lkotlin/jvm/internal/c0;

    iput-object p3, p0, Landroidx/lifecycle/j0$a$a$a;->c:Lku/p0;

    iput-object p4, p0, Landroidx/lifecycle/j0$a$a$a;->d:Landroidx/lifecycle/l$a;

    iput-object p5, p0, Landroidx/lifecycle/j0$a$a$a;->e:Lku/n;

    iput-object p6, p0, Landroidx/lifecycle/j0$a$a$a;->f:Luu/a;

    iput-object p7, p0, Landroidx/lifecycle/j0$a$a$a;->g:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final g(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V
    .locals 7

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/lifecycle/j0$a$a$a;->a:Landroidx/lifecycle/l$a;

    const/4 v0, 0x0

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Landroidx/lifecycle/j0$a$a$a;->b:Lkotlin/jvm/internal/c0;

    iget-object v1, p0, Landroidx/lifecycle/j0$a$a$a;->c:Lku/p0;

    new-instance v4, Landroidx/lifecycle/j0$a$a$a$a;

    iget-object p2, p0, Landroidx/lifecycle/j0$a$a$a;->f:Luu/a;

    iget-object v2, p0, Landroidx/lifecycle/j0$a$a$a;->g:Lkotlin/jvm/functions/Function2;

    invoke-direct {v4, p2, v2, v0}, Landroidx/lifecycle/j0$a$a$a$a;-><init>(Luu/a;Lkotlin/jvm/functions/Function2;Lnt/b;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    move-result-object p2

    iput-object p2, p1, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    return-void

    :cond_0
    iget-object p1, p0, Landroidx/lifecycle/j0$a$a$a;->d:Landroidx/lifecycle/l$a;

    if-ne p2, p1, :cond_2

    iget-object p1, p0, Landroidx/lifecycle/j0$a$a$a;->b:Lkotlin/jvm/internal/c0;

    iget-object p1, p1, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    check-cast p1, Lku/d2;

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lku/d2$a;->a(Lku/d2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_1
    iget-object p1, p0, Landroidx/lifecycle/j0$a$a$a;->b:Lkotlin/jvm/internal/c0;

    iput-object v0, p1, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    :cond_2
    sget-object p1, Landroidx/lifecycle/l$a;->ON_DESTROY:Landroidx/lifecycle/l$a;

    if-ne p2, p1, :cond_3

    iget-object p1, p0, Landroidx/lifecycle/j0$a$a$a;->e:Lku/n;

    sget-object p2, Ljt/n;->b:Ljt/n$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-static {p2}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, p2}, Lnt/b;->resumeWith(Ljava/lang/Object;)V

    :cond_3
    return-void
.end method
