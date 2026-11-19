.class public final Lpe/a$a;
.super Lpe/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpe/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        "X:",
        "Ljava/lang/Throwable;",
        ">",
        "Lpe/a<",
        "TV;TX;",
        "Lpe/i<",
        "-TX;+TV;>;",
        "Lpe/x<",
        "+TV;>;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lpe/x;Ljava/lang/Class;Lpe/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpe/x<",
            "+TV;>;",
            "Ljava/lang/Class<",
            "TX;>;",
            "Lpe/i<",
            "-TX;+TV;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lpe/a;-><init>(Lpe/x;Ljava/lang/Class;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic O(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lpe/i;

    invoke-virtual {p0, p1, p2}, Lpe/a$a;->Q(Lpe/i;Ljava/lang/Throwable;)Lpe/x;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic P(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lpe/x;

    invoke-virtual {p0, p1}, Lpe/a$a;->R(Lpe/x;)V

    return-void
.end method

.method public Q(Lpe/i;Ljava/lang/Throwable;)Lpe/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpe/i<",
            "-TX;+TV;>;TX;)",
            "Lpe/x<",
            "+TV;>;"
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
            "+TV;>;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lpe/b;->F(Lpe/x;)Z

    return-void
.end method
