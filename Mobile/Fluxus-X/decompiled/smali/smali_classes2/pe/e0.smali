.class public final Lpe/e0;
.super Lpe/b$j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lpe/b$j<",
        "TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lpe/b$j;-><init>()V

    return-void
.end method

.method public static H()Lpe/e0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">()",
            "Lpe/e0<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, Lpe/e0;

    invoke-direct {v0}, Lpe/e0;-><init>()V

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

    invoke-super {p0, p1}, Lpe/b;->D(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public E(Ljava/lang/Throwable;)Z
    .locals 0

    invoke-super {p0, p1}, Lpe/b;->E(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method
