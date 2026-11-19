.class public final enum Ly1/d;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ly1/d;",
        ">;",
        "Ljava/util/concurrent/Executor;"
    }
.end annotation


# static fields
.field public static final enum a:Ly1/d;

.field public static final synthetic b:[Ly1/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ly1/d;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ly1/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ly1/d;->a:Ly1/d;

    filled-new-array {v0}, [Ly1/d;

    move-result-object v0

    sput-object v0, Ly1/d;->b:[Ly1/d;

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

.method public static valueOf(Ljava/lang/String;)Ly1/d;
    .locals 1

    const-class v0, Ly1/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly1/d;

    return-object p0
.end method

.method public static values()[Ly1/d;
    .locals 1

    sget-object v0, Ly1/d;->b:[Ly1/d;

    invoke-virtual {v0}, [Ly1/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly1/d;

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

    const-string v0, "DirectExecutor"

    return-object v0
.end method
