.class public Ln9/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcom/google/android/gms/common/api/Status;)Lk9/b;
    .locals 1
    .param p0    # Lcom/google/android/gms/common/api/Status;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/Status;->z3()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lk9/l;

    invoke-direct {v0, p0}, Lk9/l;-><init>(Lcom/google/android/gms/common/api/Status;)V

    return-object v0

    :cond_0
    new-instance v0, Lk9/b;

    invoke-direct {v0, p0}, Lk9/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method
