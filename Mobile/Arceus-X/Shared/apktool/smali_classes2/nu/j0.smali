.class public final Lnu/j0;
.super Lou/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lou/d<",
        "Lnu/h0<",
        "*>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\u0008\u00030\u0002H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J)\u0010\u000c\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\t2\n\u0010\u0005\u001a\u0006\u0012\u0002\u0008\u00030\u0002H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Lnu/j0;",
        "Lou/d;",
        "Lnu/h0;",
        "<init>",
        "()V",
        "flow",
        "",
        "c",
        "(Lnu/h0;)Z",
        "",
        "Lnt/b;",
        "",
        "d",
        "(Lnu/h0;)[Lnt/b;",
        "",
        "a",
        "J",
        "index",
        "b",
        "Lnt/b;",
        "cont",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public a:J

.field public b:Lnt/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lou/d;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lnu/j0;->a:J

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lnu/h0;

    invoke-virtual {p0, p1}, Lnu/j0;->c(Lnu/h0;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)[Lnt/b;
    .locals 0

    check-cast p1, Lnu/h0;

    invoke-virtual {p0, p1}, Lnu/j0;->d(Lnu/h0;)[Lnt/b;

    move-result-object p1

    return-object p1
.end method

.method public c(Lnu/h0;)Z
    .locals 4
    .param p1    # Lnu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/h0<",
            "*>;)Z"
        }
    .end annotation

    iget-wide v0, p0, Lnu/j0;->a:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Lnu/h0;->X()J

    move-result-wide v0

    iput-wide v0, p0, Lnu/j0;->a:J

    const/4 p1, 0x1

    return p1
.end method

.method public d(Lnu/h0;)[Lnt/b;
    .locals 4
    .param p1    # Lnu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/h0<",
            "*>;)[",
            "Lnt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-wide v0, p0, Lnu/j0;->a:J

    const-wide/16 v2, -0x1

    iput-wide v2, p0, Lnu/j0;->a:J

    const/4 v2, 0x0

    iput-object v2, p0, Lnu/j0;->b:Lnt/b;

    invoke-virtual {p1, v0, v1}, Lnu/h0;->W(J)[Lnt/b;

    move-result-object p1

    return-object p1
.end method
