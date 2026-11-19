.class public final synthetic Lg0/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lg0/f1;

.field public final synthetic b:Lg0/f1$h;

.field public final synthetic c:Ljava/util/concurrent/Executor;

.field public final synthetic d:Lg0/f1$g;


# direct methods
.method public synthetic constructor <init>(Lg0/f1;Lg0/f1$h;Ljava/util/concurrent/Executor;Lg0/f1$g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/e1;->a:Lg0/f1;

    iput-object p2, p0, Lg0/e1;->b:Lg0/f1$h;

    iput-object p3, p0, Lg0/e1;->c:Ljava/util/concurrent/Executor;

    iput-object p4, p0, Lg0/e1;->d:Lg0/f1$g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lg0/e1;->a:Lg0/f1;

    iget-object v1, p0, Lg0/e1;->b:Lg0/f1$h;

    iget-object v2, p0, Lg0/e1;->c:Ljava/util/concurrent/Executor;

    iget-object v3, p0, Lg0/e1;->d:Lg0/f1$g;

    invoke-static {v0, v1, v2, v3}, Lg0/f1;->j0(Lg0/f1;Lg0/f1$h;Ljava/util/concurrent/Executor;Lg0/f1$g;)V

    return-void
.end method
