.class public final Leb/o3;
.super Leb/r3;
.source "SourceFile"


# instance fields
.field public final b:[B

.field public c:I

.field public d:I

.field public e:I


# direct methods
.method public synthetic constructor <init>([BIIZLeb/n3;)V
    .locals 0

    const/4 p2, 0x0

    invoke-direct {p0, p2}, Leb/r3;-><init>(Leb/q3;)V

    const p2, 0x7fffffff

    iput p2, p0, Leb/o3;->e:I

    iput-object p1, p0, Leb/o3;->b:[B

    const/4 p1, 0x0

    iput p1, p0, Leb/o3;->c:I

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 3

    iget p1, p0, Leb/o3;->e:I

    const/4 v0, 0x0

    iput v0, p0, Leb/o3;->e:I

    iget v1, p0, Leb/o3;->c:I

    iget v2, p0, Leb/o3;->d:I

    add-int/2addr v1, v2

    iput v1, p0, Leb/o3;->c:I

    if-lez v1, :cond_0

    iput v1, p0, Leb/o3;->d:I

    iput v0, p0, Leb/o3;->c:I

    return p1

    :cond_0
    iput v0, p0, Leb/o3;->d:I

    return p1
.end method
