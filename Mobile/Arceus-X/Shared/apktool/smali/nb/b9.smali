.class public final Lnb/b9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lne/q;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/measurement/internal/zzoh;

.field public final synthetic b:Lnb/qa;


# direct methods
.method public constructor <init>(Lnb/qa;Lcom/google/android/gms/measurement/internal/zzoh;)V
    .locals 0

    iput-object p2, p0, Lnb/b9;->a:Lcom/google/android/gms/measurement/internal/zzoh;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/b9;->b:Lnb/qa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    iget-object v0, p0, Lnb/b9;->b:Lnb/qa;

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->x()Lnb/k6;

    move-result-object v1

    invoke-virtual {v1}, Lnb/k6;->r()Landroid/util/SparseArray;

    move-result-object v1

    iget-object v2, p0, Lnb/b9;->a:Lcom/google/android/gms/measurement/internal/zzoh;

    iget v3, v2, Lcom/google/android/gms/measurement/internal/zzoh;->h:I

    iget-wide v4, v2, Lcom/google/android/gms/measurement/internal/zzoh;->g:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    invoke-virtual {v0}, Lnb/g7;->x()Lnb/k6;

    move-result-object v0

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v2

    new-array v2, v2, [I

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v3

    new-array v3, v3, [J

    const/4 v4, 0x0

    :goto_0
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v5

    if-ge v4, v5, :cond_0

    invoke-virtual {v1, v4}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v5

    aput v5, v2, v4

    invoke-virtual {v1, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    aput-wide v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v4, "uriSources"

    invoke-virtual {v1, v4, v2}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V

    const-string v2, "uriTimestamps"

    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putLongArray(Ljava/lang/String;[J)V

    iget-object v0, v0, Lnb/k6;->o:Lnb/g6;

    invoke-virtual {v0, v1}, Lnb/g6;->b(Landroid/os/Bundle;)V

    return-void
.end method

.method public final onFailure(Ljava/lang/Throwable;)V
    .locals 6

    iget-object v0, p0, Lnb/b9;->b:Lnb/qa;

    invoke-virtual {v0}, Lnb/j8;->h()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lnb/qa;->Z(Z)V

    iget-object v1, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->w()Lnb/k;

    move-result-object v2

    sget-object v3, Lnb/z4;->U0:Lnb/y4;

    const/4 v4, 0x0

    invoke-virtual {v2, v4, v3}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, p1}, Lnb/qa;->d0(Ljava/lang/Throwable;)I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    add-int/lit8 v2, v2, -0x1

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v3, :cond_1

    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->o()Lnb/u5;

    move-result-object v1

    iget-object v2, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->L()Lnb/k5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/k5;->q()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    const-string v4, "registerTriggerAsync failed. Dropping URI. App ID, Throwable"

    invoke-virtual {v1, v4, v2, p1}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lnb/b9;->a()V

    invoke-virtual {v0, v3}, Lnb/qa;->b0(I)V

    invoke-virtual {v0}, Lnb/qa;->x0()V

    return-void

    :cond_1
    invoke-virtual {v0}, Lnb/qa;->w0()Ljava/util/PriorityQueue;

    move-result-object v2

    iget-object v5, p0, Lnb/b9;->a:Lcom/google/android/gms/measurement/internal/zzoh;

    invoke-virtual {v2, v5}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lnb/qa;->a0()I

    move-result v2

    sget-object v5, Lnb/z4;->x0:Lnb/y4;

    invoke-virtual {v5, v4}, Lnb/y4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-le v2, v4, :cond_2

    invoke-virtual {v0, v3}, Lnb/qa;->b0(I)V

    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->r()Lnb/u5;

    move-result-object v1

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->L()Lnb/k5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/k5;->q()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v2, "registerTriggerAsync failed. May try later. App ID, throwable"

    invoke-virtual {v1, v2, v0, p1}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_2
    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->r()Lnb/u5;

    move-result-object v1

    iget-object v2, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->L()Lnb/k5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/k5;->q()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0}, Lnb/qa;->a0()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v4, "registerTriggerAsync failed. App ID, delay in seconds, throwable"

    invoke-virtual {v1, v4, v2, v3, p1}, Lnb/u5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lnb/qa;->a0()I

    move-result p1

    invoke-virtual {v0, p1}, Lnb/qa;->V(I)V

    invoke-virtual {v0}, Lnb/qa;->a0()I

    move-result p1

    add-int/2addr p1, p1

    invoke-virtual {v0, p1}, Lnb/qa;->b0(I)V

    return-void

    :cond_3
    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->r()Lnb/u5;

    move-result-object v1

    iget-object v2, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->L()Lnb/k5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/k5;->q()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v4, "registerTriggerAsync failed with retriable error. Will try later. App ID, throwable"

    invoke-virtual {v1, v4, v2, p1}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v3}, Lnb/qa;->b0(I)V

    invoke-virtual {v0}, Lnb/qa;->w0()Ljava/util/PriorityQueue;

    move-result-object p1

    iget-object v0, p0, Lnb/b9;->a:Lcom/google/android/gms/measurement/internal/zzoh;

    invoke-virtual {p1, v0}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final onSuccess(Ljava/lang/Object;)V
    .locals 3

    iget-object p1, p0, Lnb/b9;->b:Lnb/qa;

    invoke-virtual {p1}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b9;->a()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lnb/qa;->Z(Z)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lnb/qa;->b0(I)V

    iget-object v0, p1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->v()Lnb/u5;

    move-result-object v0

    iget-object v1, p0, Lnb/b9;->a:Lcom/google/android/gms/measurement/internal/zzoh;

    const-string v2, "Successfully registered trigger URI"

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzoh;->f:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lnb/qa;->x0()V

    return-void
.end method
