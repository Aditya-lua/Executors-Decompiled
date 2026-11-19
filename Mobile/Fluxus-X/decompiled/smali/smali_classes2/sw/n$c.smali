.class public final Lsw/n$c;
.super Lsw/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsw/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResponseT:",
        "Ljava/lang/Object;",
        ">",
        "Lsw/n<",
        "TResponseT;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final d:Lsw/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsw/e<",
            "TResponseT;",
            "Lsw/d<",
            "TResponseT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lsw/w;Lmv/e$a;Lsw/h;Lsw/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw/w;",
            "Lmv/e$a;",
            "Lsw/h<",
            "Lmv/i0;",
            "TResponseT;>;",
            "Lsw/e<",
            "TResponseT;",
            "Lsw/d<",
            "TResponseT;>;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lsw/n;-><init>(Lsw/w;Lmv/e$a;Lsw/h;)V

    iput-object p4, p0, Lsw/n$c;->d:Lsw/e;

    return-void
.end method


# virtual methods
.method public c(Lsw/d;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw/d<",
            "TResponseT;>;[",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lsw/n$c;->d:Lsw/e;

    invoke-interface {v0, p1}, Lsw/e;->b(Lsw/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lsw/d;

    array-length v0, p2

    add-int/lit8 v0, v0, -0x1

    aget-object p2, p2, v0

    check-cast p2, Leu/b;

    :try_start_0
    invoke-static {p1, p2}, Lsw/p;->c(Lsw/d;Leu/b;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-static {p1, p2}, Lsw/p;->e(Ljava/lang/Throwable;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
