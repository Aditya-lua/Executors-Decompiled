.class public final Landroidx/lifecycle/h0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/k0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/lifecycle/h0;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0004\u00a8\u0006\u0007"
    }
    d2 = {
        "androidx/lifecycle/h0$d",
        "Landroidx/lifecycle/k0$a;",
        "",
        "onCreate",
        "()V",
        "onStart",
        "onResume",
        "lifecycle-process"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Landroidx/lifecycle/h0;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/h0;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/h0$d;->a:Landroidx/lifecycle/h0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 0

    return-void
.end method

.method public onResume()V
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/h0$d;->a:Landroidx/lifecycle/h0;

    invoke-virtual {v0}, Landroidx/lifecycle/h0;->f()V

    return-void
.end method

.method public onStart()V
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/h0$d;->a:Landroidx/lifecycle/h0;

    invoke-virtual {v0}, Landroidx/lifecycle/h0;->g()V

    return-void
.end method
