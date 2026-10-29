.class public Lo5/q$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo5/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public a:Landroid/view/View;

.field public b:Ljava/lang/String;

.field public c:Lo5/d0;

.field public d:Landroid/view/WindowId;

.field public e:Lo5/q;

.field public f:Landroid/animation/Animator;


# direct methods
.method public constructor <init>(Landroid/view/View;Ljava/lang/String;Lo5/q;Landroid/view/WindowId;Lo5/d0;Landroid/animation/Animator;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo5/q$d;->a:Landroid/view/View;

    iput-object p2, p0, Lo5/q$d;->b:Ljava/lang/String;

    iput-object p5, p0, Lo5/q$d;->c:Lo5/d0;

    iput-object p4, p0, Lo5/q$d;->d:Landroid/view/WindowId;

    iput-object p3, p0, Lo5/q$d;->e:Lo5/q;

    iput-object p6, p0, Lo5/q$d;->f:Landroid/animation/Animator;

    return-void
.end method
