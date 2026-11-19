.class public final synthetic Lz5/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lz5/d1;

.field public final synthetic b:Lz5/y;

.field public final synthetic c:Landroidx/work/WorkerParameters$a;


# direct methods
.method public synthetic constructor <init>(Lz5/d1;Lz5/y;Landroidx/work/WorkerParameters$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz5/c1;->a:Lz5/d1;

    iput-object p2, p0, Lz5/c1;->b:Lz5/y;

    iput-object p3, p0, Lz5/c1;->c:Landroidx/work/WorkerParameters$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lz5/c1;->a:Lz5/d1;

    iget-object v1, p0, Lz5/c1;->b:Lz5/y;

    iget-object v2, p0, Lz5/c1;->c:Landroidx/work/WorkerParameters$a;

    invoke-static {v0, v1, v2}, Lz5/d1;->f(Lz5/d1;Lz5/y;Landroidx/work/WorkerParameters$a;)V

    return-void
.end method
