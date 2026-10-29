.class public final synthetic Lm0/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lm0/v0;

.field public final synthetic b:Landroidx/camera/core/d;


# direct methods
.method public synthetic constructor <init>(Lm0/v0;Landroidx/camera/core/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/q0;->a:Lm0/v0;

    iput-object p2, p0, Lm0/q0;->b:Landroidx/camera/core/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lm0/q0;->a:Lm0/v0;

    iget-object v1, p0, Lm0/q0;->b:Landroidx/camera/core/d;

    invoke-static {v0, v1}, Lm0/u0;->c(Lm0/v0;Landroidx/camera/core/d;)V

    return-void
.end method
