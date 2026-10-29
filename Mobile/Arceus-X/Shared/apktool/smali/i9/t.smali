.class public final synthetic Li9/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Li9/v;

.field public final synthetic b:Li9/y;


# direct methods
.method public synthetic constructor <init>(Li9/v;Li9/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li9/t;->a:Li9/v;

    iput-object p2, p0, Li9/t;->b:Li9/y;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Li9/t;->a:Li9/v;

    iget-object v1, p0, Li9/t;->b:Li9/y;

    iget v1, v1, Li9/y;->a:I

    invoke-virtual {v0, v1}, Li9/v;->e(I)V

    return-void
.end method
