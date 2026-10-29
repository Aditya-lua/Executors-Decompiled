.class public final Ls6/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls6/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J#\u0010\t\u001a\u00020\u00002\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\r\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0014\u00a8\u0006\u0017"
    }
    d2 = {
        "Ls6/d$a;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "Lcoil3/PlatformContext;",
        "context",
        "",
        "percent",
        "c",
        "(Landroid/content/Context;D)Ls6/d$a;",
        "Ls6/d;",
        "b",
        "()Ls6/d;",
        "Lkotlin/Function0;",
        "",
        "a",
        "Lkotlin/jvm/functions/Function0;",
        "maxSizeBytesFactory",
        "",
        "Z",
        "strongReferencesEnabled",
        "weakReferencesEnabled",
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


# instance fields
.field public a:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public b:Z

.field public c:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Ls6/d$a;->b:Z

    iput-boolean v0, p0, Ls6/d$a;->c:Z

    return-void
.end method

.method public static synthetic a(DLandroid/content/Context;)J
    .locals 0

    invoke-static {p0, p1, p2}, Ls6/d$a;->e(DLandroid/content/Context;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static synthetic d(Ls6/d$a;Landroid/content/Context;DILjava/lang/Object;)Ls6/d$a;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    invoke-static {p1}, Le7/e;->a(Landroid/content/Context;)D

    move-result-wide p2

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Ls6/d$a;->c(Landroid/content/Context;D)Ls6/d$a;

    move-result-object p0

    return-object p0
.end method

.method public static final e(DLandroid/content/Context;)J
    .locals 2

    invoke-static {p2}, Le7/e;->g(Landroid/content/Context;)J

    move-result-wide v0

    long-to-double v0, v0

    mul-double/2addr p0, v0

    double-to-long p0, p0

    return-wide p0
.end method


# virtual methods
.method public final b()Ls6/d;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-boolean v0, p0, Ls6/d$a;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Ls6/h;

    invoke-direct {v0}, Ls6/h;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v0, Ls6/b;

    invoke-direct {v0}, Ls6/b;-><init>()V

    :goto_0
    iget-boolean v1, p0, Ls6/d$a;->b:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Ls6/d$a;->a:Lkotlin/jvm/functions/Function0;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    new-instance v3, Ls6/g;

    invoke-direct {v3, v1, v2, v0}, Ls6/g;-><init>(JLs6/j;)V

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "maxSizeBytesFactory == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v3, Ls6/a;

    invoke-direct {v3, v0}, Ls6/a;-><init>(Ls6/j;)V

    :goto_1
    new-instance v1, Ls6/f;

    invoke-direct {v1, v3, v0}, Ls6/f;-><init>(Ls6/i;Ls6/j;)V

    return-object v1
.end method

.method public final c(Landroid/content/Context;D)Ls6/d$a;
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-wide/16 v0, 0x0

    cmpg-double v0, v0, p2

    if-gtz v0, :cond_0

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, p2, v0

    if-gtz v0, :cond_0

    new-instance v0, Ls6/c;

    invoke-direct {v0, p2, p3, p1}, Ls6/c;-><init>(DLandroid/content/Context;)V

    iput-object v0, p0, Ls6/d$a;->a:Lkotlin/jvm/functions/Function0;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "percent must be in the range [0.0, 1.0]."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
