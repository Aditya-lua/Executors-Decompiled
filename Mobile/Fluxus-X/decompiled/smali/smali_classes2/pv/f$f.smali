.class public final Lpv/f$f;
.super Lew/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpv/f;-><init>(Lew/k;Lew/b0;IIJLqv/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "pv/f$f",
        "Lew/l;",
        "Lew/b0;",
        "file",
        "",
        "mustCreate",
        "Lew/j0;",
        "u",
        "(Lew/b0;Z)Lew/j0;",
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


# direct methods
.method public constructor <init>(Lew/k;)V
    .locals 0

    invoke-direct {p0, p1}, Lew/l;-><init>(Lew/k;)V

    return-void
.end method


# virtual methods
.method public u(Lew/b0;Z)Lew/j0;
    .locals 1

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lew/b0;->k()Lew/b0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lew/k;->d(Lew/b0;)V

    :cond_0
    invoke-super {p0, p1, p2}, Lew/l;->u(Lew/b0;Z)Lew/j0;

    move-result-object p1

    return-object p1
.end method
