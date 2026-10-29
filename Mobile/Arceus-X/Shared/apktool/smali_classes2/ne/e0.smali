.class public final Lne/e0;
.super Lne/b$j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lne/b$j<",
        "TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lne/b$j;-><init>()V

    return-void
.end method

.method public static H()Lne/e0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">()",
            "Lne/e0<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, Lne/e0;

    invoke-direct {v0}, Lne/e0;-><init>()V

    return-object v0
.end method


# virtual methods
.method public D(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)Z"
        }
    .end annotation

    invoke-super {p0, p1}, Lne/b;->D(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public E(Ljava/lang/Throwable;)Z
    .locals 0

    invoke-super {p0, p1}, Lne/b;->E(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method
