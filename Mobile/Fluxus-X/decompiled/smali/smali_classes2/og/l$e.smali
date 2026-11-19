.class public final Log/l$e;
.super Log/l$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Log/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Log/l$c<",
        "TT;TT;>;"
    }
.end annotation


# instance fields
.field public final b:Lng/d0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lng/d0<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lng/d0;Log/l$f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lng/d0<",
            "TT;>;",
            "Log/l$f;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p2}, Log/l$c;-><init>(Log/l$f;)V

    iput-object p1, p0, Log/l$e;->b:Lng/d0;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Log/l$e;->b:Lng/d0;

    invoke-interface {v0}, Lng/d0;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)TT;"
        }
    .end annotation

    return-object p1
.end method

.method public c(Ljava/lang/Object;Ltg/a;Log/l$d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ltg/a;",
            "Log/l$d;",
            ")V"
        }
    .end annotation

    invoke-virtual {p3, p2, p1}, Log/l$d;->b(Ltg/a;Ljava/lang/Object;)V

    return-void
.end method
