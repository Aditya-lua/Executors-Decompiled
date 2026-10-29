.class final Lcom/google/android/play/core/review/zzc;
.super Landroid/os/ResultReceiver;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lsb/k;


# direct methods
.method public constructor <init>(Lcom/google/android/play/core/review/b;Landroid/os/Handler;Lsb/k;)V
    .locals 0

    iput-object p3, p0, Lcom/google/android/play/core/review/zzc;->a:Lsb/k;

    invoke-direct {p0, p2}, Landroid/os/ResultReceiver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public final onReceiveResult(ILandroid/os/Bundle;)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/play/core/review/zzc;->a:Lsb/k;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lsb/k;->e(Ljava/lang/Object;)Z

    return-void
.end method
