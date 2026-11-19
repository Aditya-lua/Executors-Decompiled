.class public Lbk/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbk/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final a:Lbk/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lbk/a;

    invoke-static {}, Lmw/c;->d()Lmw/c;

    move-result-object v1

    new-instance v2, Lbk/b;

    invoke-direct {v2}, Lbk/b;-><init>()V

    sget-object v3, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    invoke-direct {v0, v1, v2, v3}, Lbk/a;-><init>(Lmw/c;Lbk/b;Ljava/util/concurrent/Executor;)V

    sput-object v0, Lbk/a$b;->a:Lbk/a;

    return-void
.end method

.method public static bridge synthetic a()Lbk/a;
    .locals 1

    sget-object v0, Lbk/a$b;->a:Lbk/a;

    return-object v0
.end method
