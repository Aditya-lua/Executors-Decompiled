.class public final Ldf/i$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldf/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:[B

.field public final b:[B


# direct methods
.method public constructor <init>([B[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldf/i$a;->a:[B

    iput-object p2, p0, Ldf/i$a;->b:[B

    return-void
.end method

.method public static c()Ldf/i$a;
    .locals 1

    const/16 v0, 0x20

    invoke-static {v0}, Ldf/u;->a(I)[B

    move-result-object v0

    invoke-static {v0}, Ldf/i$a;->d([B)Ldf/i$a;

    move-result-object v0

    return-object v0
.end method

.method public static d([B)Ldf/i$a;
    .locals 2

    array-length v0, p0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_0

    invoke-static {p0}, Lwe/e;->j([B)[B

    move-result-object v0

    invoke-static {v0}, Lwe/e;->v([B)[B

    move-result-object v0

    new-instance v1, Ldf/i$a;

    invoke-direct {v1, v0, p0}, Ldf/i$a;-><init>([B[B)V

    return-object v1

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Given secret seed length is not %s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a()[B
    .locals 2

    iget-object v0, p0, Ldf/i$a;->b:[B

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    return-object v0
.end method

.method public b()[B
    .locals 2

    iget-object v0, p0, Ldf/i$a;->a:[B

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    return-object v0
.end method
