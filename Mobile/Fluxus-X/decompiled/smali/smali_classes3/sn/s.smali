.class public final synthetic Lsn/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lpe/x;

.field public final synthetic b:I

.field public final synthetic c:Z

.field public final synthetic d:Lg0/u0$a;

.field public final synthetic e:Ljava/util/concurrent/ExecutorService;

.field public final synthetic f:Z

.field public final synthetic g:Landroidx/camera/view/PreviewView;

.field public final synthetic h:Lg0/v;

.field public final synthetic i:Lsn/t;

.field public final synthetic j:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lpe/x;IZLg0/u0$a;Ljava/util/concurrent/ExecutorService;ZLandroidx/camera/view/PreviewView;Lg0/v;Lsn/t;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsn/s;->a:Lpe/x;

    iput p2, p0, Lsn/s;->b:I

    iput-boolean p3, p0, Lsn/s;->c:Z

    iput-object p4, p0, Lsn/s;->d:Lg0/u0$a;

    iput-object p5, p0, Lsn/s;->e:Ljava/util/concurrent/ExecutorService;

    iput-boolean p6, p0, Lsn/s;->f:Z

    iput-object p7, p0, Lsn/s;->g:Landroidx/camera/view/PreviewView;

    iput-object p8, p0, Lsn/s;->h:Lg0/v;

    iput-object p9, p0, Lsn/s;->i:Lsn/t;

    iput-object p10, p0, Lsn/s;->j:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    iget-object v0, p0, Lsn/s;->a:Lpe/x;

    iget v1, p0, Lsn/s;->b:I

    iget-boolean v2, p0, Lsn/s;->c:Z

    iget-object v3, p0, Lsn/s;->d:Lg0/u0$a;

    iget-object v4, p0, Lsn/s;->e:Ljava/util/concurrent/ExecutorService;

    iget-boolean v5, p0, Lsn/s;->f:Z

    iget-object v6, p0, Lsn/s;->g:Landroidx/camera/view/PreviewView;

    iget-object v7, p0, Lsn/s;->h:Lg0/v;

    iget-object v8, p0, Lsn/s;->i:Lsn/t;

    iget-object v9, p0, Lsn/s;->j:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v9}, Lsn/t;->b(Lpe/x;IZLg0/u0$a;Ljava/util/concurrent/ExecutorService;ZLandroidx/camera/view/PreviewView;Lg0/v;Lsn/t;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
