.class public final La7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0002\u0010\u0003\"\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Ll6/l$c;",
        "",
        "a",
        "Ll6/l$c;",
        "cssKey",
        "Ly6/p;",
        "(Ly6/p;)Ljava/lang/String;",
        "css",
        "coil-svg_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Ll6/l$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll6/l$c<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ll6/l$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll6/l$c;-><init>(Ljava/lang/Object;)V

    sput-object v0, La7/b;->a:Ll6/l$c;

    return-void
.end method

.method public static final a(Ly6/p;)Ljava/lang/String;
    .locals 1
    .param p0    # Ly6/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    sget-object v0, La7/b;->a:Ll6/l$c;

    invoke-static {p0, v0}, Ll6/m;->b(Ly6/p;Ll6/l$c;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method
