.class public final Lng/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lng/h0$b;
    }
.end annotation


# direct methods
.method public static a(Ltg/a;)Llg/l;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Ltg/a;->Q()Ltg/b;
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ltg/d; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v0, 0x0

    :try_start_1
    sget-object v1, Log/p;->V:Llg/a0;

    invoke-virtual {v1, p0}, Llg/a0;->read(Ltg/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Llg/l;
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ltg/d; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    new-instance v0, Llg/u;

    invoke-direct {v0, p0}, Llg/u;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_2
    move-exception p0

    new-instance v0, Llg/m;

    invoke-direct {v0, p0}, Llg/m;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_3
    move-exception p0

    new-instance v0, Llg/u;

    invoke-direct {v0, p0}, Llg/u;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_4
    move-exception p0

    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_0

    sget-object p0, Llg/n;->a:Llg/n;

    return-object p0

    :cond_0
    new-instance v0, Llg/u;

    invoke-direct {v0, p0}, Llg/u;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static b(Llg/l;Ltg/c;)V
    .locals 1

    sget-object v0, Log/p;->V:Llg/a0;

    invoke-virtual {v0, p1, p0}, Llg/a0;->write(Ltg/c;Ljava/lang/Object;)V

    return-void
.end method

.method public static c(Ljava/lang/Appendable;)Ljava/io/Writer;
    .locals 1

    instance-of v0, p0, Ljava/io/Writer;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/io/Writer;

    return-object p0

    :cond_0
    new-instance v0, Lng/h0$b;

    invoke-direct {v0, p0}, Lng/h0$b;-><init>(Ljava/lang/Appendable;)V

    return-object v0
.end method
