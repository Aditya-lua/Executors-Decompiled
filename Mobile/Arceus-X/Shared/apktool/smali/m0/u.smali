.class public final synthetic Lm0/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/camera/core/f;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/u;->a:Landroidx/camera/core/f;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lm0/u;->a:Landroidx/camera/core/f;

    invoke-static {v0}, Lm0/x;->d(Landroidx/camera/core/f;)V

    return-void
.end method
