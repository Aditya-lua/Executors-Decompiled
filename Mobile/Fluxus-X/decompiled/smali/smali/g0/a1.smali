.class public final synthetic Lg0/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/camera/core/c;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/a1;->a:Landroidx/camera/core/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lg0/a1;->a:Landroidx/camera/core/c;

    invoke-static {v0}, Landroidx/camera/core/c$b;->d(Landroidx/camera/core/c;)V

    return-void
.end method
