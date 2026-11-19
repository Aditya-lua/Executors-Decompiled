.class public final Lsp/a$c$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldv/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsp/a$c$d;->collect(Ldv/i;Leu/b;)Ljava/lang/Object;
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
        "Ldv/i;"
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
.field public final synthetic a:Ldv/i;


# direct methods
.method public constructor <init>(Ldv/i;)V
    .locals 0

    iput-object p1, p0, Lsp/a$c$d$a;->a:Ldv/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lsp/a$c$d$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lsp/a$c$d$a$a;

    iget v1, v0, Lsp/a$c$d$a$a;->u:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lsp/a$c$d$a$a;->u:I

    goto :goto_0

    :cond_0
    new-instance v0, Lsp/a$c$d$a$a;

    invoke-direct {v0, p0, p2}, Lsp/a$c$d$a$a;-><init>(Lsp/a$c$d$a;Leu/b;)V

    :goto_0
    iget-object p2, v0, Lsp/a$c$d$a$a;->t:Ljava/lang/Object;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lsp/a$c$d$a$a;->u:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lsp/a$c$d$a$a;->z:Ljava/lang/Object;

    check-cast p1, Ldv/i;

    iget-object p1, v0, Lsp/a$c$d$a$a;->w:Ljava/lang/Object;

    check-cast p1, Lsp/a$c$d$a$a;

    invoke-static {p2}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lsp/a$c$d$a;->a:Ldv/i;

    move-object v2, p1

    check-cast v2, Lsp/a$b;

    instance-of v4, v2, Lsp/a$b$a;

    if-nez v4, :cond_3

    instance-of v2, v2, Lsp/a$b$d;

    if-eqz v2, :cond_4

    :cond_3
    invoke-static {p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lsp/a$c$d$a$a;->v:Ljava/lang/Object;

    invoke-static {v0}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lsp/a$c$d$a$a;->w:Ljava/lang/Object;

    invoke-static {p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lsp/a$c$d$a$a;->y:Ljava/lang/Object;

    invoke-static {p2}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lsp/a$c$d$a$a;->z:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lsp/a$c$d$a$a;->A:I

    iput v3, v0, Lsp/a$c$d$a$a;->u:I

    invoke-interface {p2, p1, v0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
