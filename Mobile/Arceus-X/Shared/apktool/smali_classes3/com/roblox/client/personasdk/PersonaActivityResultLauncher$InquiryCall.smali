.class public final Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/personasdk/PersonaActivityResultLauncher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "InquiryCall"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\u0008\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000bJ$\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0016\u001a\u0004\u0008\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u000b\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;",
        "",
        "",
        "inquiryId",
        "Lcom/roblox/universalapp/facialageestimation/a$a;",
        "callback",
        "<init>",
        "(Ljava/lang/String;Lcom/roblox/universalapp/facialageestimation/a$a;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/roblox/universalapp/facialageestimation/a$a;",
        "copy",
        "(Ljava/lang/String;Lcom/roblox/universalapp/facialageestimation/a$a;)Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;",
        "toString",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getInquiryId",
        "Lcom/roblox/universalapp/facialageestimation/a$a;",
        "getCallback",
        "personasdk_googleProdRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final callback:Lcom/roblox/universalapp/facialageestimation/a$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final inquiryId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/roblox/universalapp/facialageestimation/a$a;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/roblox/universalapp/facialageestimation/a$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "inquiryId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;->inquiryId:Ljava/lang/String;

    iput-object p2, p0, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;->callback:Lcom/roblox/universalapp/facialageestimation/a$a;

    return-void
.end method

.method public static synthetic copy$default(Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;Ljava/lang/String;Lcom/roblox/universalapp/facialageestimation/a$a;ILjava/lang/Object;)Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;->inquiryId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;->callback:Lcom/roblox/universalapp/facialageestimation/a$a;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;->copy(Ljava/lang/String;Lcom/roblox/universalapp/facialageestimation/a$a;)Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;->inquiryId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/roblox/universalapp/facialageestimation/a$a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;->callback:Lcom/roblox/universalapp/facialageestimation/a$a;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/roblox/universalapp/facialageestimation/a$a;)Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/roblox/universalapp/facialageestimation/a$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "inquiryId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;

    invoke-direct {v0, p1, p2}, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;-><init>(Ljava/lang/String;Lcom/roblox/universalapp/facialageestimation/a$a;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;

    iget-object v1, p0, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;->inquiryId:Ljava/lang/String;

    iget-object v3, p1, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;->inquiryId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;->callback:Lcom/roblox/universalapp/facialageestimation/a$a;

    iget-object p1, p1, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;->callback:Lcom/roblox/universalapp/facialageestimation/a$a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getCallback()Lcom/roblox/universalapp/facialageestimation/a$a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;->callback:Lcom/roblox/universalapp/facialageestimation/a$a;

    return-object v0
.end method

.method public final getInquiryId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;->inquiryId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;->inquiryId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;->callback:Lcom/roblox/universalapp/facialageestimation/a$a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;->inquiryId:Ljava/lang/String;

    iget-object v1, p0, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher$InquiryCall;->callback:Lcom/roblox/universalapp/facialageestimation/a$a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "InquiryCall(inquiryId="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", callback="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
