.class public final Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljo/c0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment;->S2(Lcom/withpersona/sdk2/inquiry/governmentid/Screen;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "com/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$j",
        "Ljo/c0$a;",
        "Landroid/content/Context;",
        "context",
        "Landroid/view/ViewGroup;",
        "container",
        "Ljo/c0;",
        "a",
        "(Landroid/content/Context;Landroid/view/ViewGroup;)Ljo/c0;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/view/ViewGroup;)Ljo/c0;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljo/y;

    invoke-direct {v0, p1, p2}, Ljo/y;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;)V

    return-object v0
.end method
