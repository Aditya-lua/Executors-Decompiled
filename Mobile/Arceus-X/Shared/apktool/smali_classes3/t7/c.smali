.class public Lt7/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lt7/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt7/b<",
            "TT;>;"
        }
    .end annotation
.end field

.field public b:Li7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/a<",
            "**>;"
        }
    .end annotation
.end field

.field public c:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lt7/b;

    invoke-direct {v0}, Lt7/b;-><init>()V

    iput-object v0, p0, Lt7/c;->a:Lt7/b;

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lt7/c;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance v0, Lt7/b;

    invoke-direct {v0}, Lt7/b;-><init>()V

    iput-object v0, p0, Lt7/c;->a:Lt7/b;

    .line 6
    iput-object p1, p0, Lt7/c;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lt7/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt7/b<",
            "TT;>;)TT;"
        }
    .end annotation

    iget-object p1, p0, Lt7/c;->c:Ljava/lang/Object;

    return-object p1
.end method

.method public final b(FFLjava/lang/Object;Ljava/lang/Object;FFF)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FFTT;TT;FFF)TT;"
        }
    .end annotation

    iget-object v0, p0, Lt7/c;->a:Lt7/b;

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    move v6, p6

    move v7, p7

    invoke-virtual/range {v0 .. v7}, Lt7/b;->h(FFLjava/lang/Object;Ljava/lang/Object;FFF)Lt7/b;

    move-result-object p1

    invoke-virtual {p0, p1}, Lt7/c;->a(Lt7/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final c(Li7/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li7/a<",
            "**>;)V"
        }
    .end annotation

    iput-object p1, p0, Lt7/c;->b:Li7/a;

    return-void
.end method
