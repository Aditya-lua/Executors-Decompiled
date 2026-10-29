.class public final Ll9/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln9/c$e;


# instance fields
.field public final synthetic a:Ll9/j0;


# direct methods
.method public constructor <init>(Ll9/j0;)V
    .locals 0

    iput-object p1, p0, Ll9/i0;->a:Ll9/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Ll9/i0;->a:Ll9/j0;

    iget-object v0, v0, Ll9/j0;->r:Ll9/f;

    invoke-static {v0}, Ll9/f;->o(Ll9/f;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Ll9/h0;

    invoke-direct {v1, p0}, Ll9/h0;-><init>(Ll9/i0;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
