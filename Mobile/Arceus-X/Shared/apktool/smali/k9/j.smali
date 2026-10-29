.class public final Lk9/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lk9/n;Lk9/f;)Lk9/i;
    .locals 2
    .param p0    # Lk9/n;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lk9/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R::",
            "Lk9/n;",
            ">(TR;",
            "Lk9/f;",
            ")",
            "Lk9/i<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "Result must not be null"

    invoke-static {p0, v0}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0}, Lk9/n;->m()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->A3()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Status code must not be SUCCESS"

    invoke-static {v0, v1}, Ln9/m;->b(ZLjava/lang/Object;)V

    new-instance v0, Lk9/s;

    invoke-direct {v0, p1, p0}, Lk9/s;-><init>(Lk9/f;Lk9/n;)V

    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->h(Lk9/n;)V

    return-object v0
.end method

.method public static b(Lcom/google/android/gms/common/api/Status;Lk9/f;)Lk9/i;
    .locals 1
    .param p0    # Lcom/google/android/gms/common/api/Status;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lk9/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/Status;",
            "Lk9/f;",
            ")",
            "Lk9/i<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    const-string v0, "Result must not be null"

    invoke-static {p0, v0}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ll9/t;

    invoke-direct {v0, p1}, Ll9/t;-><init>(Lk9/f;)V

    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->h(Lk9/n;)V

    return-object v0
.end method
