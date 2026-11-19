.class public final synthetic Lj9/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Lj9/a;

.field public final synthetic c:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lj9/a;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj9/o;->a:Landroid/content/Context;

    iput-object p2, p0, Lj9/o;->b:Lj9/a;

    iput-object p3, p0, Lj9/o;->c:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lj9/o;->b:Lj9/a;

    invoke-virtual {v0}, Lj9/a;->B3()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, Ltb/m;->f(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v0}, Lj9/a;->B3()Ljava/lang/String;

    move-result-object v2

    const-string v3, "google.message_id"

    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lj9/a;->C3()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v2, "google.product_id"

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_1
    iget-object v0, p0, Lj9/o;->a:Landroid/content/Context;

    const-string v2, "supports_message_handled"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-static {v0}, Lj9/d0;->b(Landroid/content/Context;)Lj9/d0;

    move-result-object v0

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Lj9/d0;->c(ILandroid/os/Bundle;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    :goto_0
    iget-object v1, p0, Lj9/o;->c:Ljava/util/concurrent/CountDownLatch;

    sget-object v2, Lj9/m;->a:Lj9/m;

    new-instance v3, Lj9/n;

    invoke-direct {v3, v1}, Lj9/n;-><init>(Ljava/util/concurrent/CountDownLatch;)V

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/tasks/Task;->c(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method
