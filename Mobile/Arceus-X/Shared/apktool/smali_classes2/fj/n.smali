.class public Lfj/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lvi/g;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lvi/g;->b()Lvi/g;

    move-result-object v0

    iput-object v0, p0, Lfj/n;->a:Lvi/g;

    return-void
.end method


# virtual methods
.method public A()V
    .locals 1

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/n;->a:Lvi/g;

    invoke-virtual {v0}, Lvi/g;->c0()V

    :cond_0
    return-void
.end method

.method public B()V
    .locals 1

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/n;->a:Lvi/g;

    invoke-virtual {v0}, Lvi/g;->d0()V

    :cond_0
    return-void
.end method

.method public C(Z)V
    .locals 2

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/n;->a:Lvi/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lvi/g;->e0(ZZ)V

    :cond_0
    return-void
.end method

.method public D(Z)V
    .locals 2

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/n;->a:Lvi/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lvi/g;->f0(ZZ)V

    :cond_0
    return-void
.end method

.method public E(Z)V
    .locals 2

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/n;->a:Lvi/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lvi/g;->g0(ZZ)V

    :cond_0
    return-void
.end method

.method public a(Lej/i;Ljava/lang/String;)V
    .locals 4

    const-string v0, "rbx.purchaseflow"

    invoke-static {v0, p2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_0

    new-instance v0, Lli/a;

    const-string v1, "Android-PurchaseFlow"

    invoke-direct {v0, v1}, Lli/a;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lli/a;->m(Z)Lli/a;

    move-result-object v0

    const-string v1, "UserId"

    invoke-virtual {p1}, Lej/i;->b()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lli/a;->c(Ljava/lang/String;J)Lli/a;

    move-result-object v0

    const-string v1, "InAppPurchase"

    invoke-virtual {p1}, Lej/i;->c()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lli/a;->e(Ljava/lang/String;Z)Lli/a;

    move-result-object v0

    const-string v1, "ProductId"

    invoke-virtual {p1}, Lej/i;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lli/a;->d(Ljava/lang/String;Ljava/lang/Object;)Lli/a;

    move-result-object p1

    const-string v0, "Message"

    invoke-virtual {p1, v0, p2}, Lli/a;->d(Ljava/lang/String;Ljava/lang/Object;)Lli/a;

    move-result-object p1

    invoke-static {}, Lsg/u;->g()Lsg/u;

    move-result-object p2

    invoke-virtual {p2}, Lsg/u;->h()Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    const-string v0, "Rooted"

    invoke-virtual {p1, v0, p2}, Lli/a;->f(Ljava/lang/String;Ljava/lang/Object;)Lli/a;

    move-result-object p1

    invoke-virtual {p1}, Lli/a;->g()Ljh/c;

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 6

    iget-object v0, p0, Lfj/n;->a:Lvi/g;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    invoke-virtual/range {v0 .. v5}, Lvi/g;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    return-void
.end method

.method public c(Z)V
    .locals 1

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/n;->a:Lvi/g;

    invoke-virtual {v0, p1}, Lvi/g;->n(Z)V

    :cond_0
    return-void
.end method

.method public d(Z)V
    .locals 1

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/n;->a:Lvi/g;

    invoke-virtual {v0, p1}, Lvi/g;->o(Z)V

    :cond_0
    return-void
.end method

.method public e(Z)V
    .locals 1

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/n;->a:Lvi/g;

    invoke-virtual {v0, p1}, Lvi/g;->p(Z)V

    :cond_0
    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/n;->a:Lvi/g;

    invoke-virtual {v0, p1}, Lvi/g;->q(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public g()V
    .locals 1

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/n;->a:Lvi/g;

    invoke-virtual {v0}, Lvi/g;->t()V

    :cond_0
    return-void
.end method

.method public h()V
    .locals 1

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/n;->a:Lvi/g;

    invoke-virtual {v0}, Lvi/g;->u()V

    :cond_0
    return-void
.end method

.method public i()V
    .locals 1

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/n;->a:Lvi/g;

    invoke-virtual {v0}, Lvi/g;->v()V

    :cond_0
    return-void
.end method

.method public j(Z)V
    .locals 1

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/n;->a:Lvi/g;

    invoke-virtual {v0, p1}, Lvi/g;->y(Z)V

    :cond_0
    return-void
.end method

.method public k()V
    .locals 1

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/n;->a:Lvi/g;

    invoke-virtual {v0}, Lvi/g;->L()V

    :cond_0
    return-void
.end method

.method public l()V
    .locals 1

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/n;->a:Lvi/g;

    invoke-virtual {v0}, Lvi/g;->M()V

    :cond_0
    return-void
.end method

.method public m()V
    .locals 1

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/n;->a:Lvi/g;

    invoke-virtual {v0}, Lvi/g;->N()V

    :cond_0
    return-void
.end method

.method public n()V
    .locals 1

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/n;->a:Lvi/g;

    invoke-virtual {v0}, Lvi/g;->O()V

    :cond_0
    return-void
.end method

.method public o()V
    .locals 1

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/n;->a:Lvi/g;

    invoke-virtual {v0}, Lvi/g;->P()V

    :cond_0
    return-void
.end method

.method public p()V
    .locals 1

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/n;->a:Lvi/g;

    invoke-virtual {v0}, Lvi/g;->R()V

    :cond_0
    return-void
.end method

.method public q(Z)V
    .locals 2

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/n;->a:Lvi/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lvi/g;->S(ZZ)V

    :cond_0
    return-void
.end method

.method public r(Z)V
    .locals 2

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/n;->a:Lvi/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lvi/g;->T(ZZ)V

    :cond_0
    return-void
.end method

.method public s(Z)V
    .locals 2

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/n;->a:Lvi/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lvi/g;->a0(ZZ)V

    :cond_0
    return-void
.end method

.method public t(Z)V
    .locals 2

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/n;->a:Lvi/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lvi/g;->U(ZZ)V

    :cond_0
    return-void
.end method

.method public u(Z)V
    .locals 2

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/n;->a:Lvi/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lvi/g;->V(ZZ)V

    :cond_0
    return-void
.end method

.method public v(Z)V
    .locals 2

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/n;->a:Lvi/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lvi/g;->W(ZZ)V

    :cond_0
    return-void
.end method

.method public w(Z)V
    .locals 2

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/n;->a:Lvi/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lvi/g;->X(ZZ)V

    :cond_0
    return-void
.end method

.method public x(Z)V
    .locals 2

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/n;->a:Lvi/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lvi/g;->Y(ZZ)V

    :cond_0
    return-void
.end method

.method public y(Z)V
    .locals 2

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/n;->a:Lvi/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lvi/g;->Z(ZZ)V

    :cond_0
    return-void
.end method

.method public z(Z)V
    .locals 2

    invoke-static {}, Lnh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lfj/n;->a:Lvi/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lvi/g;->b0(ZZ)V

    :cond_0
    return-void
.end method
