.class public Ls/b$a;
.super Ls/b$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ls/b$e<",
        "TK;TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ls/b$c;Ls/b$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls/b$c<",
            "TK;TV;>;",
            "Ls/b$c<",
            "TK;TV;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ls/b$e;-><init>(Ls/b$c;Ls/b$c;)V

    return-void
.end method


# virtual methods
.method public b(Ls/b$c;)Ls/b$c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls/b$c<",
            "TK;TV;>;)",
            "Ls/b$c<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object p1, p1, Ls/b$c;->d:Ls/b$c;

    return-object p1
.end method

.method public d(Ls/b$c;)Ls/b$c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls/b$c<",
            "TK;TV;>;)",
            "Ls/b$c<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object p1, p1, Ls/b$c;->c:Ls/b$c;

    return-object p1
.end method
