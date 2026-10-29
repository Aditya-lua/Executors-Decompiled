.class public final Lmu/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmu/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static a(Lmu/g;Ljava/lang/Object;)Z
    .locals 0
    .param p0    # Lmu/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Lmu/g<",
            "TE;>;TE;)Z"
        }
    .end annotation

    invoke-static {p0, p1}, Lmu/y$a;->b(Lmu/y;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method
