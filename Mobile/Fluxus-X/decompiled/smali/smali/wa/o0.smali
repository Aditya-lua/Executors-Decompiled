.class public final Lwa/o0;
.super Lw8/b;
.source "SourceFile"


# instance fields
.field public final b:Lwa/n0;
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

    new-instance v0, Lwa/h0;

    invoke-direct {v0, p1}, Lwa/h0;-><init>(Landroid/content/Context;)V

    invoke-direct {p0}, Lw8/b;-><init>()V

    new-instance p1, Lwa/n0;

    invoke-direct {p1, v0}, Lwa/n0;-><init>(Ll9/g;)V

    iput-object p1, p0, Lwa/o0;->b:Lwa/n0;

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

    invoke-static {}, Lnf/g;->A3()Lnf/g;

    move-result-object v0

    iget-object v1, p0, Lwa/o0;->b:Lwa/n0;

    invoke-virtual {v1, v0}, Lwa/n0;->d(Lnf/g;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public final varargs c([Lw8/g;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lw8/g;",
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

    new-instance p1, Lw8/d;

    const-string v0, "Indexables cannot be null."

    invoke-direct {p1, v0}, Lw8/d;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ltb/m;->e(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ArrayStoreException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :cond_1
    invoke-static {p1}, Lnf/g;->B3([Lcom/google/firebase/appindexing/internal/Thing;)Lnf/g;

    move-result-object p1

    iget-object v0, p0, Lwa/o0;->b:Lwa/n0;

    invoke-virtual {v0, p1}, Lwa/n0;->d(Lnf/g;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :catch_0
    new-instance p1, Lw8/d;

    const-string v0, "Custom Indexable-objects are not allowed. Please use the \'Indexables\'-class for creating the objects."

    invoke-direct {p1, v0}, Lw8/d;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ltb/m;->e(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
