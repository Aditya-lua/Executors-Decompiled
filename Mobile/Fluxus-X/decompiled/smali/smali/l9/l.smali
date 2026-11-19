.class public final Ll9/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ll9/p;Ll9/h;)Ll9/k;
    .locals 2
    .param p0    # Ll9/p;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ll9/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R::",
            "Ll9/p;",
            ">(TR;",
            "Ll9/h;",
            ")",
            "Ll9/k<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "Result must not be null"

    invoke-static {p0, v0}, Lo9/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0}, Ll9/p;->n()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->F3()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Status code must not be SUCCESS"

    invoke-static {v0, v1}, Lo9/s;->b(ZLjava/lang/Object;)V

    new-instance v0, Ll9/u;

    invoke-direct {v0, p1, p0}, Ll9/u;-><init>(Ll9/h;Ll9/p;)V

    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->h(Ll9/p;)V

    return-object v0
.end method

.method public static b(Lcom/google/android/gms/common/api/Status;Ll9/h;)Ll9/k;
    .locals 1
    .param p0    # Lcom/google/android/gms/common/api/Status;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ll9/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/Status;",
            "Ll9/h;",
            ")",
            "Ll9/k<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    const-string v0, "Result must not be null"

    invoke-static {p0, v0}, Lo9/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lm9/t;

    invoke-direct {v0, p1}, Lm9/t;-><init>(Ll9/h;)V

    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->h(Ll9/p;)V

    return-object v0
.end method
