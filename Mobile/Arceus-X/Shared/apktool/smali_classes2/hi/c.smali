.class public Lhi/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhi/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lhi/d<",
        "Lei/j;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public b()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lei/j;

    invoke-virtual {p0, p1}, Lhi/c;->d(Lei/j;)Z

    move-result p1

    return p1
.end method

.method public d(Lei/j;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public retry()V
    .locals 0

    return-void
.end method
