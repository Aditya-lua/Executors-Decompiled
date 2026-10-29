.class public final Lwa/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx8/b;


# instance fields
.field public final a:Lx8/b;

.field public final b:Lx8/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-static {}, Lj9/d;->f()Lj9/d;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lwa/p;

    invoke-direct {v1, p1, v0}, Lwa/p;-><init>(Landroid/content/Context;Lj9/d;)V

    iput-object v1, p0, Lwa/r;->a:Lx8/b;

    invoke-static {p1}, Lwa/l;->c(Landroid/content/Context;)Lx8/b;

    move-result-object p1

    iput-object p1, p0, Lwa/r;->b:Lx8/b;

    return-void
.end method

.method public static synthetic a(Lwa/r;Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object v0

    instance-of v1, v0, Lk9/b;

    if-eqz v1, :cond_5

    check-cast v0, Lk9/b;

    invoke-virtual {v0}, Lk9/b;->b()I

    move-result v0

    const v1, 0xa7f9

    if-eq v0, v1, :cond_4

    const v1, 0xa7fa

    if-eq v0, v1, :cond_4

    const v1, 0xa7fb

    if-eq v0, v1, :cond_4

    const/16 v1, 0x11

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const p0, 0xa7f8

    if-ne v0, p0, :cond_2

    new-instance p0, Ljava/lang/Exception;

    const-string p1, "Failed to get app set ID due to an internal error. Please try again later."

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lsb/m;->e(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0

    :cond_2
    const/16 p0, 0xf

    if-eq v0, p0, :cond_3

    goto :goto_1

    :cond_3
    new-instance p0, Ljava/lang/Exception;

    const-string p1, "The operation to get app set ID timed out. Please try again later."

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lsb/m;->e(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0

    :cond_4
    :goto_0
    iget-object p0, p0, Lwa/r;->b:Lx8/b;

    invoke-interface {p0}, Lx8/b;->j()Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0

    :cond_5
    :goto_1
    return-object p1
.end method


# virtual methods
.method public final j()Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Lx8/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lwa/r;->a:Lx8/b;

    invoke-interface {v0}, Lx8/b;->j()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v1, Lwa/q;

    invoke-direct {v1, p0}, Lwa/q;-><init>(Lwa/r;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->j(Lsb/c;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
