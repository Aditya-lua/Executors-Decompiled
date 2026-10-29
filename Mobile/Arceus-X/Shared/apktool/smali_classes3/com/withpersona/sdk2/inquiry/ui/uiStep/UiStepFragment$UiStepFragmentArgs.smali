.class public final Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment$UiStepFragmentArgs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "UiStepFragmentArgs"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001d\u0010\r\u001a\u00020\u000c2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u000f\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment$UiStepFragmentArgs;",
        "Landroid/os/Parcelable;",
        "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;",
        "props",
        "<init>",
        "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;)V",
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
        "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;",
        "()Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;",
        "ui_release"
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
            "Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment$UiStepFragmentArgs;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment$UiStepFragmentArgs$a;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment$UiStepFragmentArgs$a;-><init>()V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment$UiStepFragmentArgs;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;)V
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "props"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment$UiStepFragmentArgs;->a:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;

    return-void
.end method


# virtual methods
.method public final a()Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment$UiStepFragmentArgs;->a:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

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

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/uiStep/UiStepFragment$UiStepFragmentArgs;->a:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;

    invoke-virtual {v0, p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
