.class public Lz/h4$b;
.super Ln0/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz/h4;->R(Ly1/c$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ly1/c$a;

.field public final synthetic b:Lz/h4;


# direct methods
.method public constructor <init>(Lz/h4;Ly1/c$a;)V
    .locals 0

    iput-object p1, p0, Lz/h4$b;->b:Lz/h4;

    iput-object p2, p0, Lz/h4$b;->a:Ly1/c$a;

    invoke-direct {p0}, Ln0/u;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    iget-object p1, p0, Lz/h4$b;->a:Ly1/c$a;

    if-eqz p1, :cond_0

    new-instance v0, Lg0/m$a;

    const-string v1, "Camera is closed"

    invoke-direct {v0, v1}, Lg0/m$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    :cond_0
    return-void
.end method

.method public b(ILn0/e0;)V
    .locals 0

    iget-object p1, p0, Lz/h4$b;->a:Ly1/c$a;

    if-eqz p1, :cond_0

    const-string p1, "FocusMeteringControl"

    const-string p2, "triggerAePrecapture: triggering capture request completed"

    invoke-static {p1, p2}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lz/h4$b;->a:Ly1/c$a;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public c(ILn0/w;)V
    .locals 1

    iget-object p1, p0, Lz/h4$b;->a:Ly1/c$a;

    if-eqz p1, :cond_0

    new-instance v0, Ln0/l0$c;

    invoke-direct {v0, p2}, Ln0/l0$c;-><init>(Ln0/w;)V

    invoke-virtual {p1, v0}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    :cond_0
    return-void
.end method
