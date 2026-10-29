.class public final Lee/r;
.super Lee/s;
.source "SourceFile"


# instance fields
.field public final transient c:I

.field public final transient d:I

.field public final synthetic e:Lee/s;


# direct methods
.method public constructor <init>(Lee/s;II)V
    .locals 0

    iput-object p1, p0, Lee/r;->e:Lee/s;

    invoke-direct {p0}, Lee/s;-><init>()V

    iput p2, p0, Lee/r;->c:I

    iput p3, p0, Lee/r;->d:I

    return-void
.end method


# virtual methods
.method public final b()I
    .locals 2

    iget-object v0, p0, Lee/r;->e:Lee/s;

    invoke-virtual {v0}, Lee/p;->c()I

    move-result v0

    iget v1, p0, Lee/r;->c:I

    add-int/2addr v0, v1

    iget v1, p0, Lee/r;->d:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final c()I
    .locals 2

    iget-object v0, p0, Lee/r;->e:Lee/s;

    invoke-virtual {v0}, Lee/p;->c()I

    move-result v0

    iget v1, p0, Lee/r;->c:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final d()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lee/r;->e:Lee/s;

    invoke-virtual {v0}, Lee/p;->d()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final e(II)Lee/s;
    .locals 2

    iget v0, p0, Lee/r;->d:I

    invoke-static {p1, p2, v0}, Lee/m;->c(III)V

    iget v0, p0, Lee/r;->c:I

    iget-object v1, p0, Lee/r;->e:Lee/s;

    add-int/2addr p1, v0

    add-int/2addr p2, v0

    invoke-virtual {v1, p1, p2}, Lee/s;->e(II)Lee/s;

    move-result-object p1

    return-object p1
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lee/r;->d:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, Lee/m;->a(IILjava/lang/String;)I

    iget-object v0, p0, Lee/r;->e:Lee/s;

    iget v1, p0, Lee/r;->c:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lee/r;->d:I

    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lee/s;->e(II)Lee/s;

    move-result-object p1

    return-object p1
.end method
