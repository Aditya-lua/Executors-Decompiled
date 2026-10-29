.class public final Lyp/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Ljava/util/Set<",
        "Lan/a0<",
        "*>;>;>;"
    }
.end annotation


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/selfie/d;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lzp/p0;",
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
            "Lcom/withpersona/sdk2/inquiry/selfie/d;",
            ">;",
            "Lft/i<",
            "Lzp/p0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyp/b0;->a:Lft/i;

    iput-object p2, p0, Lyp/b0;->b:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;)Lyp/b0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/selfie/d;",
            ">;",
            "Lft/i<",
            "Lzp/p0;",
            ">;)",
            "Lyp/b0;"
        }
    .end annotation

    new-instance v0, Lyp/b0;

    invoke-direct {v0, p0, p1}, Lyp/b0;-><init>(Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Lcom/withpersona/sdk2/inquiry/selfie/d;Lzp/p0;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/selfie/d;",
            "Lzp/p0;",
            ")",
            "Ljava/util/Set<",
            "Lan/a0<",
            "*>;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/j;->a(Lcom/withpersona/sdk2/inquiry/selfie/d;Lzp/p0;)Ljava/util/Set;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Set;

    return-object p0
.end method


# virtual methods
.method public b()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lan/a0<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, Lyp/b0;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/selfie/d;

    iget-object v1, p0, Lyp/b0;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzp/p0;

    invoke-static {v0, v1}, Lyp/b0;->c(Lcom/withpersona/sdk2/inquiry/selfie/d;Lzp/p0;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lyp/b0;->b()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
