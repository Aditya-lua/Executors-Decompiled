.class public final Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Pages;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Pages"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Pages$GovernmentIdPages;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0008B\u0013\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Pages;",
        "",
        "governmentId",
        "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Pages$GovernmentIdPages;",
        "<init>",
        "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Pages$GovernmentIdPages;)V",
        "getGovernmentId",
        "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Pages$GovernmentIdPages;",
        "GovernmentIdPages",
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
    generateAdapter = true
.end annotation


# instance fields
.field private final governmentId:Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Pages$GovernmentIdPages;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Pages;-><init>(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Pages$GovernmentIdPages;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Pages$GovernmentIdPages;)V
    .locals 0
    .param p1    # Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Pages$GovernmentIdPages;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Pages;->governmentId:Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Pages$GovernmentIdPages;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Pages$GovernmentIdPages;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Pages;-><init>(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Pages$GovernmentIdPages;)V

    return-void
.end method


# virtual methods
.method public final getGovernmentId()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Pages$GovernmentIdPages;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Pages;->governmentId:Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Pages$GovernmentIdPages;

    return-object v0
.end method
