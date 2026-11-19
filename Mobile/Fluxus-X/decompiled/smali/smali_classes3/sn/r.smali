.class public final synthetic Lsn/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/camera/view/PreviewView;

.field public final synthetic b:Z

.field public final synthetic c:Lg0/u0$a;

.field public final synthetic d:Z

.field public final synthetic e:Lg0/v;

.field public final synthetic f:Lsn/t;

.field public final synthetic g:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/view/PreviewView;ZLg0/u0$a;ZLg0/v;Lsn/t;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsn/r;->a:Landroidx/camera/view/PreviewView;

    iput-boolean p2, p0, Lsn/r;->b:Z

    iput-object p3, p0, Lsn/r;->c:Lg0/u0$a;

    iput-boolean p4, p0, Lsn/r;->d:Z

    iput-object p5, p0, Lsn/r;->e:Lg0/v;

    iput-object p6, p0, Lsn/r;->f:Lsn/t;

    iput-object p7, p0, Lsn/r;->g:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lsn/r;->a:Landroidx/camera/view/PreviewView;

    iget-boolean v1, p0, Lsn/r;->b:Z

    iget-object v2, p0, Lsn/r;->c:Lg0/u0$a;

    iget-boolean v3, p0, Lsn/r;->d:Z

    iget-object v4, p0, Lsn/r;->e:Lg0/v;

    iget-object v5, p0, Lsn/r;->f:Lsn/t;

    iget-object v6, p0, Lsn/r;->g:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v6}, Lsn/t;->a(Landroidx/camera/view/PreviewView;ZLg0/u0$a;ZLg0/v;Lsn/t;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
