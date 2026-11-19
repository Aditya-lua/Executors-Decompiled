.class public final Lf7/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf7/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf7/t$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\tB\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lf7/t;",
        "Lf7/o;",
        "Lf7/u;",
        "logger",
        "<init>",
        "(Lf7/u;)V",
        "Lz6/g;",
        "size",
        "",
        "a",
        "(Lz6/g;)Z",
        "b",
        "()Z",
        "Lf7/u;",
        "coil-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:Lf7/t$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lf7/u;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf7/t$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf7/t$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lf7/t;->b:Lf7/t$a;

    return-void
.end method

.method public constructor <init>(Lf7/u;)V
    .locals 0
    .param p1    # Lf7/u;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf7/t;->a:Lf7/u;

    return-void
.end method


# virtual methods
.method public a(Lz6/g;)Z
    .locals 3
    .param p1    # Lz6/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Lz6/g;->d()Lz6/a;

    move-result-object v0

    instance-of v1, v0, Lz6/a$a;

    const v2, 0x7fffffff

    if-eqz v1, :cond_0

    check-cast v0, Lz6/a$a;

    invoke-virtual {v0}, Lz6/a$a;->f()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    const/16 v1, 0x64

    if-le v0, v1, :cond_2

    invoke-virtual {p1}, Lz6/g;->c()Lz6/a;

    move-result-object p1

    instance-of v0, p1, Lz6/a$a;

    if-eqz v0, :cond_1

    check-cast p1, Lz6/a$a;

    invoke-virtual {p1}, Lz6/a$a;->f()I

    move-result v2

    :cond_1
    if-le v2, v1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public b()Z
    .locals 2

    sget-object v0, Lf7/k;->a:Lf7/k;

    iget-object v1, p0, Lf7/t;->a:Lf7/u;

    invoke-virtual {v0, v1}, Lf7/k;->b(Lf7/u;)Z

    move-result v0

    return v0
.end method
