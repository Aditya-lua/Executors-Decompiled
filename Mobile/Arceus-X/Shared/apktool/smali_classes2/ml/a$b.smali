.class public final Lml/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lml/a;->a(Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "ml/a$b",
        "Landroid/content/DialogInterface$OnClickListener;",
        "Landroid/content/DialogInterface;",
        "dialog",
        "",
        "which",
        "",
        "onClick",
        "(Landroid/content/DialogInterface;I)V",
        "universalapp_googleProdRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lml/a;


# direct methods
.method public constructor <init>(Lml/a;)V
    .locals 0

    iput-object p1, p0, Lml/a$b;->a:Lml/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    iget-object p1, p0, Lml/a$b;->a:Lml/a;

    invoke-virtual {p1}, Lml/a;->d()Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance p2, Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;

    iget-object v0, p0, Lml/a$b;->a:Lml/a;

    invoke-virtual {v0}, Lml/a;->e()J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-direct {p2, v0, v1, v2}, Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;-><init>(JZ)V

    invoke-virtual {p1, p2}, Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;->onCancelClicked(Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;)V

    :cond_0
    iget-object p1, p0, Lml/a$b;->a:Lml/a;

    invoke-virtual {p1}, Lml/a;->b()V

    return-void
.end method
