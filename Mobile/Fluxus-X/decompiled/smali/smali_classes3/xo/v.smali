.class public final Lxo/v;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxo/v$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lvo/d3$e;",
        "Lsn/w0$c;",
        "b",
        "(Lvo/d3$e;)Lsn/w0$c;",
        "government-id_release"
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
.method public static final synthetic a(Lvo/d3$e;)Lsn/w0$c;
    .locals 0

    invoke-static {p0}, Lxo/v;->b(Lvo/d3$e;)Lsn/w0$c;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lvo/d3$e;)Lsn/w0$c;
    .locals 1

    sget-object v0, Lxo/v$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    sget-object p0, Lsn/w0$c;->b:Lsn/w0$c;

    return-object p0

    :cond_0
    sget-object p0, Lsn/w0$c;->a:Lsn/w0$c;

    return-object p0

    :cond_1
    sget-object p0, Lsn/w0$c;->a:Lsn/w0$c;

    return-object p0
.end method
