.class public Log/p$n;
.super Llg/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Log/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Llg/a0<",
        "Ljava/net/URI;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Llg/a0;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltg/a;)Ljava/net/URI;
    .locals 3

    invoke-virtual {p1}, Ltg/a;->Q()Ltg/b;

    move-result-object v0

    sget-object v1, Ltg/b;->i:Ltg/b;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Ltg/a;->K()V

    return-object v2

    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ltg/a;->N()Ljava/lang/String;

    move-result-object p1

    const-string v0, "null"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object v2

    :cond_1
    new-instance v0, Ljava/net/URI;

    invoke-direct {v0, p1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Llg/m;

    invoke-direct {v0, p1}, Llg/m;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public b(Ltg/c;Ljava/net/URI;)V
    .locals 0

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ljava/net/URI;->toASCIIString()Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-virtual {p1, p2}, Ltg/c;->Y(Ljava/lang/String;)Ltg/c;

    return-void
.end method

.method public bridge synthetic read(Ltg/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Log/p$n;->a(Ltg/a;)Ljava/net/URI;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic write(Ltg/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/net/URI;

    invoke-virtual {p0, p1, p2}, Log/p$n;->b(Ltg/c;Ljava/net/URI;)V

    return-void
.end method
