.class public final Lnv/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lmv/h0;",
        "a",
        "(Lmv/h0;)Lmv/h0;",
        "okhttp"
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
.method public static final a(Lmv/h0;)Lmv/h0;
    .locals 5
    .param p0    # Lmv/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lmv/h0;->s()Lmv/h0$a;

    move-result-object v0

    new-instance v1, Lnv/h;

    invoke-virtual {p0}, Lmv/h0;->b()Lmv/i0;

    move-result-object v2

    invoke-virtual {v2}, Lmv/i0;->f()Lmv/b0;

    move-result-object v2

    invoke-virtual {p0}, Lmv/h0;->b()Lmv/i0;

    move-result-object p0

    invoke-virtual {p0}, Lmv/i0;->e()J

    move-result-wide v3

    invoke-direct {v1, v2, v3, v4}, Lnv/h;-><init>(Lmv/b0;J)V

    invoke-virtual {v0, v1}, Lmv/h0$a;->b(Lmv/i0;)Lmv/h0$a;

    move-result-object p0

    invoke-virtual {p0}, Lmv/h0$a;->c()Lmv/h0;

    move-result-object p0

    return-object p0
.end method
