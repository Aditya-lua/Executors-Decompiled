.class public Lon/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsn/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lon/k$a;
    }
.end annotation


# instance fields
.field public final a:Lon/k$a;

.field public final b:Lqn/s;

.field public final c:Lsn/h;

.field public d:Z


# direct methods
.method public constructor <init>(Lon/k$a;Lqn/s;Lsn/h;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lon/k;->d:Z

    iput-object p1, p0, Lon/k;->a:Lon/k$a;

    iput-object p2, p0, Lon/k;->b:Lqn/s;

    iput-object p3, p0, Lon/k;->c:Lsn/h;

    return-void
.end method


# virtual methods
.method public b()Lsn/f;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lon/k;->d:Z

    return-object p0
.end method

.method public d()Lqn/s;
    .locals 1

    iget-object v0, p0, Lon/k;->b:Lqn/s;

    return-object v0
.end method

.method public e()Lsn/h;
    .locals 1

    iget-object v0, p0, Lon/k;->c:Lsn/h;

    return-object v0
.end method

.method public f()Lon/k$a;
    .locals 1

    iget-object v0, p0, Lon/k;->a:Lon/k$a;

    return-object v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Lon/k;->d:Z

    return v0
.end method
