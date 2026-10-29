.class public final Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\r\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0003\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0013\u001a\u0004\u0008\u0012\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;",
        "Landroid/os/Parcelable;",
        "",
        "isEnabled",
        "extractTextFromImage",
        "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;",
        "idSideConfig",
        "<init>",
        "(ZZLcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;)V",
        "",
        "describeContents",
        "()I",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "a",
        "Z",
        "()Z",
        "b",
        "c",
        "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;",
        "f",
        "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;",
        "d",
        "government-id_release"
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
            "Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final d:Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;->d:Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig$a;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig$b;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig$b;-><init>()V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ZZLcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;)V
    .locals 1
    .param p3    # Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "idSideConfig"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;->a:Z

    iput-boolean p2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;->b:Z

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;->c:Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;->b:Z

    return v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final f()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;->c:Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;

    return-object v0
.end method

.method public final isEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;->a:Z

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1    # Landroid/os/Parcel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;->a:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;->b:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;->c:Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;

    invoke-virtual {v0, p1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
