.class public final Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent$CancelInquiry;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CancelInquiry"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\t\u0010\u0008\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u00032\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent$CancelInquiry;",
        "Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent;",
        "skipBackendCall",
        "",
        "<init>",
        "(Z)V",
        "getSkipBackendCall",
        "()Z",
        "component1",
        "copy",
        "equals",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
        "inquiry-dynamic-feature_release"
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
.field private final skipBackendCall:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent$CancelInquiry;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent$CancelInquiry;->skipBackendCall:Z

    return-void
.end method

.method public synthetic constructor <init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 3
    :cond_0
    invoke-direct {p0, p1}, Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent$CancelInquiry;-><init>(Z)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent$CancelInquiry;ZILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent$CancelInquiry;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-boolean p1, p0, Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent$CancelInquiry;->skipBackendCall:Z

    :cond_0
    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent$CancelInquiry;->copy(Z)Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent$CancelInquiry;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent$CancelInquiry;->skipBackendCall:Z

    return v0
.end method

.method public final copy(Z)Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent$CancelInquiry;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent$CancelInquiry;

    invoke-direct {v0, p1}, Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent$CancelInquiry;-><init>(Z)V

    return-object v0
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
    instance-of v1, p1, Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent$CancelInquiry;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent$CancelInquiry;

    iget-boolean v1, p0, Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent$CancelInquiry;->skipBackendCall:Z

    iget-boolean p1, p1, Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent$CancelInquiry;->skipBackendCall:Z

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getSkipBackendCall()Z
    .locals 1

    iget-boolean v0, p0, Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent$CancelInquiry;->skipBackendCall:Z

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-boolean v0, p0, Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent$CancelInquiry;->skipBackendCall:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-boolean v0, p0, Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent$CancelInquiry;->skipBackendCall:Z

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CancelInquiry(skipBackendCall="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
