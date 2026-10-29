.class public final Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint$Companion;
.super Lum/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lum/h<",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J!\u0010\r\u001a\u00020\u000c2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint$Companion;",
        "Lum/h;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;",
        "<init>",
        "()V",
        "Lum/m;",
        "reader",
        "fromJson",
        "(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;",
        "Lum/t;",
        "writer",
        "value",
        "",
        "toJson",
        "(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;)V",
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
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public fromJson(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;
    .locals 1
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
    invoke-virtual {p1}, Lum/m;->B()Ljava/lang/Object;

    move-result-object p1

    .line 3
    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;->NAME:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;

    return-object p1

    .line 4
    :cond_0
    const-string v0, "name_first"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;->NAME_FIRST:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;

    return-object p1

    .line 5
    :cond_1
    const-string v0, "name_middle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;->NAME_MIDDLE:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;

    return-object p1

    .line 6
    :cond_2
    const-string v0, "name_last"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;->NAME_LAST:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;

    return-object p1

    .line 7
    :cond_3
    const-string v0, "email"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;->EMAIL:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;

    return-object p1

    .line 8
    :cond_4
    const-string v0, "address_line_1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object p1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;->ADDRESS_LINE_1:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;

    return-object p1

    .line 9
    :cond_5
    const-string v0, "address_line_2"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object p1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;->ADDRESS_LINE_2:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;

    return-object p1

    .line 10
    :cond_6
    const-string v0, "city"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object p1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;->CITY:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;

    return-object p1

    .line 11
    :cond_7
    const-string v0, "country"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object p1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;->COUNTRY:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;

    return-object p1

    .line 12
    :cond_8
    const-string v0, "postal_code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    sget-object p1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;->POSTAL_CODE:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;

    return-object p1

    :cond_9
    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic fromJson(Lum/m;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint$Companion;->fromJson(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;)V
    .locals 0
    .param p1    # Lum/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lum/z;
    .end annotation

    .line 1
    const-string p2, "writer"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic toJson(Lum/t;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint$Companion;->toJson(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$AutofillHint;)V

    return-void
.end method
