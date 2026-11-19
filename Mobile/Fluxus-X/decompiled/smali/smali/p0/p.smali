.class public final synthetic Lp0/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lp0/s;

.field public final synthetic b:Landroidx/lifecycle/a0;


# direct methods
.method public synthetic constructor <init>(Lp0/s;Landroidx/lifecycle/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp0/p;->a:Lp0/s;

    iput-object p2, p0, Lp0/p;->b:Landroidx/lifecycle/a0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lp0/p;->a:Lp0/s;

    iget-object v1, p0, Lp0/p;->b:Landroidx/lifecycle/a0;

    invoke-static {v0, v1}, Lp0/s;->r(Lp0/s;Landroidx/lifecycle/a0;)V

    return-void
.end method
