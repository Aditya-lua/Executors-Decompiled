.class public Luf/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrf/h;


# instance fields
.field public a:Z

.field public b:Z

.field public c:Lrf/d;

.field public final d:Luf/f;


# direct methods
.method public constructor <init>(Luf/f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Luf/i;->a:Z

    iput-boolean v0, p0, Luf/i;->b:Z

    iput-object p1, p0, Luf/i;->d:Luf/f;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-boolean v0, p0, Luf/i;->a:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Luf/i;->a:Z

    return-void

    :cond_0
    new-instance v0, Lrf/c;

    const-string v1, "Cannot encode a second value in the ValueEncoderContext"

    invoke-direct {v0, v1}, Lrf/c;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public add(Ljava/lang/String;)Lrf/h;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Luf/i;->a()V

    .line 2
    iget-object v0, p0, Luf/i;->d:Luf/f;

    iget-object v1, p0, Luf/i;->c:Lrf/d;

    iget-boolean v2, p0, Luf/i;->b:Z

    invoke-virtual {v0, v1, p1, v2}, Luf/f;->d(Lrf/d;Ljava/lang/Object;Z)Lrf/f;

    return-object p0
.end method

.method public add(Z)Lrf/h;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 3
    invoke-virtual {p0}, Luf/i;->a()V

    .line 4
    iget-object v0, p0, Luf/i;->d:Luf/f;

    iget-object v1, p0, Luf/i;->c:Lrf/d;

    iget-boolean v2, p0, Luf/i;->b:Z

    invoke-virtual {v0, v1, p1, v2}, Luf/f;->i(Lrf/d;ZZ)Luf/f;

    return-object p0
.end method

.method public b(Lrf/d;Z)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Luf/i;->a:Z

    iput-object p1, p0, Luf/i;->c:Lrf/d;

    iput-boolean p2, p0, Luf/i;->b:Z

    return-void
.end method
