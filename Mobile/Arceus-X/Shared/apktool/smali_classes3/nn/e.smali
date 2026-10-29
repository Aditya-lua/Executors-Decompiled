.class public Lnn/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lqn/b0;

.field public final b:Lsn/h;

.field public final c:Lqn/b0;

.field public final d:Lsn/h;

.field public final e:Lsn/h;

.field public final f:Lnn/e;

.field public final g:Lnn/g;

.field public h:Z

.field public i:Z


# direct methods
.method public constructor <init>(Lqn/b0;Lsn/h;Lqn/b0;Lsn/h;Lsn/h;Lnn/e;Lnn/g;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnn/e;->h:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnn/e;->i:Z

    iput-object p1, p0, Lnn/e;->a:Lqn/b0;

    iput-object p2, p0, Lnn/e;->b:Lsn/h;

    iput-object p3, p0, Lnn/e;->c:Lqn/b0;

    iput-object p4, p0, Lnn/e;->d:Lsn/h;

    iput-object p5, p0, Lnn/e;->e:Lsn/h;

    iput-object p6, p0, Lnn/e;->f:Lnn/e;

    iput-object p7, p0, Lnn/e;->g:Lnn/g;

    return-void
.end method

.method public static a(Lqn/b0;Lsn/h;Lsn/h;Lnn/e;Lnn/g;)Lnn/e;
    .locals 8

    new-instance v0, Lnn/e;

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-direct/range {v0 .. v7}, Lnn/e;-><init>(Lqn/b0;Lsn/h;Lqn/b0;Lsn/h;Lsn/h;Lnn/e;Lnn/g;)V

    return-object v0
.end method

.method public static b(Lqn/b0;Lsn/h;Lqn/b0;Lsn/h;Lsn/h;Lnn/e;Lnn/g;)Lnn/e;
    .locals 8

    new-instance v0, Lnn/e;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lnn/e;-><init>(Lqn/b0;Lsn/h;Lqn/b0;Lsn/h;Lsn/h;Lnn/e;Lnn/g;)V

    return-object v0
.end method
