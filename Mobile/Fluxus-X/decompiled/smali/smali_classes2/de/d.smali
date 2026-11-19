.class public final Lde/d;
.super Lde/r1;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lde/f;


# direct methods
.method public constructor <init>(Lde/f;)V
    .locals 0

    iput-object p1, p0, Lde/d;->b:Lde/f;

    invoke-direct {p0}, Lde/r1;-><init>()V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 2

    iget-object v0, p0, Lde/d;->b:Lde/f;

    iget-object v0, v0, Lde/f;->a:Lde/g;

    invoke-static {v0}, Lde/g;->r(Lde/g;)V

    iget-object v0, p0, Lde/d;->b:Lde/f;

    iget-object v0, v0, Lde/f;->a:Lde/g;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lde/g;->m(Lde/g;Landroid/os/IInterface;)V

    iget-object v0, p0, Lde/d;->b:Lde/f;

    iget-object v0, v0, Lde/f;->a:Lde/g;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lde/g;->l(Lde/g;Z)V

    return-void
.end method
