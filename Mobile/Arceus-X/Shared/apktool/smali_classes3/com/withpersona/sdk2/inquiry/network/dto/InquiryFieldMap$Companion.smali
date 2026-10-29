.class public final Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap$Companion;
.super Lum/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lum/h<",
        "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J!\u0010\r\u001a\u00020\u000c2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap$Companion;",
        "Lum/h;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;",
        "<init>",
        "()V",
        "Lum/m;",
        "reader",
        "fromJson",
        "(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;",
        "Lum/t;",
        "writer",
        "value",
        "",
        "toJson",
        "(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;)V",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Lum/h;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public fromJson(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;
    .locals 2
    .param p1    # Lum/m;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lum/f;
    .end annotation

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Ljt/m;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "An operation is not implemented: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "Not yet implemented"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljt/m;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic fromJson(Lum/m;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap$Companion;->fromJson(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;)V
    .locals 4
    .param p1    # Lum/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lum/z;
    .end annotation

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lum/t;->o()Lum/t;

    return-void

    .line 3
    :cond_0
    invoke-virtual {p1}, Lum/t;->c()Lum/t;

    .line 4
    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;->getFields()Ljava/util/Map;

    move-result-object p2

    .line 5
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;

    .line 6
    invoke-virtual {p1, v1}, Lum/t;->n(Ljava/lang/String;)Lum/t;

    .line 7
    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$StringField;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$StringField;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$StringField;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    goto :goto_0

    .line 8
    :cond_1
    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$IntegerField;

    if-eqz v1, :cond_2

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$IntegerField;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$IntegerField;->getValue()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lum/t;->L(Ljava/lang/Number;)Lum/t;

    goto :goto_0

    .line 9
    :cond_2
    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$BooleanField;

    if-eqz v1, :cond_3

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$BooleanField;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$BooleanField;->getValue()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Lum/t;->I(Ljava/lang/Boolean;)Lum/t;

    goto :goto_0

    .line 10
    :cond_3
    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$DatetimeField;

    if-eqz v1, :cond_4

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$DatetimeField;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$DatetimeField;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    goto :goto_0

    .line 11
    :cond_4
    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$DateField;

    if-eqz v1, :cond_5

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$DateField;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$DateField;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    goto :goto_0

    .line 12
    :cond_5
    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$FloatField;

    if-eqz v1, :cond_6

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$FloatField;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$FloatField;->getValue()Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p1, v0}, Lum/t;->L(Ljava/lang/Number;)Lum/t;

    goto :goto_0

    .line 13
    :cond_6
    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$ChoicesField;

    if-eqz v1, :cond_7

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$ChoicesField;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$ChoicesField;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    goto :goto_0

    .line 14
    :cond_7
    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$MultiChoicesField;

    if-eqz v1, :cond_9

    .line 15
    invoke-virtual {p1}, Lum/t;->a()Lum/t;

    .line 16
    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$MultiChoicesField;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$MultiChoicesField;->getValue()[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 17
    array-length v1, v0

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_8

    aget-object v3, v0, v2

    .line 18
    invoke-virtual {p1, v3}, Lum/t;->M(Ljava/lang/String;)Lum/t;

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 19
    :cond_8
    invoke-virtual {p1}, Lum/t;->e()Lum/t;

    goto/16 :goto_0

    .line 20
    :cond_9
    instance-of p1, v0, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$Unknown;

    if-eqz p1, :cond_a

    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    const-string p2, "Attempted to write field with type `Unknown`."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 22
    :cond_a
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1

    .line 23
    :cond_b
    invoke-virtual {p1}, Lum/t;->g()Lum/t;

    return-void
.end method

.method public bridge synthetic toJson(Lum/t;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap$Companion;->toJson(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/InquiryFieldMap;)V

    return-void
.end method
