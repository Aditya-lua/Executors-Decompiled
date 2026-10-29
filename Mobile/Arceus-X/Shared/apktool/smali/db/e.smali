.class public final Ldb/e;
.super Ldb/b;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Ldb/b;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Ldb/e;
    .locals 0

    invoke-super {p0, p1}, Ldb/b;->a(Ljava/lang/Object;)Ldb/b;

    return-object p0
.end method

.method public final c()Ldb/i;
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Ldb/b;->c:Z

    iget-object v0, p0, Ldb/b;->a:[Ljava/lang/Object;

    iget v1, p0, Ldb/b;->b:I

    invoke-static {v0, v1}, Ldb/i;->l([Ljava/lang/Object;I)Ldb/i;

    move-result-object v0

    return-object v0
.end method
