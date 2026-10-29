.class public final enum Lne/l;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lne/l;",
        ">;",
        "Ljava/util/concurrent/Executor;"
    }
.end annotation


# static fields
.field public static final enum a:Lne/l;

.field public static final synthetic b:[Lne/l;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lne/l;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lne/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lne/l;->a:Lne/l;

    invoke-static {}, Lne/l;->b()[Lne/l;

    move-result-object v0

    sput-object v0, Lne/l;->b:[Lne/l;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic b()[Lne/l;
    .locals 1

    sget-object v0, Lne/l;->a:Lne/l;

    filled-new-array {v0}, [Lne/l;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lne/l;
    .locals 1

    const-class v0, Lne/l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lne/l;

    return-object p0
.end method

.method public static values()[Lne/l;
    .locals 1

    sget-object v0, Lne/l;->b:[Lne/l;

    invoke-virtual {v0}, [Lne/l;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lne/l;

    return-object v0
.end method


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "MoreExecutors.directExecutor()"

    return-object v0
.end method
