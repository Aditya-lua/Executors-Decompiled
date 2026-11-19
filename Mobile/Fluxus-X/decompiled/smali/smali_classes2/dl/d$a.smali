.class public Ldl/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldl/d;->execute(Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/Runnable;

.field public final synthetic b:Ldl/d;


# direct methods
.method public constructor <init>(Ldl/d;Ljava/lang/Runnable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Ldl/d$a;->b:Ldl/d;

    iput-object p2, p0, Ldl/d$a;->a:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Ldl/d$a;->a:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Ldl/d$a;->b:Ldl/d;

    invoke-static {v0}, Ldl/d;->b(Ldl/d;)V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Ldl/d$a;->b:Ldl/d;

    invoke-static {v1}, Ldl/d;->b(Ldl/d;)V

    throw v0
.end method
