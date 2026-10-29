.class public Lnn/d;
.super Ltn/f;
.source "SourceFile"


# instance fields
.field public final a:[Ltn/d;

.field public b:I

.field public c:I

.field public d:Z

.field public e:I


# direct methods
.method public varargs constructor <init>([Ltn/d;)V
    .locals 1

    invoke-direct {p0}, Ltn/f;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lnn/d;->b:I

    iput v0, p0, Lnn/d;->c:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnn/d;->d:Z

    iput v0, p0, Lnn/d;->e:I

    iput-object p1, p0, Lnn/d;->a:[Ltn/d;

    return-void
.end method


# virtual methods
.method public a(I)Ltn/f;
    .locals 0

    iput p1, p0, Lnn/d;->c:I

    return-object p0
.end method

.method public b(I)Ltn/f;
    .locals 0

    iput p1, p0, Lnn/d;->b:I

    return-object p0
.end method

.method public e(I)Ltn/f;
    .locals 1

    const/4 v0, 0x1

    if-lt p1, v0, :cond_0

    iput p1, p0, Lnn/d;->e:I

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Lines must be >= 1"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f()[Ltn/d;
    .locals 1

    iget-object v0, p0, Lnn/d;->a:[Ltn/d;

    return-object v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lnn/d;->c:I

    return v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lnn/d;->b:I

    return v0
.end method

.method public i()I
    .locals 1

    iget v0, p0, Lnn/d;->e:I

    return v0
.end method

.method public j()Z
    .locals 1

    iget-boolean v0, p0, Lnn/d;->d:Z

    return v0
.end method
