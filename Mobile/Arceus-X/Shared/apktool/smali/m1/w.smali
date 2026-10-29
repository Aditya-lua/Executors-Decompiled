.class public final synthetic Lm1/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lm1/i0;

.field public final synthetic b:Lm1/j1;


# direct methods
.method public synthetic constructor <init>(Lm1/i0;Lm1/j1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/w;->a:Lm1/i0;

    iput-object p2, p0, Lm1/w;->b:Lm1/j1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lm1/w;->a:Lm1/i0;

    iget-object v1, p0, Lm1/w;->b:Lm1/j1;

    invoke-static {v0, v1}, Lm1/i0;->o(Lm1/i0;Lm1/j1;)V

    return-void
.end method
