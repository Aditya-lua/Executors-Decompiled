.class public final Lhn/u$e;
.super Ljava/util/AbstractSet;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhn/u;
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
.field public final synthetic a:Lhn/u;


# direct methods
.method public constructor <init>(Lhn/u;)V
    .locals 0

    iput-object p1, p0, Lhn/u$e;->a:Lhn/u;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    iget-object v0, p0, Lhn/u$e;->a:Lhn/u;

    invoke-virtual {v0}, Lhn/u;->clear()V

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lhn/u$e;->a:Lhn/u;

    invoke-virtual {v0, p1}, Lhn/u;->containsKey(Ljava/lang/Object;)Z

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

    new-instance v0, Lhn/u$e$a;

    invoke-direct {v0, p0}, Lhn/u$e$a;-><init>(Lhn/u$e;)V

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lhn/u$e;->a:Lhn/u;

    invoke-virtual {v0, p1}, Lhn/u;->i(Ljava/lang/Object;)Lhn/u$g;

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

    iget-object v0, p0, Lhn/u$e;->a:Lhn/u;

    iget v0, v0, Lhn/u;->d:I

    return v0
.end method
