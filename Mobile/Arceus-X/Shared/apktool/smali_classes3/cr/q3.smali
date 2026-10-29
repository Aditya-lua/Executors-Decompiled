.class public abstract Lcr/q3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcr/q3$a;,
        Lcr/q3$b;,
        Lcr/q3$c;,
        Lcr/q3$d;,
        Lcr/q3$e;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00082\u0018\u0000 \u00072\u00020\u0001:\u0005\t\u0007\n\u000b\u000cB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u0082\u0001\u0004\r\u000e\u000f\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcr/q3;",
        "",
        "<init>",
        "()V",
        "",
        "char",
        "",
        "a",
        "(C)Z",
        "b",
        "c",
        "e",
        "d",
        "Lcr/q3$a;",
        "Lcr/q3$b;",
        "Lcr/q3$c;",
        "Lcr/q3$e;",
        "ui-step-renderer_release"
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
.field public static final a:Lcr/q3$d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcr/q3$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcr/q3$d;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcr/q3;->a:Lcr/q3$d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcr/q3;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(C)Z
    .locals 3

    instance-of v0, p0, Lcr/q3$b;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Character;->isDigit(C)Z

    move-result p1

    return p1

    :cond_0
    instance-of v0, p0, Lcr/q3$a;

    if-eqz v0, :cond_1

    invoke-static {p1}, Ljava/lang/Character;->isLetter(C)Z

    move-result p1

    return p1

    :cond_1
    instance-of v0, p0, Lcr/q3$c;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    invoke-static {p1}, Ljava/lang/Character;->isDigit(C)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {p1}, Ljava/lang/Character;->isLetter(C)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    return v2

    :cond_3
    :goto_0
    return v1

    :cond_4
    instance-of v0, p0, Lcr/q3$e;

    if-eqz v0, :cond_6

    move-object v0, p0

    check-cast v0, Lcr/q3$e;

    invoke-virtual {v0}, Lcr/q3$e;->b()C

    move-result v0

    if-ne p1, v0, :cond_5

    return v1

    :cond_5
    return v2

    :cond_6
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1
.end method
