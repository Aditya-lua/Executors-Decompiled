.class public final synthetic Lf1/k1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lf1/p1;

.field public final synthetic b:Lx0/n0;

.field public final synthetic c:Ln0/p0;

.field public final synthetic d:Lg1/a;

.field public final synthetic e:Ln0/a4;

.field public final synthetic f:Z


# direct methods
.method public synthetic constructor <init>(Lf1/p1;Lx0/n0;Ln0/p0;Lg1/a;Ln0/a4;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/k1;->a:Lf1/p1;

    iput-object p2, p0, Lf1/k1;->b:Lx0/n0;

    iput-object p3, p0, Lf1/k1;->c:Ln0/p0;

    iput-object p4, p0, Lf1/k1;->d:Lg1/a;

    iput-object p5, p0, Lf1/k1;->e:Ln0/a4;

    iput-boolean p6, p0, Lf1/k1;->f:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lf1/k1;->a:Lf1/p1;

    iget-object v1, p0, Lf1/k1;->b:Lx0/n0;

    iget-object v2, p0, Lf1/k1;->c:Ln0/p0;

    iget-object v3, p0, Lf1/k1;->d:Lg1/a;

    iget-object v4, p0, Lf1/k1;->e:Ln0/a4;

    iget-boolean v5, p0, Lf1/k1;->f:Z

    invoke-static/range {v0 .. v5}, Lf1/p1;->g0(Lf1/p1;Lx0/n0;Ln0/p0;Lg1/a;Ln0/a4;Z)V

    return-void
.end method
