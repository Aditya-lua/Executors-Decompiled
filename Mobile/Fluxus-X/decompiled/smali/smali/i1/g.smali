.class public final synthetic Li1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Li1/n;

.field public final synthetic b:Lh1/c;


# direct methods
.method public synthetic constructor <init>(Li1/n;Lh1/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/g;->a:Li1/n;

    iput-object p2, p0, Li1/g;->b:Lh1/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Li1/g;->a:Li1/n;

    iget-object v1, p0, Li1/g;->b:Lh1/c;

    invoke-static {v0, v1}, Li1/n;->d(Li1/n;Lh1/c;)V

    return-void
.end method
