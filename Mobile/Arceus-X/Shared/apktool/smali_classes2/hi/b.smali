.class public Lhi/b;
.super Lhi/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lhi/a<",
        "Lei/j;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x2

    const/high16 v1, 0x40000000    # 2.0f

    const/16 v2, 0x3e8

    invoke-direct {p0, v2, v0, v1}, Lhi/a;-><init>(IIF)V

    return-void
.end method


# virtual methods
.method public bridge synthetic c(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lei/j;

    invoke-virtual {p0, p1}, Lhi/b;->d(Lei/j;)Z

    move-result p1

    return p1
.end method

.method public d(Lei/j;)Z
    .locals 2

    invoke-virtual {p1}, Lei/j;->b()I

    move-result v0

    const/16 v1, 0x12c

    if-ge v0, v1, :cond_1

    invoke-virtual {p1}, Lei/j;->b()I

    move-result p1

    const/16 v0, 0xc8

    if-ge p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
