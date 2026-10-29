.class final Lcom/google/android/gms/games/internal/v2/resolution/zza;
.super Landroid/os/ResultReceiver;
.source "SourceFile"


# instance fields
.field public final a:Lsb/k;


# direct methods
.method public constructor <init>()V
    .locals 2

    new-instance v0, Lfb/w0;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Lfb/w0;-><init>(Landroid/os/Looper;)V

    invoke-direct {p0, v0}, Landroid/os/ResultReceiver;-><init>(Landroid/os/Handler;)V

    new-instance v0, Lsb/k;

    invoke-direct {v0}, Lsb/k;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/games/internal/v2/resolution/zza;->a:Lsb/k;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/tasks/Task;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/v2/resolution/zza;->a:Lsb/k;

    invoke-virtual {v0}, Lsb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public final onReceiveResult(ILandroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/os/ResultReceiver;->onReceiveResult(ILandroid/os/Bundle;)V

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p2, :cond_1

    new-instance p2, Landroid/content/Intent;

    invoke-direct {p2}, Landroid/content/Intent;-><init>()V

    goto :goto_1

    :cond_1
    const-string v0, "resultData"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Landroid/content/Intent;

    if-nez p2, :cond_2

    new-instance p2, Landroid/content/Intent;

    invoke-direct {p2}, Landroid/content/Intent;-><init>()V

    :cond_2
    :goto_1
    if-eqz p1, :cond_3

    invoke-static {p2}, Lla/a;->a(Landroid/content/Intent;)Lla/a;

    move-result-object p1

    goto :goto_2

    :cond_3
    invoke-static {p2}, Lla/a;->b(Landroid/content/Intent;)Lla/a;

    move-result-object p1

    :goto_2
    iget-object p2, p0, Lcom/google/android/gms/games/internal/v2/resolution/zza;->a:Lsb/k;

    invoke-virtual {p2, p1}, Lsb/k;->e(Ljava/lang/Object;)Z

    return-void
.end method
