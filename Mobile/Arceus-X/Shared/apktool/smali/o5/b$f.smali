.class public Lo5/b$f;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo5/b;->s(Landroid/view/ViewGroup;Lo5/d0;Lo5/d0;)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lo5/b$i;

.field public final synthetic b:Lo5/b;

.field private final mViewBounds:Lo5/b$i;


# direct methods
.method public constructor <init>(Lo5/b;Lo5/b$i;)V
    .locals 0

    iput-object p1, p0, Lo5/b$f;->b:Lo5/b;

    iput-object p2, p0, Lo5/b$f;->a:Lo5/b$i;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    iput-object p2, p0, Lo5/b$f;->mViewBounds:Lo5/b$i;

    return-void
.end method
