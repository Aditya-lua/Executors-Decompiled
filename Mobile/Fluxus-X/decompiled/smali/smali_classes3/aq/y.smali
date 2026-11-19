.class public final Laq/y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001a\u0019\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Laq/h0;",
        "",
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
.method public static synthetic a(Z)V
    .locals 0

    invoke-static {p0}, Laq/y;->c(Z)V

    return-void
.end method

.method public static final b()Laq/h0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Laq/h0<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lh/h;

    invoke-direct {v0}, Lh/h;-><init>()V

    new-instance v1, Laq/x;

    invoke-direct {v1}, Laq/x;-><init>()V

    invoke-static {v0, v1}, Laq/i0;->a(Lh/a;Lg/b;)Laq/h0;

    move-result-object v0

    return-object v0
.end method

.method public static final c(Z)V
    .locals 1

    new-instance v0, Laq/b0;

    invoke-direct {v0}, Laq/b0;-><init>()V

    invoke-virtual {v0, p0}, Laq/b0;->b(Z)Z

    return-void
.end method
