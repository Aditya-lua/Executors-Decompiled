.class public final Ln9/w0;
.super Ln9/n1;
.source "SourceFile"


# instance fields
.field public a:Ln9/c;

.field public final b:I


# direct methods
.method public constructor <init>(Ln9/c;I)V
    .locals 0
    .param p1    # Ln9/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ln9/n1;-><init>()V

    iput-object p1, p0, Ln9/w0;->a:Ln9/c;

    iput p2, p0, Ln9/w0;->b:I

    return-void
.end method


# virtual methods
.method public final d0(ILandroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 2
    .param p2    # Landroid/os/IBinder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Ln9/w0;->a:Ln9/c;

    const-string v1, "onPostInitComplete can be called only once per call to getRemoteService"

    invoke-static {v0, v1}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Ln9/w0;->a:Ln9/c;

    iget v1, p0, Ln9/w0;->b:I

    invoke-virtual {v0, p1, p2, p3, v1}, Ln9/c;->onPostInitHandler(ILandroid/os/IBinder;Landroid/os/Bundle;I)V

    const/4 p1, 0x0

    iput-object p1, p0, Ln9/w0;->a:Ln9/c;

    return-void
.end method

.method public final i(ILandroid/os/Bundle;)V
    .locals 1

    new-instance p1, Ljava/lang/Exception;

    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    const-string p2, "GmsClient"

    const-string v0, "received deprecated onAccountValidationComplete callback, ignoring"

    invoke-static {p2, v0, p1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public final x1(ILandroid/os/IBinder;Lcom/google/android/gms/common/internal/zzj;)V
    .locals 2
    .param p2    # Landroid/os/IBinder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/google/android/gms/common/internal/zzj;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Ln9/w0;->a:Ln9/c;

    const-string v1, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService"

    invoke-static {v0, v1}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, p3}, Ln9/c;->zzc(Lcom/google/android/gms/common/internal/zzj;)V

    iget-object p3, p3, Lcom/google/android/gms/common/internal/zzj;->f:Landroid/os/Bundle;

    invoke-virtual {p0, p1, p2, p3}, Ln9/w0;->d0(ILandroid/os/IBinder;Landroid/os/Bundle;)V

    return-void
.end method
