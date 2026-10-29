.class public Lxi/f$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxi/f$a;->onMenuItemActionExpand(Landroid/view/MenuItem;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lxi/f$a;


# direct methods
.method public constructor <init>(Lxi/f$a;)V
    .locals 0

    iput-object p1, p0, Lxi/f$a$a;->a:Lxi/f$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lxi/f$a$a;->a:Lxi/f$a;

    iget-object v0, v0, Lxi/f$a;->b:Lxi/f;

    invoke-static {v0}, Lxi/f;->d(Lxi/f;)Lcom/roblox/client/components/RobloxToolbar;

    move-result-object v0

    iget-object v1, p0, Lxi/f$a$a;->a:Lxi/f$a;

    iget-object v1, v1, Lxi/f$a;->b:Lxi/f;

    invoke-static {v1}, Lxi/f;->f(Lxi/f;)I

    move-result v1

    invoke-static {v0, v1}, Leh/h;->c(Landroidx/appcompat/widget/Toolbar;I)V

    return-void
.end method
