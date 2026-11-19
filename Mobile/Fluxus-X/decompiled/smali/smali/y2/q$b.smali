.class public Ly2/q$b;
.super Ly2/q$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly2/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method public constructor <init>(Ly2/q;)V
    .locals 0

    invoke-direct {p0, p1}, Ly2/q$a;-><init>(Ly2/q;)V

    return-void
.end method


# virtual methods
.method public addExtraDataToAccessibilityNodeInfo(ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Ly2/q$a;->a:Ly2/q;

    invoke-static {p2}, Ly2/p;->O0(Landroid/view/accessibility/AccessibilityNodeInfo;)Ly2/p;

    move-result-object p2

    invoke-virtual {v0, p1, p2, p3, p4}, Ly2/q;->a(ILy2/p;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
