.class public final Lft/g$b;
.super Lft/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lft/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lft/a$a<",
        "TK;TV;TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lft/a$a;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(ILft/g$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lft/g$b;-><init>(I)V

    return-void
.end method


# virtual methods
.method public b()Lft/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lft/g<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance v0, Lft/g;

    iget-object v1, p0, Lft/a$a;->a:Ljava/util/LinkedHashMap;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lft/g;-><init>(Ljava/util/Map;Lft/g$a;)V

    return-object v0
.end method

.method public c(Ljava/lang/Object;Lft/i;)Lft/g$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Lft/i<",
            "TV;>;)",
            "Lft/g$b<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Lft/a$a;->a(Ljava/lang/Object;Lft/i;)Lft/a$a;

    return-object p0
.end method
