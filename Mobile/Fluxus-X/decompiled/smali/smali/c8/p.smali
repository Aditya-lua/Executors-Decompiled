.class public final Lc8/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz7/i;


# instance fields
.field public final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lz7/c;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lc8/o;

.field public final c:Lc8/s;


# direct methods
.method public constructor <init>(Ljava/util/Set;Lc8/o;Lc8/s;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lz7/c;",
            ">;",
            "Lc8/o;",
            "Lc8/s;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc8/p;->a:Ljava/util/Set;

    iput-object p2, p0, Lc8/p;->b:Lc8/o;

    iput-object p3, p0, Lc8/p;->c:Lc8/s;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/Class;Lz7/c;Lz7/g;)Lz7/h;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lz7/c;",
            "Lz7/g<",
            "TT;[B>;)",
            "Lz7/h<",
            "TT;>;"
        }
    .end annotation

    iget-object p2, p0, Lc8/p;->a:Ljava/util/Set;

    invoke-interface {p2, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance v0, Lc8/r;

    iget-object v1, p0, Lc8/p;->b:Lc8/o;

    iget-object v5, p0, Lc8/p;->c:Lc8/s;

    move-object v2, p1

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lc8/r;-><init>(Lc8/o;Ljava/lang/String;Lz7/c;Lz7/g;Lc8/s;)V

    return-object v0

    :cond_0
    move-object v3, p3

    new-instance p1, Ljava/lang/IllegalArgumentException;

    iget-object p2, p0, Lc8/p;->a:Ljava/util/Set;

    filled-new-array {v3, p2}, [Ljava/lang/Object;

    move-result-object p2

    const-string p3, "%s is not supported byt this factory. Supported encodings are: %s."

    invoke-static {p3, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
