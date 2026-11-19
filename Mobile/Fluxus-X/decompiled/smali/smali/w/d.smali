.class public final Lw/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw/d$d;,
        Lw/d$c;,
        Lw/d$b;,
        Lw/d$a;,
        Lw/d$e;
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Intent;

.field public final b:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Landroid/content/Intent;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw/d;->a:Landroid/content/Intent;

    iput-object p2, p0, Lw/d;->b:Landroid/os/Bundle;

    return-void
.end method

.method public static a(Landroid/content/Intent;)Z
    .locals 2

    const-string v0, "androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method


# virtual methods
.method public b(Landroid/content/Context;Landroid/net/Uri;)V
    .locals 1

    iget-object v0, p0, Lw/d;->a:Landroid/content/Intent;

    invoke-virtual {v0, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    iget-object p2, p0, Lw/d;->a:Landroid/content/Intent;

    iget-object v0, p0, Lw/d;->b:Landroid/os/Bundle;

    invoke-static {p1, p2, v0}, Ll2/b;->p(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V

    return-void
.end method
