.class public final synthetic Li1/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Li1/n;

.field public final synthetic b:Li1/n$c;


# direct methods
.method public synthetic constructor <init>(Li1/n;Li1/n$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/m;->a:Li1/n;

    iput-object p2, p0, Li1/m;->b:Li1/n$c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Li1/m;->a:Li1/n;

    iget-object v1, p0, Li1/m;->b:Li1/n$c;

    invoke-static {v0, v1}, Li1/n;->i(Li1/n;Li1/n$c;)V

    return-void
.end method
