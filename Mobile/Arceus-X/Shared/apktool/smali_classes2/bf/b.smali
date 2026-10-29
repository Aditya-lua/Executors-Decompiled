.class public final Lbf/b;
.super Lbf/b1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbf/b$b;
    }
.end annotation


# instance fields
.field public final a:Lbf/c;

.field public final b:Lef/b;


# direct methods
.method public constructor <init>(Lbf/c;Lef/b;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lbf/b1;-><init>()V

    .line 3
    iput-object p1, p0, Lbf/b;->a:Lbf/c;

    .line 4
    iput-object p2, p0, Lbf/b;->b:Lef/b;

    return-void
.end method

.method public synthetic constructor <init>(Lbf/c;Lef/b;Lbf/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lbf/b;-><init>(Lbf/c;Lef/b;)V

    return-void
.end method

.method public static d()Lbf/b$b;
    .locals 2

    new-instance v0, Lbf/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbf/b$b;-><init>(Lbf/b$a;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic c()Lbf/c1;
    .locals 1

    invoke-virtual {p0}, Lbf/b;->g()Lbf/c;

    move-result-object v0

    return-object v0
.end method

.method public e()Lbf/a;
    .locals 1

    iget-object v0, p0, Lbf/b;->a:Lbf/c;

    invoke-virtual {v0}, Lbf/c;->d()Lbf/a;

    move-result-object v0

    return-object v0
.end method

.method public f()Lef/b;
    .locals 1

    iget-object v0, p0, Lbf/b;->b:Lef/b;

    return-object v0
.end method

.method public g()Lbf/c;
    .locals 1

    iget-object v0, p0, Lbf/b;->a:Lbf/c;

    return-object v0
.end method
