.class public final synthetic Lm1/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lm1/l$c$a;

.field public final synthetic b:Landroid/view/Surface;


# direct methods
.method public synthetic constructor <init>(Lm1/l$c$a;Landroid/view/Surface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/e1;->a:Lm1/l$c$a;

    iput-object p2, p0, Lm1/e1;->b:Landroid/view/Surface;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lm1/e1;->a:Lm1/l$c$a;

    iget-object v1, p0, Lm1/e1;->b:Landroid/view/Surface;

    invoke-static {v0, v1}, Lm1/i0$h;->b(Lm1/l$c$a;Landroid/view/Surface;)V

    return-void
.end method
