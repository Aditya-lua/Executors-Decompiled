.class public final Lcom/google/android/gms/internal/play_billing/r0;
.super Lcom/google/android/gms/internal/play_billing/h0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/play_billing/h0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/r0;
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/h0;->a:[Ljava/lang/Object;

    array-length v0, v0

    iget v1, p0, Lcom/google/android/gms/internal/play_billing/h0;->b:I

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/i0;->a(II)I

    move-result v1

    if-gt v1, v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/play_billing/h0;->c:Z

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/h0;->a:[Ljava/lang/Object;

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/h0;->a:[Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/play_billing/h0;->c:Z

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/h0;->a:[Ljava/lang/Object;

    iget v1, p0, Lcom/google/android/gms/internal/play_billing/h0;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/google/android/gms/internal/play_billing/h0;->b:I

    aput-object p1, v0, v1

    return-object p0
.end method

.method public final c()Lcom/google/android/gms/internal/play_billing/s0;
    .locals 3

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/h0;->b:I

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/play_billing/h0;->a:[Ljava/lang/Object;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/s0;->i(I[Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/s0;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    iput v2, p0, Lcom/google/android/gms/internal/play_billing/h0;->b:I

    iput-boolean v1, p0, Lcom/google/android/gms/internal/play_billing/h0;->c:Z

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/h0;->a:[Ljava/lang/Object;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/google/android/gms/internal/play_billing/e1;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/play_billing/e1;-><init>(Ljava/lang/Object;)V

    return-object v1

    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/play_billing/c1;->i:Lcom/google/android/gms/internal/play_billing/c1;

    return-object v0
.end method
