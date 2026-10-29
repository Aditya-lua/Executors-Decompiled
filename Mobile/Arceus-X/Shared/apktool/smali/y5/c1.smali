.class public final synthetic Ly5/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ly5/d1;

.field public final synthetic b:Ly5/y;

.field public final synthetic c:Landroidx/work/WorkerParameters$a;


# direct methods
.method public synthetic constructor <init>(Ly5/d1;Ly5/y;Landroidx/work/WorkerParameters$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly5/c1;->a:Ly5/d1;

    iput-object p2, p0, Ly5/c1;->b:Ly5/y;

    iput-object p3, p0, Ly5/c1;->c:Landroidx/work/WorkerParameters$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ly5/c1;->a:Ly5/d1;

    iget-object v1, p0, Ly5/c1;->b:Ly5/y;

    iget-object v2, p0, Ly5/c1;->c:Landroidx/work/WorkerParameters$a;

    invoke-static {v0, v1, v2}, Ly5/d1;->f(Ly5/d1;Ly5/y;Landroidx/work/WorkerParameters$a;)V

    return-void
.end method
