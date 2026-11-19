.class public final synthetic Li1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Li1/n$c;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Li1/n$c;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/j;->a:Li1/n$c;

    iput-boolean p2, p0, Li1/j;->b:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Li1/j;->a:Li1/n$c;

    iget-boolean v1, p0, Li1/j;->b:Z

    invoke-static {v0, v1}, Li1/n;->h(Li1/n$c;Z)V

    return-void
.end method
