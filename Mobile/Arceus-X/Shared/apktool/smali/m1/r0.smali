.class public final synthetic Lm1/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ln0/a3$a;

.field public final synthetic b:Lh1/c$a;


# direct methods
.method public synthetic constructor <init>(Ln0/a3$a;Lh1/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/r0;->a:Ln0/a3$a;

    iput-object p2, p0, Lm1/r0;->b:Lh1/c$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lm1/r0;->a:Ln0/a3$a;

    iget-object v1, p0, Lm1/r0;->b:Lh1/c$a;

    invoke-static {v0, v1}, Lm1/i0$e;->j(Ln0/a3$a;Lh1/c$a;)V

    return-void
.end method
