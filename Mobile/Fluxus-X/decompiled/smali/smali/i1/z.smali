.class public final synthetic Li1/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Li1/c0;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Li1/c0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/z;->a:Li1/c0;

    iput p2, p0, Li1/z;->b:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Li1/z;->a:Li1/c0;

    iget v1, p0, Li1/z;->b:I

    invoke-static {v0, v1}, Li1/c0;->f(Li1/c0;I)V

    return-void
.end method
