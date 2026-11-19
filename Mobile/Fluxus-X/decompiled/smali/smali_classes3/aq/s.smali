.class public final Laq/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0004\u001a\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Laq/h0;",
        "",
        "",
        "Landroid/net/Uri;",
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
.method public static synthetic a(Landroid/net/Uri;)V
    .locals 0

    invoke-static {p0}, Laq/s;->c(Landroid/net/Uri;)V

    return-void
.end method

.method public static final b()Laq/h0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Laq/h0<",
            "[",
            "Ljava/lang/String;",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Laq/h0;

    new-instance v1, Lh/c;

    invoke-direct {v1}, Lh/c;-><init>()V

    new-instance v2, Laq/r;

    invoke-direct {v2}, Laq/r;-><init>()V

    invoke-direct {v0, v1, v2}, Laq/h0;-><init>(Lh/a;Lg/b;)V

    return-object v0
.end method

.method public static final c(Landroid/net/Uri;)V
    .locals 1

    new-instance v0, Laq/u;

    invoke-direct {v0}, Laq/u;-><init>()V

    invoke-virtual {v0, p0}, Laq/u;->b(Landroid/net/Uri;)Z

    return-void
.end method
