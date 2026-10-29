.class public final La7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le7/g;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "La7/c;",
        "Le7/g;",
        "<init>",
        "()V",
        "Lz6/g$b;",
        "b",
        "()Lz6/g$b;",
        "coil-svg_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lm6/i$a;
    .locals 1

    invoke-virtual {p0}, La7/c;->b()Lz6/g$b;

    move-result-object v0

    return-object v0
.end method

.method public b()Lz6/g$b;
    .locals 6
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lz6/g$b;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lz6/g$b;-><init>(ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
