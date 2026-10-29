.class public final Lmb/a;
.super Lmb/c;
.source "SourceFile"


# instance fields
.field public final a:Lnb/g7;

.field public final b:Lnb/qa;


# direct methods
.method public constructor <init>(Lnb/g7;)V
    .locals 1
    .param p1    # Lnb/g7;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lmb/c;-><init>([B)V

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lmb/a;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->B()Lnb/qa;

    move-result-object p1

    iput-object p1, p0, Lmb/a;->b:Lnb/qa;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lmb/a;->b:Lnb/qa;

    invoke-virtual {v0, p1, p2, p3}, Lnb/qa;->p(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final b(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lmb/a;->b:Lnb/qa;

    invoke-virtual {v0, p1}, Lnb/qa;->M(Landroid/os/Bundle;)V

    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lmb/a;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->M()Lnb/y1;

    move-result-object v1

    invoke-virtual {v0}, Lnb/g7;->e()Lu9/e;

    move-result-object v0

    invoke-interface {v0}, Lu9/e;->b()J

    move-result-wide v2

    invoke-virtual {v1, p1, v2, v3}, Lnb/y1;->j(Ljava/lang/String;J)V

    return-void
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lmb/a;->b:Lnb/qa;

    invoke-virtual {v0}, Lnb/qa;->R()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lmb/a;->b:Lnb/qa;

    invoke-virtual {v0}, Lnb/qa;->D()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final f()J
    .locals 2

    iget-object v0, p0, Lmb/a;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->C()Lnb/ve;

    move-result-object v0

    invoke-virtual {v0}, Lnb/ve;->p0()J

    move-result-wide v0

    return-wide v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lmb/a;->b:Lnb/qa;

    invoke-virtual {v0}, Lnb/qa;->S()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final h(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lmb/a;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->M()Lnb/y1;

    move-result-object v1

    invoke-virtual {v0}, Lnb/g7;->e()Lu9/e;

    move-result-object v0

    invoke-interface {v0}, Lu9/e;->b()J

    move-result-wide v2

    invoke-virtual {v1, p1, v2, v3}, Lnb/y1;->i(Ljava/lang/String;J)V

    return-void
.end method

.method public final i(Ljava/lang/String;)I
    .locals 1

    iget-object v0, p0, Lmb/a;->b:Lnb/qa;

    invoke-virtual {v0, p1}, Lnb/qa;->L(Ljava/lang/String;)I

    const/16 p1, 0x19

    return p1
.end method

.method public final j(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lmb/a;->b:Lnb/qa;

    invoke-virtual {v0, p1, p2, p3}, Lnb/qa;->C(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public final k(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lmb/a;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->B()Lnb/qa;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lnb/qa;->O(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final l(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lmb/a;->b:Lnb/qa;

    invoke-virtual {v0, p1, p2}, Lnb/qa;->P(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public final zzh()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lmb/a;->b:Lnb/qa;

    invoke-virtual {v0}, Lnb/qa;->Q()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
