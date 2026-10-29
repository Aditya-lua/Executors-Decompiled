.class public final Lee/c;
.super Lee/u0;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lee/e;


# direct methods
.method public constructor <init>(Lee/e;)V
    .locals 0

    iput-object p1, p0, Lee/c;->b:Lee/e;

    invoke-direct {p0}, Lee/u0;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    iget-object v0, p0, Lee/c;->b:Lee/e;

    iget-object v0, v0, Lee/e;->a:Lee/f;

    invoke-static {v0}, Lee/f;->s(Lee/f;)V

    iget-object v0, p0, Lee/c;->b:Lee/e;

    iget-object v0, v0, Lee/e;->a:Lee/f;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lee/f;->n(Lee/f;Landroid/os/IInterface;)V

    iget-object v0, p0, Lee/c;->b:Lee/e;

    iget-object v0, v0, Lee/e;->a:Lee/f;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lee/f;->m(Lee/f;Z)V

    return-void
.end method
