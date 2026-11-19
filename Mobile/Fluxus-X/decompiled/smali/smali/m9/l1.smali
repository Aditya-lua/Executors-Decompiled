.class public final Lm9/l1;
.super Lm9/i1;
.source "SourceFile"


# instance fields
.field public final c:Lm9/w0;


# direct methods
.method public constructor <init>(Lm9/w0;Ltb/k;)V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0, p2}, Lm9/i1;-><init>(ILtb/k;)V

    iput-object p1, p0, Lm9/l1;->c:Lm9/w0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic d(Lm9/z;Z)V
    .locals 0
    .param p1    # Lm9/z;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method

.method public final f(Lm9/j0;)Z
    .locals 0

    iget-object p1, p0, Lm9/l1;->c:Lm9/w0;

    iget-object p1, p1, Lm9/w0;->a:Lm9/o;

    invoke-virtual {p1}, Lm9/o;->f()Z

    move-result p1

    return p1
.end method

.method public final g(Lm9/j0;)[Lk9/d;
    .locals 0

    iget-object p1, p0, Lm9/l1;->c:Lm9/w0;

    iget-object p1, p1, Lm9/w0;->a:Lm9/o;

    invoke-virtual {p1}, Lm9/o;->c()[Lk9/d;

    move-result-object p1

    return-object p1
.end method

.method public final h(Lm9/j0;)V
    .locals 3

    iget-object v0, p0, Lm9/l1;->c:Lm9/w0;

    iget-object v0, v0, Lm9/w0;->a:Lm9/o;

    invoke-virtual {p1}, Lm9/j0;->t()Ll9/a$f;

    move-result-object v1

    iget-object v2, p0, Lm9/i1;->b:Ltb/k;

    invoke-virtual {v0, v1, v2}, Lm9/o;->d(Ll9/a$b;Ltb/k;)V

    iget-object v0, p0, Lm9/l1;->c:Lm9/w0;

    iget-object v0, v0, Lm9/w0;->a:Lm9/o;

    invoke-virtual {v0}, Lm9/o;->b()Lm9/k$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lm9/j0;->v()Ljava/util/Map;

    move-result-object p1

    iget-object v1, p0, Lm9/l1;->c:Lm9/w0;

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
