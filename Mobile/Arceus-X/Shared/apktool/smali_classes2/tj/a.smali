.class public Ltj/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltj/a$b;,
        Ltj/a$c;
    }
.end annotation


# instance fields
.field public a:Lfv/c;

.field public b:Ltj/b;

.field public c:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Lfv/c;Ltj/b;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltj/a;->a:Lfv/c;

    iput-object p2, p0, Ltj/a;->b:Ltj/b;

    iput-object p3, p0, Ltj/a;->c:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static a()Ltj/a;
    .locals 1

    invoke-static {}, Ltj/a$b;->a()Ltj/a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/String;)V
    .locals 4

    new-instance v0, Ltj/a$c;

    iget-object v1, p0, Ltj/a;->a:Lfv/c;

    iget-object v2, p0, Ltj/a;->b:Ltj/b;

    iget-object v3, p0, Ltj/a;->c:Ljava/util/concurrent/Executor;

    invoke-direct {v0, v1, v2, v3}, Ltj/a$c;-><init>(Lfv/c;Ltj/b;Ljava/util/concurrent/Executor;)V

    iget-object v1, p0, Ltj/a;->c:Ljava/util/concurrent/Executor;

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method
