.class public final Ldp/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Ldp/i;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/FallbackMode;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Ldp/a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lzo/h;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lum/w;",
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
            "Lcom/withpersona/sdk2/inquiry/FallbackMode;",
            ">;",
            "Lft/i<",
            "Ldp/a;",
            ">;",
            "Lft/i<",
            "Lzo/h;",
            ">;",
            "Lft/i<",
            "Lum/w;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldp/j;->a:Lft/i;

    iput-object p2, p0, Ldp/j;->b:Lft/i;

    iput-object p3, p0, Ldp/j;->c:Lft/i;

    iput-object p4, p0, Ldp/j;->d:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;Lft/i;Lft/i;)Ldp/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/FallbackMode;",
            ">;",
            "Lft/i<",
            "Ldp/a;",
            ">;",
            "Lft/i<",
            "Lzo/h;",
            ">;",
            "Lft/i<",
            "Lum/w;",
            ">;)",
            "Ldp/j;"
        }
    .end annotation

    new-instance v0, Ldp/j;

    invoke-direct {v0, p0, p1, p2, p3}, Ldp/j;-><init>(Lft/i;Lft/i;Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Lcom/withpersona/sdk2/inquiry/FallbackMode;Ldp/a;Lzo/h;Lum/w;)Ldp/i;
    .locals 1

    new-instance v0, Ldp/i;

    invoke-direct {v0, p0, p1, p2, p3}, Ldp/i;-><init>(Lcom/withpersona/sdk2/inquiry/FallbackMode;Ldp/a;Lzo/h;Lum/w;)V

    return-object v0
.end method


# virtual methods
.method public b()Ldp/i;
    .locals 4

    iget-object v0, p0, Ldp/j;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/FallbackMode;

    iget-object v1, p0, Ldp/j;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldp/a;

    iget-object v2, p0, Ldp/j;->c:Lft/i;

    invoke-interface {v2}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzo/h;

    iget-object v3, p0, Ldp/j;->d:Lft/i;

    invoke-interface {v3}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lum/w;

    invoke-static {v0, v1, v2, v3}, Ldp/j;->c(Lcom/withpersona/sdk2/inquiry/FallbackMode;Ldp/a;Lzo/h;Lum/w;)Ldp/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ldp/j;->b()Ldp/i;

    move-result-object v0

    return-object v0
.end method
