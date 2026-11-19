.class public Lwf/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/h;


# instance fields
.field public a:Z

.field public b:Z

.field public c:Ltf/d;

.field public final d:Lwf/f;


# direct methods
.method public constructor <init>(Lwf/f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lwf/i;->a:Z

    iput-boolean v0, p0, Lwf/i;->b:Z

    iput-object p1, p0, Lwf/i;->d:Lwf/f;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-boolean v0, p0, Lwf/i;->a:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lwf/i;->a:Z

    return-void

    :cond_0
    new-instance v0, Ltf/c;

    const-string v1, "Cannot encode a second value in the ValueEncoderContext"

    invoke-direct {v0, v1}, Ltf/c;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public add(Ljava/lang/String;)Ltf/h;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lwf/i;->a()V

    .line 2
    iget-object v0, p0, Lwf/i;->d:Lwf/f;

    iget-object v1, p0, Lwf/i;->c:Ltf/d;

    iget-boolean v2, p0, Lwf/i;->b:Z

    invoke-virtual {v0, v1, p1, v2}, Lwf/f;->d(Ltf/d;Ljava/lang/Object;Z)Ltf/f;

    return-object p0
.end method

.method public add(Z)Ltf/h;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 3
    invoke-virtual {p0}, Lwf/i;->a()V

    .line 4
    iget-object v0, p0, Lwf/i;->d:Lwf/f;

    iget-object v1, p0, Lwf/i;->c:Ltf/d;

    iget-boolean v2, p0, Lwf/i;->b:Z

    invoke-virtual {v0, v1, p1, v2}, Lwf/f;->i(Ltf/d;ZZ)Lwf/f;

    return-object p0
.end method

.method public b(Ltf/d;Z)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lwf/i;->a:Z

    iput-object p1, p0, Lwf/i;->c:Ltf/d;

    iput-boolean p2, p0, Lwf/i;->b:Z

    return-void
.end method
