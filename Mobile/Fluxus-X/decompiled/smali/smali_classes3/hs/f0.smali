.class public final Lhs/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lhs/e0;",
        ">;"
    }
.end annotation


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
            "Lcom/withpersona/sdk2/inquiry/ui/network/b$a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lgs/a$a;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lnr/b$a;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Les/k4$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/ui/network/b$a;",
            ">;",
            "Lwt/i<",
            "Lgs/a$a;",
            ">;",
            "Lwt/i<",
            "Lnr/b$a;",
            ">;",
            "Lwt/i<",
            "Les/k4$a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhs/f0;->a:Lwt/i;

    iput-object p2, p0, Lhs/f0;->b:Lwt/i;

    iput-object p3, p0, Lhs/f0;->c:Lwt/i;

    iput-object p4, p0, Lhs/f0;->d:Lwt/i;

    iput-object p5, p0, Lhs/f0;->e:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)Lhs/f0;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/ui/network/b$a;",
            ">;",
            "Lwt/i<",
            "Lgs/a$a;",
            ">;",
            "Lwt/i<",
            "Lnr/b$a;",
            ">;",
            "Lwt/i<",
            "Les/k4$a;",
            ">;)",
            "Lhs/f0;"
        }
    .end annotation

    new-instance v0, Lhs/f0;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lhs/f0;-><init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/ui/network/b$a;Lgs/a$a;Lnr/b$a;Les/k4$a;)Lhs/e0;
    .locals 6

    new-instance v0, Lhs/e0;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lhs/e0;-><init>(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/ui/network/b$a;Lgs/a$a;Lnr/b$a;Les/k4$a;)V

    return-object v0
.end method


# virtual methods
.method public b()Lhs/e0;
    .locals 5

    iget-object v0, p0, Lhs/f0;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lhs/f0;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/ui/network/b$a;

    iget-object v2, p0, Lhs/f0;->c:Lwt/i;

    invoke-interface {v2}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lgs/a$a;

    iget-object v3, p0, Lhs/f0;->d:Lwt/i;

    invoke-interface {v3}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lnr/b$a;

    iget-object v4, p0, Lhs/f0;->e:Lwt/i;

    invoke-interface {v4}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Les/k4$a;

    invoke-static {v0, v1, v2, v3, v4}, Lhs/f0;->c(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/ui/network/b$a;Lgs/a$a;Lnr/b$a;Les/k4$a;)Lhs/e0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lhs/f0;->b()Lhs/e0;

    move-result-object v0

    return-object v0
.end method
