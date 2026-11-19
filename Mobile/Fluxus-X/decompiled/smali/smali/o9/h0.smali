.class public final Lo9/h0;
.super Lo9/i0;
.source "SourceFile"


# instance fields
.field public final synthetic a:Landroid/content/Intent;

.field public final synthetic b:Lm9/j;


# direct methods
.method public constructor <init>(Landroid/content/Intent;Lm9/j;I)V
    .locals 0

    iput-object p1, p0, Lo9/h0;->a:Landroid/content/Intent;

    iput-object p2, p0, Lo9/h0;->b:Lm9/j;

    invoke-direct {p0}, Lo9/i0;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lo9/h0;->a:Landroid/content/Intent;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lo9/h0;->b:Lm9/j;

    const/4 v2, 0x2

    invoke-interface {v1, v0, v2}, Lm9/j;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_0
    return-void
.end method
