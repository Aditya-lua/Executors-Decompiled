.class public Lfj/f$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfj/f$a;->onMenuItemActionExpand(Landroid/view/MenuItem;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lfj/f$a;


# direct methods
.method public constructor <init>(Lfj/f$a;)V
    .locals 0

    iput-object p1, p0, Lfj/f$a$a;->a:Lfj/f$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lfj/f$a$a;->a:Lfj/f$a;

    iget-object v0, v0, Lfj/f$a;->b:Lfj/f;

    invoke-static {v0}, Lfj/f;->d(Lfj/f;)Lcom/roblox/client/components/RobloxToolbar;

    move-result-object v0

    iget-object v1, p0, Lfj/f$a$a;->a:Lfj/f$a;

    iget-object v1, v1, Lfj/f$a;->b:Lfj/f;

    invoke-static {v1}, Lfj/f;->f(Lfj/f;)I

    move-result v1

    invoke-static {v0, v1}, Lnh/h;->b(Landroidx/appcompat/widget/Toolbar;I)V

    return-void
.end method
