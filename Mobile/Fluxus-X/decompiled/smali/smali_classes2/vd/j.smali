.class public final Lvd/j;
.super Lge/u0;
.source "SourceFile"


# instance fields
.field public final synthetic b:[B

.field public final synthetic c:Ljava/lang/Long;

.field public final synthetic d:Landroid/os/Parcelable;

.field public final synthetic e:Ltb/k;

.field public final synthetic f:Lcom/google/android/play/core/integrity/IntegrityTokenRequest;

.field public final synthetic g:Lvd/m;


# direct methods
.method public constructor <init>(Lvd/m;Ltb/k;[BLjava/lang/Long;Landroid/os/Parcelable;Ltb/k;Lcom/google/android/play/core/integrity/IntegrityTokenRequest;)V
    .locals 0

    iput-object p3, p0, Lvd/j;->b:[B

    iput-object p4, p0, Lvd/j;->c:Ljava/lang/Long;

    iput-object p5, p0, Lvd/j;->d:Landroid/os/Parcelable;

    iput-object p6, p0, Lvd/j;->e:Ltb/k;

    iput-object p7, p0, Lvd/j;->f:Lcom/google/android/play/core/integrity/IntegrityTokenRequest;

    iput-object p1, p0, Lvd/j;->g:Lvd/m;

    invoke-direct {p0, p2}, Lge/u0;-><init>(Ltb/k;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Exception;)V
    .locals 2

    instance-of v0, p1, Lge/g;

    if-eqz v0, :cond_0

    new-instance v0, Lvd/a;

    const/16 v1, -0x9

    invoke-direct {v0, v1, p1}, Lvd/a;-><init>(ILjava/lang/Throwable;)V

    invoke-super {p0, v0}, Lge/u0;->a(Ljava/lang/Exception;)V

    return-void

    :cond_0
    invoke-super {p0, p1}, Lge/u0;->a(Ljava/lang/Exception;)V

    return-void
.end method

.method public final b()V
    .locals 5

    :try_start_0
    iget-object v0, p0, Lvd/j;->g:Lvd/m;

    iget-object v0, v0, Lvd/m;->f:Lge/f;

    invoke-virtual {v0}, Lge/f;->e()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lge/q0;

    iget-object v1, p0, Lvd/j;->g:Lvd/m;

    iget-object v2, p0, Lvd/j;->b:[B

    iget-object v3, p0, Lvd/j;->c:Ljava/lang/Long;

    iget-object v4, p0, Lvd/j;->d:Landroid/os/Parcelable;

    invoke-static {v1, v2, v3, v4}, Lvd/m;->a(Lvd/m;[BLjava/lang/Long;Landroid/os/Parcelable;)Landroid/os/Bundle;

    move-result-object v1

    new-instance v2, Lvd/l;

    iget-object v3, p0, Lvd/j;->g:Lvd/m;

    iget-object v4, p0, Lvd/j;->e:Ltb/k;

    invoke-direct {v2, v3, v4}, Lvd/l;-><init>(Lvd/m;Ltb/k;)V

    invoke-interface {v0, v1, v2}, Lge/q0;->e1(Landroid/os/Bundle;Lge/s0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lvd/j;->g:Lvd/m;

    iget-object v2, p0, Lvd/j;->f:Lcom/google/android/play/core/integrity/IntegrityTokenRequest;

    invoke-static {v1}, Lvd/m;->d(Lvd/m;)Lge/t0;

    move-result-object v1

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "requestIntegrityToken(%s)"

    invoke-virtual {v1, v0, v3, v2}, Lge/t0;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v1, p0, Lvd/j;->e:Ltb/k;

    new-instance v2, Lvd/a;

    const/16 v3, -0x64

    invoke-direct {v2, v3, v0}, Lvd/a;-><init>(ILjava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Ltb/k;->d(Ljava/lang/Exception;)Z

    return-void
.end method
