.class public final Lvd/k0;
.super Lvd/i0;
.source "SourceFile"


# instance fields
.field public final c:Lge/t0;

.field public final d:J

.field public final synthetic e:Lvd/n0;


# direct methods
.method public constructor <init>(Lvd/n0;Ltb/k;J)V
    .locals 0

    iput-object p1, p0, Lvd/k0;->e:Lvd/n0;

    invoke-direct {p0, p1, p2}, Lvd/i0;-><init>(Lvd/n0;Ltb/k;)V

    new-instance p1, Lge/t0;

    const-string p2, "OnRequestIntegrityTokenCallback"

    invoke-direct {p1, p2}, Lge/t0;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lvd/k0;->c:Lge/t0;

    iput-wide p3, p0, Lvd/k0;->d:J

    return-void
.end method


# virtual methods
.method public final b(Landroid/os/Bundle;)V
    .locals 4

    invoke-super {p0, p1}, Lvd/i0;->b(Landroid/os/Bundle;)V

    iget-object v0, p0, Lvd/k0;->c:Lge/t0;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRequestExpressIntegrityToken"

    invoke-virtual {v0, v2, v1}, Lge/t0;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lvd/k0;->e:Lvd/n0;

    invoke-static {v0}, Lvd/n0;->f(Lvd/n0;)Lvd/d1;

    move-result-object v0

    invoke-interface {v0, p1}, Lvd/d1;->a(Landroid/os/Bundle;)Ll9/b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lvd/i0;->a:Ltb/k;

    invoke-virtual {p1, v0}, Ltb/k;->d(Ljava/lang/Exception;)Z

    return-void

    :cond_0
    const-string v0, "request.token.sid"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iget-object v2, p0, Lvd/k0;->e:Lvd/n0;

    new-instance v3, Lvd/j0;

    invoke-static {v2}, Lvd/n0;->h(Lvd/n0;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, p0, v2, v0, v1}, Lvd/j0;-><init>(Lvd/k0;Ljava/lang/String;J)V

    iget-object v0, p0, Lvd/i0;->a:Ltb/k;

    new-instance v1, Lvd/a0;

    invoke-direct {v1}, Lvd/a0;-><init>()V

    const-string v2, "token"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lvd/q0;->b(Ljava/lang/String;)Lvd/q0;

    invoke-virtual {v1, v3}, Lvd/q0;->a(Lvd/r1;)Lvd/q0;

    invoke-virtual {v1}, Lvd/q0;->c()Lvd/r0;

    move-result-object p1

    invoke-virtual {v0, p1}, Ltb/k;->e(Ljava/lang/Object;)Z

    return-void
.end method
