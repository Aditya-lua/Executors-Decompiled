.class public final Lil/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lil/c;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u0003J/\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000f2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000fH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R&\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000f0\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R \u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00178\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0018\u001a\u0004\u0008\u0014\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Lil/d;",
        "Lil/c;",
        "<init>",
        "()V",
        "",
        "key",
        "Lil/a;",
        "b",
        "(Ljava/lang/String;)Lil/a;",
        "Lcom/roblox/protocols/designfoundationsplatforminterface/generated/DesignTokens;",
        "colorTokens",
        "",
        "e",
        "(Lcom/roblox/protocols/designfoundationsplatforminterface/generated/DesignTokens;)V",
        "d",
        "",
        "Lcom/roblox/protocols/designfoundationsplatforminterface/generated/ColorTokenVariants;",
        "f",
        "(Ljava/util/Map;)Ljava/util/Map;",
        "Lnu/c0;",
        "a",
        "Lnu/c0;",
        "_tokenMap",
        "Lnu/h;",
        "Lnu/h;",
        "()Lnu/h;",
        "tokenUpdates",
        "",
        "c",
        "()Z",
        "hasTokens",
        "universalapp_googleProdRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lnu/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnu/c0<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lil/a;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lnu/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnu/h<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lkotlin/collections/k0;->j()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lnu/r0;->a(Ljava/lang/Object;)Lnu/c0;

    move-result-object v0

    iput-object v0, p0, Lil/d;->a:Lnu/c0;

    new-instance v1, Lil/d$a;

    invoke-direct {v1, v0}, Lil/d$a;-><init>(Lnu/h;)V

    iput-object v1, p0, Lil/d;->b:Lnu/h;

    return-void
.end method


# virtual methods
.method public a()Lnu/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnu/h<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lil/d;->b:Lnu/h;

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lil/a;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lil/d;->a:Lnu/c0;

    invoke-interface {v0}, Lnu/c0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lil/a;

    return-object p1
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Lil/d;->a:Lnu/c0;

    invoke-interface {v0}, Lnu/c0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Lil/d;->a:Lnu/c0;

    invoke-static {}, Lkotlin/collections/k0;->j()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Lnu/c0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final e(Lcom/roblox/protocols/designfoundationsplatforminterface/generated/DesignTokens;)V
    .locals 2
    .param p1    # Lcom/roblox/protocols/designfoundationsplatforminterface/generated/DesignTokens;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "colorTokens"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lil/d;->a:Lnu/c0;

    invoke-virtual {p1}, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/DesignTokens;->getColorTokens()Ljava/util/HashMap;

    move-result-object p1

    const-string v1, "getColorTokens(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lil/d;->f(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {v0, p1}, Lnu/c0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final f(Ljava/util/Map;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/roblox/protocols/designfoundationsplatforminterface/generated/ColorTokenVariants;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lil/a;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    invoke-static {v1}, Lkotlin/collections/j0;->f(I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/ColorTokenVariants;

    invoke-static {v1}, Lil/e;->a(Lcom/roblox/protocols/designfoundationsplatforminterface/generated/ColorTokenVariants;)Lil/a;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method
