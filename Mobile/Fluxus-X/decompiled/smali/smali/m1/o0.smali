.class public final synthetic Lm1/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lm1/i0$e;

.field public final synthetic b:Ln0/a3$a;


# direct methods
.method public synthetic constructor <init>(Lm1/i0$e;Ln0/a3$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/o0;->a:Lm1/i0$e;

    iput-object p2, p0, Lm1/o0;->b:Ln0/a3$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lm1/o0;->a:Lm1/i0$e;

    iget-object v1, p0, Lm1/o0;->b:Ln0/a3$a;

    invoke-static {v0, v1}, Lm1/i0$e;->k(Lm1/i0$e;Ln0/a3$a;)V

    return-void
.end method
