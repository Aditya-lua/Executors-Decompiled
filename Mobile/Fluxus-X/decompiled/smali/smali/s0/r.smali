.class public interface abstract Ls0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/l3;


# static fields
.field public static final O:Ln0/n1$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/n1$a<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "camerax.core.thread.backgroundExecutor"

    const-class v1, Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ls0/r;->O:Ln0/n1$a;

    return-void
.end method


# virtual methods
.method public e0(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;
    .locals 1

    sget-object v0, Ls0/r;->O:Ln0/n1$a;

    invoke-interface {p0, v0, p1}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/Executor;

    return-object p1
.end method
