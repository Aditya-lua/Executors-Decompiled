.class public final Ll9/n1;
.super Ll9/i1;
.source "SourceFile"


# instance fields
.field public final c:Ll9/k$a;


# direct methods
.method public constructor <init>(Ll9/k$a;Lsb/k;)V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0, p2}, Ll9/i1;-><init>(ILsb/k;)V

    iput-object p1, p0, Ll9/n1;->c:Ll9/k$a;

    return-void
.end method


# virtual methods
.method public final bridge synthetic d(Ll9/z;Z)V
    .locals 0
    .param p1    # Ll9/z;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method

.method public final f(Ll9/j0;)Z
    .locals 1

    invoke-virtual {p1}, Ll9/j0;->v()Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Ll9/n1;->c:Ll9/k$a;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll9/w0;

    if-eqz p1, :cond_0

    iget-object p1, p1, Ll9/w0;->a:Ll9/o;

    invoke-virtual {p1}, Ll9/o;->f()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final g(Ll9/j0;)[Lcom/google/android/gms/common/Feature;
    .locals 1

    invoke-virtual {p1}, Ll9/j0;->v()Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Ll9/n1;->c:Ll9/k$a;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll9/w0;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object p1, p1, Ll9/w0;->a:Ll9/o;

    invoke-virtual {p1}, Ll9/o;->c()[Lcom/google/android/gms/common/Feature;

    move-result-object p1

    return-object p1
.end method

.method public final h(Ll9/j0;)V
    .locals 3

    invoke-virtual {p1}, Ll9/j0;->v()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Ll9/n1;->c:Ll9/k$a;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll9/w0;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ll9/j0;->t()Lk9/a$f;

    move-result-object p1

    iget-object v1, p0, Ll9/i1;->b:Lsb/k;

    iget-object v2, v0, Ll9/w0;->b:Ll9/w;

    invoke-virtual {v2, p1, v1}, Ll9/w;->b(Lk9/a$b;Lsb/k;)V

    iget-object p1, v0, Ll9/w0;->a:Ll9/o;

    invoke-virtual {p1}, Ll9/o;->a()V

    return-void

    :cond_0
    iget-object p1, p0, Ll9/i1;->b:Lsb/k;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lsb/k;->e(Ljava/lang/Object;)Z

    return-void
.end method
