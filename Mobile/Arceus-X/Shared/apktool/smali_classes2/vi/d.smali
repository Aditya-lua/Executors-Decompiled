.class public Lvi/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroid/content/Intent;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lvi/d;->a:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 0

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c(Landroid/content/Context;)V
    .locals 0

    return-void
.end method

.method public d(Landroid/content/Context;)V
    .locals 0

    return-void
.end method

.method public e(Landroid/content/Context;J)V
    .locals 0

    return-void
.end method

.method public f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZ)V
    .locals 0

    return-void
.end method

.method public g(Landroid/content/Context;)V
    .locals 0

    return-void
.end method

.method public h(Landroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lvi/d;->a:Landroid/content/Intent;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    iput-object p1, p0, Lvi/d;->a:Landroid/content/Intent;

    return-void
.end method

.method public i(Ljava/lang/String;)V
    .locals 0

    return-void
.end method
