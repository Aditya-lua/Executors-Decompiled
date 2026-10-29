.class public final synthetic Lp1/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/camera/view/PreviewView$a;

.field public final synthetic b:Lg0/v2;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/view/PreviewView$a;Lg0/v2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/u;->a:Landroidx/camera/view/PreviewView$a;

    iput-object p2, p0, Lp1/u;->b:Lg0/v2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lp1/u;->a:Landroidx/camera/view/PreviewView$a;

    iget-object v1, p0, Lp1/u;->b:Lg0/v2;

    invoke-static {v0, v1}, Landroidx/camera/view/PreviewView$a;->b(Landroidx/camera/view/PreviewView$a;Lg0/v2;)V

    return-void
.end method
