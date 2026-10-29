.class public final Lva/n0;
.super Lv8/b;
.source "SourceFile"


# instance fields
.field public final b:Lva/m0;
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lva/g0;

    invoke-direct {v0, p1}, Lva/g0;-><init>(Landroid/content/Context;)V

    invoke-direct {p0}, Lv8/b;-><init>()V

    new-instance p1, Lva/m0;

    invoke-direct {p1, v0}, Lva/m0;-><init>(Lk9/e;)V

    iput-object p1, p0, Lva/n0;->b:Lva/m0;

    return-void
.end method


# virtual methods
.method public final b()Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/google/firebase/appindexing/internal/zzg;->v3()Lcom/google/firebase/appindexing/internal/zzg;

    move-result-object v0

    iget-object v1, p0, Lva/n0;->b:Lva/m0;

    invoke-virtual {v1, v0}, Lva/m0;->d(Lcom/google/firebase/appindexing/internal/zzg;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public final varargs c([Lv8/g;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lv8/g;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    :try_start_0
    array-length v0, p1

    new-array v1, v0, [Lcom/google/firebase/appindexing/internal/Thing;

    const/4 v2, 0x0

    invoke-static {p1, v2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p1, v1

    :goto_0
    if-nez p1, :cond_1

    new-instance p1, Lv8/d;

    const-string v0, "Indexables cannot be null."

    invoke-direct {p1, v0}, Lv8/d;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lsb/m;->e(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ArrayStoreException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :cond_1
    invoke-static {p1}, Lcom/google/firebase/appindexing/internal/zzg;->w3([Lcom/google/firebase/appindexing/internal/Thing;)Lcom/google/firebase/appindexing/internal/zzg;

    move-result-object p1

    iget-object v0, p0, Lva/n0;->b:Lva/m0;

    invoke-virtual {v0, p1}, Lva/m0;->d(Lcom/google/firebase/appindexing/internal/zzg;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :catch_0
    new-instance p1, Lv8/d;

    const-string v0, "Custom Indexable-objects are not allowed. Please use the \'Indexables\'-class for creating the objects."

    invoke-direct {p1, v0}, Lv8/d;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lsb/m;->e(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
