.class public Lng/b0$b;
.super Ljava/util/AbstractSet;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lng/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractSet<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lng/b0;


# direct methods
.method public constructor <init>(Lng/b0;)V
    .locals 0

    iput-object p1, p0, Lng/b0$b;->a:Lng/b0;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    iget-object v0, p0, Lng/b0$b;->a:Lng/b0;

    invoke-virtual {v0}, Lng/b0;->clear()V

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Ljava/util/Map$Entry;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lng/b0$b;->a:Lng/b0;

    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {v0, p1}, Lng/b0;->c(Ljava/util/Map$Entry;)Lng/b0$e;

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

    new-instance v0, Lng/b0$b$a;

    invoke-direct {v0, p0}, Lng/b0$b$a;-><init>(Lng/b0$b;)V

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lng/b0$b;->a:Lng/b0;

    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {v0, p1}, Lng/b0;->c(Ljava/util/Map$Entry;)Lng/b0$e;

    move-result-object p1

    if-nez p1, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Lng/b0$b;->a:Lng/b0;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lng/b0;->f(Lng/b0$e;Z)V

    return v1
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lng/b0$b;->a:Lng/b0;

    iget v0, v0, Lng/b0;->d:I

    return v0
.end method
