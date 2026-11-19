.class public final Lvd/l;
.super Lge/r0;
.source "SourceFile"


# instance fields
.field public final a:Lge/t0;

.field public final b:Ltb/k;

.field public final synthetic c:Lvd/m;


# direct methods
.method public constructor <init>(Lvd/m;Ltb/k;)V
    .locals 1

    iput-object p1, p0, Lvd/l;->c:Lvd/m;

    invoke-direct {p0}, Lge/r0;-><init>()V

    new-instance p1, Lge/t0;

    const-string v0, "OnRequestIntegrityTokenCallback"

    invoke-direct {p1, v0}, Lge/t0;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lvd/l;->a:Lge/t0;

    iput-object p2, p0, Lvd/l;->b:Ltb/k;

    return-void
.end method


# virtual methods
.method public final d(Landroid/os/Bundle;)V
    .locals 4

    iget-object v0, p0, Lvd/l;->c:Lvd/m;

    iget-object v0, v0, Lvd/m;->f:Lge/f;

    iget-object v1, p0, Lvd/l;->b:Ltb/k;

    invoke-virtual {v0, v1}, Lge/f;->v(Ltb/k;)V

    iget-object v0, p0, Lvd/l;->a:Lge/t0;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRequestIntegrityToken"

    invoke-virtual {v0, v2, v1}, Lge/t0;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lvd/l;->c:Lvd/m;

    invoke-static {v0}, Lvd/m;->c(Lvd/m;)Lvd/d1;

    move-result-object v0

    invoke-interface {v0, p1}, Lvd/d1;->a(Landroid/os/Bundle;)Ll9/b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lvd/l;->b:Ltb/k;

    invoke-virtual {p1, v0}, Ltb/k;->d(Ljava/lang/Exception;)Z

    return-void

    :cond_0
    const-string v0, "token"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object p1, p0, Lvd/l;->b:Ltb/k;

    new-instance v0, Lvd/a;

    const/16 v1, -0x64

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lvd/a;-><init>(ILjava/lang/Throwable;)V

    invoke-virtual {p1, v0}, Ltb/k;->d(Ljava/lang/Exception;)Z

    return-void

    :cond_1
    const-string v1, "request.token.sid"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    iget-object p1, p0, Lvd/l;->c:Lvd/m;

    new-instance v3, Lvd/k;

    invoke-static {p1}, Lvd/m;->e(Lvd/m;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v3, p0, p1, v1, v2}, Lvd/k;-><init>(Lvd/l;Ljava/lang/String;J)V

    iget-object p1, p0, Lvd/l;->b:Ltb/k;

    new-instance v1, Lvd/d;

    invoke-direct {v1}, Lvd/d;-><init>()V

    invoke-virtual {v1, v0}, Lvd/r;->b(Ljava/lang/String;)Lvd/r;

    invoke-virtual {v1, v3}, Lvd/r;->a(Lvd/r1;)Lvd/r;

    invoke-virtual {v1}, Lvd/r;->c()Lvd/s;

    move-result-object v0

    invoke-virtual {p1, v0}, Ltb/k;->e(Ljava/lang/Object;)Z

    return-void
.end method
