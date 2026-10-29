.class public abstract Lcom/withpersona/sdk2/inquiry/ui/UiState;
.super Lcom/withpersona/sdk2/inquiry/workflows/SimpleWorkflowState;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;,
        Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u0082\u0001\u0001\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/ui/UiState;",
        "Lcom/withpersona/sdk2/inquiry/workflows/SimpleWorkflowState;",
        "Landroid/os/Parcelable;",
        "<init>",
        "()V",
        "Displaying",
        "PendingAction",
        "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/workflows/SimpleWorkflowState;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/ui/UiState;-><init>()V

    return-void
.end method
