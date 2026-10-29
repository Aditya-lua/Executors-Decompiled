.class public final Ld5/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld5/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Ld5/h$a;",
        "",
        "<init>",
        "()V",
        "Ld5/i;",
        "owner",
        "Ld5/h;",
        "b",
        "(Ld5/i;)Ld5/h;",
        "savedstate"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ld5/h$a;-><init>()V

    return-void
.end method

.method public static synthetic a(Ld5/i;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Ld5/h$a;->c(Ld5/i;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ld5/i;)Lkotlin/Unit;
    .locals 2

    invoke-interface {p0}, Landroidx/lifecycle/s;->a()Landroidx/lifecycle/l;

    move-result-object v0

    new-instance v1, Ld5/b;

    invoke-direct {v1, p0}, Ld5/b;-><init>(Ld5/i;)V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final b(Ld5/i;)Ld5/h;
    .locals 2
    .param p1    # Ld5/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Le5/b;

    new-instance v1, Ld5/g;

    invoke-direct {v1, p1}, Ld5/g;-><init>(Ld5/i;)V

    invoke-direct {v0, p1, v1}, Le5/b;-><init>(Ld5/i;Lkotlin/jvm/functions/Function0;)V

    new-instance p1, Ld5/h;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Ld5/h;-><init>(Le5/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method
