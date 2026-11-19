.class public final Lm9/r1;
.super Lm9/p0;
.source "SourceFile"


# instance fields
.field public final synthetic a:Landroid/app/Dialog;

.field public final synthetic b:Lm9/s1;


# direct methods
.method public constructor <init>(Lm9/s1;Landroid/app/Dialog;)V
    .locals 0

    iput-object p1, p0, Lm9/r1;->b:Lm9/s1;

    iput-object p2, p0, Lm9/r1;->a:Landroid/app/Dialog;

    invoke-direct {p0}, Lm9/p0;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lm9/r1;->b:Lm9/s1;

    iget-object v0, v0, Lm9/s1;->b:Lm9/t1;

    invoke-static {v0}, Lm9/t1;->r(Lm9/t1;)V

    iget-object v0, p0, Lm9/r1;->a:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm9/r1;->a:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    return-void
.end method
