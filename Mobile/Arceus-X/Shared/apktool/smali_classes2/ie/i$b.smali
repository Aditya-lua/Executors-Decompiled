.class public Lie/i$b;
.super Lie/i$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lie/i;->A()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lie/i<",
        "TK;TV;>.e<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public final synthetic e:Lie/i;


# direct methods
.method public constructor <init>(Lie/i;)V
    .locals 1

    iput-object p1, p0, Lie/i$b;->e:Lie/i;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lie/i$e;-><init>(Lie/i;Lie/i$a;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic d(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lie/i$b;->f(I)Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method public f(I)Ljava/util/Map$Entry;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance v0, Lie/i$g;

    iget-object v1, p0, Lie/i$b;->e:Lie/i;

    invoke-direct {v0, v1, p1}, Lie/i$g;-><init>(Lie/i;I)V

    return-object v0
.end method
