.class public final Loo/b;
.super Ljava/lang/Object;
.source "SourceFile"


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
            "Lfn/x;",
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
            "Lfn/x;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loo/b;->a:Lft/i;

    iput-object p2, p0, Loo/b;->b:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;)Loo/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;",
            "Lft/i<",
            "Lfn/x;",
            ">;)",
            "Loo/b;"
        }
    .end annotation

    new-instance v0, Loo/b;

    invoke-direct {v0, p0, p1}, Loo/b;-><init>(Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lfn/x;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Loo/a;
    .locals 1

    new-instance v0, Loo/a;

    invoke-direct {v0, p0, p1, p2}, Loo/a;-><init>(Landroid/content/Context;Lfn/x;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)V

    return-object v0
.end method


# virtual methods
.method public b(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Loo/a;
    .locals 2

    iget-object v0, p0, Loo/b;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Loo/b;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfn/x;

    invoke-static {v0, v1, p1}, Loo/b;->c(Landroid/content/Context;Lfn/x;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Loo/a;

    move-result-object p1

    return-object p1
.end method
