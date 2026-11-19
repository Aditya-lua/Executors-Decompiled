.class public Lf4/v0$a;
.super Landroid/transition/Transition$EpicenterCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf4/v0;->v(Ljava/lang/Object;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/graphics/Rect;

.field public final synthetic b:Lf4/v0;


# direct methods
.method public constructor <init>(Lf4/v0;Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Lf4/v0$a;->b:Lf4/v0;

    iput-object p2, p0, Lf4/v0$a;->a:Landroid/graphics/Rect;

    invoke-direct {p0}, Landroid/transition/Transition$EpicenterCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onGetEpicenter(Landroid/transition/Transition;)Landroid/graphics/Rect;
    .locals 0

    iget-object p1, p0, Lf4/v0$a;->a:Landroid/graphics/Rect;

    return-object p1
.end method
