.class public Lng/b0$b$a;
.super Lng/b0$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lng/b0$b;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lng/b0<",
        "TK;TV;>.d<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public final synthetic e:Lng/b0$b;


# direct methods
.method public constructor <init>(Lng/b0$b;)V
    .locals 0

    iput-object p1, p0, Lng/b0$b$a;->e:Lng/b0$b;

    iget-object p1, p1, Lng/b0$b;->a:Lng/b0;

    invoke-direct {p0, p1}, Lng/b0$d;-><init>(Lng/b0;)V

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

    invoke-virtual {p0}, Lng/b0$d;->b()Lng/b0$e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lng/b0$b$a;->d()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method
