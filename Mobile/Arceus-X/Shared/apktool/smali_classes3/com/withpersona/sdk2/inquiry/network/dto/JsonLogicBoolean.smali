.class public final Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0087\u0008\u0018\u0000 *2\u00020\u0001:\u0001*B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005JC\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00072\u0014\u0008\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001a\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u0010J\u001a\u0010\u001e\u001a\u00020\u000b2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010 \u001a\u0004\u0008!\u0010\u0018R#\u0010)\u001a\u0004\u0018\u00010\"8BX\u0083\u0084\u0002\u00a2\u0006\u0012\n\u0004\u0008#\u0010$\u0012\u0004\u0008\'\u0010(\u001a\u0004\u0008%\u0010&\u00a8\u0006+"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;",
        "Landroid/os/Parcelable;",
        "",
        "rule",
        "<init>",
        "(Ljava/lang/String;)V",
        "",
        "",
        "formValues",
        "thisComponentValue",
        "uiStateValues",
        "",
        "getValue",
        "(Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Boolean;",
        "",
        "describeContents",
        "()I",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "component1",
        "()Ljava/lang/String;",
        "copy",
        "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;",
        "toString",
        "hashCode",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getRule",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules;",
        "parsedRules$delegate",
        "Ljt/h;",
        "getParsedRules",
        "()Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules;",
        "getParsedRules$annotations",
        "()V",
        "parsedRules",
        "Companion",
        "network-inquiry_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lum/i;
    generateAdapter = false
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final Companion:Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final parsedRules$delegate:Ljt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final rule:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;->Companion:Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean$Companion;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean$Creator;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean$Creator;-><init>()V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "rule"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;->rule:Ljava/lang/String;

    new-instance p1, Lcom/withpersona/sdk2/inquiry/network/dto/a;

    invoke-direct {p1, p0}, Lcom/withpersona/sdk2/inquiry/network/dto/a;-><init>(Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V

    invoke-static {p1}, Ljt/i;->b(Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;->parsedRules$delegate:Ljt/h;

    return-void
.end method

.method public static synthetic a(Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;->parsedRules_delegate$lambda$1(Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic copy$default(Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;->rule:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;->copy(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;

    move-result-object p0

    return-object p0
.end method

.method private final getParsedRules()Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;->parsedRules$delegate:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules;

    return-object v0
.end method

.method private static synthetic getParsedRules$annotations()V
    .locals 0
    .annotation runtime Lum/g;
        ignore = true
    .end annotation

    return-void
.end method

.method public static synthetic getValue$default(Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;ILjava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    invoke-static {}, Lkotlin/collections/k0;->j()Ljava/util/Map;

    move-result-object p3

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;->getValue(Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private static final parsedRules_delegate$lambda$1(Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules;
    .locals 5

    new-instance v0, Lum/w$b;

    invoke-direct {v0}, Lum/w$b;-><init>()V

    invoke-virtual {v0}, Lum/w$b;->d()Lum/w;

    move-result-object v0

    const-class v1, Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lum/w;->c(Ljava/lang/Class;)Lum/h;

    move-result-object v0

    invoke-virtual {v0}, Lum/h;->nullSafe()Lum/h;

    move-result-object v0

    invoke-virtual {v0}, Lum/h;->lenient()Lum/h;

    move-result-object v0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;->rule:Ljava/lang/String;

    invoke-virtual {v0, p0}, Lum/h;->fromJson(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Ljava/util/Map;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    check-cast p0, Ljava/util/Map;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    instance-of v4, v3, Ljava/lang/String;

    if-eqz v4, :cond_1

    invoke-static {v3, v2}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    if-eqz v2, :cond_0

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-static {v0}, Lkotlin/collections/k0;->t(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p0

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules$ComplexRules;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules$ComplexRules;-><init>(Ljava/util/Map;)V

    return-object v0

    :cond_3
    instance-of v0, p0, Ljava/lang/Boolean;

    if-eqz v0, :cond_4

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules$PrimitiveRule;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules$PrimitiveRule;-><init>(Ljava/lang/Object;)V

    return-object v0

    :cond_4
    return-object v1
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;->rule:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "rule"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;

    invoke-direct {v0, p1}, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;->rule:Ljava/lang/String;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;->rule:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getRule()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;->rule:Ljava/lang/String;

    return-object v0
.end method

.method public final getValue(Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Boolean;
    .locals 4
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Object;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "formValues"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uiStateValues"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;->getParsedRules()Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    instance-of v2, v0, Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules$ComplexRules;

    if-eqz v2, :cond_5

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBooleanKt;->access$getJsonLogicEngine()Lwr/i;

    move-result-object v2

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules$ComplexRules;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules$ComplexRules;->getExpression()Ljava/util/Map;

    move-result-object v0

    const-string v3, "form"

    invoke-static {v3, p1}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const-string v3, "value"

    invoke-static {v3, p2}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const-string v3, "meta"

    invoke-static {v3, p3}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p3

    filled-new-array {p1, p2, p3}, [Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/k0;->m([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {v2, v0, p1}, Lwr/i;->a(Ljava/util/Map;Ljava/lang/Object;)Lwr/k;

    move-result-object p1

    instance-of p2, p1, Lwr/k$b;

    if-eqz p2, :cond_2

    check-cast p1, Lwr/k$b;

    invoke-virtual {p1}, Lwr/k$b;->a()Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/lang/Boolean;

    if-eqz p2, :cond_1

    check-cast p1, Ljava/lang/Boolean;

    return-object p1

    :cond_1
    return-object v1

    :cond_2
    sget-object p2, Lwr/k$a$c;->a:Lwr/k$a$c;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    sget-object p2, Lwr/k$a$a;->a:Lwr/k$a$a;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    sget-object p2, Lwr/k$a$b;->a:Lwr/k$a$b;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1

    :cond_4
    :goto_0
    return-object v1

    :cond_5
    instance-of p1, v0, Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules$PrimitiveRule;

    if-eqz p1, :cond_7

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules$PrimitiveRule;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules$PrimitiveRule;->getValue()Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_6

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules$PrimitiveRule;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    return-object p1

    :cond_6
    return-object v1

    :cond_7
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;->rule:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;->rule:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "JsonLogicBoolean(rule="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1    # Landroid/os/Parcel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;->rule:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
