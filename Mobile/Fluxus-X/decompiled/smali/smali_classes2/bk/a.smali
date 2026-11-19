.class public Lbk/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbk/a$b;,
        Lbk/a$c;
    }
.end annotation


# instance fields
.field public a:Lmw/c;

.field public b:Lbk/b;

.field public c:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Lmw/c;Lbk/b;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbk/a;->a:Lmw/c;

    iput-object p2, p0, Lbk/a;->b:Lbk/b;

    iput-object p3, p0, Lbk/a;->c:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static a()Lbk/a;
    .locals 1

    invoke-static {}, Lbk/a$b;->a()Lbk/a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/String;)V
    .locals 4

    new-instance v0, Lbk/a$c;

    iget-object v1, p0, Lbk/a;->a:Lmw/c;

    iget-object v2, p0, Lbk/a;->b:Lbk/b;

    iget-object v3, p0, Lbk/a;->c:Ljava/util/concurrent/Executor;

    invoke-direct {v0, v1, v2, v3}, Lbk/a$c;-><init>(Lmw/c;Lbk/b;Ljava/util/concurrent/Executor;)V

    iget-object v1, p0, Lbk/a;->c:Ljava/util/concurrent/Executor;

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method
