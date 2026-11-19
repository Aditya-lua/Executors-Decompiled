.class public final Leb/e;
.super Leb/b;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Leb/b;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Leb/e;
    .locals 0

    invoke-super {p0, p1}, Leb/b;->a(Ljava/lang/Object;)Leb/b;

    return-object p0
.end method

.method public final c()Leb/i;
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Leb/b;->c:Z

    iget-object v0, p0, Leb/b;->a:[Ljava/lang/Object;

    iget v1, p0, Leb/b;->b:I

    invoke-static {v0, v1}, Leb/i;->l([Ljava/lang/Object;I)Leb/i;

    move-result-object v0

    return-object v0
.end method
