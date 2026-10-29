.class public final Ln0/h4$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln0/h4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Ln0/o3;

.field public final b:Ln0/i4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/i4<",
            "*>;"
        }
    .end annotation
.end field

.field public final c:Ln0/t3;

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ln0/j4$b;",
            ">;"
        }
    .end annotation
.end field

.field public e:Z

.field public f:Z


# direct methods
.method public constructor <init>(Ln0/o3;Ln0/i4;Ln0/t3;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/o3;",
            "Ln0/i4<",
            "*>;",
            "Ln0/t3;",
            "Ljava/util/List<",
            "Ln0/j4$b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ln0/h4$b;->e:Z

    iput-boolean v0, p0, Ln0/h4$b;->f:Z

    iput-object p1, p0, Ln0/h4$b;->a:Ln0/o3;

    iput-object p2, p0, Ln0/h4$b;->b:Ln0/i4;

    iput-object p3, p0, Ln0/h4$b;->c:Ln0/t3;

    iput-object p4, p0, Ln0/h4$b;->d:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Ln0/h4$b;->f:Z

    return v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Ln0/h4$b;->e:Z

    return v0
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ln0/j4$b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ln0/h4$b;->d:Ljava/util/List;

    return-object v0
.end method

.method public d()Ln0/o3;
    .locals 1

    iget-object v0, p0, Ln0/h4$b;->a:Ln0/o3;

    return-object v0
.end method

.method public e()Ln0/t3;
    .locals 1

    iget-object v0, p0, Ln0/h4$b;->c:Ln0/t3;

    return-object v0
.end method

.method public f()Ln0/i4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ln0/i4<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Ln0/h4$b;->b:Ln0/i4;

    return-object v0
.end method

.method public g(Z)V
    .locals 0

    iput-boolean p1, p0, Ln0/h4$b;->f:Z

    return-void
.end method

.method public h(Z)V
    .locals 0

    iput-boolean p1, p0, Ln0/h4$b;->e:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UseCaseAttachInfo{mSessionConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln0/h4$b;->a:Ln0/o3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mUseCaseConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln0/h4$b;->b:Ln0/i4;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mStreamSpec="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln0/h4$b;->c:Ln0/t3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mCaptureTypes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln0/h4$b;->d:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mAttached="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ln0/h4$b;->e:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", mActive="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ln0/h4$b;->f:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
