.class public Lq7/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lm7/a;

.field public final b:Lm7/b;

.field public final c:Lm7/b;

.field public final d:Lm7/b;

.field public final e:Lm7/b;


# direct methods
.method public constructor <init>(Lm7/a;Lm7/b;Lm7/b;Lm7/b;Lm7/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq7/j;->a:Lm7/a;

    iput-object p2, p0, Lq7/j;->b:Lm7/b;

    iput-object p3, p0, Lq7/j;->c:Lm7/b;

    iput-object p4, p0, Lq7/j;->d:Lm7/b;

    iput-object p5, p0, Lq7/j;->e:Lm7/b;

    return-void
.end method


# virtual methods
.method public a()Lm7/a;
    .locals 1

    iget-object v0, p0, Lq7/j;->a:Lm7/a;

    return-object v0
.end method

.method public b()Lm7/b;
    .locals 1

    iget-object v0, p0, Lq7/j;->c:Lm7/b;

    return-object v0
.end method

.method public c()Lm7/b;
    .locals 1

    iget-object v0, p0, Lq7/j;->d:Lm7/b;

    return-object v0
.end method

.method public d()Lm7/b;
    .locals 1

    iget-object v0, p0, Lq7/j;->b:Lm7/b;

    return-object v0
.end method

.method public e()Lm7/b;
    .locals 1

    iget-object v0, p0, Lq7/j;->e:Lm7/b;

    return-object v0
.end method
