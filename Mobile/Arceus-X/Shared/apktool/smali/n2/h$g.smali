.class public final Ln2/h$g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln2/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln2/h$g$b;,
        Ln2/h$g$a;
    }
.end annotation


# direct methods
.method public static a(Landroid/content/res/Resources$Theme;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Ln2/h$g$b;->a(Landroid/content/res/Resources$Theme;)V

    return-void

    :cond_0
    invoke-static {p0}, Ln2/h$g$a;->a(Landroid/content/res/Resources$Theme;)V

    return-void
.end method
