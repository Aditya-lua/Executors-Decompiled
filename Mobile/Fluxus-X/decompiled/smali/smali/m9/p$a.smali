.class public Lm9/p$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm9/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A::",
        "Ll9/a$b;",
        "L:Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:Lm9/q;

.field public b:Lm9/q;

.field public c:Ljava/lang/Runnable;

.field public d:Lm9/k;

.field public e:[Lk9/d;

.field public f:Z

.field public g:I


# direct methods
.method public synthetic constructor <init>(Lm9/a1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object p1, Lm9/x0;->a:Lm9/x0;

    iput-object p1, p0, Lm9/p$a;->c:Ljava/lang/Runnable;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lm9/p$a;->f:Z

    return-void
.end method

.method public static bridge synthetic h(Lm9/p$a;)Lm9/q;
    .locals 0

    iget-object p0, p0, Lm9/p$a;->a:Lm9/q;

    return-object p0
.end method

.method public static bridge synthetic i(Lm9/p$a;)Lm9/q;
    .locals 0

    iget-object p0, p0, Lm9/p$a;->b:Lm9/q;

    return-object p0
.end method


# virtual methods
.method public a()Lm9/p;
    .locals 8
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lm9/p<",
            "TA;T",
            "L;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm9/p$a;->a:Lm9/q;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const-string v3, "Must set register function"

    invoke-static {v0, v3}, Lo9/s;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Lm9/p$a;->b:Lm9/q;

    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    const-string v3, "Must set unregister function"

    invoke-static {v0, v3}, Lo9/s;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Lm9/p$a;->d:Lm9/k;

    if-eqz v0, :cond_2

    move v1, v2

    :cond_2
    const-string v0, "Must set holder"

    invoke-static {v1, v0}, Lo9/s;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Lm9/p$a;->d:Lm9/k;

    invoke-virtual {v0}, Lm9/k;->b()Lm9/k$a;

    move-result-object v0

    const-string v1, "Key must not be null"

    invoke-static {v0, v1}, Lo9/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm9/k$a;

    new-instance v1, Lm9/p;

    new-instance v2, Lm9/y0;

    iget-object v4, p0, Lm9/p$a;->d:Lm9/k;

    iget-object v5, p0, Lm9/p$a;->e:[Lk9/d;

    iget-boolean v6, p0, Lm9/p$a;->f:Z

    iget v7, p0, Lm9/p$a;->g:I

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Lm9/y0;-><init>(Lm9/p$a;Lm9/k;[Lk9/d;ZI)V

    new-instance v4, Lm9/z0;

    invoke-direct {v4, p0, v0}, Lm9/z0;-><init>(Lm9/p$a;Lm9/k$a;)V

    iget-object v0, v3, Lm9/p$a;->c:Ljava/lang/Runnable;

    const/4 v5, 0x0

    invoke-direct {v1, v2, v4, v0, v5}, Lm9/p;-><init>(Lm9/o;Lm9/w;Ljava/lang/Runnable;Lm9/b1;)V

    return-object v1
.end method

.method public b(Lm9/q;)Lm9/p$a;
    .locals 0
    .param p1    # Lm9/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm9/q<",
            "TA;",
            "Ltb/k<",
            "Ljava/lang/Void;",
            ">;>;)",
            "Lm9/p$a<",
            "TA;T",
            "L;",
            ">;"
        }
    .end annotation

    iput-object p1, p0, Lm9/p$a;->a:Lm9/q;

    return-object p0
.end method

.method public c(Z)Lm9/p$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lm9/p$a<",
            "TA;T",
            "L;",
            ">;"
        }
    .end annotation

    iput-boolean p1, p0, Lm9/p$a;->f:Z

    return-object p0
.end method

.method public varargs d([Lk9/d;)Lm9/p$a;
    .locals 0
    .param p1    # [Lk9/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lk9/d;",
            ")",
            "Lm9/p$a<",
            "TA;T",
            "L;",
            ">;"
        }
    .end annotation

    iput-object p1, p0, Lm9/p$a;->e:[Lk9/d;

    return-object p0
.end method

.method public e(I)Lm9/p$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lm9/p$a<",
            "TA;T",
            "L;",
            ">;"
        }
    .end annotation

    iput p1, p0, Lm9/p$a;->g:I

    return-object p0
.end method

.method public f(Lm9/q;)Lm9/p$a;
    .locals 0
    .param p1    # Lm9/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm9/q<",
            "TA;",
            "Ltb/k<",
            "Ljava/lang/Boolean;",
            ">;>;)",
            "Lm9/p$a<",
            "TA;T",
            "L;",
            ">;"
        }
    .end annotation

    iput-object p1, p0, Lm9/p$a;->b:Lm9/q;

    return-object p0
.end method

.method public g(Lm9/k;)Lm9/p$a;
    .locals 0
    .param p1    # Lm9/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm9/k<",
            "T",
            "L;",
            ">;)",
            "Lm9/p$a<",
            "TA;T",
            "L;",
            ">;"
        }
    .end annotation

    iput-object p1, p0, Lm9/p$a;->d:Lm9/k;

    return-object p0
.end method
