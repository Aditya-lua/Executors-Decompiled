.class public final Lpe/d$a;
.super Lpe/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpe/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<I:",
        "Ljava/lang/Object;",
        "O:",
        "Ljava/lang/Object;",
        ">",
        "Lpe/d<",
        "TI;TO;",
        "Lpe/i<",
        "-TI;+TO;>;",
        "Lpe/x<",
        "+TO;>;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lpe/x;Lpe/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpe/x<",
            "+TI;>;",
            "Lpe/i<",
            "-TI;+TO;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lpe/d;-><init>(Lpe/x;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic O(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lpe/i;

    invoke-virtual {p0, p1, p2}, Lpe/d$a;->Q(Lpe/i;Ljava/lang/Object;)Lpe/x;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic P(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lpe/x;

    invoke-virtual {p0, p1}, Lpe/d$a;->R(Lpe/x;)V

    return-void
.end method

.method public Q(Lpe/i;Ljava/lang/Object;)Lpe/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpe/i<",
            "-TI;+TO;>;TI;)",
            "Lpe/x<",
            "+TO;>;"
        }
    .end annotation

    invoke-interface {p1, p2}, Lpe/i;->apply(Ljava/lang/Object;)Lpe/x;

    move-result-object p2

    const-string v0, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s"

    invoke-static {p2, v0, p1}, Lje/n;->n(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public R(Lpe/x;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpe/x<",
            "+TO;>;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lpe/b;->F(Lpe/x;)Z

    return-void
.end method
