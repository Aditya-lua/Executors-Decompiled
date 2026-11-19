.class public final Lln/m$a$a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lln/m$a;->a(Lew/h;)Lln/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/util/Map<",
        "Lmn/k;",
        "+",
        "Lln/m;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "",
        "Lmn/k;",
        "Lln/m;",
        "b",
        "()Ljava/util/Map;"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic i:Lew/g;


# direct methods
.method public constructor <init>(Lew/g;)V
    .locals 0

    iput-object p1, p0, Lln/m$a$a;->i:Lew/g;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lmn/k;",
            "Lln/m;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lln/m$a$a;->i:Lew/g;

    invoke-interface {v0}, Lew/g;->readInt()I

    move-result v0

    iget-object v1, p0, Lln/m$a$a;->i:Lew/g;

    invoke-static {v0}, Lkotlin/collections/j0;->e(I)Ljava/util/Map;

    move-result-object v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    add-int/lit8 v3, v3, 0x1

    invoke-static {v1}, Lln/j;->a(Lew/g;)Lew/h;

    move-result-object v4

    sget-object v5, Lmn/k;->c:Lmn/k$a;

    invoke-virtual {v5, v4}, Lmn/k$a;->a(Lew/h;)Lmn/k;

    move-result-object v4

    invoke-static {v1}, Lln/j;->a(Lew/g;)Lew/h;

    move-result-object v5

    sget-object v6, Lln/m;->c:Lln/m$a;

    invoke-virtual {v6, v5}, Lln/m$a;->a(Lew/h;)Lln/m;

    move-result-object v5

    invoke-interface {v2, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-static {v2}, Lkotlin/collections/j0;->c(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lln/m$a$a;->b()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
