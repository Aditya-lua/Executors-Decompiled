.class public final Lmp/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0019\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a%\u0010\u0008\u001a\u001a\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u00070\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\u0004\u001a\u001f\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u00070\u0000\u00a2\u0006\u0004\u0008\n\u0010\u0004\u00a8\u0006\u000b"
    }
    d2 = {
        "Lmp/h0;",
        "Landroid/net/Uri;",
        "",
        "h",
        "()Lmp/h0;",
        "",
        "",
        "",
        "d",
        "Lg/h;",
        "f",
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
.method public static synthetic a(Ljava/util/List;)V
    .locals 0

    invoke-static {p0}, Lmp/m;->e(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic b(Z)V
    .locals 0

    invoke-static {p0}, Lmp/m;->i(Z)V

    return-void
.end method

.method public static synthetic c(Ljava/util/List;)V
    .locals 0

    invoke-static {p0}, Lmp/m;->g(Ljava/util/List;)V

    return-void
.end method

.method public static final d()Lmp/h0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmp/h0<",
            "[",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroid/net/Uri;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lmp/h0;

    new-instance v1, Lh/d;

    invoke-direct {v1}, Lh/d;-><init>()V

    new-instance v2, Lmp/k;

    invoke-direct {v2}, Lmp/k;-><init>()V

    invoke-direct {v0, v1, v2}, Lmp/h0;-><init>(Lh/a;Lg/a;)V

    return-object v0
.end method

.method public static final e(Ljava/util/List;)V
    .locals 1

    const-string v0, "uriList"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lmp/v;

    invoke-direct {v0}, Lmp/v;-><init>()V

    invoke-virtual {v0, p0}, Lmp/v;->b(Ljava/util/List;)Z

    return-void
.end method

.method public static final f()Lmp/h0;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmp/h0<",
            "Lg/h;",
            "Ljava/util/List<",
            "Landroid/net/Uri;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lmp/h0;

    new-instance v1, Lh/e;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v4, v2, v3}, Lh/e;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lmp/j;

    invoke-direct {v2}, Lmp/j;-><init>()V

    invoke-direct {v0, v1, v2}, Lmp/h0;-><init>(Lh/a;Lg/a;)V

    return-object v0
.end method

.method public static final g(Ljava/util/List;)V
    .locals 1

    const-string v0, "uriList"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lmp/v;

    invoke-direct {v0}, Lmp/v;-><init>()V

    invoke-virtual {v0, p0}, Lmp/v;->b(Ljava/util/List;)Z

    return-void
.end method

.method public static final h()Lmp/h0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmp/h0<",
            "Landroid/net/Uri;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lmp/h0;

    new-instance v1, Lh/k;

    invoke-direct {v1}, Lh/k;-><init>()V

    new-instance v2, Lmp/l;

    invoke-direct {v2}, Lmp/l;-><init>()V

    invoke-direct {v0, v1, v2}, Lmp/h0;-><init>(Lh/a;Lg/a;)V

    return-object v0
.end method

.method public static final i(Z)V
    .locals 1

    new-instance v0, Lmp/a0;

    invoke-direct {v0}, Lmp/a0;-><init>()V

    invoke-virtual {v0, p0}, Lmp/a0;->b(Z)Z

    return-void
.end method
