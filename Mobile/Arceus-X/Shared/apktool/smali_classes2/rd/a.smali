.class public Lrd/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpd/b;


# instance fields
.field public a:Lpd/a;

.field public b:Lpd/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lpd/d;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .param p1    # Lpd/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpd/d;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lpd/e;",
            ">;"
        }
    .end annotation

    iget-object p1, p0, Lrd/a;->a:Lpd/a;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lsb/m;->e(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, Lrd/a;->b:Lpd/e;

    if-eqz p1, :cond_1

    invoke-static {p1}, Lsb/m;->f(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "FakeAgeSignalsManager not configured with a response or exception."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lsb/m;->e(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public b(Lpd/e;)V
    .locals 1
    .param p1    # Lpd/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    iput-object v0, p0, Lrd/a;->a:Lpd/a;

    iput-object p1, p0, Lrd/a;->b:Lpd/e;

    return-void
.end method
