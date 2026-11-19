.class public final Llp/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lg/d<",
            "Laq/b;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwt/i;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lg/d<",
            "Laq/b;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llp/d;->a:Lwt/i;

    iput-object p2, p0, Llp/d;->b:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;)Llp/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lg/d<",
            "Laq/b;",
            ">;>;)",
            "Llp/d;"
        }
    .end annotation

    new-instance v0, Llp/d;

    invoke-direct {v0, p0, p1}, Llp/d;-><init>(Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lg/d;Ljava/lang/String;Ljava/lang/String;Llp/a;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;)Llp/c;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lg/d<",
            "Laq/b;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Llp/a;",
            "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;",
            ")",
            "Llp/c;"
        }
    .end annotation

    new-instance v0, Llp/c;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Llp/c;-><init>(Landroid/content/Context;Lg/d;Ljava/lang/String;Ljava/lang/String;Llp/a;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;)V

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/String;Ljava/lang/String;Llp/a;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;)Llp/c;
    .locals 7

    iget-object v0, p0, Llp/d;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    iget-object v0, p0, Llp/d;->b:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lg/d;

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-static/range {v1 .. v6}, Llp/d;->c(Landroid/content/Context;Lg/d;Ljava/lang/String;Ljava/lang/String;Llp/a;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;)Llp/c;

    move-result-object p1

    return-object p1
.end method
