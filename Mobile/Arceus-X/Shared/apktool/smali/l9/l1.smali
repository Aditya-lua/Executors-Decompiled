.class public final Ll9/l1;
.super Ll9/i1;
.source "SourceFile"


# instance fields
.field public final c:Ll9/w0;


# direct methods
.method public constructor <init>(Ll9/w0;Lsb/k;)V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0, p2}, Ll9/i1;-><init>(ILsb/k;)V

    iput-object p1, p0, Ll9/l1;->c:Ll9/w0;

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
    .locals 0

    iget-object p1, p0, Ll9/l1;->c:Ll9/w0;

    iget-object p1, p1, Ll9/w0;->a:Ll9/o;

    invoke-virtual {p1}, Ll9/o;->f()Z

    move-result p1

    return p1
.end method

.method public final g(Ll9/j0;)[Lcom/google/android/gms/common/Feature;
    .locals 0

    iget-object p1, p0, Ll9/l1;->c:Ll9/w0;

    iget-object p1, p1, Ll9/w0;->a:Ll9/o;

    invoke-virtual {p1}, Ll9/o;->c()[Lcom/google/android/gms/common/Feature;

    move-result-object p1

    return-object p1
.end method

.method public final h(Ll9/j0;)V
    .locals 3

    iget-object v0, p0, Ll9/l1;->c:Ll9/w0;

    iget-object v0, v0, Ll9/w0;->a:Ll9/o;

    invoke-virtual {p1}, Ll9/j0;->t()Lk9/a$f;

    move-result-object v1

    iget-object v2, p0, Ll9/i1;->b:Lsb/k;

    invoke-virtual {v0, v1, v2}, Ll9/o;->d(Lk9/a$b;Lsb/k;)V

    iget-object v0, p0, Ll9/l1;->c:Ll9/w0;

    iget-object v0, v0, Ll9/w0;->a:Ll9/o;

    invoke-virtual {v0}, Ll9/o;->b()Ll9/k$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ll9/j0;->v()Ljava/util/Map;

    move-result-object p1

    iget-object v1, p0, Ll9/l1;->c:Ll9/w0;

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
