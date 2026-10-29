.class public final Lcom/withpersona/sdk2/inquiry/document/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lcom/withpersona/sdk2/inquiry/document/i$b;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lg/c<",
            "[",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lg/c<",
            "Lg/h;",
            ">;>;"
        }
    .end annotation
.end field

.field public final c:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lqq/c;",
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
            "Lg/c<",
            "[",
            "Ljava/lang/String;",
            ">;>;",
            "Lft/i<",
            "Lg/c<",
            "Lg/h;",
            ">;>;",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;",
            "Lft/i<",
            "Lqq/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/j;->a:Lft/i;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/document/j;->b:Lft/i;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/document/j;->c:Lft/i;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/document/j;->d:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;Lft/i;Lft/i;)Lcom/withpersona/sdk2/inquiry/document/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lg/c<",
            "[",
            "Ljava/lang/String;",
            ">;>;",
            "Lft/i<",
            "Lg/c<",
            "Lg/h;",
            ">;>;",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;",
            "Lft/i<",
            "Lqq/c;",
            ">;)",
            "Lcom/withpersona/sdk2/inquiry/document/j;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/j;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/document/j;-><init>(Lft/i;Lft/i;Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Lg/c;Lg/c;Landroid/content/Context;Lqq/c;)Lcom/withpersona/sdk2/inquiry/document/i$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg/c<",
            "[",
            "Ljava/lang/String;",
            ">;",
            "Lg/c<",
            "Lg/h;",
            ">;",
            "Landroid/content/Context;",
            "Lqq/c;",
            ")",
            "Lcom/withpersona/sdk2/inquiry/document/i$b;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/i$b;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/document/i$b;-><init>(Lg/c;Lg/c;Landroid/content/Context;Lqq/c;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/document/i$b;
    .locals 4

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/j;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg/c;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/document/j;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg/c;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/j;->c:Lft/i;

    invoke-interface {v2}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/document/j;->d:Lft/i;

    invoke-interface {v3}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqq/c;

    invoke-static {v0, v1, v2, v3}, Lcom/withpersona/sdk2/inquiry/document/j;->c(Lg/c;Lg/c;Landroid/content/Context;Lqq/c;)Lcom/withpersona/sdk2/inquiry/document/i$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/document/j;->b()Lcom/withpersona/sdk2/inquiry/document/i$b;

    move-result-object v0

    return-object v0
.end method
