.class public final Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$Companion;
.super Lum/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lum/h<",
        "Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;",
        ">;"
    }
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
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$Companion;-><init>()V

    return-void
.end method

.method private final getJsonType(Lum/m;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p1}, Lum/m;->v()Lum/m;

    move-result-object p1

    invoke-virtual {p1}, Lum/m;->b()V

    :goto_0
    invoke-virtual {p1}, Lum/m;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lum/m;->n()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lum/m;->r()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lum/m;->P()V

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public fromJson(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;
    .locals 4
    .param p1    # Lum/m;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lum/f;
    .end annotation

    .line 2
    new-instance v0, Lum/w$b;

    invoke-direct {v0}, Lum/w$b;-><init>()V

    invoke-virtual {v0}, Lum/w$b;->d()Lum/w;

    move-result-object v0

    .line 3
    invoke-direct {p0, p1}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$Companion;->getJsonType(Lum/m;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 4
    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const v3, -0x30b1cea8

    if-eq v2, v3, :cond_5

    const v3, -0xcabd85c

    if-eq v2, v3, :cond_3

    const v3, 0x62db307f

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    const-string v2, "input_address"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    .line 5
    :cond_2
    const-class v1, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputAddressComponentError;

    invoke-virtual {v0, v1}, Lum/w;->c(Ljava/lang/Class;)Lum/h;

    move-result-object v0

    .line 6
    invoke-virtual {v0, p1}, Lum/h;->fromJson(Lum/m;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;

    return-object p1

    .line 7
    :cond_3
    const-string v2, "input_international_db"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    .line 8
    :cond_4
    const-class v1, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputInternationalDbComponentError;

    invoke-virtual {v0, v1}, Lum/w;->c(Ljava/lang/Class;)Lum/h;

    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lum/h;->fromJson(Lum/m;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;

    return-object p1

    .line 10
    :cond_5
    const-string v2, "gov_id_nfc"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 11
    :goto_0
    const-class v1, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;

    invoke-virtual {v0, v1}, Lum/w;->c(Ljava/lang/Class;)Lum/h;

    move-result-object v0

    invoke-virtual {v0, p1}, Lum/h;->fromJson(Lum/m;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;

    return-object p1

    .line 12
    :cond_6
    const-class v1, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiGovernmentIdNfcScanComponentError;

    invoke-virtual {v0, v1}, Lum/w;->c(Ljava/lang/Class;)Lum/h;

    move-result-object v0

    .line 13
    invoke-virtual {v0, p1}, Lum/h;->fromJson(Lum/m;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;

    return-object p1
.end method

.method public bridge synthetic fromJson(Lum/m;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$Companion;->fromJson(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lum/t;Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;)V
    .locals 2
    .param p1    # Lum/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lum/z;
    .end annotation

    .line 2
    new-instance v0, Lum/w$b;

    invoke-direct {v0}, Lum/w$b;-><init>()V

    invoke-virtual {v0}, Lum/w$b;->d()Lum/w;

    move-result-object v0

    .line 3
    instance-of v1, p2, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiGovernmentIdNfcScanComponentError;

    if-eqz v1, :cond_0

    .line 4
    const-class v1, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiGovernmentIdNfcScanComponentError;

    invoke-virtual {v0, v1}, Lum/w;->c(Ljava/lang/Class;)Lum/h;

    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2}, Lum/h;->toJson(Lum/t;Ljava/lang/Object;)V

    return-void

    .line 6
    :cond_0
    instance-of v1, p2, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputAddressComponentError;

    if-eqz v1, :cond_1

    .line 7
    const-class v1, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputAddressComponentError;

    invoke-virtual {v0, v1}, Lum/w;->c(Ljava/lang/Class;)Lum/h;

    move-result-object v0

    .line 8
    invoke-virtual {v0, p1, p2}, Lum/h;->toJson(Lum/t;Ljava/lang/Object;)V

    return-void

    .line 9
    :cond_1
    instance-of v1, p2, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;

    if-eqz v1, :cond_2

    .line 10
    const-class v1, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;

    invoke-virtual {v0, v1}, Lum/w;->c(Ljava/lang/Class;)Lum/h;

    move-result-object v0

    .line 11
    invoke-virtual {v0, p1, p2}, Lum/h;->toJson(Lum/t;Ljava/lang/Object;)V

    return-void

    .line 12
    :cond_2
    instance-of v1, p2, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputInternationalDbComponentError;

    if-eqz v1, :cond_3

    .line 13
    const-class v1, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputInternationalDbComponentError;

    invoke-virtual {v0, v1}, Lum/w;->c(Ljava/lang/Class;)Lum/h;

    move-result-object v0

    .line 14
    invoke-virtual {v0, p1, p2}, Lum/h;->toJson(Lum/t;Ljava/lang/Object;)V

    return-void

    :cond_3
    if-nez p2, :cond_4

    .line 15
    invoke-virtual {p1}, Lum/t;->o()Lum/t;

    return-void

    .line 16
    :cond_4
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1
.end method

.method public bridge synthetic toJson(Lum/t;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$Companion;->toJson(Lum/t;Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;)V

    return-void
.end method
