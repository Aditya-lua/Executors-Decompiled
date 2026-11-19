.class public final Lvo/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Lvo/j;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lg/d<",
            "[",
            "Ljava/lang/String;",
            ">;>;"
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
            "Ler/c;",
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
            "Lg/d<",
            "[",
            "Ljava/lang/String;",
            ">;>;",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Ler/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo/k;->a:Lwt/i;

    iput-object p2, p0, Lvo/k;->b:Lwt/i;

    iput-object p3, p0, Lvo/k;->c:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;Lwt/i;)Lvo/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lg/d<",
            "[",
            "Ljava/lang/String;",
            ">;>;",
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;",
            "Lwt/i<",
            "Ler/c;",
            ">;)",
            "Lvo/k;"
        }
    .end annotation

    new-instance v0, Lvo/k;

    invoke-direct {v0, p0, p1, p2}, Lvo/k;-><init>(Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Lg/d;Landroid/content/Context;Ler/c;)Lvo/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg/d<",
            "[",
            "Ljava/lang/String;",
            ">;",
            "Landroid/content/Context;",
            "Ler/c;",
            ")",
            "Lvo/j;"
        }
    .end annotation

    new-instance v0, Lvo/j;

    invoke-direct {v0, p0, p1, p2}, Lvo/j;-><init>(Lg/d;Landroid/content/Context;Ler/c;)V

    return-object v0
.end method


# virtual methods
.method public b()Lvo/j;
    .locals 3

    iget-object v0, p0, Lvo/k;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg/d;

    iget-object v1, p0, Lvo/k;->b:Lwt/i;

    invoke-interface {v1}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, Lvo/k;->c:Lwt/i;

    invoke-interface {v2}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ler/c;

    invoke-static {v0, v1, v2}, Lvo/k;->c(Lg/d;Landroid/content/Context;Ler/c;)Lvo/j;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lvo/k;->b()Lvo/j;

    move-result-object v0

    return-object v0
.end method
