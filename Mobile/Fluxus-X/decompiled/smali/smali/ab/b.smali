.class public final Lab/b;
.super Lb9/b;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lb9/b;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final P()Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lm9/u;->c()Lm9/u$a;

    move-result-object v0

    new-instance v1, Lab/j;

    invoke-direct {v1, p0}, Lab/j;-><init>(Lab/b;)V

    invoke-virtual {v0, v1}, Lm9/u$a;->b(Lm9/q;)Lm9/u$a;

    move-result-object v0

    sget-object v1, Lab/c;->c:Lk9/d;

    filled-new-array {v1}, [Lk9/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm9/u$a;->d([Lk9/d;)Lm9/u$a;

    move-result-object v0

    const/16 v1, 0x61f

    invoke-virtual {v0, v1}, Lm9/u$a;->e(I)Lm9/u$a;

    move-result-object v0

    invoke-virtual {v0}, Lm9/u$a;->a()Lm9/u;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll9/g;->D(Lm9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
