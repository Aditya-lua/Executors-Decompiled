.class public final synthetic Lcr/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field public final synthetic a:Landroid/widget/EditText;

.field public final synthetic b:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/EditText;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcr/q0;->a:Landroid/widget/EditText;

    iput-object p2, p0, Lcr/q0;->b:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 2

    iget-object v0, p0, Lcr/q0;->a:Landroid/widget/EditText;

    iget-object v1, p0, Lcr/q0;->b:Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1, p1, p2, p3}, Lcr/r0;->d(Landroid/widget/EditText;Lkotlin/jvm/functions/Function0;Landroid/view/View;ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
