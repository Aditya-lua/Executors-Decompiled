.class public Ldb/b;
.super Ldb/c;
.source "SourceFile"


# instance fields
.field public a:[Ljava/lang/Object;

.field public b:I

.field public c:Z


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ldb/c;-><init>()V

    const/4 p1, 0x4

    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Ldb/b;->a:[Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p0, Ldb/b;->b:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ldb/b;
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Ldb/b;->a:[Ljava/lang/Object;

    array-length v0, v0

    iget v1, p0, Ldb/b;->b:I

    add-int/lit8 v2, v1, 0x1

    if-ltz v2, :cond_5

    if-gt v2, v0, :cond_0

    move v3, v0

    goto :goto_0

    :cond_0
    shr-int/lit8 v3, v0, 0x1

    add-int/2addr v3, v0

    add-int/lit8 v3, v3, 0x1

    if-ge v3, v2, :cond_1

    invoke-static {v1}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v1

    add-int v3, v1, v1

    :cond_1
    if-gez v3, :cond_2

    const v3, 0x7fffffff

    :cond_2
    :goto_0
    if-gt v3, v0, :cond_3

    iget-boolean v0, p0, Ldb/b;->c:Z

    if-eqz v0, :cond_4

    :cond_3
    iget-object v0, p0, Ldb/b;->a:[Ljava/lang/Object;

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ldb/b;->a:[Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Ldb/b;->c:Z

    :cond_4
    iget-object v0, p0, Ldb/b;->a:[Ljava/lang/Object;

    iget v1, p0, Ldb/b;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ldb/b;->b:I

    aput-object p1, v0, v1

    return-object p0

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "cannot store more than Integer.MAX_VALUE elements"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
