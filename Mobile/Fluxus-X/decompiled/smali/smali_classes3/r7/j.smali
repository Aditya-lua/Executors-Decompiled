.class public Lr7/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ln7/a;

.field public final b:Ln7/b;

.field public final c:Ln7/b;

.field public final d:Ln7/b;

.field public final e:Ln7/b;


# direct methods
.method public constructor <init>(Ln7/a;Ln7/b;Ln7/b;Ln7/b;Ln7/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr7/j;->a:Ln7/a;

    iput-object p2, p0, Lr7/j;->b:Ln7/b;

    iput-object p3, p0, Lr7/j;->c:Ln7/b;

    iput-object p4, p0, Lr7/j;->d:Ln7/b;

    iput-object p5, p0, Lr7/j;->e:Ln7/b;

    return-void
.end method


# virtual methods
.method public a()Ln7/a;
    .locals 1

    iget-object v0, p0, Lr7/j;->a:Ln7/a;

    return-object v0
.end method

.method public b()Ln7/b;
    .locals 1

    iget-object v0, p0, Lr7/j;->c:Ln7/b;

    return-object v0
.end method

.method public c()Ln7/b;
    .locals 1

    iget-object v0, p0, Lr7/j;->d:Ln7/b;

    return-object v0
.end method

.method public d()Ln7/b;
    .locals 1

    iget-object v0, p0, Lr7/j;->b:Ln7/b;

    return-object v0
.end method

.method public e()Ln7/b;
    .locals 1

    iget-object v0, p0, Lr7/j;->e:Ln7/b;

    return-object v0
.end method
