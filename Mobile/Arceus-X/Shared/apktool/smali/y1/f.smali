.class public final Ly1/f;
.super Ly1/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ly1/a<",
        "TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ly1/a;-><init>()V

    return-void
.end method

.method public static B()Ly1/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">()",
            "Ly1/f<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, Ly1/f;

    invoke-direct {v0}, Ly1/f;-><init>()V

    return-object v0
.end method


# virtual methods
.method public x(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)Z"
        }
    .end annotation

    invoke-super {p0, p1}, Ly1/a;->x(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public y(Ljava/lang/Throwable;)Z
    .locals 0

    invoke-super {p0, p1}, Ly1/a;->y(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method
