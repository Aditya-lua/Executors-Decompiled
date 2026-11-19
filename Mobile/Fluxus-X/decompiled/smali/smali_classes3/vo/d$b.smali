.class public final Lvo/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsn/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvo/d;->a(Lvo/y3$b;Landroid/content/Context;Lsn/t;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Landroidx/camera/view/PreviewView;Lsn/h0;Z)Lsn/i;
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
        "vo/d$b",
        "Lsn/z;",
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
.field public final synthetic a:Lvo/y3$b;

.field public final synthetic b:Lsn/t;

.field public final synthetic c:Landroidx/camera/view/PreviewView;

.field public final synthetic d:Lsn/h0;

.field public final synthetic e:Z


# direct methods
.method public constructor <init>(Lvo/y3$b;Lsn/t;Landroidx/camera/view/PreviewView;Lsn/h0;Z)V
    .locals 0

    iput-object p1, p0, Lvo/d$b;->a:Lvo/y3$b;

    iput-object p2, p0, Lvo/d$b;->b:Lsn/t;

    iput-object p3, p0, Lvo/d$b;->c:Landroidx/camera/view/PreviewView;

    iput-object p4, p0, Lvo/d$b;->d:Lsn/h0;

    iput-boolean p5, p0, Lvo/d$b;->e:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 7

    sget-object v2, Lsn/t$a;->b:Lsn/t$a;

    iget-object v0, p0, Lvo/d$b;->a:Lvo/y3$b;

    invoke-virtual {v0}, Lvo/y3$b;->D()Lkotlin/jvm/functions/Function1;

    move-result-object v6

    iget-object v0, p0, Lvo/d$b;->b:Lsn/t;

    iget-object v1, p0, Lvo/d$b;->c:Landroidx/camera/view/PreviewView;

    iget-object v3, p0, Lvo/d$b;->d:Lsn/h0;

    const/4 v4, 0x1

    iget-boolean v5, p0, Lvo/d$b;->e:Z

    invoke-virtual/range {v0 .. v6}, Lsn/t;->f(Landroidx/camera/view/PreviewView;Lsn/t$a;Lg0/u0$a;ZZLkotlin/jvm/functions/Function1;)V

    return-void
.end method
