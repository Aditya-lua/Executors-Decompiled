.class public final enum Lgb/t1;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# static fields
.field public static final enum a:Lgb/t1;

.field public static final synthetic b:[Lgb/t1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lgb/t1;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lgb/t1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgb/t1;->a:Lgb/t1;

    filled-new-array {v0}, [Lgb/t1;

    move-result-object v0

    sput-object v0, Lgb/t1;->b:[Lgb/t1;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    const-string p1, "INSTANCE"

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[Lgb/t1;
    .locals 1

    sget-object v0, Lgb/t1;->b:[Lgb/t1;

    invoke-virtual {v0}, [Lgb/t1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lgb/t1;

    return-object v0
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "MoreExecutors.directExecutor()"

    return-object v0
.end method
