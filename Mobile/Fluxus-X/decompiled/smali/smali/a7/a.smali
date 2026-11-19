.class public final La7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\"\u0014\u0010\u0008\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0007\"\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0007\u00a8\u0006\u000b"
    }
    d2 = {
        "Ln6/h;",
        "Lew/g;",
        "source",
        "",
        "a",
        "(Ln6/h;Lew/g;)Z",
        "Lew/h;",
        "Lew/h;",
        "SVG_TAG",
        "b",
        "LEFT_ANGLE_BRACKET",
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
.field public static final a:Lew/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lew/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lew/h;->d:Lew/h$a;

    const-string v1, "<svg"

    invoke-virtual {v0, v1}, Lew/h$a;->d(Ljava/lang/String;)Lew/h;

    move-result-object v1

    sput-object v1, La7/a;->a:Lew/h;

    const-string v1, "<"

    invoke-virtual {v0, v1}, Lew/h$a;->d(Ljava/lang/String;)Lew/h;

    move-result-object v0

    sput-object v0, La7/a;->b:Lew/h;

    return-void
.end method

.method public static final a(Ln6/h;Lew/g;)Z
    .locals 6
    .param p0    # Ln6/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lew/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-wide/16 v0, 0x0

    sget-object p0, La7/a;->b:Lew/h;

    invoke-interface {p1, v0, v1, p0}, Lew/g;->V1(JLew/h;)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object v1, La7/a;->a:Lew/h;

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x400

    move-object v0, p1

    invoke-interface/range {v0 .. v5}, Lew/g;->K1(Lew/h;JJ)J

    move-result-wide p0

    const-wide/16 v0, -0x1

    cmp-long p0, p0, v0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
