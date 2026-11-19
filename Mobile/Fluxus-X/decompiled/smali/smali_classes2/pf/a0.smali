.class public final enum Lpf/a0;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lpf/a0;",
        ">;",
        "Ljava/util/concurrent/Executor;"
    }
.end annotation


# static fields
.field public static final enum a:Lpf/a0;

.field public static final b:Landroid/os/Handler;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ThreadPoolCreation"
        }
    .end annotation
.end field

.field public static final synthetic c:[Lpf/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lpf/a0;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lpf/a0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpf/a0;->a:Lpf/a0;

    invoke-static {}, Lpf/a0;->b()[Lpf/a0;

    move-result-object v0

    sput-object v0, Lpf/a0;->c:[Lpf/a0;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lpf/a0;->b:Landroid/os/Handler;

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

.method public static synthetic b()[Lpf/a0;
    .locals 1

    sget-object v0, Lpf/a0;->a:Lpf/a0;

    filled-new-array {v0}, [Lpf/a0;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lpf/a0;
    .locals 1

    const-class v0, Lpf/a0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lpf/a0;

    return-object p0
.end method

.method public static values()[Lpf/a0;
    .locals 1

    sget-object v0, Lpf/a0;->c:[Lpf/a0;

    invoke-virtual {v0}, [Lpf/a0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lpf/a0;

    return-object v0
.end method


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, Lpf/a0;->b:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
