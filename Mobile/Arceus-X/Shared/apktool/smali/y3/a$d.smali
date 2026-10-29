.class public Ly3/a$d;
.super Ly3/a$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly3/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public final b:Landroid/view/Choreographer;

.field public final c:Landroid/view/Choreographer$FrameCallback;


# direct methods
.method public constructor <init>(Ly3/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ly3/a$c;-><init>(Ly3/a$a;)V

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object p1

    iput-object p1, p0, Ly3/a$d;->b:Landroid/view/Choreographer;

    new-instance p1, Ly3/a$d$a;

    invoke-direct {p1, p0}, Ly3/a$d$a;-><init>(Ly3/a$d;)V

    iput-object p1, p0, Ly3/a$d;->c:Landroid/view/Choreographer$FrameCallback;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Ly3/a$d;->b:Landroid/view/Choreographer;

    iget-object v1, p0, Ly3/a$d;->c:Landroid/view/Choreographer$FrameCallback;

    invoke-virtual {v0, v1}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    return-void
.end method
