.class public Lum/u$d$a;
.super Lum/u$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lum/u$d;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lum/u<",
        "TK;TV;>.f<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public final synthetic e:Lum/u$d;


# direct methods
.method public constructor <init>(Lum/u$d;)V
    .locals 0

    iput-object p1, p0, Lum/u$d$a;->e:Lum/u$d;

    iget-object p1, p1, Lum/u$d;->a:Lum/u;

    invoke-direct {p0, p1}, Lum/u$f;-><init>(Lum/u;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/util/Map$Entry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lum/u$f;->b()Lum/u$g;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lum/u$d$a;->d()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method
