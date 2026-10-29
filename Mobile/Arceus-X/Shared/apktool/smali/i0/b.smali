.class public abstract Li0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li0/b$a;,
        Li0/b$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u000c\u0008\'\u0018\u0000 \u00172\u00020\u0001:\u0001\u000fB\t\u0008\u0001\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0013\u0010\r\u001a\u00020\u000c*\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001b\u0010\u0013\u001a\u00020\u000c8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u000b8aX\u00a0\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0018"
    }
    d2 = {
        "Li0/b;",
        "",
        "<init>",
        "()V",
        "Ln0/o0;",
        "cameraInfoInternal",
        "Lg0/g2;",
        "sessionConfig",
        "",
        "d",
        "(Ln0/o0;Lg0/g2;)Z",
        "Lk0/b;",
        "",
        "e",
        "(Lk0/b;)I",
        "a",
        "Ljt/h;",
        "getFeatureType",
        "()I",
        "featureType",
        "c",
        "()Lk0/b;",
        "featureTypeInternal",
        "b",
        "camera-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:Li0/b$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Li0/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final d:Li0/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final e:Li0/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final f:Li0/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Ljt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Li0/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li0/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Li0/b;->b:Li0/b$a;

    new-instance v0, Lk0/a;

    sget-object v1, Lg0/k0;->f:Lg0/k0;

    const-string v2, "HLG_10_BIT"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lk0/a;-><init>(Lg0/k0;)V

    sput-object v0, Li0/b;->c:Li0/b;

    new-instance v0, Lk0/c;

    const/16 v1, 0x3c

    invoke-direct {v0, v1, v1}, Lk0/c;-><init>(II)V

    sput-object v0, Li0/b;->d:Li0/b;

    new-instance v0, Lk0/e;

    sget-object v1, Lk0/e$b;->c:Lk0/e$b;

    invoke-direct {v0, v1}, Lk0/e;-><init>(Lk0/e$b;)V

    sput-object v0, Li0/b;->e:Li0/b;

    new-instance v0, Lk0/d;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lk0/d;-><init>(I)V

    sput-object v0, Li0/b;->f:Li0/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Li0/a;

    invoke-direct {v0, p0}, Li0/a;-><init>(Li0/b;)V

    invoke-static {v0}, Ljt/i;->b(Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object v0

    iput-object v0, p0, Li0/b;->a:Ljt/h;

    return-void
.end method

.method public static synthetic a(Li0/b;)I
    .locals 0

    invoke-static {p0}, Li0/b;->b(Li0/b;)I

    move-result p0

    return p0
.end method

.method public static final b(Li0/b;)I
    .locals 1

    invoke-virtual {p0}, Li0/b;->c()Lk0/b;

    move-result-object v0

    invoke-virtual {p0, v0}, Li0/b;->e(Lk0/b;)I

    move-result p0

    return p0
.end method


# virtual methods
.method public abstract c()Lk0/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public d(Ln0/o0;Lg0/g2;)Z
    .locals 1
    .param p1    # Ln0/o0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lg0/g2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "cameraInfoInternal"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "sessionConfig"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final e(Lk0/b;)I
    .locals 2

    sget-object v0, Li0/b$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v1, 0x4

    if-ne p1, v1, :cond_0

    return v0

    :cond_0
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1

    :cond_1
    return v1

    :cond_2
    return v0

    :cond_3
    const/4 p1, 0x0

    return p1
.end method
