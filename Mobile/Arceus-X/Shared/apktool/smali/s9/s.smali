.class public final Ls9/s;
.super Ls9/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic b:Lsb/k;

.field public final synthetic c:Lr9/a;

.field public final synthetic d:Ls9/u;


# direct methods
.method public constructor <init>(Ls9/u;Ljava/util/concurrent/atomic/AtomicReference;Lsb/k;Lr9/a;)V
    .locals 0

    iput-object p1, p0, Ls9/s;->d:Ls9/u;

    iput-object p2, p0, Ls9/s;->a:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, Ls9/s;->b:Lsb/k;

    iput-object p4, p0, Ls9/s;->c:Lr9/a;

    invoke-direct {p0}, Ls9/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final s1(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/common/moduleinstall/ModuleInstallResponse;)V
    .locals 2

    if-eqz p2, :cond_0

    iget-object v0, p0, Ls9/s;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    :cond_0
    const/4 v0, 0x0

    iget-object v1, p0, Ls9/s;->b:Lsb/k;

    invoke-static {p1, v0, v1}, Ll9/v;->c(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lsb/k;)Z

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->A3()Z

    move-result p1

    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lcom/google/android/gms/common/moduleinstall/ModuleInstallResponse;->w3()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_0
    iget-object p1, p0, Ls9/s;->d:Ls9/u;

    iget-object p2, p0, Ls9/s;->c:Lr9/a;

    const-class v0, Lr9/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Ll9/l;->c(Ljava/lang/Object;Ljava/lang/String;)Ll9/k$a;

    move-result-object p2

    const/16 v0, 0x6aaa

    invoke-virtual {p1, p2, v0}, Lk9/e;->B(Ll9/k$a;I)Lcom/google/android/gms/tasks/Task;

    return-void
.end method
