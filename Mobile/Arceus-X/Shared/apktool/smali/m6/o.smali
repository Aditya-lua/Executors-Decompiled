.class public interface abstract Lm6/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm6/o$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u00e6\u0080\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tJ!\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\n\u00c0\u0006\u0001"
    }
    d2 = {
        "Lm6/o;",
        "",
        "",
        "mimeType",
        "Lxu/g;",
        "source",
        "",
        "e",
        "(Ljava/lang/String;Lxu/g;)Z",
        "a",
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
.field public static final a:Lm6/o$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lm6/o;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Lm6/o;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final d:Lm6/o;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lm6/o$a;->a:Lm6/o$a;

    sput-object v0, Lm6/o;->a:Lm6/o$a;

    new-instance v0, Lm6/l;

    invoke-direct {v0}, Lm6/l;-><init>()V

    sput-object v0, Lm6/o;->b:Lm6/o;

    new-instance v0, Lm6/m;

    invoke-direct {v0}, Lm6/m;-><init>()V

    sput-object v0, Lm6/o;->c:Lm6/o;

    new-instance v0, Lm6/n;

    invoke-direct {v0}, Lm6/n;-><init>()V

    sput-object v0, Lm6/o;->d:Lm6/o;

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Lxu/g;)Z
    .locals 0

    invoke-static {p0, p1}, Lm6/o;->d(Ljava/lang/String;Lxu/g;)Z

    move-result p0

    return p0
.end method

.method public static b(Ljava/lang/String;Lxu/g;)Z
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method public static c(Ljava/lang/String;Lxu/g;)Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public static d(Ljava/lang/String;Lxu/g;)Z
    .locals 0

    if-eqz p0, :cond_1

    const-string p1, "image/jpeg"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "image/webp"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "image/heic"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "image/heif"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic f(Ljava/lang/String;Lxu/g;)Z
    .locals 0

    invoke-static {p0, p1}, Lm6/o;->c(Ljava/lang/String;Lxu/g;)Z

    move-result p0

    return p0
.end method

.method public static synthetic g(Ljava/lang/String;Lxu/g;)Z
    .locals 0

    invoke-static {p0, p1}, Lm6/o;->b(Ljava/lang/String;Lxu/g;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public abstract e(Ljava/lang/String;Lxu/g;)Z
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lxu/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
