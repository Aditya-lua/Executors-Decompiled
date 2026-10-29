.class public final synthetic Li9/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# static fields
.field public static final synthetic a:Li9/k;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Li9/k;

    invoke-direct {v0}, Li9/k;-><init>()V

    sput-object v0, Li9/k;->a:Li9/k;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method
