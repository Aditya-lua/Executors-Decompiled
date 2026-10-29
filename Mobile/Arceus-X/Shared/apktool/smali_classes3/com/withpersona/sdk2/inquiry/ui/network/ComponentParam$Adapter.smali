.class public final Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Adapter;
.super Lum/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Adapter"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Adapter$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lum/h<",
        "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J!\u0010\r\u001a\u00020\u000c2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Adapter;",
        "Lum/h;",
        "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;",
        "<init>",
        "()V",
        "Lum/m;",
        "reader",
        "fromJson",
        "(Lum/m;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;",
        "Lum/t;",
        "writer",
        "value",
        "",
        "toJson",
        "(Lum/t;Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;)V",
        "ui_release"
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
.field public static final a:Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Adapter;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Adapter;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Adapter;-><init>()V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Adapter;->a:Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Adapter;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lum/h;-><init>()V

    return-void
.end method


# virtual methods
.method public fromJson(Lum/m;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;
    .locals 1
    .param p1    # Lum/m;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lum/f;
    .end annotation

    .line 1
    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic fromJson(Lum/m;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Adapter;->fromJson(Lum/m;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lum/t;Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;)V
    .locals 3
    .param p1    # Lum/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lum/z;
    .end annotation

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentString;

    if-eqz v0, :cond_0

    .line 3
    check-cast p2, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentString;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentString;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    return-void

    .line 4
    :cond_0
    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentStringList;

    if-eqz v0, :cond_2

    .line 5
    invoke-virtual {p1}, Lum/t;->a()Lum/t;

    .line 6
    check-cast p2, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentStringList;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentStringList;->a()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 7
    invoke-virtual {p1, v0}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {p1}, Lum/t;->e()Lum/t;

    return-void

    .line 9
    :cond_2
    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Address;

    if-eqz v0, :cond_8

    .line 10
    invoke-virtual {p1}, Lum/t;->c()Lum/t;

    .line 11
    check-cast p2, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Address;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Address;->g()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 12
    const-string v1, "street_1"

    invoke-virtual {p1, v1}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 13
    invoke-virtual {p1, v0}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    .line 14
    :cond_3
    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Address;->i()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 15
    const-string v1, "street_2"

    invoke-virtual {p1, v1}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 16
    invoke-virtual {p1, v0}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    .line 17
    :cond_4
    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Address;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 18
    const-string v1, "city"

    invoke-virtual {p1, v1}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 19
    invoke-virtual {p1, v0}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    .line 20
    :cond_5
    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Address;->j()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 21
    const-string v1, "subdivision"

    invoke-virtual {p1, v1}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 22
    invoke-virtual {p1, v0}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    .line 23
    :cond_6
    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Address;->f()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_7

    .line 24
    const-string v0, "postal_code"

    invoke-virtual {p1, v0}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 25
    invoke-virtual {p1, p2}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    .line 26
    :cond_7
    invoke-virtual {p1}, Lum/t;->g()Lum/t;

    return-void

    .line 27
    :cond_8
    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentBoolean;

    if-eqz v0, :cond_9

    .line 28
    check-cast p2, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentBoolean;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentBoolean;->a()Z

    move-result p2

    invoke-virtual {p1, p2}, Lum/t;->U(Z)Lum/t;

    return-void

    .line 29
    :cond_9
    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentNumber;

    if-eqz v0, :cond_a

    .line 30
    new-instance v0, Ljava/math/BigDecimal;

    check-cast p2, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentNumber;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentNumber;->a()Ljava/lang/Number;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/math/BigDecimal;-><init>(D)V

    invoke-virtual {v0}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    return-void

    .line 31
    :cond_a
    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ESignature;

    if-eqz v0, :cond_b

    .line 32
    check-cast p2, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ESignature;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ESignature;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    return-void

    .line 33
    :cond_b
    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$GovernmentIdNfcScan;

    if-eqz v0, :cond_14

    .line 34
    invoke-virtual {p1}, Lum/t;->c()Lum/t;

    .line 35
    check-cast p2, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$GovernmentIdNfcScan;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$GovernmentIdNfcScan;->a()Lqp/a;

    move-result-object v0

    if-eqz v0, :cond_10

    .line 36
    const-string v1, "caFlag"

    invoke-virtual {p1, v1}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 37
    sget-object v1, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Adapter$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_f

    const/4 v1, 0x2

    if-eq v0, v1, :cond_e

    const/4 v1, 0x3

    if-eq v0, v1, :cond_d

    const/4 v1, 0x4

    if-ne v0, v1, :cond_c

    .line 38
    const-string v0, "success"

    goto :goto_1

    .line 39
    :cond_c
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1

    .line 40
    :cond_d
    const-string v0, "failed"

    goto :goto_1

    .line 41
    :cond_e
    const-string v0, "notSupported"

    goto :goto_1

    .line 42
    :cond_f
    const-string v0, "notRequested"

    .line 43
    :goto_1
    invoke-virtual {p1, v0}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    .line 44
    :cond_10
    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$GovernmentIdNfcScan;->f()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_11

    .line 45
    const-string v1, "dg1"

    invoke-virtual {p1, v1}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 46
    invoke-virtual {p1, v0}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    .line 47
    :cond_11
    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$GovernmentIdNfcScan;->g()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_12

    .line 48
    const-string v1, "dg2"

    invoke-virtual {p1, v1}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 49
    invoke-virtual {p1, v0}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    .line 50
    :cond_12
    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$GovernmentIdNfcScan;->i()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_13

    .line 51
    const-string v0, "sod"

    invoke-virtual {p1, v0}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 52
    invoke-virtual {p1, p2}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    .line 53
    :cond_13
    invoke-virtual {p1}, Lum/t;->g()Lum/t;

    return-void

    .line 54
    :cond_14
    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$JpMyNumberNfcScanParams;

    if-eqz v0, :cond_18

    .line 55
    invoke-virtual {p1}, Lum/t;->c()Lum/t;

    .line 56
    check-cast p2, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$JpMyNumberNfcScanParams;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$JpMyNumberNfcScanParams;->a()Ljava/util/Map;

    move-result-object p2

    .line 57
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 58
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_15
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 59
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 60
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_15

    .line 61
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 62
    :cond_16
    invoke-static {v0}, Lkotlin/collections/j0;->i(Ljava/util/Map;)Ljava/util/SortedMap;

    move-result-object p2

    check-cast p2, Ljava/util/Map;

    .line 63
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 64
    invoke-virtual {p1, v1}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 65
    invoke-virtual {p1, v0}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    goto :goto_3

    .line 66
    :cond_17
    invoke-virtual {p1}, Lum/t;->g()Lum/t;

    return-void

    .line 67
    :cond_18
    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$InternationalDbParams;

    if-eqz v0, :cond_1c

    .line 68
    invoke-virtual {p1}, Lum/t;->c()Lum/t;

    .line 69
    check-cast p2, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$InternationalDbParams;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$InternationalDbParams;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_19

    .line 70
    const-string v1, "idb_country"

    invoke-virtual {p1, v1}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 71
    invoke-virtual {p1, v0}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    .line 72
    :cond_19
    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$InternationalDbParams;->f()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1a

    .line 73
    const-string v1, "idb_type"

    invoke-virtual {p1, v1}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 74
    invoke-virtual {p1, v0}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    .line 75
    :cond_1a
    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$InternationalDbParams;->g()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_1b

    .line 76
    const-string v0, "idb_value"

    invoke-virtual {p1, v0}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 77
    invoke-virtual {p1, p2}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    .line 78
    :cond_1b
    invoke-virtual {p1}, Lum/t;->g()Lum/t;

    return-void

    .line 79
    :cond_1c
    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$PhoneNumberSnaParams;

    const-string v1, ""

    if-eqz v0, :cond_20

    .line 80
    invoke-virtual {p1}, Lum/t;->c()Lum/t;

    .line 81
    check-cast p2, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$PhoneNumberSnaParams;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$PhoneNumberSnaParams;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1d

    .line 82
    const-string v2, "code"

    invoke-virtual {p1, v2}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 83
    invoke-virtual {p1, v0}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    .line 84
    :cond_1d
    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$PhoneNumberSnaParams;->g()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1f

    .line 85
    const-string v2, "error"

    invoke-virtual {p1, v2}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 86
    invoke-virtual {p1}, Lum/t;->c()Lum/t;

    .line 87
    const-string v2, "name"

    invoke-virtual {p1, v2}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 88
    invoke-virtual {p1, v0}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    .line 89
    const-string v0, "message"

    invoke-virtual {p1, v0}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 90
    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$PhoneNumberSnaParams;->f()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_1e

    goto :goto_4

    :cond_1e
    move-object v1, p2

    :goto_4
    invoke-virtual {p1, v1}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    .line 91
    invoke-virtual {p1}, Lum/t;->g()Lum/t;

    .line 92
    :cond_1f
    invoke-virtual {p1}, Lum/t;->g()Lum/t;

    return-void

    .line 93
    :cond_20
    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$FileUpload;

    if-eqz v0, :cond_25

    .line 94
    check-cast p2, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$FileUpload;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$FileUpload;->a()Z

    move-result v0

    if-eqz v0, :cond_21

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$FileUpload;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_21

    .line 95
    const-string p2, "USE PREVIOUS FILE"

    invoke-virtual {p1, p2}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    return-void

    .line 96
    :cond_21
    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$FileUpload;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_22

    .line 97
    invoke-virtual {p1}, Lum/t;->a()Lum/t;

    .line 98
    invoke-virtual {p1, v1}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    .line 99
    invoke-virtual {p1}, Lum/t;->e()Lum/t;

    return-void

    .line 100
    :cond_22
    invoke-virtual {p1}, Lum/t;->a()Lum/t;

    .line 101
    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$FileUpload;->f()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_24

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    .line 102
    invoke-virtual {v0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_23

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v0, "toString(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_23
    invoke-virtual {p1, v1}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    goto :goto_5

    .line 103
    :cond_24
    invoke-virtual {p1}, Lum/t;->e()Lum/t;

    return-void

    :cond_25
    if-nez p2, :cond_26

    .line 104
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-void

    .line 105
    :cond_26
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1
.end method

.method public bridge synthetic toJson(Lum/t;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Adapter;->toJson(Lum/t;Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;)V

    return-void
.end method
