.class public interface abstract Ls0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/l3;


# static fields
.field public static final L:Ln0/n1$a;
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

    const-string v0, "camerax.core.io.ioExecutor"

    const-class v1, Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, Ln0/n1$a;->a(Ljava/lang/String;Ljava/lang/Class;)Ln0/n1$a;

    move-result-object v0

    sput-object v0, Ls0/i;->L:Ln0/n1$a;

    return-void
.end method
