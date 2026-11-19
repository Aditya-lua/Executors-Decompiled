.class public final Lsn/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001d\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Ldv/p0;",
        "Lsn/y;",
        "Ldv/h;",
        "a",
        "(Ldv/p0;)Ldv/h;",
        "camera_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Ldv/p0;)Ldv/h;
    .locals 2
    .param p0    # Ldv/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldv/p0<",
            "+",
            "Lsn/y;",
            ">;)",
            "Ldv/h<",
            "Lsn/y;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lsn/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lsn/j$a;-><init>(Leu/b;)V

    invoke-static {p0, v0}, Ldv/j;->U(Ldv/h;Lpu/n;)Ldv/h;

    move-result-object p0

    return-object p0
.end method
