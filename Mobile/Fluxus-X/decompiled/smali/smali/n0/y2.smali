.class public Ln0/y2;
.super Ln0/s3;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ln0/s3<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ln0/s3;-><init>(Ljava/lang/Object;Z)V

    return-void
.end method

.method public static l(Ljava/lang/Object;)Ln0/y2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Ln0/y2<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Ln0/y2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ln0/y2;-><init>(Ljava/lang/Object;Z)V

    return-object v0
.end method


# virtual methods
.method public j(Ljava/lang/Throwable;)V
    .locals 0

    invoke-virtual {p0, p1}, Ln0/s3;->h(Ljava/lang/Throwable;)V

    return-void
.end method

.method public k(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Ln0/s3;->g(Ljava/lang/Object;)V

    return-void
.end method
