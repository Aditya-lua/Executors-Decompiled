.class public final Lnb/a;
.super Lnb/c;
.source "SourceFile"


# instance fields
.field public final a:Lob/l7;

.field public final b:Lob/va;


# direct methods
.method public constructor <init>(Lob/l7;)V
    .locals 1
    .param p1    # Lob/l7;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lnb/c;-><init>([B)V

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/a;->a:Lob/l7;

    invoke-virtual {p1}, Lob/l7;->B()Lob/va;

    move-result-object p1

    iput-object p1, p0, Lnb/a;->b:Lob/va;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lnb/a;->b:Lob/va;

    invoke-virtual {v0, p1, p2, p3}, Lob/va;->p(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final b(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lnb/a;->b:Lob/va;

    invoke-virtual {v0, p1}, Lob/va;->M(Landroid/os/Bundle;)V

    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lnb/a;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->M()Lob/d2;

    move-result-object v1

    invoke-virtual {v0}, Lob/l7;->e()Lv9/e;

    move-result-object v0

    invoke-interface {v0}, Lv9/e;->b()J

    move-result-wide v2

    invoke-virtual {v1, p1, v2, v3}, Lob/d2;->j(Ljava/lang/String;J)V

    return-void
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnb/a;->b:Lob/va;

    invoke-virtual {v0}, Lob/va;->R()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnb/a;->b:Lob/va;

    invoke-virtual {v0}, Lob/va;->D()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final f()J
    .locals 2

    iget-object v0, p0, Lnb/a;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->C()Lob/ff;

    move-result-object v0

    invoke-virtual {v0}, Lob/ff;->p0()J

    move-result-wide v0

    return-wide v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnb/a;->b:Lob/va;

    invoke-virtual {v0}, Lob/va;->S()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final h(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lnb/a;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->M()Lob/d2;

    move-result-object v1

    invoke-virtual {v0}, Lob/l7;->e()Lv9/e;

    move-result-object v0

    invoke-interface {v0}, Lv9/e;->b()J

    move-result-wide v2

    invoke-virtual {v1, p1, v2, v3}, Lob/d2;->i(Ljava/lang/String;J)V

    return-void
.end method

.method public final i(Ljava/lang/String;)I
    .locals 1

    iget-object v0, p0, Lnb/a;->b:Lob/va;

    invoke-virtual {v0, p1}, Lob/va;->L(Ljava/lang/String;)I

    const/16 p1, 0x19

    return p1
.end method

.method public final j(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lnb/a;->b:Lob/va;

    invoke-virtual {v0, p1, p2, p3}, Lob/va;->C(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public final k(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lnb/a;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->B()Lob/va;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lob/va;->O(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final l(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lnb/a;->b:Lob/va;

    invoke-virtual {v0, p1, p2}, Lob/va;->P(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public final zzh()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnb/a;->b:Lob/va;

    invoke-virtual {v0}, Lob/va;->Q()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
