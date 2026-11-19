.class public final Lsw/n$a;
.super Lsw/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsw/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResponseT:",
        "Ljava/lang/Object;",
        "ReturnT:",
        "Ljava/lang/Object;",
        ">",
        "Lsw/n<",
        "TResponseT;TReturnT;>;"
    }
.end annotation


# instance fields
.field public final d:Lsw/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsw/e<",
            "TResponseT;TReturnT;>;"
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
            "TResponseT;TReturnT;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lsw/n;-><init>(Lsw/w;Lmv/e$a;Lsw/h;)V

    iput-object p4, p0, Lsw/n$a;->d:Lsw/e;

    return-void
.end method


# virtual methods
.method public c(Lsw/d;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw/d<",
            "TResponseT;>;[",
            "Ljava/lang/Object;",
            ")TReturnT;"
        }
    .end annotation

    iget-object p2, p0, Lsw/n$a;->d:Lsw/e;

    invoke-interface {p2, p1}, Lsw/e;->b(Lsw/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
