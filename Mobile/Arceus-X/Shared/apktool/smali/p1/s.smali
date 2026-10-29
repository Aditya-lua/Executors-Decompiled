.class public final synthetic Lp1/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq1/a$b;


# instance fields
.field public final synthetic a:Landroidx/camera/view/PreviewView;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/view/PreviewView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/s;->a:Landroidx/camera/view/PreviewView;

    return-void
.end method


# virtual methods
.method public final a(Lq1/a$c;)Z
    .locals 1

    iget-object v0, p0, Lp1/s;->a:Landroidx/camera/view/PreviewView;

    invoke-static {v0, p1}, Landroidx/camera/view/PreviewView;->a(Landroidx/camera/view/PreviewView;Lq1/a$c;)Z

    move-result p1

    return p1
.end method
