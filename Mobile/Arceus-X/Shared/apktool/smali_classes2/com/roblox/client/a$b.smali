.class public Lcom/roblox/client/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/a;->e2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/client/a;


# direct methods
.method public constructor <init>(Lcom/roblox/client/a;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/a$b;->a:Lcom/roblox/client/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object p1, p0, Lcom/roblox/client/a$b;->a:Lcom/roblox/client/a;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/roblox/client/a;->M1(Lcom/roblox/client/a;Landroidx/appcompat/app/a;)V

    return-void
.end method
