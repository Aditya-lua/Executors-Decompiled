.class public final Lrv/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmv/a0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lrv/c;",
        "Lmv/a0;",
        "<init>",
        "()V",
        "Lmv/a0$a;",
        "chain",
        "Lmv/h0;",
        "intercept",
        "(Lmv/a0$a;)Lmv/h0;",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lrv/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrv/c;

    invoke-direct {v0}, Lrv/c;-><init>()V

    sput-object v0, Lrv/c;->a:Lrv/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public intercept(Lmv/a0$a;)Lmv/h0;
    .locals 10
    .param p1    # Lmv/a0$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, Lsv/g;

    invoke-virtual {v1}, Lsv/g;->e()Lrv/m;

    move-result-object p1

    invoke-virtual {p1, v1}, Lrv/m;->x(Lsv/g;)Lrv/h;

    move-result-object v3

    const/16 v8, 0x3d

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lsv/g;->d(Lsv/g;ILrv/h;Lmv/f0;IIIILjava/lang/Object;)Lsv/g;

    move-result-object p1

    invoke-virtual {v1}, Lsv/g;->j()Lmv/f0;

    move-result-object v0

    invoke-virtual {p1, v0}, Lsv/g;->a(Lmv/f0;)Lmv/h0;

    move-result-object p1

    return-object p1
.end method
