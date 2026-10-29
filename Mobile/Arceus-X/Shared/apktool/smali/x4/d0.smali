.class public final synthetic Lx4/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/lang/Runnable;

.field public final synthetic b:Lx4/e0;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Runnable;Lx4/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx4/d0;->a:Ljava/lang/Runnable;

    iput-object p2, p0, Lx4/d0;->b:Lx4/e0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lx4/d0;->a:Ljava/lang/Runnable;

    iget-object v1, p0, Lx4/d0;->b:Lx4/e0;

    invoke-static {v0, v1}, Lx4/e0;->b(Ljava/lang/Runnable;Lx4/e0;)V

    return-void
.end method
