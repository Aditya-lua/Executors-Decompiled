.class public final Lcom/withpersona/sdk2/inquiry/governmentid/f$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnu/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/governmentid/f$c;->collect(Lnu/i;Lnt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lnu/i;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lnu/i;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/governmentid/f;


# direct methods
.method public constructor <init>(Lnu/i;Lcom/withpersona/sdk2/inquiry/governmentid/f;)V
    .locals 0

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/f$c$a;->a:Lnu/i;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/f$c$a;->b:Lcom/withpersona/sdk2/inquiry/governmentid/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/governmentid/f$c$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/withpersona/sdk2/inquiry/governmentid/f$c$a$a;

    iget v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/f$c$a$a;->u:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/f$c$a$a;->u:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/f$c$a$a;

    invoke-direct {v0, p0, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/f$c$a$a;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/f$c$a;Lnt/b;)V

    :goto_0
    iget-object p2, v0, Lcom/withpersona/sdk2/inquiry/governmentid/f$c$a$a;->t:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/withpersona/sdk2/inquiry/governmentid/f$c$a$a;->u:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/f$c$a$a;->A:Ljava/lang/Object;

    check-cast p1, Ljt/n;

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/f$c$a$a;->z:Ljava/lang/Object;

    check-cast p1, Lnu/i;

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/f$c$a$a;->x:Ljava/lang/Object;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/governmentid/f$c$a$a;

    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/f$c$a;->a:Lnu/i;

    move-object v2, p1

    check-cast v2, Ljt/n;

    invoke-virtual {v2}, Ljt/n;->j()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    if-nez v4, :cond_5

    check-cast v2, Lfn/j0;

    instance-of v4, v2, Lfn/j0$b;

    if-eqz v4, :cond_4

    check-cast v2, Lfn/j0$b;

    invoke-virtual {v2}, Lfn/j0$b;->e()Lcom/withpersona/sdk2/camera/ImageIdMetadata;

    move-result-object v4

    if-eqz v4, :cond_3

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/governmentid/f$c$a;->b:Lcom/withpersona/sdk2/inquiry/governmentid/f;

    invoke-static {v5}, Lcom/withpersona/sdk2/inquiry/governmentid/f;->e(Lcom/withpersona/sdk2/inquiry/governmentid/f;)Lcom/withpersona/sdk2/inquiry/governmentid/network/AutocaptureState;

    move-result-object v6

    invoke-static {v6, v4}, Lpo/a;->b(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutocaptureState;Lcom/withpersona/sdk2/camera/ImageIdMetadata;)Lcom/withpersona/sdk2/inquiry/governmentid/network/AutocaptureState;

    move-result-object v4

    invoke-static {v5, v4}, Lcom/withpersona/sdk2/inquiry/governmentid/f;->f(Lcom/withpersona/sdk2/inquiry/governmentid/f;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutocaptureState;)V

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/governmentid/f$c$a;->b:Lcom/withpersona/sdk2/inquiry/governmentid/f;

    invoke-static {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/f;->e(Lcom/withpersona/sdk2/inquiry/governmentid/f;)Lcom/withpersona/sdk2/inquiry/governmentid/network/AutocaptureState;

    move-result-object v4

    invoke-static {v4}, Lpo/a;->a(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutocaptureState;)Z

    move-result v4

    if-eqz v4, :cond_4

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/governmentid/f$c$a;->b:Lcom/withpersona/sdk2/inquiry/governmentid/f;

    invoke-static {v4, v2}, Lcom/withpersona/sdk2/inquiry/governmentid/f;->d(Lcom/withpersona/sdk2/inquiry/governmentid/f;Lfn/j0$b;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljt/n;->a(Ljava/lang/Object;)Ljt/n;

    move-result-object v2

    goto :goto_1

    :cond_3
    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/governmentid/f$c$a;->b:Lcom/withpersona/sdk2/inquiry/governmentid/f;

    invoke-static {v4, v2}, Lcom/withpersona/sdk2/inquiry/governmentid/f;->d(Lcom/withpersona/sdk2/inquiry/governmentid/f;Lfn/j0$b;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljt/n;->a(Ljava/lang/Object;)Ljt/n;

    move-result-object v2

    goto :goto_1

    :cond_4
    const/4 v2, 0x0

    goto :goto_1

    :cond_5
    invoke-static {v4}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljt/n;->a(Ljava/lang/Object;)Ljt/n;

    move-result-object v2

    :goto_1
    if-eqz v2, :cond_6

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v0, Lcom/withpersona/sdk2/inquiry/governmentid/f$c$a$a;->v:Ljava/lang/Object;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v0, Lcom/withpersona/sdk2/inquiry/governmentid/f$c$a$a;->x:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/f$c$a$a;->y:Ljava/lang/Object;

    invoke-static {p2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/f$c$a$a;->z:Ljava/lang/Object;

    invoke-static {v2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/f$c$a$a;->A:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/f$c$a$a;->B:I

    iput v3, v0, Lcom/withpersona/sdk2/inquiry/governmentid/f$c$a$a;->u:I

    invoke-interface {p2, v2, v0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    return-object v1

    :cond_6
    :goto_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
