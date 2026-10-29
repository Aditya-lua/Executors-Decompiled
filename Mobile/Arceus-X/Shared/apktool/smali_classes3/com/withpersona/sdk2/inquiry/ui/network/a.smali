.class public final Lcom/withpersona/sdk2/inquiry/ui/network/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;",
        "",
        "a",
        "(Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;)Ljava/lang/Object;",
        "ui_release"
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
.method public static final a(Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;)Ljava/lang/Object;
    .locals 5
    .param p0    # Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Address;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Address;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Address;->g()Ljava/lang/String;

    move-result-object v0

    const-string v1, "street_1"

    invoke-static {v1, v0}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const-string v1, "street_2"

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Address;->i()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const-string v2, "city"

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Address;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const-string v3, "subdivision"

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Address;->j()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const-string v4, "postal_code"

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Address;->f()Ljava/lang/String;

    move-result-object p0

    invoke-static {v4, p0}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    filled-new-array {v0, v1, v2, v3, p0}, [Lkotlin/Pair;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/k0;->m([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentString;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentString;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentString;->a()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentStringList;

    if-eqz v0, :cond_2

    check-cast p0, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentStringList;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentStringList;->a()Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_2
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentBoolean;

    if-eqz v0, :cond_3

    check-cast p0, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentBoolean;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentBoolean;->a()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_3
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentNumber;

    if-eqz v0, :cond_4

    check-cast p0, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentNumber;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentNumber;->a()Ljava/lang/Number;

    move-result-object p0

    return-object p0

    :cond_4
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ESignature;

    if-eqz v0, :cond_6

    check-cast p0, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ESignature;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ESignature;->a()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_5

    const-string p0, ""

    :cond_5
    return-object p0

    :cond_6
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$GovernmentIdNfcScan;

    if-eqz v0, :cond_7

    check-cast p0, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$GovernmentIdNfcScan;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$GovernmentIdNfcScan;->a()Lqp/a;

    move-result-object v0

    const-string v1, "caFlag"

    invoke-static {v1, v0}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const-string v1, "dg1"

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$GovernmentIdNfcScan;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const-string v2, "dg2"

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$GovernmentIdNfcScan;->g()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const-string v3, "sod"

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$GovernmentIdNfcScan;->i()Ljava/lang/String;

    move-result-object p0

    invoke-static {v3, p0}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    filled-new-array {v0, v1, v2, p0}, [Lkotlin/Pair;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/k0;->m([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_7
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$JpMyNumberNfcScanParams;

    if-eqz v0, :cond_8

    check-cast p0, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$JpMyNumberNfcScanParams;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$JpMyNumberNfcScanParams;->a()Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_8
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$InternationalDbParams;

    if-eqz v0, :cond_9

    check-cast p0, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$InternationalDbParams;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$InternationalDbParams;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "idb_country"

    invoke-static {v1, v0}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const-string v1, "idb_type"

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$InternationalDbParams;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const-string v2, "idb_value"

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$InternationalDbParams;->g()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    filled-new-array {v0, v1, p0}, [Lkotlin/Pair;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/k0;->m([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_9
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$PhoneNumberSnaParams;

    if-eqz v0, :cond_a

    check-cast p0, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$PhoneNumberSnaParams;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$PhoneNumberSnaParams;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "code"

    invoke-static {v1, v0}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const-string v1, "name"

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$PhoneNumberSnaParams;->g()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const-string v2, "message"

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$PhoneNumberSnaParams;->f()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    filled-new-array {v1, p0}, [Lkotlin/Pair;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/k0;->m([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    const-string v1, "error"

    invoke-static {v1, p0}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    filled-new-array {v0, p0}, [Lkotlin/Pair;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/k0;->m([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_a
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$FileUpload;

    if-eqz v0, :cond_d

    check-cast p0, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$FileUpload;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$FileUpload;->f()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_b

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v1, "toString(...)"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_b
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_c
    return-object v0

    :cond_d
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0
.end method
