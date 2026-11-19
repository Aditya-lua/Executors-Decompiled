.class public final synthetic Li1/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Li1/p$a;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Li1/p$a;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/r;->a:Li1/p$a;

    iput-boolean p2, p0, Li1/r;->b:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Li1/r;->a:Li1/p$a;

    iget-boolean v1, p0, Li1/r;->b:Z

    invoke-static {v0, v1}, Li1/s;->c(Li1/p$a;Z)V

    return-void
.end method
