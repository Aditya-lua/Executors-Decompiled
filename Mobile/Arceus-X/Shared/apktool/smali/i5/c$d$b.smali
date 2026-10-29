.class public final Li5/c$d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg5/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li5/c$d;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "i5/c$d$b",
        "Lg5/f;",
        "Lg5/e;",
        "statement",
        "",
        "b",
        "(Lg5/e;)V",
        "",
        "a",
        "()Ljava/lang/String;",
        "sql",
        "sqlite-framework"
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
.field public final synthetic a:Li5/c$d;


# direct methods
.method public constructor <init>(Li5/c$d;)V
    .locals 0

    iput-object p1, p0, Li5/c$d$b;->a:Li5/c$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li5/c$d$b;->a:Li5/c$d;

    invoke-virtual {v0}, Li5/c;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b(Lg5/e;)V
    .locals 6

    const-string v0, "statement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Li5/c$d$b;->a:Li5/c$d;

    invoke-static {v0}, Li5/c$d;->e(Li5/c$d;)[I

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x1

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_5

    iget-object v3, p0, Li5/c$d$b;->a:Li5/c$d;

    invoke-static {v3}, Li5/c$d;->e(Li5/c$d;)[I

    move-result-object v3

    aget v3, v3, v2

    if-eq v3, v1, :cond_4

    const/4 v4, 0x2

    if-eq v3, v4, :cond_3

    const/4 v4, 0x3

    if-eq v3, v4, :cond_2

    const/4 v4, 0x4

    if-eq v3, v4, :cond_1

    const/4 v4, 0x5

    if-eq v3, v4, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p1, v2}, Lg5/e;->C(I)V

    goto :goto_1

    :cond_1
    iget-object v3, p0, Li5/c$d$b;->a:Li5/c$d;

    invoke-static {v3}, Li5/c$d;->f(Li5/c$d;)[[B

    move-result-object v3

    aget-object v3, v3, v2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {p1, v2, v3}, Lg5/e;->A(I[B)V

    goto :goto_1

    :cond_2
    iget-object v3, p0, Li5/c$d$b;->a:Li5/c$d;

    invoke-static {v3}, Li5/c$d;->j(Li5/c$d;)[Ljava/lang/String;

    move-result-object v3

    aget-object v3, v3, v2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {p1, v2, v3}, Lg5/e;->L1(ILjava/lang/String;)V

    goto :goto_1

    :cond_3
    iget-object v3, p0, Li5/c$d$b;->a:Li5/c$d;

    invoke-static {v3}, Li5/c$d;->g(Li5/c$d;)[D

    move-result-object v3

    aget-wide v4, v3, v2

    invoke-interface {p1, v2, v4, v5}, Lg5/e;->c0(ID)V

    goto :goto_1

    :cond_4
    iget-object v3, p0, Li5/c$d$b;->a:Li5/c$d;

    invoke-static {v3}, Li5/c$d;->h(Li5/c$d;)[J

    move-result-object v3

    aget-wide v4, v3, v2

    invoke-interface {p1, v2, v4, v5}, Lg5/e;->z(IJ)V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    return-void
.end method
