.class public final Lnu/z$a$b;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnu/z$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnu/z$a$b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lnu/k0;",
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lnu/k0;",
        "it",
        "",
        "<anonymous>",
        "(Lnu/k0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2"
    f = "Share.kt"
    l = {
        0xdf
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lnu/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnu/h<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic w:Lnu/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnu/b0<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic x:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnu/h;Lnu/b0;Ljava/lang/Object;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/h<",
            "+TT;>;",
            "Lnu/b0<",
            "TT;>;TT;",
            "Lnt/b<",
            "-",
            "Lnu/z$a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lnu/z$a$b;->v:Lnu/h;

    iput-object p2, p0, Lnu/z$a$b;->w:Lnu/b0;

    iput-object p3, p0, Lnu/z$a$b;->x:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 4
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

    new-instance v0, Lnu/z$a$b;

    iget-object v1, p0, Lnu/z$a$b;->v:Lnu/h;

    iget-object v2, p0, Lnu/z$a$b;->w:Lnu/b0;

    iget-object v3, p0, Lnu/z$a$b;->x:Ljava/lang/Object;

    invoke-direct {v0, v1, v2, v3, p2}, Lnu/z$a$b;-><init>(Lnu/h;Lnu/b0;Ljava/lang/Object;Lnt/b;)V

    iput-object p1, v0, Lnu/z$a$b;->u:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnu/k0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lnu/z$a$b;->q(Lnu/k0;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lnu/z$a$b;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lnu/z$a$b;->u:Ljava/lang/Object;

    check-cast p1, Lnu/k0;

    sget-object v1, Lnu/z$a$b$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    if-eq p1, v2, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_5

    const/4 v0, 0x3

    if-ne p1, v0, :cond_3

    iget-object p1, p0, Lnu/z$a$b;->x:Ljava/lang/Object;

    sget-object v0, Lnu/i0;->a:Lqu/e0;

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Lnu/z$a$b;->w:Lnu/b0;

    invoke-interface {p1}, Lnu/b0;->j()V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lnu/z$a$b;->w:Lnu/b0;

    invoke-interface {v0, p1}, Lnu/b0;->a(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Lpt/b;->a(Z)Ljava/lang/Boolean;

    goto :goto_0

    :cond_3
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1

    :cond_4
    iget-object p1, p0, Lnu/z$a$b;->v:Lnu/h;

    iget-object v1, p0, Lnu/z$a$b;->w:Lnu/b0;

    iput v2, p0, Lnu/z$a$b;->t:I

    invoke-interface {p1, v1, p0}, Lnu/h;->collect(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final q(Lnu/k0;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/k0;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lnu/z$a$b;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lnu/z$a$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lnu/z$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
