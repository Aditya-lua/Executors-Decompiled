.class public final Lcom/google/android/gms/internal/play_billing/d5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/google/android/gms/internal/play_billing/x5;

.field public volatile b:Lcom/google/android/gms/internal/play_billing/s3;

.field public volatile c:Lcom/google/android/gms/internal/play_billing/x5;

.field public volatile d:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/play_billing/x5;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/d5;->c:Lcom/google/android/gms/internal/play_billing/x5;

    invoke-interface {p1}, Lcom/google/android/gms/internal/play_billing/y5;->f()Lcom/google/android/gms/internal/play_billing/x5;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/d5;->a:Lcom/google/android/gms/internal/play_billing/x5;

    sget-object p1, Lcom/google/android/gms/internal/play_billing/f4;->b:Lcom/google/android/gms/internal/play_billing/f4;

    sget p1, Lcom/google/android/gms/internal/play_billing/e3;->a:I

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/d5;->b:Lcom/google/android/gms/internal/play_billing/s3;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/play_billing/d5;->d:Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "message cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(I)I
    .locals 2

    const/16 v0, 0x8

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v0

    add-int/2addr v0, v0

    const/16 v1, 0x10

    invoke-static {v1}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v1

    invoke-static {p1}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result p1

    add-int/2addr v1, p1

    add-int/2addr v0, v1

    const/4 p1, 0x3

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/play_billing/d5;->b(I)I

    move-result p1

    add-int/2addr v0, p1

    return v0
.end method

.method public final b(I)I
    .locals 1

    const/16 p1, 0x18

    invoke-static {p1}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result p1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/d5;->c()I

    move-result v0

    add-int/2addr p1, v0

    return p1
.end method

.method public final c()I
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/d5;->d()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/a4;->v(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final d()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/d5;->b:Lcom/google/android/gms/internal/play_billing/s3;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/d5;->b:Lcom/google/android/gms/internal/play_billing/s3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/s3;->d()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/d5;->c:Lcom/google/android/gms/internal/play_billing/x5;

    invoke-interface {v0}, Lcom/google/android/gms/internal/play_billing/x5;->zzn()I

    move-result v0

    return v0
.end method

.method public final e()Lcom/google/android/gms/internal/play_billing/s3;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/d5;->b:Lcom/google/android/gms/internal/play_billing/s3;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/d5;->b:Lcom/google/android/gms/internal/play_billing/s3;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/d5;->b:Lcom/google/android/gms/internal/play_billing/s3;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/d5;->b:Lcom/google/android/gms/internal/play_billing/s3;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/d5;->c:Lcom/google/android/gms/internal/play_billing/x5;

    invoke-interface {v0}, Lcom/google/android/gms/internal/play_billing/x5;->e()Lcom/google/android/gms/internal/play_billing/s3;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/d5;->b:Lcom/google/android/gms/internal/play_billing/s3;

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/d5;->b:Lcom/google/android/gms/internal/play_billing/s3;

    monitor-exit p0

    return-object v0

    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/d5;->f()Lcom/google/android/gms/internal/play_billing/x5;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final f()Lcom/google/android/gms/internal/play_billing/x5;
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/d5;->c:Lcom/google/android/gms/internal/play_billing/x5;
    :try_end_0
    .catch Lcom/google/android/gms/internal/play_billing/f5; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/f4;->b()Z

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/d5;->a:Lcom/google/android/gms/internal/play_billing/x5;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/d5;->f()Lcom/google/android/gms/internal/play_billing/x5;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/d5;->f()Lcom/google/android/gms/internal/play_billing/x5;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
