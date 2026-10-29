.class public final Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Companion;",
        "",
        "<init>",
        "()V",
        "Lum/h$e;",
        "createAdapter",
        "()Lum/h$e;",
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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final createAdapter()Lum/h$e;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-class v0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;

    const-string v1, "type"

    invoke-static {v0, v1}, Lvm/b;->b(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Unknown;->INSTANCE:Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Unknown;

    invoke-virtual {v0, v1}, Lvm/b;->c(Ljava/lang/Object;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;

    const-string v2, "ui"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId;

    const-string v2, "government_id"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie;

    const-string v2, "selfie"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;

    const-string v2, "document"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Complete;

    const-string v2, "complete"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration;

    const-string v2, "integration"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-string v1, "withSubtype(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
