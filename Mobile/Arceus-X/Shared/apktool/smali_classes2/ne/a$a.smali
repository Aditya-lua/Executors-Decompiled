.class public final Lne/a$a;
.super Lne/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lne/a;
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
        "Lne/a<",
        "TV;TX;",
        "Lne/i<",
        "-TX;+TV;>;",
        "Lne/x<",
        "+TV;>;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lne/x;Ljava/lang/Class;Lne/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lne/x<",
            "+TV;>;",
            "Ljava/lang/Class<",
            "TX;>;",
            "Lne/i<",
            "-TX;+TV;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lne/a;-><init>(Lne/x;Ljava/lang/Class;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic O(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lne/i;

    invoke-virtual {p0, p1, p2}, Lne/a$a;->Q(Lne/i;Ljava/lang/Throwable;)Lne/x;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic P(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lne/x;

    invoke-virtual {p0, p1}, Lne/a$a;->R(Lne/x;)V

    return-void
.end method

.method public Q(Lne/i;Ljava/lang/Throwable;)Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lne/i<",
            "-TX;+TV;>;TX;)",
            "Lne/x<",
            "+TV;>;"
        }
    .end annotation

    invoke-interface {p1, p2}, Lne/i;->apply(Ljava/lang/Object;)Lne/x;

    move-result-object p2

    const-string v0, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s"

    invoke-static {p2, v0, p1}, Lhe/n;->n(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public R(Lne/x;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lne/x<",
            "+TV;>;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lne/b;->F(Lne/x;)Z

    return-void
.end method
