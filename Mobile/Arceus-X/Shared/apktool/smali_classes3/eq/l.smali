.class public final Leq/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lfq/k2$d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lfq/k2$d;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leq/l;->a:Lft/i;

    return-void
.end method

.method public static a(Lft/i;)Leq/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lfq/k2$d;",
            ">;)",
            "Leq/l;"
        }
    .end annotation

    new-instance v0, Leq/l;

    invoke-direct {v0, p0}, Leq/l;-><init>(Lft/i;)V

    return-object v0
.end method

.method public static c(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lfq/k2$d;)Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b;

    invoke-direct {v0, p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b;-><init>(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lfq/k2$d;)V

    return-object v0
.end method


# virtual methods
.method public b(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b;
    .locals 1

    iget-object v0, p0, Leq/l;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfq/k2$d;

    invoke-static {p1, p2, v0}, Leq/l;->c(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lfq/k2$d;)Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b;

    move-result-object p1

    return-object p1
.end method
