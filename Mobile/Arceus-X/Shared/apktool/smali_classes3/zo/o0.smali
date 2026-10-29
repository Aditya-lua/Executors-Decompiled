.class public final Lzo/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lku/p0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/i;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;",
            "Lft/i<",
            "Lku/p0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzo/o0;->a:Lft/i;

    iput-object p2, p0, Lzo/o0;->b:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;)Lzo/o0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;",
            "Lft/i<",
            "Lku/p0;",
            ">;)",
            "Lzo/o0;"
        }
    .end annotation

    new-instance v0, Lzo/o0;

    invoke-direct {v0, p0, p1}, Lzo/o0;-><init>(Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lku/p0;)Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;

    invoke-direct {v0, p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;-><init>(Landroid/content/Context;Lku/p0;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;
    .locals 2

    iget-object v0, p0, Lzo/o0;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lzo/o0;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lku/p0;

    invoke-static {v0, v1}, Lzo/o0;->c(Landroid/content/Context;Lku/p0;)Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzo/o0;->b()Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;

    move-result-object v0

    return-object v0
.end method
