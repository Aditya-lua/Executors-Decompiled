.class public final synthetic Lm1/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lm1/i0$e;

.field public final synthetic b:Ly1/c$a;


# direct methods
.method public synthetic constructor <init>(Lm1/i0$e;Ly1/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/s0;->a:Lm1/i0$e;

    iput-object p2, p0, Lm1/s0;->b:Ly1/c$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lm1/s0;->a:Lm1/i0$e;

    iget-object v1, p0, Lm1/s0;->b:Ly1/c$a;

    invoke-static {v0, v1}, Lm1/i0$e;->n(Lm1/i0$e;Ly1/c$a;)V

    return-void
.end method
