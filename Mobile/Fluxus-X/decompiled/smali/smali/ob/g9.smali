.class public final Lob/g9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpe/q;


# instance fields
.field public final synthetic a:Lob/vd;

.field public final synthetic b:Lob/va;


# direct methods
.method public constructor <init>(Lob/va;Lob/vd;)V
    .locals 0

    iput-object p2, p0, Lob/g9;->a:Lob/vd;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/g9;->b:Lob/va;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    iget-object v0, p0, Lob/g9;->b:Lob/va;

    iget-object v0, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->x()Lob/p6;

    move-result-object v1

    invoke-virtual {v1}, Lob/p6;->r()Landroid/util/SparseArray;

    move-result-object v1

    iget-object v2, p0, Lob/g9;->a:Lob/vd;

    iget v3, v2, Lob/vd;->h:I

    iget-wide v4, v2, Lob/vd;->g:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    invoke-virtual {v0}, Lob/l7;->x()Lob/p6;

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

    iget-object v0, v0, Lob/p6;->o:Lob/l6;

    invoke-virtual {v0, v1}, Lob/l6;->b(Landroid/os/Bundle;)V

    return-void
.end method

.method public final onFailure(Ljava/lang/Throwable;)V
    .locals 6

    iget-object v0, p0, Lob/g9;->b:Lob/va;

    invoke-virtual {v0}, Lob/o8;->h()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lob/va;->Z(Z)V

    iget-object v1, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->w()Lob/m;

    move-result-object v2

    sget-object v3, Lob/e5;->U0:Lob/d5;

    const/4 v4, 0x0

    invoke-virtual {v2, v4, v3}, Lob/m;->H(Ljava/lang/String;Lob/d5;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, p1}, Lob/va;->d0(Ljava/lang/Throwable;)I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    add-int/lit8 v2, v2, -0x1

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v3, :cond_1

    invoke-virtual {v1}, Lob/l7;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->o()Lob/z5;

    move-result-object v1

    iget-object v2, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v2}, Lob/l7;->L()Lob/p5;

    move-result-object v2

    invoke-virtual {v2}, Lob/p5;->q()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lob/b6;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    const-string v4, "registerTriggerAsync failed. Dropping URI. App ID, Throwable"

    invoke-virtual {v1, v4, v2, p1}, Lob/z5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lob/g9;->a()V

    invoke-virtual {v0, v3}, Lob/va;->b0(I)V

    invoke-virtual {v0}, Lob/va;->x0()V

    return-void

    :cond_1
    invoke-virtual {v0}, Lob/va;->w0()Ljava/util/PriorityQueue;

    move-result-object v2

    iget-object v5, p0, Lob/g9;->a:Lob/vd;

    invoke-virtual {v2, v5}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lob/va;->a0()I

    move-result v2

    sget-object v5, Lob/e5;->x0:Lob/d5;

    invoke-virtual {v5, v4}, Lob/d5;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-le v2, v4, :cond_2

    invoke-virtual {v0, v3}, Lob/va;->b0(I)V

    invoke-virtual {v1}, Lob/l7;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->r()Lob/z5;

    move-result-object v1

    iget-object v0, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->L()Lob/p5;

    move-result-object v0

    invoke-virtual {v0}, Lob/p5;->q()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lob/b6;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lob/b6;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v2, "registerTriggerAsync failed. May try later. App ID, throwable"

    invoke-virtual {v1, v2, v0, p1}, Lob/z5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_2
    invoke-virtual {v1}, Lob/l7;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->r()Lob/z5;

    move-result-object v1

    iget-object v2, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v2}, Lob/l7;->L()Lob/p5;

    move-result-object v2

    invoke-virtual {v2}, Lob/p5;->q()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lob/b6;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0}, Lob/va;->a0()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lob/b6;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lob/b6;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v4, "registerTriggerAsync failed. App ID, delay in seconds, throwable"

    invoke-virtual {v1, v4, v2, v3, p1}, Lob/z5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lob/va;->a0()I

    move-result p1

    invoke-virtual {v0, p1}, Lob/va;->V(I)V

    invoke-virtual {v0}, Lob/va;->a0()I

    move-result p1

    add-int/2addr p1, p1

    invoke-virtual {v0, p1}, Lob/va;->b0(I)V

    return-void

    :cond_3
    invoke-virtual {v1}, Lob/l7;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->r()Lob/z5;

    move-result-object v1

    iget-object v2, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v2}, Lob/l7;->L()Lob/p5;

    move-result-object v2

    invoke-virtual {v2}, Lob/p5;->q()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lob/b6;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lob/b6;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v4, "registerTriggerAsync failed with retriable error. Will try later. App ID, throwable"

    invoke-virtual {v1, v4, v2, p1}, Lob/z5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v3}, Lob/va;->b0(I)V

    invoke-virtual {v0}, Lob/va;->w0()Ljava/util/PriorityQueue;

    move-result-object p1

    iget-object v0, p0, Lob/g9;->a:Lob/vd;

    invoke-virtual {p1, v0}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final onSuccess(Ljava/lang/Object;)V
    .locals 3

    iget-object p1, p0, Lob/g9;->b:Lob/va;

    invoke-virtual {p1}, Lob/o8;->h()V

    invoke-virtual {p0}, Lob/g9;->a()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lob/va;->Z(Z)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lob/va;->b0(I)V

    iget-object v0, p1, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->v()Lob/z5;

    move-result-object v0

    iget-object v1, p0, Lob/g9;->a:Lob/vd;

    const-string v2, "Successfully registered trigger URI"

    iget-object v1, v1, Lob/vd;->f:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lob/va;->x0()V

    return-void
.end method
