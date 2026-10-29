.class public Lwe/e$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwe/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public final a:[J

.field public final b:[J

.field public final c:[J


# direct methods
.method public constructor <init>()V
    .locals 3

    const/16 v0, 0xa

    .line 1
    new-array v1, v0, [J

    new-array v2, v0, [J

    new-array v0, v0, [J

    invoke-direct {p0, v1, v2, v0}, Lwe/e$d;-><init>([J[J[J)V

    return-void
.end method

.method public constructor <init>(Lwe/e$c;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Lwe/e$d;-><init>()V

    .line 11
    invoke-static {p0, p1}, Lwe/e$d;->a(Lwe/e$d;Lwe/e$c;)Lwe/e$d;

    return-void
.end method

.method public constructor <init>(Lwe/e$d;)V
    .locals 2

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iget-object v0, p1, Lwe/e$d;->a:[J

    const/16 v1, 0xa

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v0

    iput-object v0, p0, Lwe/e$d;->a:[J

    .line 8
    iget-object v0, p1, Lwe/e$d;->b:[J

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v0

    iput-object v0, p0, Lwe/e$d;->b:[J

    .line 9
    iget-object p1, p1, Lwe/e$d;->c:[J

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object p1

    iput-object p1, p0, Lwe/e$d;->c:[J

    return-void
.end method

.method public constructor <init>([J[J[J)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lwe/e$d;->a:[J

    .line 4
    iput-object p2, p0, Lwe/e$d;->b:[J

    .line 5
    iput-object p3, p0, Lwe/e$d;->c:[J

    return-void
.end method

.method public static a(Lwe/e$d;Lwe/e$c;)Lwe/e$d;
    .locals 3

    iget-object v0, p0, Lwe/e$d;->a:[J

    iget-object v1, p1, Lwe/e$c;->a:Lwe/e$d;

    iget-object v1, v1, Lwe/e$d;->a:[J

    iget-object v2, p1, Lwe/e$c;->b:[J

    invoke-static {v0, v1, v2}, Lwe/i;->f([J[J[J)V

    iget-object v0, p0, Lwe/e$d;->b:[J

    iget-object v1, p1, Lwe/e$c;->a:Lwe/e$d;

    iget-object v2, v1, Lwe/e$d;->b:[J

    iget-object v1, v1, Lwe/e$d;->c:[J

    invoke-static {v0, v2, v1}, Lwe/i;->f([J[J[J)V

    iget-object v0, p0, Lwe/e$d;->c:[J

    iget-object v1, p1, Lwe/e$c;->a:Lwe/e$d;

    iget-object v1, v1, Lwe/e$d;->c:[J

    iget-object p1, p1, Lwe/e$c;->b:[J

    invoke-static {v0, v1, p1}, Lwe/i;->f([J[J[J)V

    return-object p0
.end method


# virtual methods
.method public b()Z
    .locals 6

    const/16 v0, 0xa

    new-array v1, v0, [J

    iget-object v2, p0, Lwe/e$d;->a:[J

    invoke-static {v1, v2}, Lwe/i;->k([J[J)V

    new-array v2, v0, [J

    iget-object v3, p0, Lwe/e$d;->b:[J

    invoke-static {v2, v3}, Lwe/i;->k([J[J)V

    new-array v3, v0, [J

    iget-object v4, p0, Lwe/e$d;->c:[J

    invoke-static {v3, v4}, Lwe/i;->k([J[J)V

    new-array v4, v0, [J

    invoke-static {v4, v3}, Lwe/i;->k([J[J)V

    new-array v5, v0, [J

    invoke-static {v5, v2, v1}, Lwe/i;->m([J[J[J)V

    invoke-static {v5, v5, v3}, Lwe/i;->f([J[J[J)V

    new-array v0, v0, [J

    invoke-static {v0, v1, v2}, Lwe/i;->f([J[J[J)V

    sget-object v1, Lwe/f;->a:[J

    invoke-static {v0, v0, v1}, Lwe/i;->f([J[J[J)V

    invoke-static {v0, v4}, Lwe/i;->n([J[J)V

    invoke-static {v0, v0}, Lwe/i;->h([J[J)V

    invoke-static {v5}, Lwe/i;->a([J)[B

    move-result-object v1

    invoke-static {v0}, Lwe/i;->a([J)[B

    move-result-object v0

    invoke-static {v1, v0}, Ldf/e;->b([B[B)Z

    move-result v0

    return v0
.end method

.method public c()[B
    .locals 4

    const/16 v0, 0xa

    new-array v1, v0, [J

    new-array v2, v0, [J

    new-array v0, v0, [J

    iget-object v3, p0, Lwe/e$d;->c:[J

    invoke-static {v1, v3}, Lwe/i;->e([J[J)V

    iget-object v3, p0, Lwe/e$d;->a:[J

    invoke-static {v2, v3, v1}, Lwe/i;->f([J[J[J)V

    iget-object v3, p0, Lwe/e$d;->b:[J

    invoke-static {v0, v3, v1}, Lwe/i;->f([J[J[J)V

    invoke-static {v0}, Lwe/i;->a([J)[B

    move-result-object v0

    const/16 v1, 0x1f

    aget-byte v3, v0, v1

    invoke-static {v2}, Lwe/e;->a([J)I

    move-result v2

    shl-int/lit8 v2, v2, 0x7

    xor-int/2addr v2, v3

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    return-object v0
.end method
