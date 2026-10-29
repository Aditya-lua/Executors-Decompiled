.class public final Lft/j$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lft/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lft/i<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lft/i<",
            "Ljava/util/Collection<",
            "TT;>;>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lft/b;->d(I)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lft/j$b;->a:Ljava/util/List;

    .line 4
    invoke-static {p2}, Lft/b;->d(I)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lft/j$b;->b:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(IILft/j$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lft/j$b;-><init>(II)V

    return-void
.end method


# virtual methods
.method public a(Lft/i;)Lft/j$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "+",
            "Ljava/util/Collection<",
            "+TT;>;>;)",
            "Lft/j$b<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lft/j$b;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public b(Lft/i;)Lft/j$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "+TT;>;)",
            "Lft/j$b<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lft/j$b;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public c()Lft/j;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lft/j<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lft/j;

    iget-object v1, p0, Lft/j$b;->a:Ljava/util/List;

    iget-object v2, p0, Lft/j$b;->b:Ljava/util/List;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lft/j;-><init>(Ljava/util/List;Ljava/util/List;Lft/j$a;)V

    return-object v0
.end method
