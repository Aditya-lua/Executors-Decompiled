.class public final Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$a;",
        "",
        "<init>",
        "()V",
        "",
        "inquiryId",
        "sessionToken",
        "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;",
        "inquiryWorkflowProps",
        "Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;",
        "a",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;)Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;",
        "inquiry-internal_release"
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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;)Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "inquiryWorkflowProps"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;-><init>()V

    new-instance v1, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$WorkflowFragmentArgs;

    invoke-direct {v1, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment$WorkflowFragmentArgs;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;)V

    invoke-static {v0, v1}, Lkq/b;->a(Lkq/a;Landroid/os/Parcelable;)Lkq/a;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;

    return-object p1
.end method
