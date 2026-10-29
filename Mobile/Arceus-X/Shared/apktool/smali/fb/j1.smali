.class public final Lfb/j1;
.super Lfb/g1;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lfb/g1;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;)Lfb/j1;
    .locals 0

    invoke-super {p0, p1}, Lfb/g1;->b(Ljava/lang/Object;)Lfb/g1;

    return-object p0
.end method

.method public final e()Lfb/n1;
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lfb/g1;->c:Z

    iget-object v0, p0, Lfb/g1;->a:[Ljava/lang/Object;

    iget v1, p0, Lfb/g1;->b:I

    invoke-static {v0, v1}, Lfb/n1;->g([Ljava/lang/Object;I)Lfb/n1;

    move-result-object v0

    return-object v0
.end method
