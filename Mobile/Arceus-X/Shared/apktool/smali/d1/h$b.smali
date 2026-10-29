.class public Ld1/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld1/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Ld1/h;

.field public final b:Landroidx/lifecycle/s;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/s;Ld1/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld1/h$b;->b:Landroidx/lifecycle/s;

    iput-object p2, p0, Ld1/h$b;->a:Ld1/h;

    return-void
.end method


# virtual methods
.method public a()Landroidx/lifecycle/s;
    .locals 1

    iget-object v0, p0, Ld1/h$b;->b:Landroidx/lifecycle/s;

    return-object v0
.end method

.method public onDestroy(Landroidx/lifecycle/s;)V
    .locals 1
    .annotation runtime Landroidx/lifecycle/f0;
        value = .enum Landroidx/lifecycle/l$a;->ON_DESTROY:Landroidx/lifecycle/l$a;
    .end annotation

    iget-object v0, p0, Ld1/h$b;->a:Ld1/h;

    invoke-virtual {v0, p1}, Ld1/h;->p(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public onStart(Landroidx/lifecycle/s;)V
    .locals 1
    .annotation runtime Landroidx/lifecycle/f0;
        value = .enum Landroidx/lifecycle/l$a;->ON_START:Landroidx/lifecycle/l$a;
    .end annotation

    iget-object v0, p0, Ld1/h$b;->a:Ld1/h;

    invoke-virtual {v0, p1}, Ld1/h;->j(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public onStop(Landroidx/lifecycle/s;)V
    .locals 1
    .annotation runtime Landroidx/lifecycle/f0;
        value = .enum Landroidx/lifecycle/l$a;->ON_STOP:Landroidx/lifecycle/l$a;
    .end annotation

    iget-object v0, p0, Ld1/h$b;->a:Ld1/h;

    invoke-virtual {v0, p1}, Ld1/h;->k(Landroidx/lifecycle/s;)V

    return-void
.end method
