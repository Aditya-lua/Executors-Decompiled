.class public final Lcom/withpersona/sdk2/inquiry/integration/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;",
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
            "Luq/a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/integration/a$a;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/i;Lft/i;Lft/i;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;",
            "Lft/i<",
            "Luq/a;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/integration/a$a;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/integration/c;->a:Lft/i;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/integration/c;->b:Lft/i;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/integration/c;->c:Lft/i;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/integration/c;->d:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;Lft/i;Lft/i;)Lcom/withpersona/sdk2/inquiry/integration/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;",
            "Lft/i<",
            "Luq/a;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/integration/a$a;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ">;)",
            "Lcom/withpersona/sdk2/inquiry/integration/c;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/integration/c;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/integration/c;-><init>(Lft/i;Lft/i;Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Luq/a;Lcom/withpersona/sdk2/inquiry/integration/a$a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;-><init>(Landroid/content/Context;Luq/a;Lcom/withpersona/sdk2/inquiry/integration/a$a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;
    .locals 4

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/integration/c;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/integration/c;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Luq/a;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/integration/c;->c:Lft/i;

    invoke-interface {v2}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/integration/a$a;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/integration/c;->d:Lft/i;

    invoke-interface {v3}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    invoke-static {v0, v1, v2, v3}, Lcom/withpersona/sdk2/inquiry/integration/c;->c(Landroid/content/Context;Luq/a;Lcom/withpersona/sdk2/inquiry/integration/a$a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/integration/c;->b()Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow;

    move-result-object v0

    return-object v0
.end method
