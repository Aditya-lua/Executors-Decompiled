.class public final Lhn/u$d;
.super Ljava/util/AbstractSet;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhn/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractSet<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lhn/u;


# direct methods
.method public constructor <init>(Lhn/u;)V
    .locals 0

    iput-object p1, p0, Lhn/u$d;->a:Lhn/u;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    iget-object v0, p0, Lhn/u$d;->a:Lhn/u;

    invoke-virtual {v0}, Lhn/u;->clear()V

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Ljava/util/Map$Entry;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhn/u$d;->a:Lhn/u;

    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {v0, p1}, Lhn/u;->e(Ljava/util/Map$Entry;)Lhn/u$g;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, Lhn/u$d$a;

    invoke-direct {v0, p0}, Lhn/u$d$a;-><init>(Lhn/u$d;)V

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lhn/u$d;->a:Lhn/u;

    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {v0, p1}, Lhn/u;->e(Ljava/util/Map$Entry;)Lhn/u$g;

    move-result-object p1

    if-nez p1, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Lhn/u$d;->a:Lhn/u;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lhn/u;->h(Lhn/u$g;Z)V

    return v1
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lhn/u$d;->a:Lhn/u;

    iget v0, v0, Lhn/u;->d:I

    return v0
.end method
