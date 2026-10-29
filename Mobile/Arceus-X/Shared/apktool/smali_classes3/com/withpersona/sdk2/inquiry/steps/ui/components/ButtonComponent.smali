.class public interface abstract Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/steps/ui/components/AutoSubmitableComponent;
.implements Lcr/o;
.implements Lcr/x;
.implements Lcr/h2;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004R\u0014\u0010\u0008\u001a\u00020\u00058&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007R\u001c\u0010\u000e\u001a\u00020\t8&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00058&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0007R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013\u0082\u0001\u0008\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u00a8\u0006\u001d\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/AutoSubmitableComponent;",
        "Lcr/o;",
        "Lcr/x;",
        "Lcr/h2;",
        "",
        "getName",
        "()Ljava/lang/String;",
        "name",
        "",
        "Y0",
        "()Z",
        "b",
        "(Z)V",
        "wasTapped",
        "getAutoSubmitCountdownText",
        "autoSubmitCountdownText",
        "",
        "getAutoSubmitIntervalSeconds",
        "()Ljava/lang/Integer;",
        "autoSubmitIntervalSeconds",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ActionButtonComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/CancelButtonComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/CombinedStepButtonComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/CompleteButtonComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/LinkButtonComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SubmitButtonComponent;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;",
        "ui-step-renderer_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract Y0()Z
.end method

.method public abstract b(Z)V
.end method

.method public abstract getAutoSubmitCountdownText()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getAutoSubmitIntervalSeconds()Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getName()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
