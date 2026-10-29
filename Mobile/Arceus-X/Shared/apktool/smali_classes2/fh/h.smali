.class public final Lfh/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00000\u0000*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Landroidx/appcompat/app/a;",
        "",
        "d",
        "(Landroidx/appcompat/app/a;)V",
        "Landroid/content/Context;",
        "kotlin.jvm.PlatformType",
        "e",
        "(Landroid/content/Context;)Landroidx/appcompat/app/a;",
        "NativeShell_googleProdRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lfh/h;->f(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic b(Landroidx/appcompat/app/a;)V
    .locals 0

    invoke-static {p0}, Lfh/h;->d(Landroidx/appcompat/app/a;)V

    return-void
.end method

.method public static final synthetic c(Landroid/content/Context;)Landroidx/appcompat/app/a;
    .locals 0

    invoke-static {p0}, Lfh/h;->e(Landroid/content/Context;)Landroidx/appcompat/app/a;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/appcompat/app/a;)V
    .locals 1

    invoke-virtual {p0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lj/l;->dismiss()V

    :cond_0
    return-void
.end method

.method public static final e(Landroid/content/Context;)Landroidx/appcompat/app/a;
    .locals 1

    new-instance v0, Landroidx/appcompat/app/a$a;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/a$a;-><init>(Landroid/content/Context;)V

    const/4 p0, 0x0

    invoke-virtual {v0, p0}, Landroidx/appcompat/app/a$a;->d(Z)Landroidx/appcompat/app/a$a;

    move-result-object p0

    sget v0, Lsg/q0;->k:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/a$a;->g(I)Landroidx/appcompat/app/a$a;

    move-result-object p0

    new-instance v0, Lfh/g;

    invoke-direct {v0}, Lfh/g;-><init>()V

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/a$a;->l(Landroid/content/DialogInterface$OnKeyListener;)Landroidx/appcompat/app/a$a;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/appcompat/app/a$a;->r()Landroidx/appcompat/app/a;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 0

    const/4 p0, 0x4

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
