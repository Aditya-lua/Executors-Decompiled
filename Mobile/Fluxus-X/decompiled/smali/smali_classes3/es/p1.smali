.class public final Les/p1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lgs/c;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lmo/a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lwt/i;
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
.method public constructor <init>(Lwt/i;Lwt/i;Lwt/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lgs/c;",
            ">;",
            "Lwt/i<",
            "Lmo/a;",
            ">;",
            "Lwt/i<",
            "Lg/d<",
            "Laq/b;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/p1;->a:Lwt/i;

    iput-object p2, p0, Les/p1;->b:Lwt/i;

    iput-object p3, p0, Les/p1;->c:Lwt/i;

    return-void
.end method

.method public static a(Lwt/i;Lwt/i;Lwt/i;)Les/p1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt/i<",
            "Lgs/c;",
            ">;",
            "Lwt/i<",
            "Lmo/a;",
            ">;",
            "Lwt/i<",
            "Lg/d<",
            "Laq/b;",
            ">;>;)",
            "Les/p1;"
        }
    .end annotation

    new-instance v0, Les/p1;

    invoke-direct {v0, p0, p1, p2}, Les/p1;-><init>(Lwt/i;Lwt/i;Lwt/i;)V

    return-object v0
.end method

.method public static c(Lgs/c;Lmo/a;Lg/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Les/o1;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgs/c;",
            "Lmo/a;",
            "Lg/d<",
            "Laq/b;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Les/o1;"
        }
    .end annotation

    new-instance v0, Les/o1;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Les/o1;-><init>(Lgs/c;Lmo/a;Lg/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Les/o1;
    .locals 8

    iget-object v0, p0, Les/p1;->a:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lgs/c;

    iget-object v0, p0, Les/p1;->b:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lmo/a;

    iget-object v0, p0, Les/p1;->c:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lg/d;

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-static/range {v1 .. v7}, Les/p1;->c(Lgs/c;Lmo/a;Lg/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Les/o1;

    move-result-object p1

    return-object p1
.end method
