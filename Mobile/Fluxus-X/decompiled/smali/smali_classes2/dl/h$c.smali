.class public Ldl/h$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldl/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field public static final a:Ldl/h;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ldl/h;

    new-instance v1, Lcl/e;

    new-instance v2, Ldl/d;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v3

    const/16 v4, 0xc8

    invoke-direct {v2, v3, v4}, Ldl/d;-><init>(Ljava/util/concurrent/Executor;I)V

    new-instance v3, Lcl/e$a;

    invoke-direct {v3}, Lcl/e$a;-><init>()V

    invoke-direct {v1, v2, v3}, Lcl/e;-><init>(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V

    invoke-direct {v0, v1}, Ldl/h;-><init>(Lcl/c;)V

    sput-object v0, Ldl/h$c;->a:Ldl/h;

    return-void
.end method

.method public static bridge synthetic a()Ldl/h;
    .locals 1

    sget-object v0, Ldl/h$c;->a:Ldl/h;

    return-object v0
.end method
