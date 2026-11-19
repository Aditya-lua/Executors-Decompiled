.class public final Lt9/t;
.super Lt9/b;
.source "SourceFile"


# instance fields
.field public final synthetic a:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic b:Ltb/k;

.field public final synthetic c:Ls9/a;

.field public final synthetic d:Lt9/v;


# direct methods
.method public constructor <init>(Lt9/v;Ljava/util/concurrent/atomic/AtomicReference;Ltb/k;Ls9/a;)V
    .locals 0

    iput-object p1, p0, Lt9/t;->d:Lt9/v;

    iput-object p2, p0, Lt9/t;->a:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, Lt9/t;->b:Ltb/k;

    iput-object p4, p0, Lt9/t;->c:Ls9/a;

    invoke-direct {p0}, Lt9/b;-><init>()V

    return-void
.end method


# virtual methods
.method public final O0(Lcom/google/android/gms/common/api/Status;Ls9/g;)V
    .locals 2

    if-eqz p2, :cond_0

    iget-object v0, p0, Lt9/t;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    :cond_0
    const/4 v0, 0x0

    iget-object v1, p0, Lt9/t;->b:Ltb/k;

    invoke-static {p1, v0, v1}, Lm9/v;->c(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Ltb/k;)Z

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->F3()Z

    move-result p1

    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ls9/g;->B3()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_0
    iget-object p1, p0, Lt9/t;->d:Lt9/v;

    iget-object p2, p0, Lt9/t;->c:Ls9/a;

    const-class v0, Ls9/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lm9/l;->c(Ljava/lang/Object;Ljava/lang/String;)Lm9/k$a;

    move-result-object p2

    const/16 v0, 0x6aaa

    invoke-virtual {p1, p2, v0}, Ll9/g;->B(Lm9/k$a;I)Lcom/google/android/gms/tasks/Task;

    return-void
.end method
