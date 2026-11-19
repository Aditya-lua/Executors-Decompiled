.class public final synthetic Lgb/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Ltb/k;


# direct methods
.method public synthetic constructor <init>(Ltb/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgb/e0;->a:Ltb/k;

    return-void
.end method


# virtual methods
.method public final synthetic onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    iget-object v0, p0, Lgb/e0;->a:Ltb/k;

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgb/f2;

    invoke-virtual {p1}, Lgb/f2;->zza()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lgb/h0;->a(Ljava/lang/String;)Lgb/h0;

    move-result-object p1

    invoke-virtual {v0, p1}, Ltb/k;->e(Ljava/lang/Object;)Z

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    instance-of v1, p1, Ll9/b;

    if-nez v1, :cond_1

    invoke-static {p1}, Lgb/c1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ltb/k;->d(Ljava/lang/Exception;)Z

    return-void

    :cond_1
    check-cast p1, Ll9/b;

    invoke-virtual {p1}, Ll9/b;->a()Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-static {p1}, Lgb/h0;->b(Lcom/google/android/gms/common/api/Status;)Lgb/h0;

    move-result-object p1

    invoke-virtual {v0, p1}, Ltb/k;->e(Ljava/lang/Object;)Z

    return-void
.end method
