.class public final Ln9/u0;
.super Ldb/p;
.source "SourceFile"


# instance fields
.field public final synthetic b:Ln9/c;


# direct methods
.method public constructor <init>(Ln9/c;Landroid/os/Looper;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ln9/u0;->b:Ln9/c;

    invoke-direct {p0, p2}, Ldb/p;-><init>(Landroid/os/Looper;)V

    return-void
.end method

.method public static final a(Landroid/os/Message;)V
    .locals 0

    iget-object p0, p0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p0, Ln9/v0;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ln9/v0;->c()V

    :cond_0
    return-void
.end method

.method public static final b(Landroid/os/Message;)Z
    .locals 2

    iget p0, p0, Landroid/os/Message;->what:I

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-eq p0, v0, :cond_1

    if-eq p0, v1, :cond_1

    const/4 v0, 0x7

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    return v1
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 8

    iget-object v0, p0, Ln9/u0;->b:Ln9/c;

    iget-object v1, v0, Ln9/c;->zzd:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    iget v2, p1, Landroid/os/Message;->arg1:I

    if-eq v1, v2, :cond_1

    invoke-static {p1}, Ln9/u0;->b(Landroid/os/Message;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Ln9/u0;->a(Landroid/os/Message;)V

    :cond_0
    return-void

    :cond_1
    iget v1, p1, Landroid/os/Message;->what:I

    const/4 v2, 0x4

    const/4 v3, 0x1

    const/4 v4, 0x5

    if-eq v1, v3, :cond_3

    const/4 v5, 0x7

    if-eq v1, v5, :cond_3

    if-ne v1, v2, :cond_2

    invoke-virtual {v0}, Ln9/c;->enableLocalFallback()Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_2
    iget v1, p1, Landroid/os/Message;->what:I

    if-ne v1, v4, :cond_4

    :cond_3
    invoke-virtual {v0}, Ln9/c;->isConnecting()Z

    move-result v1

    if-eqz v1, :cond_12

    :cond_4
    iget v1, p1, Landroid/os/Message;->what:I

    const/16 v5, 0x8

    const/4 v6, 0x3

    const/4 v7, 0x0

    if-ne v1, v2, :cond_8

    new-instance v1, Lcom/google/android/gms/common/ConnectionResult;

    iget p1, p1, Landroid/os/Message;->arg2:I

    invoke-direct {v1, p1}, Lcom/google/android/gms/common/ConnectionResult;-><init>(I)V

    invoke-virtual {v0, v1}, Ln9/c;->zzn(Lcom/google/android/gms/common/ConnectionResult;)V

    invoke-virtual {v0}, Ln9/c;->zzg()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {v0}, Ln9/c;->zzo()Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_0

    :cond_5
    invoke-virtual {v0, v6, v7}, Ln9/c;->zzd(ILandroid/os/IInterface;)V

    return-void

    :cond_6
    :goto_0
    invoke-virtual {v0}, Ln9/c;->zzm()Lcom/google/android/gms/common/ConnectionResult;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {v0}, Ln9/c;->zzm()Lcom/google/android/gms/common/ConnectionResult;

    move-result-object p1

    goto :goto_1

    :cond_7
    new-instance p1, Lcom/google/android/gms/common/ConnectionResult;

    invoke-direct {p1, v5}, Lcom/google/android/gms/common/ConnectionResult;-><init>(I)V

    :goto_1
    iget-object v1, v0, Ln9/c;->zzc:Ln9/c$c;

    invoke-interface {v1, p1}, Ln9/c$c;->a(Lcom/google/android/gms/common/ConnectionResult;)V

    invoke-virtual {v0, p1}, Ln9/c;->onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V

    return-void

    :cond_8
    if-ne v1, v4, :cond_a

    invoke-virtual {v0}, Ln9/c;->zzm()Lcom/google/android/gms/common/ConnectionResult;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {v0}, Ln9/c;->zzm()Lcom/google/android/gms/common/ConnectionResult;

    move-result-object p1

    goto :goto_2

    :cond_9
    new-instance p1, Lcom/google/android/gms/common/ConnectionResult;

    invoke-direct {p1, v5}, Lcom/google/android/gms/common/ConnectionResult;-><init>(I)V

    :goto_2
    iget-object v1, v0, Ln9/c;->zzc:Ln9/c$c;

    invoke-interface {v1, p1}, Ln9/c$c;->a(Lcom/google/android/gms/common/ConnectionResult;)V

    invoke-virtual {v0, p1}, Ln9/c;->onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V

    return-void

    :cond_a
    if-ne v1, v6, :cond_c

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v2, v1, Landroid/app/PendingIntent;

    if-eqz v2, :cond_b

    move-object v7, v1

    check-cast v7, Landroid/app/PendingIntent;

    :cond_b
    new-instance v1, Lcom/google/android/gms/common/ConnectionResult;

    iget p1, p1, Landroid/os/Message;->arg2:I

    invoke-direct {v1, p1, v7}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;)V

    iget-object p1, v0, Ln9/c;->zzc:Ln9/c$c;

    invoke-interface {p1, v1}, Ln9/c$c;->a(Lcom/google/android/gms/common/ConnectionResult;)V

    invoke-virtual {v0, v1}, Ln9/c;->onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V

    return-void

    :cond_c
    const/4 v2, 0x6

    if-ne v1, v2, :cond_e

    invoke-virtual {v0, v4, v7}, Ln9/c;->zzd(ILandroid/os/IInterface;)V

    invoke-virtual {v0}, Ln9/c;->zzk()Ln9/c$a;

    move-result-object v1

    if-eqz v1, :cond_d

    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-virtual {v0}, Ln9/c;->zzk()Ln9/c$a;

    move-result-object v2

    invoke-interface {v2, v1}, Ln9/c$a;->onConnectionSuspended(I)V

    :cond_d
    iget p1, p1, Landroid/os/Message;->arg2:I

    invoke-virtual {v0, p1}, Ln9/c;->onConnectionSuspended(I)V

    invoke-virtual {v0, v4, v3, v7}, Ln9/c;->zze(IILandroid/os/IInterface;)Z

    return-void

    :cond_e
    const/4 v2, 0x2

    if-ne v1, v2, :cond_10

    invoke-virtual {v0}, Ln9/c;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_f

    goto :goto_3

    :cond_f
    invoke-static {p1}, Ln9/u0;->a(Landroid/os/Message;)V

    return-void

    :cond_10
    :goto_3
    invoke-static {p1}, Ln9/u0;->b(Landroid/os/Message;)Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ln9/v0;

    invoke-virtual {p1}, Ln9/v0;->b()V

    return-void

    :cond_11
    iget p1, p1, Landroid/os/Message;->what:I

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x22

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Don\'t know how to handle message: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    const-string v1, "GmsClient"

    invoke-static {v1, p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void

    :cond_12
    invoke-static {p1}, Ln9/u0;->a(Landroid/os/Message;)V

    return-void
.end method
