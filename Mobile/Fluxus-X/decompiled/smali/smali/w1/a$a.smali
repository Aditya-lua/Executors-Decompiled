.class public final Lw1/a$a;
.super Ljava/util/AbstractSet;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractSet<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lw1/a;


# direct methods
.method public constructor <init>(Lw1/a;)V
    .locals 0

    iput-object p1, p0, Lw1/a$a;->a:Lw1/a;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, Lw1/a$d;

    iget-object v1, p0, Lw1/a$a;->a:Lw1/a;

    invoke-direct {v0, v1}, Lw1/a$d;-><init>(Lw1/a;)V

    return-object v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lw1/a$a;->a:Lw1/a;

    invoke-virtual {v0}, Lw1/j;->size()I

    move-result v0

    return v0
.end method
