.class public Lz/u0$h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/u0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz/u0$h$a;
    }
.end annotation


# instance fields
.field public a:Lz/u0$h$a;

.field public final synthetic b:Lz/u0;


# direct methods
.method public constructor <init>(Lz/u0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz/u0$h;->b:Lz/u0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lz/u0$h;->a:Lz/u0$h$a;

    return-void
.end method

.method public synthetic constructor <init>(Lz/u0;Lz/u0$a;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lz/u0$h;-><init>(Lz/u0;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lz/u0$h;->a:Lz/u0$h$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lz/u0$h$a;->c()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lz/u0$h;->a:Lz/u0$h$a;

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lz/u0$h;->b:Lz/u0;

    const-string v1, "Camera receive onErrorCallback"

    invoke-virtual {v0, v1}, Lz/u0;->a0(Ljava/lang/String;)V

    invoke-virtual {p0}, Lz/u0$h;->a()V

    return-void
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Lz/u0$h;->a:Lz/u0$h$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lz/u0$h$a;->f()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Lz/u0$h;->b:Lz/u0;

    iget-object v0, v0, Lz/u0;->e:Lz/u0$i;

    sget-object v1, Lz/u0$i;->i:Lz/u0$i;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lz/u0$h;->b:Lz/u0;

    const-string v1, "Don\'t need the onError timeout handler."

    invoke-virtual {v0, v1}, Lz/u0;->a0(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lz/u0$h;->b:Lz/u0;

    const-string v1, "Camera waiting for onError."

    invoke-virtual {v0, v1}, Lz/u0;->a0(Ljava/lang/String;)V

    invoke-virtual {p0}, Lz/u0$h;->a()V

    new-instance v0, Lz/u0$h$a;

    invoke-direct {v0, p0}, Lz/u0$h$a;-><init>(Lz/u0$h;)V

    iput-object v0, p0, Lz/u0$h;->a:Lz/u0$h$a;

    return-void
.end method
