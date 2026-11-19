.class public final Laq/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u001a\u0019\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Laq/h0;",
        "Laq/b;",
        "",
        "b",
        "()Laq/h0;",
        "launchers_release"
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
.method public static synthetic a(I)V
    .locals 0

    invoke-static {p0}, Laq/f;->c(I)V

    return-void
.end method

.method public static final b()Laq/h0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Laq/h0<",
            "Laq/b;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Laq/h0;

    new-instance v1, Laq/f$a;

    invoke-direct {v1}, Laq/f$a;-><init>()V

    new-instance v2, Laq/e;

    invoke-direct {v2}, Laq/e;-><init>()V

    invoke-direct {v0, v1, v2}, Laq/h0;-><init>(Lh/a;Lg/b;)V

    return-object v0
.end method

.method public static final c(I)V
    .locals 1

    new-instance v0, Laq/h;

    invoke-direct {v0}, Laq/h;-><init>()V

    invoke-virtual {v0, p0}, Laq/h;->b(I)Z

    return-void
.end method
