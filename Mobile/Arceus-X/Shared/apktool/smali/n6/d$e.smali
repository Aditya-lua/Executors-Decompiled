.class public final Ln6/d$e;
.super Lxu/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln6/d;-><init>(Lxu/l;Lxu/h0;Lkotlin/coroutines/CoroutineContext;JII)V
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
        "n6/d$e",
        "Lxu/n;",
        "Lxu/h0;",
        "file",
        "",
        "mustCreate",
        "Lxu/p0;",
        "sink",
        "(Lxu/h0;Z)Lxu/p0;",
        "coil-core_release"
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
.method public constructor <init>(Lxu/l;)V
    .locals 0

    invoke-direct {p0, p1}, Lxu/n;-><init>(Lxu/l;)V

    return-void
.end method


# virtual methods
.method public sink(Lxu/h0;Z)Lxu/p0;
    .locals 1

    invoke-virtual {p1}, Lxu/h0;->j()Lxu/h0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lxu/l;->createDirectories(Lxu/h0;)V

    :cond_0
    invoke-super {p0, p1, p2}, Lxu/n;->sink(Lxu/h0;Z)Lxu/p0;

    move-result-object p1

    return-object p1
.end method
