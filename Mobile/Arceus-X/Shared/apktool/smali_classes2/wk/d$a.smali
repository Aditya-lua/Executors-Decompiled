.class public Lwk/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwk/d;->execute(Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/Runnable;

.field public final synthetic b:Lwk/d;


# direct methods
.method public constructor <init>(Lwk/d;Ljava/lang/Runnable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lwk/d$a;->b:Lwk/d;

    iput-object p2, p0, Lwk/d$a;->a:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lwk/d$a;->a:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lwk/d$a;->b:Lwk/d;

    invoke-static {v0}, Lwk/d;->b(Lwk/d;)V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lwk/d$a;->b:Lwk/d;

    invoke-static {v1}, Lwk/d;->b(Lwk/d;)V

    throw v0
.end method
