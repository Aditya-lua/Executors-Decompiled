.class public final Lfb/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lfb/l;

.field public final b:Lsb/k;


# direct methods
.method public constructor <init>(Lfb/l;Lsb/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfb/t;->a:Lfb/l;

    iput-object p2, p0, Lfb/t;->b:Lsb/k;

    return-void
.end method


# virtual methods
.method public final a(Lk9/e;)V
    .locals 2

    iget-object v0, p0, Lfb/t;->a:Lfb/l;

    invoke-interface {v0, p1}, Lfb/l;->a(Lk9/e;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    invoke-static {}, Lfb/t1;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lfb/s;

    invoke-direct {v1, p0}, Lfb/s;-><init>(Lfb/t;)V

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/tasks/Task;->c(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public final b(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lfb/t;->b:Lsb/k;

    invoke-virtual {v0, p1}, Lsb/k;->b(Ljava/lang/Exception;)V

    return-void
.end method

.method public final synthetic c(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lfb/t;->b:Lsb/k;

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lsb/k;->c(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lfb/t;->b:Lsb/k;

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    invoke-static {p1}, Lfb/b1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, p1}, Lsb/k;->b(Ljava/lang/Exception;)V

    return-void
.end method
