.class public Lo7/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo7/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo7/t$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lo7/t$a;

.field public final c:Ln7/b;

.field public final d:Ln7/b;

.field public final e:Ln7/b;

.field public final f:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lo7/t$a;Ln7/b;Ln7/b;Ln7/b;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo7/t;->a:Ljava/lang/String;

    iput-object p2, p0, Lo7/t;->b:Lo7/t$a;

    iput-object p3, p0, Lo7/t;->c:Ln7/b;

    iput-object p4, p0, Lo7/t;->d:Ln7/b;

    iput-object p5, p0, Lo7/t;->e:Ln7/b;

    iput-boolean p6, p0, Lo7/t;->f:Z

    return-void
.end method


# virtual methods
.method public a(Lg7/h0;Lg7/i;Lp7/b;)Li7/c;
    .locals 0

    new-instance p1, Li7/u;

    invoke-direct {p1, p3, p0}, Li7/u;-><init>(Lp7/b;Lo7/t;)V

    return-object p1
.end method

.method public b()Ln7/b;
    .locals 1

    iget-object v0, p0, Lo7/t;->d:Ln7/b;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo7/t;->a:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ln7/b;
    .locals 1

    iget-object v0, p0, Lo7/t;->e:Ln7/b;

    return-object v0
.end method

.method public e()Ln7/b;
    .locals 1

    iget-object v0, p0, Lo7/t;->c:Ln7/b;

    return-object v0
.end method

.method public f()Lo7/t$a;
    .locals 1

    iget-object v0, p0, Lo7/t;->b:Lo7/t$a;

    return-object v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Lo7/t;->f:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Trim Path: {start: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lo7/t;->c:Ln7/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", end: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lo7/t;->d:Ln7/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", offset: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lo7/t;->e:Ln7/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
