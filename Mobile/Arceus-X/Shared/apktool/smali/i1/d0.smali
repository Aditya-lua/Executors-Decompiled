.class public final synthetic Li1/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Li1/p$a;


# direct methods
.method public synthetic constructor <init>(Li1/p$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/d0;->a:Li1/p$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Li1/d0;->a:Li1/p$a;

    invoke-static {v0}, Li1/e0;->c(Li1/p$a;)V

    return-void
.end method
