.class public final synthetic Lfb/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Lsb/k;


# direct methods
.method public synthetic constructor <init>(Lsb/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfb/d0;->a:Lsb/k;

    return-void
.end method


# virtual methods
.method public final synthetic onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    iget-object v0, p0, Lfb/d0;->a:Lsb/k;

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/games_v2/zzs;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/games_v2/zzs;->zza()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lfb/g0;->a(Ljava/lang/String;)Lfb/g0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lsb/k;->e(Ljava/lang/Object;)Z

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    instance-of v1, p1, Lk9/b;

    if-nez v1, :cond_1

    invoke-static {p1}, Lfb/b1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, p1}, Lsb/k;->d(Ljava/lang/Exception;)Z

    return-void

    :cond_1
    check-cast p1, Lk9/b;

    invoke-virtual {p1}, Lk9/b;->a()Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-static {p1}, Lfb/g0;->b(Lcom/google/android/gms/common/api/Status;)Lfb/g0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lsb/k;->e(Ljava/lang/Object;)Z

    return-void
.end method
