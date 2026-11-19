.class public Lp5/b$f;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp5/b;->u(Landroid/view/ViewGroup;Lp5/d0;Lp5/d0;)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lp5/b$i;

.field public final synthetic b:Lp5/b;

.field private final mViewBounds:Lp5/b$i;


# direct methods
.method public constructor <init>(Lp5/b;Lp5/b$i;)V
    .locals 0

    iput-object p1, p0, Lp5/b$f;->b:Lp5/b;

    iput-object p2, p0, Lp5/b$f;->a:Lp5/b$i;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    iput-object p2, p0, Lp5/b$f;->mViewBounds:Lp5/b$i;

    return-void
.end method
