.class public final synthetic Lg0/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/camera/core/f;

.field public final synthetic b:Landroidx/camera/core/f;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/f;Landroidx/camera/core/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/q0;->a:Landroidx/camera/core/f;

    iput-object p2, p0, Lg0/q0;->b:Landroidx/camera/core/f;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lg0/q0;->a:Landroidx/camera/core/f;

    iget-object v1, p0, Lg0/q0;->b:Landroidx/camera/core/f;

    invoke-static {v0, v1}, Lg0/u0;->g0(Landroidx/camera/core/f;Landroidx/camera/core/f;)V

    return-void
.end method
