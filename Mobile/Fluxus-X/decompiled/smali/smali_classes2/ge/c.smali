.class public final Lge/c;
.super Lge/u0;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lge/e;


# direct methods
.method public constructor <init>(Lge/e;)V
    .locals 0

    iput-object p1, p0, Lge/c;->b:Lge/e;

    invoke-direct {p0}, Lge/u0;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    iget-object v0, p0, Lge/c;->b:Lge/e;

    iget-object v0, v0, Lge/e;->a:Lge/f;

    invoke-static {v0}, Lge/f;->s(Lge/f;)V

    iget-object v0, p0, Lge/c;->b:Lge/e;

    iget-object v0, v0, Lge/e;->a:Lge/f;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lge/f;->n(Lge/f;Landroid/os/IInterface;)V

    iget-object v0, p0, Lge/c;->b:Lge/e;

    iget-object v0, v0, Lge/e;->a:Lge/f;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lge/f;->m(Lge/f;Z)V

    return-void
.end method
