.class public final Leb/d1;
.super Leb/e1;
.source "SourceFile"


# instance fields
.field public final transient c:I

.field public final transient d:I

.field public final synthetic e:Leb/e1;


# direct methods
.method public constructor <init>(Leb/e1;II)V
    .locals 0

    iput-object p1, p0, Leb/d1;->e:Leb/e1;

    invoke-direct {p0}, Leb/e1;-><init>()V

    iput p2, p0, Leb/d1;->c:I

    iput p3, p0, Leb/d1;->d:I

    return-void
.end method


# virtual methods
.method public final b()I
    .locals 2

    iget-object v0, p0, Leb/d1;->e:Leb/e1;

    invoke-virtual {v0}, Leb/z0;->c()I

    move-result v0

    iget v1, p0, Leb/d1;->c:I

    add-int/2addr v0, v1

    iget v1, p0, Leb/d1;->d:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final c()I
    .locals 2

    iget-object v0, p0, Leb/d1;->e:Leb/e1;

    invoke-virtual {v0}, Leb/z0;->c()I

    move-result v0

    iget v1, p0, Leb/d1;->c:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final e()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Leb/d1;->e:Leb/e1;

    invoke-virtual {v0}, Leb/z0;->e()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final g(II)Leb/e1;
    .locals 2

    iget v0, p0, Leb/d1;->d:I

    invoke-static {p1, p2, v0}, Leb/n0;->e(III)V

    iget v0, p0, Leb/d1;->c:I

    iget-object v1, p0, Leb/d1;->e:Leb/e1;

    add-int/2addr p1, v0

    add-int/2addr p2, v0

    invoke-virtual {v1, p1, p2}, Leb/e1;->g(II)Leb/e1;

    move-result-object p1

    return-object p1
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Leb/d1;->d:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, Leb/n0;->a(IILjava/lang/String;)I

    iget-object v0, p0, Leb/d1;->e:Leb/e1;

    iget v1, p0, Leb/d1;->c:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Leb/d1;->d:I

    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Leb/e1;->g(II)Leb/e1;

    move-result-object p1

    return-object p1
.end method
