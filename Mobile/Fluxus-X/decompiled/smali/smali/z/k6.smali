.class public final synthetic Lz/k6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/camera/core/f;

.field public final synthetic b:Lz/m6$b;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/f;Lz/m6$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/k6;->a:Landroidx/camera/core/f;

    iput-object p2, p0, Lz/k6;->b:Lz/m6$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lz/k6;->a:Landroidx/camera/core/f;

    iget-object v1, p0, Lz/k6;->b:Lz/m6$b;

    invoke-static {v0, v1}, Lz/m6;->j(Landroidx/camera/core/f;Lz/m6$b;)V

    return-void
.end method
