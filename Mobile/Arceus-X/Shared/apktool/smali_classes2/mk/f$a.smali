.class public Lmk/f$a;
.super Landroid/view/OrientationEventListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmk/f;-><init>(Landroid/app/Activity;Landroid/view/SurfaceView;Lmk/f$f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lmk/f;


# direct methods
.method public constructor <init>(Lmk/f;Landroid/content/Context;I)V
    .locals 0

    iput-object p1, p0, Lmk/f$a;->a:Lmk/f;

    invoke-direct {p0, p2, p3}, Landroid/view/OrientationEventListener;-><init>(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method public onOrientationChanged(I)V
    .locals 0

    iget-object p1, p0, Lmk/f$a;->a:Lmk/f;

    invoke-static {p1}, Lmk/f;->l(Lmk/f;)V

    return-void
.end method
