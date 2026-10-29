.class public Ltj/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final a:Ltj/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ltj/a;

    invoke-static {}, Lfv/c;->d()Lfv/c;

    move-result-object v1

    new-instance v2, Ltj/b;

    invoke-direct {v2}, Ltj/b;-><init>()V

    sget-object v3, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    invoke-direct {v0, v1, v2, v3}, Ltj/a;-><init>(Lfv/c;Ltj/b;Ljava/util/concurrent/Executor;)V

    sput-object v0, Ltj/a$b;->a:Ltj/a;

    return-void
.end method

.method public static bridge synthetic a()Ltj/a;
    .locals 1

    sget-object v0, Ltj/a$b;->a:Ltj/a;

    return-object v0
.end method
