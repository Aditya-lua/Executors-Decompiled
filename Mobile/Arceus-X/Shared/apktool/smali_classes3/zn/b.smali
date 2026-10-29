.class public final Lzn/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lcom/withpersona/sdk2/inquiry/document/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lg/c<",
            "Landroid/net/Uri;",
            ">;>;"
        }
    .end annotation
.end field

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lqq/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/i;Lft/i;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lg/c<",
            "Landroid/net/Uri;",
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

    iput-object p1, p0, Lzn/b;->a:Lft/i;

    iput-object p2, p0, Lzn/b;->b:Lft/i;

    iput-object p3, p0, Lzn/b;->c:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;Lft/i;)Lzn/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lg/c<",
            "Landroid/net/Uri;",
            ">;>;",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;",
            "Lft/i<",
            "Lqq/c;",
            ">;)",
            "Lzn/b;"
        }
    .end annotation

    new-instance v0, Lzn/b;

    invoke-direct {v0, p0, p1, p2}, Lzn/b;-><init>(Lft/i;Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Lg/c;Landroid/content/Context;Lqq/c;)Lcom/withpersona/sdk2/inquiry/document/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg/c<",
            "Landroid/net/Uri;",
            ">;",
            "Landroid/content/Context;",
            "Lqq/c;",
            ")",
            "Lcom/withpersona/sdk2/inquiry/document/a;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/a;

    invoke-direct {v0, p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/a;-><init>(Lg/c;Landroid/content/Context;Lqq/c;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/document/a;
    .locals 3

    iget-object v0, p0, Lzn/b;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg/c;

    iget-object v1, p0, Lzn/b;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, Lzn/b;->c:Lft/i;

    invoke-interface {v2}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqq/c;

    invoke-static {v0, v1, v2}, Lzn/b;->c(Lg/c;Landroid/content/Context;Lqq/c;)Lcom/withpersona/sdk2/inquiry/document/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzn/b;->b()Lcom/withpersona/sdk2/inquiry/document/a;

    move-result-object v0

    return-object v0
.end method
