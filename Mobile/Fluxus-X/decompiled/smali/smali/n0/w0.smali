.class public final synthetic Ln0/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ln0/o0;

.field public final synthetic b:Landroidx/lifecycle/e0;


# direct methods
.method public synthetic constructor <init>(Ln0/o0;Landroidx/lifecycle/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/w0;->a:Ln0/o0;

    iput-object p2, p0, Ln0/w0;->b:Landroidx/lifecycle/e0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ln0/w0;->a:Ln0/o0;

    iget-object v1, p0, Ln0/w0;->b:Landroidx/lifecycle/e0;

    invoke-static {v0, v1}, Ln0/y0;->e(Ln0/o0;Landroidx/lifecycle/e0;)V

    return-void
.end method
