.class public final Lgb/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lgb/m;

.field public final b:Ltb/k;


# direct methods
.method public constructor <init>(Lgb/m;Ltb/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgb/u;->a:Lgb/m;

    iput-object p2, p0, Lgb/u;->b:Ltb/k;

    return-void
.end method


# virtual methods
.method public final a(Ll9/g;)V
    .locals 2

    iget-object v0, p0, Lgb/u;->a:Lgb/m;

    invoke-interface {v0, p1}, Lgb/m;->a(Ll9/g;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    invoke-static {}, Lgb/u1;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lgb/t;

    invoke-direct {v1, p0}, Lgb/t;-><init>(Lgb/u;)V

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/tasks/Task;->c(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public final b(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lgb/u;->b:Ltb/k;

    invoke-virtual {v0, p1}, Ltb/k;->b(Ljava/lang/Exception;)V

    return-void
.end method

.method public final synthetic c(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lgb/u;->b:Ltb/k;

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ltb/k;->c(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lgb/u;->b:Ltb/k;

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    invoke-static {p1}, Lgb/c1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ltb/k;->b(Ljava/lang/Exception;)V

    return-void
.end method
