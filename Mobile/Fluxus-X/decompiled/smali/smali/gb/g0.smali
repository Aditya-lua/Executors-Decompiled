.class public final Lgb/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgb/d0;


# instance fields
.field public final a:Landroid/app/Application;

.field public final b:Lha/o;

.field public final c:Lgb/o;


# direct methods
.method public constructor <init>(Landroid/app/Application;Lha/o;Lgb/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgb/g0;->a:Landroid/app/Application;

    iput-object p2, p0, Lgb/g0;->b:Lha/o;

    iput-object p3, p0, Lgb/g0;->c:Lgb/o;

    return-void
.end method


# virtual methods
.method public final a(Lgb/d2;)Lcom/google/android/gms/tasks/Task;
    .locals 5

    invoke-virtual {p1}, Lgb/d2;->zzc()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lgb/g0;->a:Landroid/app/Application;

    invoke-static {v0}, Lx9/a;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    invoke-virtual {p0}, Lgb/g0;->c()Lgb/x1;

    move-result-object v0

    invoke-interface {v0, p1, v1}, Lgb/x1;->q(Lgb/d2;Z)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v2, Ltb/k;

    invoke-direct {v2}, Ltb/k;-><init>()V

    invoke-static {}, Lgb/u1;->a()Ljava/util/concurrent/Executor;

    move-result-object v3

    new-instance v4, Lgb/f0;

    invoke-direct {v4, p0, p1, v1}, Lgb/f0;-><init>(Lgb/g0;Lgb/d2;Z)V

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/tasks/Task;->i(Ljava/util/concurrent/Executor;Ltb/c;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    invoke-static {}, Lgb/u1;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lgb/e0;

    invoke-direct {v1, v2}, Lgb/e0;-><init>(Ltb/k;)V

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/tasks/Task;->c(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v2}, Ltb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic b(Lgb/d2;ZLcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    invoke-virtual {p3}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object v0

    instance-of v1, v0, Ll9/b;

    if-eqz v1, :cond_1

    check-cast v0, Ll9/b;

    invoke-virtual {v0}, Ll9/b;->b()I

    move-result v0

    const/16 v1, 0x14

    if-ne v0, v1, :cond_1

    const-string p3, "GamesAuthenticator"

    const-string v0, "Service connection suspended during the first sign-in attempt. Trying again."

    invoke-static {p3, v0}, Lgb/t0;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lgb/g0;->c()Lgb/x1;

    move-result-object p3

    invoke-interface {p3, p1, p2}, Lgb/x1;->q(Lgb/d2;Z)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    return-object p3
.end method

.method public final c()Lgb/x1;
    .locals 2

    iget-object v0, p0, Lgb/g0;->b:Lha/o;

    invoke-virtual {v0}, Lha/o;->d()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lgb/g0;->c:Lgb/o;

    iget-object v1, v1, Lgb/o;->b:Lgb/q1;

    invoke-static {v0, v1}, Lgb/w1;->a(Landroid/content/Context;Lgb/q1;)Lgb/x1;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lgb/g0;->c:Lgb/o;

    iget-object v1, v0, Lgb/o;->a:Landroid/app/Application;

    iget-object v0, v0, Lgb/o;->b:Lgb/q1;

    invoke-static {v1, v0}, Lgb/w1;->a(Landroid/content/Context;Lgb/q1;)Lgb/x1;

    move-result-object v0

    return-object v0
.end method
