.class public final Lcom/google/android/gms/auth/blockstore/StoreBytesData$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/auth/blockstore/StoreBytesData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:[B

.field public b:Z

.field public c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY"

    iput-object v0, p0, Lcom/google/android/gms/auth/blockstore/StoreBytesData$a;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/auth/blockstore/StoreBytesData;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lcom/google/android/gms/auth/blockstore/StoreBytesData;

    iget-object v1, p0, Lcom/google/android/gms/auth/blockstore/StoreBytesData$a;->a:[B

    iget-boolean v2, p0, Lcom/google/android/gms/auth/blockstore/StoreBytesData$a;->b:Z

    iget-object v3, p0, Lcom/google/android/gms/auth/blockstore/StoreBytesData$a;->c:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/auth/blockstore/StoreBytesData;-><init>([BZLjava/lang/String;)V

    return-object v0
.end method

.method public b([B)Lcom/google/android/gms/auth/blockstore/StoreBytesData$a;
    .locals 0
    .param p1    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/auth/blockstore/StoreBytesData$a;->a:[B

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/google/android/gms/auth/blockstore/StoreBytesData$a;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "key cannot be null or empty"

    invoke-static {p1, v0}, Ln9/m;->g(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/auth/blockstore/StoreBytesData$a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public d(Z)Lcom/google/android/gms/auth/blockstore/StoreBytesData$a;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-boolean p1, p0, Lcom/google/android/gms/auth/blockstore/StoreBytesData$a;->b:Z

    return-object p0
.end method
