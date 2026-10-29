.class public final Lcom/withpersona/sdk2/inquiry/governmentid/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfn/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/governmentid/b;->a(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Landroid/content/Context;Lcom/withpersona/sdk2/camera/b;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Landroidx/camera/view/PreviewView;Lfn/x;Z)Lfn/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "com/withpersona/sdk2/inquiry/governmentid/b$b",
        "Lfn/s;",
        "",
        "a",
        "()V",
        "government-id_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

.field public final synthetic b:Lcom/withpersona/sdk2/camera/b;

.field public final synthetic c:Landroidx/camera/view/PreviewView;

.field public final synthetic d:Lfn/x;

.field public final synthetic e:Z


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Lcom/withpersona/sdk2/camera/b;Landroidx/camera/view/PreviewView;Lfn/x;Z)V
    .locals 0

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/b$b;->a:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/b$b;->b:Lcom/withpersona/sdk2/camera/b;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/governmentid/b$b;->c:Landroidx/camera/view/PreviewView;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/governmentid/b$b;->d:Lfn/x;

    iput-boolean p5, p0, Lcom/withpersona/sdk2/inquiry/governmentid/b$b;->e:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 7

    sget-object v2, Lcom/withpersona/sdk2/camera/b$a;->b:Lcom/withpersona/sdk2/camera/b$a;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/b$b;->a:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;->D()Lkotlin/jvm/functions/Function1;

    move-result-object v6

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/b$b;->b:Lcom/withpersona/sdk2/camera/b;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/b$b;->c:Landroidx/camera/view/PreviewView;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/governmentid/b$b;->d:Lfn/x;

    const/4 v4, 0x1

    iget-boolean v5, p0, Lcom/withpersona/sdk2/inquiry/governmentid/b$b;->e:Z

    invoke-virtual/range {v0 .. v6}, Lcom/withpersona/sdk2/camera/b;->f(Landroidx/camera/view/PreviewView;Lcom/withpersona/sdk2/camera/b$a;Lg0/u0$a;ZZLkotlin/jvm/functions/Function1;)V

    return-void
.end method
