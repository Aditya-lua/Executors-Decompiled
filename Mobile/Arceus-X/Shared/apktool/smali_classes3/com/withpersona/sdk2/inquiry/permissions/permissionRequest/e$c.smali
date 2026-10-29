.class public final Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$c;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e;->run()Lnu/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lnu/i<",
        "-",
        "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$b;",
        ">;",
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lnu/i;",
        "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$b;",
        "",
        "<anonymous>",
        "(Lnu/i;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestWorker$run$1"
    f = "PermissionRequestWorker.kt"
    l = {
        0x18,
        0x1d,
        0x20
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:I

.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$c;->x:Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 2
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

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$c;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$c;->x:Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e;

    invoke-direct {v0, v1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$c;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e;Lnt/b;)V

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$c;->w:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnu/i;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$c;->q(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$c;->w:Ljava/lang/Object;

    check-cast v0, Lnu/i;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$c;->v:I

    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v6, :cond_2

    if-eq v2, v5, :cond_1

    if-ne v2, v4, :cond_0

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$c;->u:Ljava/lang/Object;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$PermissionRequestFragmentResult;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$c;->t:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$c;->t:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$c;->t:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v2, "toString(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lku/g1;->c()Lku/n2;

    move-result-object v2

    new-instance v7, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$c$a;

    iget-object v8, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$c;->x:Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e;

    invoke-direct {v7, v8, p1, v3}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$c$a;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e;Ljava/lang/String;Lnt/b;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$c;->w:Ljava/lang/Object;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$c;->t:Ljava/lang/Object;

    iput v6, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$c;->v:I

    invoke-static {v2, v7, p0}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v2, p1

    :goto_0
    new-instance p1, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/b;

    invoke-direct {p1}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/b;-><init>()V

    new-instance v6, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$c$b;

    invoke-direct {v6, v2, v3}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$c$b;-><init>(Ljava/lang/String;Lnt/b;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$c;->w:Ljava/lang/Object;

    invoke-static {v2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$c;->t:Ljava/lang/Object;

    iput v5, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$c;->v:I

    invoke-static {p1, v6, p0}, Lnu/j;->t(Lnu/h;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    check-cast p1, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$PermissionRequestFragmentResult;

    new-instance v3, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$b;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$PermissionRequestFragmentResult;->a()Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;

    move-result-object v5

    invoke-direct {v3, v5}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$b;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$c;->w:Ljava/lang/Object;

    invoke-static {v2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$c;->t:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$c;->u:Ljava/lang/Object;

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$c;->v:I

    invoke-interface {v0, v3, p0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    :goto_3
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final q(Lnu/i;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/i<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$b;",
            ">;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$c;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
