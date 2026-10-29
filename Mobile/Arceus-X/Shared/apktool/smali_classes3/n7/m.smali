.class public Ln7/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln7/c;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lm7/b;

.field public final c:Lm7/b;

.field public final d:Lm7/n;

.field public final e:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lm7/b;Lm7/b;Lm7/n;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln7/m;->a:Ljava/lang/String;

    iput-object p2, p0, Ln7/m;->b:Lm7/b;

    iput-object p3, p0, Ln7/m;->c:Lm7/b;

    iput-object p4, p0, Ln7/m;->d:Lm7/n;

    iput-boolean p5, p0, Ln7/m;->e:Z

    return-void
.end method


# virtual methods
.method public a(Lf7/h0;Lf7/i;Lo7/b;)Lh7/c;
    .locals 0

    new-instance p2, Lh7/p;

    invoke-direct {p2, p1, p3, p0}, Lh7/p;-><init>(Lf7/h0;Lo7/b;Ln7/m;)V

    return-object p2
.end method

.method public b()Lm7/b;
    .locals 1

    iget-object v0, p0, Ln7/m;->b:Lm7/b;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ln7/m;->a:Ljava/lang/String;

    return-object v0
.end method

.method public d()Lm7/b;
    .locals 1

    iget-object v0, p0, Ln7/m;->c:Lm7/b;

    return-object v0
.end method

.method public e()Lm7/n;
    .locals 1

    iget-object v0, p0, Ln7/m;->d:Lm7/n;

    return-object v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Ln7/m;->e:Z

    return v0
.end method
