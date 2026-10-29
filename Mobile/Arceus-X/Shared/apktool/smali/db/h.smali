.class public final Ldb/h;
.super Ldb/i;
.source "SourceFile"


# instance fields
.field public final transient c:I

.field public final transient d:I

.field public final synthetic e:Ldb/i;


# direct methods
.method public constructor <init>(Ldb/i;II)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ldb/h;->e:Ldb/i;

    invoke-direct {p0}, Ldb/i;-><init>()V

    iput p2, p0, Ldb/h;->c:I

    iput p3, p0, Ldb/h;->d:I

    return-void
.end method


# virtual methods
.method public final a()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ldb/h;->e:Ldb/i;

    invoke-virtual {v0}, Ldb/d;->a()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final b()I
    .locals 2

    iget-object v0, p0, Ldb/h;->e:Ldb/i;

    invoke-virtual {v0}, Ldb/d;->b()I

    move-result v0

    iget v1, p0, Ldb/h;->c:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final c()I
    .locals 2

    iget-object v0, p0, Ldb/h;->e:Ldb/i;

    invoke-virtual {v0}, Ldb/d;->b()I

    move-result v0

    iget v1, p0, Ldb/h;->c:I

    add-int/2addr v0, v1

    iget v1, p0, Ldb/h;->d:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final f(II)Ldb/i;
    .locals 2

    iget v0, p0, Ldb/h;->d:I

    invoke-static {p1, p2, v0}, Ldb/s;->d(III)V

    iget v0, p0, Ldb/h;->c:I

    iget-object v1, p0, Ldb/h;->e:Ldb/i;

    add-int/2addr p1, v0

    add-int/2addr p2, v0

    invoke-virtual {v1, p1, p2}, Ldb/i;->f(II)Ldb/i;

    move-result-object p1

    return-object p1
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ldb/h;->d:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, Ldb/s;->b(IILjava/lang/String;)I

    iget-object v0, p0, Ldb/h;->e:Ldb/i;

    iget v1, p0, Ldb/h;->c:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Ldb/h;->d:I

    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ldb/i;->f(II)Ldb/i;

    move-result-object p1

    return-object p1
.end method
