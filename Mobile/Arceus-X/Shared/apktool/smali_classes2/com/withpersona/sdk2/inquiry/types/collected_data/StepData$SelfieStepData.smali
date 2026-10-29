.class public final Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;
.super Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SelfieStepData"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\r\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u000fJ\u001a\u0010\u001b\u001a\u00020\u001a2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010!\u001a\u0004\u0008%\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010!\u001a\u0004\u0008\'\u0010#\u00a8\u0006("
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;",
        "Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData;",
        "",
        "stepName",
        "Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;",
        "centerCapture",
        "leftCapture",
        "rightCapture",
        "<init>",
        "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;)V",
        "",
        "close",
        "()V",
        "",
        "describeContents",
        "()I",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Ljava/lang/String;",
        "getStepName",
        "b",
        "Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;",
        "getCenterCapture",
        "()Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;",
        "c",
        "getLeftCapture",
        "d",
        "getRightCapture",
        "inquiry-types_release"
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
            "Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final c:Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final d:Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData$a;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData$a;-><init>()V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "stepName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;->b:Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;->c:Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;->d:Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 3

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;->b:Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;->c:Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;->d:Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;

    filled-new-array {v0, v1, v2}, [Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;->a()Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
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
    instance-of v1, p1, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;->b:Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;

    iget-object v3, p1, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;->b:Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;->c:Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;

    iget-object v3, p1, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;->c:Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;->d:Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;->d:Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;->b:Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;->c:Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;->d:Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;->b:Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;->c:Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;->d:Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "SelfieStepData(stepName="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", centerCapture="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", leftCapture="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", rightCapture="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3
    .param p1    # Landroid/os/Parcel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;->b:Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;->c:Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;

    if-nez v0, :cond_1

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;->d:Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;

    if-nez v0, :cond_2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_2
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
