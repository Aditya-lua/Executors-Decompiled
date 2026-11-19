.class public Lo7/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo7/c;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ln7/b;

.field public final c:Ln7/b;

.field public final d:Ln7/n;

.field public final e:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ln7/b;Ln7/b;Ln7/n;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo7/m;->a:Ljava/lang/String;

    iput-object p2, p0, Lo7/m;->b:Ln7/b;

    iput-object p3, p0, Lo7/m;->c:Ln7/b;

    iput-object p4, p0, Lo7/m;->d:Ln7/n;

    iput-boolean p5, p0, Lo7/m;->e:Z

    return-void
.end method


# virtual methods
.method public a(Lg7/h0;Lg7/i;Lp7/b;)Li7/c;
    .locals 0

    new-instance p2, Li7/p;

    invoke-direct {p2, p1, p3, p0}, Li7/p;-><init>(Lg7/h0;Lp7/b;Lo7/m;)V

    return-object p2
.end method

.method public b()Ln7/b;
    .locals 1

    iget-object v0, p0, Lo7/m;->b:Ln7/b;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo7/m;->a:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ln7/b;
    .locals 1

    iget-object v0, p0, Lo7/m;->c:Ln7/b;

    return-object v0
.end method

.method public e()Ln7/n;
    .locals 1

    iget-object v0, p0, Lo7/m;->d:Ln7/n;

    return-object v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lo7/m;->e:Z

    return v0
.end method
