.class public final Lsq/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Landroidx/lifecycle/l0;",
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
            "Landroidx/lifecycle/l0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsq/a;->a:Lft/i;

    return-void
.end method

.method public static a(Lft/i;)Lsq/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Landroidx/lifecycle/l0;",
            ">;)",
            "Lsq/a;"
        }
    .end annotation

    new-instance v0, Lsq/a;

    invoke-direct {v0, p0}, Lsq/a;-><init>(Lft/i;)V

    return-object v0
.end method

.method public static c(Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;-><init>(Landroidx/lifecycle/l0;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;
    .locals 1

    iget-object v0, p0, Lsq/a;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/l0;

    invoke-static {v0}, Lsq/a;->c(Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lsq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;

    move-result-object v0

    return-object v0
.end method
