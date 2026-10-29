.class public final Lie/q0$b;
.super Lie/w;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lie/q0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        ">",
        "Lie/w<",
        "TK;>;"
    }
.end annotation


# instance fields
.field public final transient c:Lie/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lie/u<",
            "TK;*>;"
        }
    .end annotation
.end field

.field public final transient d:Lie/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lie/t<",
            "TK;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lie/u;Lie/t;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lie/u<",
            "TK;*>;",
            "Lie/t<",
            "TK;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lie/w;-><init>()V

    iput-object p1, p0, Lie/q0$b;->c:Lie/u;

    iput-object p2, p0, Lie/q0$b;->d:Lie/t;

    return-void
.end method


# virtual methods
.method public a()Lie/t;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lie/t<",
            "TK;>;"
        }
    .end annotation

    iget-object v0, p0, Lie/q0$b;->d:Lie/t;

    return-object v0
.end method

.method public b([Ljava/lang/Object;I)I
    .locals 1

    invoke-virtual {p0}, Lie/q0$b;->a()Lie/t;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lie/t;->b([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lie/q0$b;->c:Lie/u;

    invoke-virtual {v0, p1}, Lie/u;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public g()Lie/y0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lie/y0<",
            "TK;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lie/q0$b;->a()Lie/t;

    move-result-object v0

    invoke-virtual {v0}, Lie/t;->g()Lie/y0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lie/q0$b;->g()Lie/y0;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lie/q0$b;->c:Lie/u;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method
