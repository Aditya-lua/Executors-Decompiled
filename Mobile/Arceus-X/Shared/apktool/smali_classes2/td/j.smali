.class public final Ltd/j;
.super Lee/u0;
.source "SourceFile"


# instance fields
.field public final synthetic b:[B

.field public final synthetic c:Ljava/lang/Long;

.field public final synthetic d:Landroid/os/Parcelable;

.field public final synthetic e:Lsb/k;

.field public final synthetic f:Lcom/google/android/play/core/integrity/IntegrityTokenRequest;

.field public final synthetic g:Ltd/m;


# direct methods
.method public constructor <init>(Ltd/m;Lsb/k;[BLjava/lang/Long;Landroid/os/Parcelable;Lsb/k;Lcom/google/android/play/core/integrity/IntegrityTokenRequest;)V
    .locals 0

    iput-object p3, p0, Ltd/j;->b:[B

    iput-object p4, p0, Ltd/j;->c:Ljava/lang/Long;

    iput-object p5, p0, Ltd/j;->d:Landroid/os/Parcelable;

    iput-object p6, p0, Ltd/j;->e:Lsb/k;

    iput-object p7, p0, Ltd/j;->f:Lcom/google/android/play/core/integrity/IntegrityTokenRequest;

    iput-object p1, p0, Ltd/j;->g:Ltd/m;

    invoke-direct {p0, p2}, Lee/u0;-><init>(Lsb/k;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Exception;)V
    .locals 2

    instance-of v0, p1, Lee/g;

    if-eqz v0, :cond_0

    new-instance v0, Ltd/a;

    const/16 v1, -0x9

    invoke-direct {v0, v1, p1}, Ltd/a;-><init>(ILjava/lang/Throwable;)V

    invoke-super {p0, v0}, Lee/u0;->a(Ljava/lang/Exception;)V

    return-void

    :cond_0
    invoke-super {p0, p1}, Lee/u0;->a(Ljava/lang/Exception;)V

    return-void
.end method

.method public final b()V
    .locals 5

    :try_start_0
    iget-object v0, p0, Ltd/j;->g:Ltd/m;

    iget-object v0, v0, Ltd/m;->f:Lee/f;

    invoke-virtual {v0}, Lee/f;->e()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lee/q0;

    iget-object v1, p0, Ltd/j;->g:Ltd/m;

    iget-object v2, p0, Ltd/j;->b:[B

    iget-object v3, p0, Ltd/j;->c:Ljava/lang/Long;

    iget-object v4, p0, Ltd/j;->d:Landroid/os/Parcelable;

    invoke-static {v1, v2, v3, v4}, Ltd/m;->a(Ltd/m;[BLjava/lang/Long;Landroid/os/Parcelable;)Landroid/os/Bundle;

    move-result-object v1

    new-instance v2, Ltd/l;

    iget-object v3, p0, Ltd/j;->g:Ltd/m;

    iget-object v4, p0, Ltd/j;->e:Lsb/k;

    invoke-direct {v2, v3, v4}, Ltd/l;-><init>(Ltd/m;Lsb/k;)V

    invoke-interface {v0, v1, v2}, Lee/q0;->F1(Landroid/os/Bundle;Lee/s0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Ltd/j;->g:Ltd/m;

    iget-object v2, p0, Ltd/j;->f:Lcom/google/android/play/core/integrity/IntegrityTokenRequest;

    invoke-static {v1}, Ltd/m;->d(Ltd/m;)Lee/t0;

    move-result-object v1

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "requestIntegrityToken(%s)"

    invoke-virtual {v1, v0, v3, v2}, Lee/t0;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v1, p0, Ltd/j;->e:Lsb/k;

    new-instance v2, Ltd/a;

    const/16 v3, -0x64

    invoke-direct {v2, v3, v0}, Ltd/a;-><init>(ILjava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Lsb/k;->d(Ljava/lang/Exception;)Z

    return-void
.end method
