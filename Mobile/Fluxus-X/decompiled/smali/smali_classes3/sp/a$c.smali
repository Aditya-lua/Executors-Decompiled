.class public final Lsp/a$c;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsp/a;->g(Leu/b;)Ljava/lang/Object;
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
        "Ljava/lang/String;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2"
    f = "PlayIntegrityHelper.kt"
    l = {
        0x77,
        0x9e
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lav/p0;",
        "",
        "<anonymous>",
        "(Lav/p0;)Ljava/lang/String;"
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

.field public w:I

.field public final synthetic x:Lsp/a;


# direct methods
.method public constructor <init>(Lsp/a;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsp/a;",
            "Leu/b<",
            "-",
            "Lsp/a$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsp/a$c;->x:Lsp/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 1
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

    new-instance p1, Lsp/a$c;

    iget-object v0, p0, Lsp/a$c;->x:Lsp/a;

    invoke-direct {p1, v0, p2}, Lsp/a$c;-><init>(Lsp/a;Leu/b;)V

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
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lsp/a$c;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lsp/a$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lsp/a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lsp/a$c;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lsp/a$c;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lsp/a$c;->u:Ljava/lang/Object;

    check-cast v0, Lsp/a;

    iget-object v0, p0, Lsp/a$c;->t:Ljava/lang/Object;

    check-cast v0, Lvd/c$c;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    return-object p1

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

    iget-object p1, p0, Lsp/a$c;->x:Lsp/a;

    invoke-static {p1}, Lsp/a;->e(Lsp/a;)Ldv/c0;

    move-result-object p1

    invoke-interface {p1}, Ldv/c0;->getValue()Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Lsp/a$b$b;

    if-eqz p1, :cond_3

    return-object v3

    :cond_3
    iget-object p1, p0, Lsp/a$c;->x:Lsp/a;

    invoke-static {p1}, Lsp/a;->e(Lsp/a;)Ldv/c0;

    move-result-object p1

    new-instance v1, Lsp/a$c$d;

    invoke-direct {v1, p1}, Lsp/a$c$d;-><init>(Ldv/h;)V

    invoke-static {}, Lsp/a;->b()J

    move-result-wide v5

    invoke-static {v1, v5, v6}, Ldv/j;->P(Ldv/h;J)Ldv/h;

    move-result-object p1

    new-instance v1, Lsp/a$c$c;

    invoke-direct {v1, v3}, Lsp/a$c$c;-><init>(Leu/b;)V

    invoke-static {p1, v1}, Ldv/j;->f(Ldv/h;Lpu/n;)Ldv/h;

    move-result-object p1

    new-instance v1, Lsp/a$c$e;

    invoke-direct {v1, p1}, Lsp/a$c$e;-><init>(Ldv/h;)V

    iput v4, p0, Lsp/a$c;->w:I

    invoke-static {v1, p0}, Ldv/j;->v(Ldv/h;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_1

    :cond_4
    :goto_0
    check-cast p1, Lvd/c$c;

    if-nez p1, :cond_5

    return-object v3

    :cond_5
    iget-object v1, p0, Lsp/a$c;->x:Lsp/a;

    iput-object p1, p0, Lsp/a$c;->t:Ljava/lang/Object;

    iput-object v1, p0, Lsp/a$c;->u:Ljava/lang/Object;

    const/4 v3, 0x0

    iput v3, p0, Lsp/a$c;->v:I

    iput v2, p0, Lsp/a$c;->w:I

    new-instance v2, Lav/p;

    invoke-static {p0}, Lfu/b;->c(Leu/b;)Leu/b;

    move-result-object v3

    invoke-direct {v2, v3, v4}, Lav/p;-><init>(Leu/b;I)V

    invoke-virtual {v2}, Lav/p;->G()V

    invoke-static {}, Lvd/c$d;->a()Lvd/c$d$a;

    move-result-object v3

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lvd/c$d$a;->b(Ljava/lang/String;)Lvd/c$d$a;

    move-result-object v3

    invoke-virtual {v3}, Lvd/c$d$a;->a()Lvd/c$d;

    move-result-object v3

    invoke-interface {p1, v3}, Lvd/c$c;->a(Lvd/c$d;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v3, Lsp/a$c$a;

    invoke-direct {v3, v2}, Lsp/a$c$a;-><init>(Lav/n;)V

    new-instance v4, Lsp/b;

    invoke-direct {v4, v3}, Lsp/b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v4}, Lcom/google/android/gms/tasks/Task;->g(Ltb/g;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v3, Lsp/a$c$b;

    invoke-direct {v3, v1, v2}, Lsp/a$c$b;-><init>(Lsp/a;Lav/n;)V

    invoke-virtual {p1, v3}, Lcom/google/android/gms/tasks/Task;->e(Ltb/f;)Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v2}, Lav/p;->y()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    if-ne p1, v1, :cond_6

    invoke-static {p0}, Lgu/h;->c(Leu/b;)V

    :cond_6
    if-ne p1, v0, :cond_7

    :goto_1
    return-object v0

    :cond_7
    return-object p1
.end method
