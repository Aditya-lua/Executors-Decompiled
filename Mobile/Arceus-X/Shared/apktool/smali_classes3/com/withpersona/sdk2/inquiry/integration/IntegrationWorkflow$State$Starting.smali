.class public final Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;
.super Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Starting"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001d\u0010\r\u001a\u00020\u000c2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001c\u0010\u000f\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0008J\u001a\u0010\u0018\u001a\u00020\u00172\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;",
        "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;",
        "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;",
        "pendingAction",
        "<init>",
        "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;)V",
        "",
        "describeContents",
        "()I",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "u",
        "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;)Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;",
        "v",
        "()Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;",
        "integration_release"
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
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting$a;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting$a;-><init>()V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;-><init>(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;)V
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;->a:Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 3
    :cond_0
    invoke-direct {p0, p1}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;-><init>(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;)V

    return-void
.end method


# virtual methods
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
    instance-of v1, p1, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;->a:Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;->a:Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;->a:Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;->a:Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Starting(pendingAction="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;)Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;

    invoke-direct {v0, p1}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;-><init>(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;)V

    return-object v0
.end method

.method public final v()Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;->a:Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1    # Landroid/os/Parcel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;->a:Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$PendingAction;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
