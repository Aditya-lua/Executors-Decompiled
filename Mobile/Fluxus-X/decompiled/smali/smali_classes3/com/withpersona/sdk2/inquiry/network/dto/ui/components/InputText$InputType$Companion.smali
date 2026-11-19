.class public final Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType$Companion;
.super Lhn/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lhn/h<",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J!\u0010\r\u001a\u00020\u000c2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType$Companion;",
        "Lhn/h;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType;",
        "<init>",
        "()V",
        "Lhn/m;",
        "reader",
        "fromJson",
        "(Lhn/m;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType;",
        "Lhn/t;",
        "writer",
        "value",
        "",
        "toJson",
        "(Lhn/t;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType;)V",
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
    invoke-direct {p0}, Lhn/h;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public fromJson(Lhn/m;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType;
    .locals 1
    .param p1    # Lhn/m;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lhn/f;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lhn/m;->E()Ljava/lang/Object;

    move-result-object p1

    .line 3
    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType;->TEXT:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType;

    return-object p1

    .line 4
    :cond_0
    const-string v0, "email"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType;->EMAIL:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType;

    return-object p1

    .line 5
    :cond_1
    const-string v0, "number_pad"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType;->NUMBER_PAD:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType;

    return-object p1

    .line 6
    :cond_2
    sget-object p1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType;->TEXT:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType;

    return-object p1
.end method

.method public bridge synthetic fromJson(Lhn/m;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType$Companion;->fromJson(Lhn/m;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lhn/t;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType;)V
    .locals 0
    .param p1    # Lhn/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lhn/z;
    .end annotation

    .line 1
    const-string p2, "writer"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic toJson(Lhn/t;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType$Companion;->toJson(Lhn/t;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputText$InputType;)V

    return-void
.end method
