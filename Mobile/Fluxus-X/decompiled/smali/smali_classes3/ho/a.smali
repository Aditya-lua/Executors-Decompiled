.class public abstract Lho/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lho/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public c(Lfo/i;)V
    .locals 0

    return-void
.end method

.method public d(Leo/y;)V
    .locals 1

    invoke-interface {p0}, Lho/d;->f()Leo/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Leo/s;->b(Leo/y;)V

    return-void
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public g(Leo/a;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public h()V
    .locals 0

    return-void
.end method

.method public i()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Leo/e<",
            "*>;>;"
        }
    .end annotation

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0
.end method

.method public j(Lfo/b;)V
    .locals 0

    return-void
.end method
