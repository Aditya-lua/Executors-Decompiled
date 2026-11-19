.class public final Ldf/b;
.super Ldf/b1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldf/b$b;
    }
.end annotation


# instance fields
.field public final a:Ldf/c;

.field public final b:Lgf/b;


# direct methods
.method public constructor <init>(Ldf/c;Lgf/b;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ldf/b1;-><init>()V

    .line 3
    iput-object p1, p0, Ldf/b;->a:Ldf/c;

    .line 4
    iput-object p2, p0, Ldf/b;->b:Lgf/b;

    return-void
.end method

.method public synthetic constructor <init>(Ldf/c;Lgf/b;Ldf/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ldf/b;-><init>(Ldf/c;Lgf/b;)V

    return-void
.end method

.method public static d()Ldf/b$b;
    .locals 2

    new-instance v0, Ldf/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldf/b$b;-><init>(Ldf/b$a;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic c()Ldf/c1;
    .locals 1

    invoke-virtual {p0}, Ldf/b;->g()Ldf/c;

    move-result-object v0

    return-object v0
.end method

.method public e()Ldf/a;
    .locals 1

    iget-object v0, p0, Ldf/b;->a:Ldf/c;

    invoke-virtual {v0}, Ldf/c;->d()Ldf/a;

    move-result-object v0

    return-object v0
.end method

.method public f()Lgf/b;
    .locals 1

    iget-object v0, p0, Ldf/b;->b:Lgf/b;

    return-object v0
.end method

.method public g()Ldf/c;
    .locals 1

    iget-object v0, p0, Ldf/b;->a:Ldf/c;

    return-object v0
.end method
