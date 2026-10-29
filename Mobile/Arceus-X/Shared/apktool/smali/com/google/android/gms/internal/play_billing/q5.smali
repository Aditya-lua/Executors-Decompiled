.class public final Lcom/google/android/gms/internal/play_billing/q5;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static b(Lcom/google/android/gms/internal/play_billing/p5;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public static d(Lcom/google/android/gms/internal/play_billing/a4;Lcom/google/android/gms/internal/play_billing/p5;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method


# virtual methods
.method public final a(ILjava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    shl-int/lit8 p1, p1, 0x3

    invoke-static {p1}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result p1

    const/4 v0, 0x0

    invoke-static {v0, p2, p3}, Lcom/google/android/gms/internal/play_billing/q5;->b(Lcom/google/android/gms/internal/play_billing/p5;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p2

    invoke-static {p2}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result p3

    add-int/2addr p3, p2

    add-int/2addr p1, p3

    return p1
.end method

.method public final c()Lcom/google/android/gms/internal/play_billing/p5;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
