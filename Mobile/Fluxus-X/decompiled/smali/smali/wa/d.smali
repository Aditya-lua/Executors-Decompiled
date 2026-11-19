.class public final Lwa/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcom/google/android/gms/common/api/Status;Ljava/lang/String;)Lw8/c;
    .locals 3
    .param p0    # Lcom/google/android/gms/common/api/Status;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p0}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/Status;->D3()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0}, Lwa/q;->a(Ljava/lang/String;)Z

    move-result v2

    if-eq v1, v2, :cond_0

    move-object p1, v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/Status;->C3()I

    move-result p0

    const/16 v0, 0x4466

    if-eq p0, v0, :cond_2

    const/16 v0, 0x4467

    if-eq p0, v0, :cond_1

    new-instance p0, Lw8/c;

    invoke-direct {p0, p1}, Lw8/c;-><init>(Ljava/lang/String;)V

    return-object p0

    :cond_1
    new-instance p0, Lw8/e;

    invoke-direct {p0, p1}, Lw8/e;-><init>(Ljava/lang/String;)V

    return-object p0

    :cond_2
    new-instance p0, Lw8/d;

    invoke-direct {p0, p1}, Lw8/d;-><init>(Ljava/lang/String;)V

    return-object p0
.end method
