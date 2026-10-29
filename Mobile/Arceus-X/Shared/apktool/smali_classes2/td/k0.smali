.class public final Ltd/k0;
.super Ltd/i0;
.source "SourceFile"


# instance fields
.field public final c:Lee/t0;

.field public final d:J

.field public final synthetic e:Ltd/n0;


# direct methods
.method public constructor <init>(Ltd/n0;Lsb/k;J)V
    .locals 0

    iput-object p1, p0, Ltd/k0;->e:Ltd/n0;

    invoke-direct {p0, p1, p2}, Ltd/i0;-><init>(Ltd/n0;Lsb/k;)V

    new-instance p1, Lee/t0;

    const-string p2, "OnRequestIntegrityTokenCallback"

    invoke-direct {p1, p2}, Lee/t0;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Ltd/k0;->c:Lee/t0;

    iput-wide p3, p0, Ltd/k0;->d:J

    return-void
.end method


# virtual methods
.method public final b(Landroid/os/Bundle;)V
    .locals 4

    invoke-super {p0, p1}, Ltd/i0;->b(Landroid/os/Bundle;)V

    iget-object v0, p0, Ltd/k0;->c:Lee/t0;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRequestExpressIntegrityToken"

    invoke-virtual {v0, v2, v1}, Lee/t0;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Ltd/k0;->e:Ltd/n0;

    invoke-static {v0}, Ltd/n0;->f(Ltd/n0;)Ltd/d1;

    move-result-object v0

    invoke-interface {v0, p1}, Ltd/d1;->a(Landroid/os/Bundle;)Lk9/b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Ltd/i0;->a:Lsb/k;

    invoke-virtual {p1, v0}, Lsb/k;->d(Ljava/lang/Exception;)Z

    return-void

    :cond_0
    const-string v0, "request.token.sid"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iget-object v2, p0, Ltd/k0;->e:Ltd/n0;

    new-instance v3, Ltd/j0;

    invoke-static {v2}, Ltd/n0;->h(Ltd/n0;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, p0, v2, v0, v1}, Ltd/j0;-><init>(Ltd/k0;Ljava/lang/String;J)V

    iget-object v0, p0, Ltd/i0;->a:Lsb/k;

    new-instance v1, Ltd/a0;

    invoke-direct {v1}, Ltd/a0;-><init>()V

    const-string v2, "token"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ltd/q0;->b(Ljava/lang/String;)Ltd/q0;

    invoke-virtual {v1, v3}, Ltd/q0;->a(Ltd/r1;)Ltd/q0;

    invoke-virtual {v1}, Ltd/q0;->c()Ltd/r0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lsb/k;->e(Ljava/lang/Object;)Z

    return-void
.end method
