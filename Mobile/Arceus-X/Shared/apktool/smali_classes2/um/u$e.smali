.class public final Lum/u$e;
.super Ljava/util/AbstractSet;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lum/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractSet<",
        "TK;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lum/u;


# direct methods
.method public constructor <init>(Lum/u;)V
    .locals 0

    iput-object p1, p0, Lum/u$e;->a:Lum/u;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    iget-object v0, p0, Lum/u$e;->a:Lum/u;

    invoke-virtual {v0}, Lum/u;->clear()V

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lum/u$e;->a:Lum/u;

    invoke-virtual {v0, p1}, Lum/u;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TK;>;"
        }
    .end annotation

    new-instance v0, Lum/u$e$a;

    invoke-direct {v0, p0}, Lum/u$e$a;-><init>(Lum/u$e;)V

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lum/u$e;->a:Lum/u;

    invoke-virtual {v0, p1}, Lum/u;->j(Ljava/lang/Object;)Lum/u$g;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lum/u$e;->a:Lum/u;

    iget v0, v0, Lum/u;->d:I

    return v0
.end method
