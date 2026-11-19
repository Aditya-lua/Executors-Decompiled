.class public final synthetic Lm9/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lm9/k;

.field public final synthetic b:Lm9/k$b;


# direct methods
.method public synthetic constructor <init>(Lm9/k;Lm9/k$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm9/s0;->a:Lm9/k;

    iput-object p2, p0, Lm9/s0;->b:Lm9/k$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lm9/s0;->a:Lm9/k;

    iget-object v1, p0, Lm9/s0;->b:Lm9/k$b;

    invoke-virtual {v0, v1}, Lm9/k;->d(Lm9/k$b;)V

    return-void
.end method
