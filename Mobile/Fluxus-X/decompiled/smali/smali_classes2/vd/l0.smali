.class public final Lvd/l0;
.super Lvd/i0;
.source "SourceFile"


# instance fields
.field public final c:Lge/t0;

.field public final synthetic d:Lvd/n0;


# direct methods
.method public constructor <init>(Lvd/n0;Ltb/k;)V
    .locals 0

    iput-object p1, p0, Lvd/l0;->d:Lvd/n0;

    invoke-direct {p0, p1, p2}, Lvd/i0;-><init>(Lvd/n0;Ltb/k;)V

    new-instance p1, Lge/t0;

    const-string p2, "OnWarmUpIntegrityTokenCallback"

    invoke-direct {p1, p2}, Lge/t0;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lvd/l0;->c:Lge/t0;

    return-void
.end method


# virtual methods
.method public final E1(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lvd/i0;->E1(Landroid/os/Bundle;)V

    iget-object v0, p0, Lvd/l0;->c:Lge/t0;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onWarmUpExpressIntegrityToken"

    invoke-virtual {v0, v2, v1}, Lge/t0;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lvd/l0;->d:Lvd/n0;

    invoke-static {v0}, Lvd/n0;->f(Lvd/n0;)Lvd/d1;

    move-result-object v0

    invoke-interface {v0, p1}, Lvd/d1;->a(Landroid/os/Bundle;)Ll9/b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lvd/i0;->a:Ltb/k;

    invoke-virtual {p1, v0}, Ltb/k;->d(Ljava/lang/Exception;)Z

    return-void

    :cond_0
    iget-object v0, p0, Lvd/i0;->a:Ltb/k;

    const-string v1, "warm.up.sid"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p1}, Ltb/k;->e(Ljava/lang/Object;)Z

    return-void
.end method
