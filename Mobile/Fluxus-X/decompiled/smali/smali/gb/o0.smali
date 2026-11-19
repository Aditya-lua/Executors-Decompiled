.class public final Lgb/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lea/a;


# instance fields
.field public final a:Lgb/i;


# direct methods
.method public constructor <init>(Lgb/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgb/o0;->a:Lgb/i;

    return-void
.end method


# virtual methods
.method public final a(Z)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/google/android/gms/tasks/Task<",
            "Lea/b<",
            "Lfa/b;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lgb/j0;

    invoke-direct {v0, p1}, Lgb/j0;-><init>(Z)V

    iget-object p1, p0, Lgb/o0;->a:Lgb/i;

    invoke-virtual {p1, v0}, Lgb/i;->b(Lgb/h;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lgb/k0;

    invoke-direct {v0, p1}, Lgb/k0;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lgb/o0;->a:Lgb/i;

    invoke-virtual {p1, v0}, Lgb/i;->b(Lgb/h;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
