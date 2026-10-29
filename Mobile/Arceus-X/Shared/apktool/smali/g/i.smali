.class public final Lg/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a5\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lh/f$h;",
        "mediaType",
        "",
        "maxItems",
        "",
        "isOrderedSelection",
        "Lh/f$b;",
        "defaultTab",
        "Lg/h;",
        "a",
        "(Lh/f$h;IZLh/f$b;)Lg/h;",
        "activity"
    }
    k = 0x2
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lh/f$h;IZLh/f$b;)Lg/h;
    .locals 1
    .param p0    # Lh/f$h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lh/f$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "mediaType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultTab"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lg/h$a;

    invoke-direct {v0}, Lg/h$a;-><init>()V

    invoke-virtual {v0, p0}, Lg/h$a;->d(Lh/f$h;)Lg/h$a;

    move-result-object p0

    invoke-virtual {p0, p1}, Lg/h$a;->c(I)Lg/h$a;

    move-result-object p0

    invoke-virtual {p0, p2}, Lg/h$a;->e(Z)Lg/h$a;

    move-result-object p0

    invoke-virtual {p0, p3}, Lg/h$a;->b(Lh/f$b;)Lg/h$a;

    move-result-object p0

    invoke-virtual {p0}, Lg/h$a;->a()Lg/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lh/f$h;IZLh/f$b;ILjava/lang/Object;)Lg/h;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    sget-object p0, Lh/f$c;->a:Lh/f$c;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    sget-object p1, Lh/e;->b:Lh/e$a;

    invoke-virtual {p1}, Lh/e$a;->a()I

    move-result p1

    :cond_1
    and-int/lit8 p5, p4, 0x4

    if-eqz p5, :cond_2

    const/4 p2, 0x0

    :cond_2
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_3

    sget-object p3, Lh/f$b$a;->a:Lh/f$b$a;

    :cond_3
    invoke-static {p0, p1, p2, p3}, Lg/i;->a(Lh/f$h;IZLh/f$b;)Lg/h;

    move-result-object p0

    return-object p0
.end method
