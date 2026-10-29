.class public final Lfb/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lda/a;


# instance fields
.field public final a:Lfb/h;


# direct methods
.method public constructor <init>(Lfb/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfb/n0;->a:Lfb/h;

    return-void
.end method


# virtual methods
.method public final a(Z)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/google/android/gms/tasks/Task<",
            "Lda/b<",
            "Lea/a;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lfb/i0;

    invoke-direct {v0, p1}, Lfb/i0;-><init>(Z)V

    iget-object p1, p0, Lfb/n0;->a:Lfb/h;

    invoke-virtual {p1, v0}, Lfb/h;->b(Lfb/g;)Lcom/google/android/gms/tasks/Task;

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

    new-instance v0, Lfb/j0;

    invoke-direct {v0, p1}, Lfb/j0;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lfb/n0;->a:Lfb/h;

    invoke-virtual {p1, v0}, Lfb/h;->b(Lfb/g;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
