.class public final Ln0/w3$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln0/w3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0011\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010JE\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0014\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00152\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Ln0/w3$a;",
        "",
        "<init>",
        "()V",
        "Ln0/w3$d;",
        "type",
        "Ln0/w3$b;",
        "size",
        "Ln0/u3;",
        "streamUseCase",
        "Ln0/w3;",
        "b",
        "(Ln0/w3$d;Ln0/w3$b;Ln0/u3;)Ln0/w3;",
        "",
        "imageFormat",
        "d",
        "(I)Ln0/w3$d;",
        "Landroid/util/Size;",
        "Ln0/x3;",
        "surfaceSizeDefinition",
        "cameraMode",
        "Ln0/w3$c;",
        "configSource",
        "f",
        "(ILandroid/util/Size;Ln0/x3;ILn0/w3$c;Ln0/u3;)Ln0/w3;",
        "DEFAULT_STREAM_USE_CASE",
        "Ln0/u3;",
        "",
        "FEATURE_COMBO_QUERY_SUPPORTED_SIZES",
        "[Ln0/w3$b;",
        "",
        "IMAGE_FORMATS_BY_CONFIG_TYPE",
        "Ljava/util/Map;",
        "CONFIG_TYPES_BY_IMAGE_FORMAT",
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
    invoke-direct {p0}, Ln0/w3$a;-><init>()V

    return-void
.end method

.method public static synthetic c(Ln0/w3$a;Ln0/w3$d;Ln0/w3$b;Ln0/u3;ILjava/lang/Object;)Ln0/w3;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    sget-object p3, Ln0/w3;->f:Ln0/u3;

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Ln0/w3$a;->b(Ln0/w3$d;Ln0/w3$b;Ln0/u3;)Ln0/w3;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ln0/w3$a;ILandroid/util/Size;Ln0/x3;ILn0/w3$c;Ln0/u3;ILjava/lang/Object;)Ln0/w3;
    .locals 7

    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_0

    const/4 p4, 0x0

    :cond_0
    move v4, p4

    and-int/lit8 p4, p7, 0x10

    if-eqz p4, :cond_1

    sget-object p5, Ln0/w3$c;->b:Ln0/w3$c;

    :cond_1
    move-object v5, p5

    and-int/lit8 p4, p7, 0x20

    if-eqz p4, :cond_2

    sget-object p6, Ln0/w3;->f:Ln0/u3;

    :cond_2
    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Ln0/w3$a;->f(ILandroid/util/Size;Ln0/x3;ILn0/w3$c;Ln0/u3;)Ln0/w3;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ln0/w3$d;Ln0/w3$b;)Ln0/w3;
    .locals 7
    .param p1    # Ln0/w3$d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ln0/w3$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "size"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Ln0/w3$a;->c(Ln0/w3$a;Ln0/w3$d;Ln0/w3$b;Ln0/u3;ILjava/lang/Object;)Ln0/w3;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ln0/w3$d;Ln0/w3$b;Ln0/u3;)Ln0/w3;
    .locals 1
    .param p1    # Ln0/w3$d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ln0/w3$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ln0/u3;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "size"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "streamUseCase"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ln0/w3;

    invoke-direct {v0, p1, p2, p3}, Ln0/w3;-><init>(Ln0/w3$d;Ln0/w3$b;Ln0/u3;)V

    return-object v0
.end method

.method public final d(I)Ln0/w3$d;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {}, Ln0/w3;->a()Ljava/util/Map;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln0/w3$d;

    if-nez p1, :cond_0

    sget-object p1, Ln0/w3$d;->a:Ln0/w3$d;

    :cond_0
    return-object p1
.end method

.method public final e(ILandroid/util/Size;Ln0/x3;)Ln0/w3;
    .locals 10
    .param p2    # Landroid/util/Size;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ln0/x3;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "size"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "surfaceSizeDefinition"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x38

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-static/range {v1 .. v9}, Ln0/w3$a;->g(Ln0/w3$a;ILandroid/util/Size;Ln0/x3;ILn0/w3$c;Ln0/u3;ILjava/lang/Object;)Ln0/w3;

    move-result-object p1

    return-object p1
.end method

.method public final f(ILandroid/util/Size;Ln0/x3;ILn0/w3$c;Ln0/u3;)Ln0/w3;
    .locals 4
    .param p2    # Landroid/util/Size;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ln0/x3;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Ln0/w3$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Ln0/u3;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "size"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "surfaceSizeDefinition"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configSource"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "streamUseCase"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ln0/w3$a;->d(I)Ln0/w3$d;

    move-result-object v0

    sget-object v1, Ln0/w3$b;->q:Ln0/w3$b;

    invoke-static {p2}, Lw0/d;->c(Landroid/util/Size;)I

    move-result v2

    const/4 v3, 0x1

    if-ne p4, v3, :cond_1

    invoke-virtual {p3, p1}, Ln0/x3;->m(I)Landroid/util/Size;

    move-result-object p2

    invoke-static {p2}, Lw0/d;->c(Landroid/util/Size;)I

    move-result p2

    if-gt v2, p2, :cond_0

    sget-object v1, Ln0/w3$b;->e:Ln0/w3$b;

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p3, p1}, Ln0/x3;->k(I)Landroid/util/Size;

    move-result-object p1

    invoke-static {p1}, Lw0/d;->c(Landroid/util/Size;)I

    move-result p1

    if-gt v2, p1, :cond_a

    sget-object v1, Ln0/w3$b;->i:Ln0/w3$b;

    goto/16 :goto_2

    :cond_1
    sget-object v3, Ln0/w3$c;->a:Ln0/w3$c;

    if-ne p5, v3, :cond_4

    invoke-virtual {p3, p1}, Ln0/x3;->g(I)Landroid/util/Size;

    move-result-object p1

    invoke-static {}, Ln0/w3;->b()[Ln0/w3$b;

    move-result-object p3

    array-length p4, p3

    const/4 p5, 0x0

    :goto_0
    if-ge p5, p4, :cond_3

    aget-object v2, p3, p5

    invoke-virtual {v2}, Ln0/w3$b;->c()Landroid/util/Size;

    move-result-object v3

    invoke-static {p2, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    move-object v1, v2

    goto :goto_1

    :cond_2
    add-int/lit8 p5, p5, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    sget-object p3, Ln0/w3$b;->q:Ln0/w3$b;

    if-ne v1, p3, :cond_a

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    sget-object v1, Ln0/w3$b;->m:Ln0/w3$b;

    goto :goto_2

    :cond_4
    invoke-virtual {p3}, Ln0/x3;->b()Landroid/util/Size;

    move-result-object p2

    invoke-static {p2}, Lw0/d;->c(Landroid/util/Size;)I

    move-result p2

    if-gt v2, p2, :cond_5

    sget-object v1, Ln0/w3$b;->c:Ln0/w3$b;

    goto :goto_2

    :cond_5
    invoke-virtual {p3}, Ln0/x3;->i()Landroid/util/Size;

    move-result-object p2

    invoke-static {p2}, Lw0/d;->c(Landroid/util/Size;)I

    move-result p2

    if-gt v2, p2, :cond_6

    sget-object v1, Ln0/w3$b;->f:Ln0/w3$b;

    goto :goto_2

    :cond_6
    invoke-virtual {p3}, Ln0/x3;->j()Landroid/util/Size;

    move-result-object p2

    invoke-static {p2}, Lw0/d;->c(Landroid/util/Size;)I

    move-result p2

    if-gt v2, p2, :cond_7

    sget-object v1, Ln0/w3$b;->l:Ln0/w3$b;

    goto :goto_2

    :cond_7
    invoke-virtual {p3, p1}, Ln0/x3;->g(I)Landroid/util/Size;

    move-result-object p2

    invoke-virtual {p3, p1}, Ln0/x3;->o(I)Landroid/util/Size;

    move-result-object p1

    if-eqz p2, :cond_8

    invoke-static {p2}, Lw0/d;->c(Landroid/util/Size;)I

    move-result p2

    if-gt v2, p2, :cond_9

    :cond_8
    const/4 p2, 0x2

    if-eq p4, p2, :cond_9

    sget-object v1, Ln0/w3$b;->m:Ln0/w3$b;

    goto :goto_2

    :cond_9
    if-eqz p1, :cond_a

    invoke-static {p1}, Lw0/d;->c(Landroid/util/Size;)I

    move-result p1

    if-gt v2, p1, :cond_a

    sget-object v1, Ln0/w3$b;->p:Ln0/w3$b;

    :cond_a
    :goto_2
    invoke-virtual {p0, v0, v1, p6}, Ln0/w3$a;->b(Ln0/w3$d;Ln0/w3$b;Ln0/u3;)Ln0/w3;

    move-result-object p1

    return-object p1
.end method
