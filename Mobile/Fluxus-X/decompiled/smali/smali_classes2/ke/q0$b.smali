.class public final Lke/q0$b;
.super Lke/w;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lke/q0;
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
        "Lke/w<",
        "TK;>;"
    }
.end annotation


# instance fields
.field public final transient c:Lke/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lke/u<",
            "TK;*>;"
        }
    .end annotation
.end field

.field public final transient d:Lke/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lke/t<",
            "TK;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lke/u;Lke/t;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lke/u<",
            "TK;*>;",
            "Lke/t<",
            "TK;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lke/w;-><init>()V

    iput-object p1, p0, Lke/q0$b;->c:Lke/u;

    iput-object p2, p0, Lke/q0$b;->d:Lke/t;

    return-void
.end method


# virtual methods
.method public a()Lke/t;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lke/t<",
            "TK;>;"
        }
    .end annotation

    iget-object v0, p0, Lke/q0$b;->d:Lke/t;

    return-object v0
.end method

.method public b([Ljava/lang/Object;I)I
    .locals 1

    invoke-virtual {p0}, Lke/q0$b;->a()Lke/t;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lke/t;->b([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lke/q0$b;->c:Lke/u;

    invoke-virtual {v0, p1}, Lke/u;->get(Ljava/lang/Object;)Ljava/lang/Object;

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

.method public g()Lke/y0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lke/y0<",
            "TK;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lke/q0$b;->a()Lke/t;

    move-result-object v0

    invoke-virtual {v0}, Lke/t;->g()Lke/y0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lke/q0$b;->g()Lke/y0;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lke/q0$b;->c:Lke/u;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method
