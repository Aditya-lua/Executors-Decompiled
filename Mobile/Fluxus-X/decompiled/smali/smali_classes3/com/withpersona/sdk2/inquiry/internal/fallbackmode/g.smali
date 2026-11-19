.class public final Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lhn/w;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwt/i;Lwt/i;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lhn/w;",
            ">;",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/g;->a:Lwt/i;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/g;->b:Lwt/i;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/g;->c:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;Lwt/i;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lhn/w;",
            ">;",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;",
            ">;)",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/g;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/g;

    invoke-direct {v0, p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/g;-><init>(Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Lhn/w;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;I)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f;-><init>(Lhn/w;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;I)V

    return-object v0
.end method


# virtual methods
.method public b(I)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f;
    .locals 3

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/g;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhn/w;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/g;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/g;->c:Lwt/i;

    invoke-interface {v2}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;

    invoke-static {v0, v1, v2, p1}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/g;->c(Lhn/w;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;I)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f;

    move-result-object p1

    return-object p1
.end method
