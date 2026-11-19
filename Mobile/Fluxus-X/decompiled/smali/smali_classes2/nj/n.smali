.class public Lnj/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ldj/g;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ldj/g;->b()Ldj/g;

    move-result-object v0

    iput-object v0, p0, Lnj/n;->a:Ldj/g;

    return-void
.end method


# virtual methods
.method public A()V
    .locals 1

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/n;->a:Ldj/g;

    invoke-virtual {v0}, Ldj/g;->c0()V

    :cond_0
    return-void
.end method

.method public B()V
    .locals 1

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/n;->a:Ldj/g;

    invoke-virtual {v0}, Ldj/g;->d0()V

    :cond_0
    return-void
.end method

.method public C(Z)V
    .locals 2

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/n;->a:Ldj/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ldj/g;->e0(ZZ)V

    :cond_0
    return-void
.end method

.method public D(Z)V
    .locals 2

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/n;->a:Ldj/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ldj/g;->f0(ZZ)V

    :cond_0
    return-void
.end method

.method public E(Z)V
    .locals 2

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/n;->a:Ldj/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ldj/g;->g0(ZZ)V

    :cond_0
    return-void
.end method

.method public a(Lmj/n;Ljava/lang/String;)V
    .locals 4

    const-string v0, "rbx.purchaseflow"

    invoke-static {v0, p2}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_0

    new-instance v0, Lti/a;

    const-string v1, "Android-PurchaseFlow"

    invoke-direct {v0, v1}, Lti/a;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lti/a;->m(Z)Lti/a;

    move-result-object v0

    const-string v1, "UserId"

    invoke-virtual {p1}, Lmj/n;->b()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lti/a;->c(Ljava/lang/String;J)Lti/a;

    move-result-object v0

    const-string v1, "InAppPurchase"

    invoke-virtual {p1}, Lmj/n;->c()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lti/a;->e(Ljava/lang/String;Z)Lti/a;

    move-result-object v0

    const-string v1, "ProductId"

    invoke-virtual {p1}, Lmj/n;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lti/a;->d(Ljava/lang/String;Ljava/lang/Object;)Lti/a;

    move-result-object p1

    const-string v0, "Message"

    invoke-virtual {p1, v0, p2}, Lti/a;->d(Ljava/lang/String;Ljava/lang/Object;)Lti/a;

    move-result-object p1

    invoke-static {}, Lbh/u;->g()Lbh/u;

    move-result-object p2

    invoke-virtual {p2}, Lbh/u;->h()Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    const-string v0, "Rooted"

    invoke-virtual {p1, v0, p2}, Lti/a;->f(Ljava/lang/String;Ljava/lang/Object;)Lti/a;

    move-result-object p1

    invoke-virtual {p1}, Lti/a;->g()Lsh/c;

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 6

    iget-object v0, p0, Lnj/n;->a:Ldj/g;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    invoke-virtual/range {v0 .. v5}, Ldj/g;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    return-void
.end method

.method public c(Z)V
    .locals 1

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/n;->a:Ldj/g;

    invoke-virtual {v0, p1}, Ldj/g;->n(Z)V

    :cond_0
    return-void
.end method

.method public d(Z)V
    .locals 1

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/n;->a:Ldj/g;

    invoke-virtual {v0, p1}, Ldj/g;->o(Z)V

    :cond_0
    return-void
.end method

.method public e(Z)V
    .locals 1

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/n;->a:Ldj/g;

    invoke-virtual {v0, p1}, Ldj/g;->p(Z)V

    :cond_0
    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/n;->a:Ldj/g;

    invoke-virtual {v0, p1}, Ldj/g;->q(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public g()V
    .locals 1

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/n;->a:Ldj/g;

    invoke-virtual {v0}, Ldj/g;->t()V

    :cond_0
    return-void
.end method

.method public h()V
    .locals 1

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/n;->a:Ldj/g;

    invoke-virtual {v0}, Ldj/g;->u()V

    :cond_0
    return-void
.end method

.method public i()V
    .locals 1

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/n;->a:Ldj/g;

    invoke-virtual {v0}, Ldj/g;->v()V

    :cond_0
    return-void
.end method

.method public j(Z)V
    .locals 1

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/n;->a:Ldj/g;

    invoke-virtual {v0, p1}, Ldj/g;->y(Z)V

    :cond_0
    return-void
.end method

.method public k()V
    .locals 1

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/n;->a:Ldj/g;

    invoke-virtual {v0}, Ldj/g;->L()V

    :cond_0
    return-void
.end method

.method public l()V
    .locals 1

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/n;->a:Ldj/g;

    invoke-virtual {v0}, Ldj/g;->M()V

    :cond_0
    return-void
.end method

.method public m()V
    .locals 1

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/n;->a:Ldj/g;

    invoke-virtual {v0}, Ldj/g;->N()V

    :cond_0
    return-void
.end method

.method public n()V
    .locals 1

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/n;->a:Ldj/g;

    invoke-virtual {v0}, Ldj/g;->O()V

    :cond_0
    return-void
.end method

.method public o()V
    .locals 1

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/n;->a:Ldj/g;

    invoke-virtual {v0}, Ldj/g;->P()V

    :cond_0
    return-void
.end method

.method public p()V
    .locals 1

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/n;->a:Ldj/g;

    invoke-virtual {v0}, Ldj/g;->R()V

    :cond_0
    return-void
.end method

.method public q(Z)V
    .locals 2

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/n;->a:Ldj/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ldj/g;->S(ZZ)V

    :cond_0
    return-void
.end method

.method public r(Z)V
    .locals 2

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/n;->a:Ldj/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ldj/g;->T(ZZ)V

    :cond_0
    return-void
.end method

.method public s(Z)V
    .locals 2

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/n;->a:Ldj/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ldj/g;->a0(ZZ)V

    :cond_0
    return-void
.end method

.method public t(Z)V
    .locals 2

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/n;->a:Ldj/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ldj/g;->U(ZZ)V

    :cond_0
    return-void
.end method

.method public u(Z)V
    .locals 2

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/n;->a:Ldj/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ldj/g;->V(ZZ)V

    :cond_0
    return-void
.end method

.method public v(Z)V
    .locals 2

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/n;->a:Ldj/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ldj/g;->W(ZZ)V

    :cond_0
    return-void
.end method

.method public w(Z)V
    .locals 2

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/n;->a:Ldj/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ldj/g;->X(ZZ)V

    :cond_0
    return-void
.end method

.method public x(Z)V
    .locals 2

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/n;->a:Ldj/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ldj/g;->Y(ZZ)V

    :cond_0
    return-void
.end method

.method public y(Z)V
    .locals 2

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/n;->a:Ldj/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ldj/g;->Z(ZZ)V

    :cond_0
    return-void
.end method

.method public z(Z)V
    .locals 2

    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnj/n;->a:Ldj/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ldj/g;->b0(ZZ)V

    :cond_0
    return-void
.end method
