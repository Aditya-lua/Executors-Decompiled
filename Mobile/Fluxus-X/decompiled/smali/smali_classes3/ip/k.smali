.class public final Lip/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lip/j;",
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
            "Lsn/a0$a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lun/c$a;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lir/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lsn/a0$a;",
            ">;",
            "Lwt/i<",
            "Lun/c$a;",
            ">;",
            "Lwt/i<",
            "Lir/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lip/k;->a:Lwt/i;

    iput-object p2, p0, Lip/k;->b:Lwt/i;

    iput-object p3, p0, Lip/k;->c:Lwt/i;

    iput-object p4, p0, Lip/k;->d:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;Lwt/i;Lwt/i;)Lip/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Lsn/a0$a;",
            ">;",
            "Lwt/i<",
            "Lun/c$a;",
            ">;",
            "Lwt/i<",
            "Lir/b;",
            ">;)",
            "Lip/k;"
        }
    .end annotation

    new-instance v0, Lip/k;

    invoke-direct {v0, p0, p1, p2, p3}, Lip/k;-><init>(Lwt/i;Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lsn/a0$a;Lun/c$a;Lir/b;)Lip/j;
    .locals 1

    new-instance v0, Lip/j;

    invoke-direct {v0, p0, p1, p2, p3}, Lip/j;-><init>(Landroid/content/Context;Lsn/a0$a;Lun/c$a;Lir/b;)V

    return-object v0
.end method


# virtual methods
.method public b()Lip/j;
    .locals 4

    iget-object v0, p0, Lip/k;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lip/k;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsn/a0$a;

    iget-object v2, p0, Lip/k;->c:Lwt/i;

    invoke-interface {v2}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lun/c$a;

    iget-object v3, p0, Lip/k;->d:Lwt/i;

    invoke-interface {v3}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lir/b;

    invoke-static {v0, v1, v2, v3}, Lip/k;->c(Landroid/content/Context;Lsn/a0$a;Lun/c$a;Lir/b;)Lip/j;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lip/k;->b()Lip/j;

    move-result-object v0

    return-object v0
.end method
