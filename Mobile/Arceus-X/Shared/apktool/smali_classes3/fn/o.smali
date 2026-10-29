.class public final synthetic Lfn/o;
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

.field public final synthetic f:Lcom/withpersona/sdk2/camera/b;

.field public final synthetic g:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/view/PreviewView;ZLg0/u0$a;ZLg0/v;Lcom/withpersona/sdk2/camera/b;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfn/o;->a:Landroidx/camera/view/PreviewView;

    iput-boolean p2, p0, Lfn/o;->b:Z

    iput-object p3, p0, Lfn/o;->c:Lg0/u0$a;

    iput-boolean p4, p0, Lfn/o;->d:Z

    iput-object p5, p0, Lfn/o;->e:Lg0/v;

    iput-object p6, p0, Lfn/o;->f:Lcom/withpersona/sdk2/camera/b;

    iput-object p7, p0, Lfn/o;->g:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lfn/o;->a:Landroidx/camera/view/PreviewView;

    iget-boolean v1, p0, Lfn/o;->b:Z

    iget-object v2, p0, Lfn/o;->c:Lg0/u0$a;

    iget-boolean v3, p0, Lfn/o;->d:Z

    iget-object v4, p0, Lfn/o;->e:Lg0/v;

    iget-object v5, p0, Lfn/o;->f:Lcom/withpersona/sdk2/camera/b;

    iget-object v6, p0, Lfn/o;->g:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v6}, Lcom/withpersona/sdk2/camera/b;->a(Landroidx/camera/view/PreviewView;ZLg0/u0$a;ZLg0/v;Lcom/withpersona/sdk2/camera/b;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
