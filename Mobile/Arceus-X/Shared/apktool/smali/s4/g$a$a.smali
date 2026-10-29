.class public final Ls4/g$a$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls4/g$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
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

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lku/p0;",
        "",
        "<anonymous>",
        "(Lku/p0;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4$1$1"
    f = "MeasurementManagerImplCommon.kt"
    l = {
        0x83
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:I

.field public final synthetic x:Ls4/g;

.field public final synthetic y:Landroid/net/Uri;

.field public final synthetic z:Ls4/h;


# direct methods
.method public constructor <init>(Ls4/g;Landroid/net/Uri;Ls4/h;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls4/g;",
            "Landroid/net/Uri;",
            "Ls4/h;",
            "Lnt/b<",
            "-",
            "Ls4/g$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ls4/g$a$a;->x:Ls4/g;

    iput-object p2, p0, Ls4/g$a$a;->y:Landroid/net/Uri;

    iput-object p3, p0, Ls4/g$a$a;->z:Ls4/h;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lnt/b<",
            "*>;)",
            "Lnt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Ls4/g$a$a;

    iget-object v0, p0, Ls4/g$a$a;->x:Ls4/g;

    iget-object v1, p0, Ls4/g$a$a;->y:Landroid/net/Uri;

    iget-object v2, p0, Ls4/g$a$a;->z:Ls4/h;

    invoke-direct {p1, v0, v1, v2, p2}, Ls4/g$a$a;-><init>(Ls4/g;Landroid/net/Uri;Ls4/h;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Ls4/g$a$a;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lku/p0;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Ls4/g$a$a;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Ls4/g$a$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Ls4/g$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ls4/g$a$a;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Ls4/g$a$a;->v:Ljava/lang/Object;

    check-cast v0, Ls4/h;

    iget-object v0, p0, Ls4/g$a$a;->u:Ljava/lang/Object;

    check-cast v0, Landroid/net/Uri;

    iget-object v0, p0, Ls4/g$a$a;->t:Ljava/lang/Object;

    check-cast v0, Ls4/g;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ls4/g$a$a;->x:Ls4/g;

    iget-object v1, p0, Ls4/g$a$a;->y:Landroid/net/Uri;

    iget-object v3, p0, Ls4/g$a$a;->z:Ls4/h;

    iput-object p1, p0, Ls4/g$a$a;->t:Ljava/lang/Object;

    iput-object v1, p0, Ls4/g$a$a;->u:Ljava/lang/Object;

    iput-object v3, p0, Ls4/g$a$a;->v:Ljava/lang/Object;

    iput v2, p0, Ls4/g$a$a;->w:I

    new-instance v4, Lku/p;

    invoke-static {p0}, Lot/b;->c(Lnt/b;)Lnt/b;

    move-result-object v5

    invoke-direct {v4, v5, v2}, Lku/p;-><init>(Lnt/b;I)V

    invoke-virtual {v4}, Lku/p;->H()V

    invoke-virtual {p1}, Ls4/g;->i()Landroid/adservices/measurement/MeasurementManager;

    move-result-object p1

    invoke-virtual {v3}, Ls4/h;->a()Landroid/view/InputEvent;

    move-result-object v2

    new-instance v3, Le3/n;

    invoke-direct {v3}, Le3/n;-><init>()V

    invoke-static {v4}, Lu2/n;->a(Lnt/b;)Landroid/os/OutcomeReceiver;

    move-result-object v5

    invoke-virtual {p1, v1, v2, v3, v5}, Landroid/adservices/measurement/MeasurementManager;->registerSource(Landroid/net/Uri;Landroid/view/InputEvent;Ljava/util/concurrent/Executor;Landroid/os/OutcomeReceiver;)V

    invoke-virtual {v4}, Lku/p;->A()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    if-ne p1, v1, :cond_2

    invoke-static {p0}, Lpt/h;->c(Lnt/b;)V

    :cond_2
    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
