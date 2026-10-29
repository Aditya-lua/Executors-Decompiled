.class public final synthetic Li9/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsb/c;


# instance fields
.field public final synthetic a:Li9/b;

.field public final synthetic b:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Li9/b;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li9/f0;->a:Li9/b;

    iput-object p2, p0, Li9/f0;->b:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Li9/f0;->a:Li9/b;

    iget-object v1, p0, Li9/f0;->b:Landroid/os/Bundle;

    invoke-virtual {v0, v1, p1}, Li9/b;->f(Landroid/os/Bundle;Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
