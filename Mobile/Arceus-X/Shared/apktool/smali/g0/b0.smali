.class public final synthetic Lg0/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lg0/f0;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Ljava/util/concurrent/Executor;

.field public final synthetic d:I

.field public final synthetic e:Ly1/c$a;

.field public final synthetic f:J


# direct methods
.method public synthetic constructor <init>(Lg0/f0;Landroid/content/Context;Ljava/util/concurrent/Executor;ILy1/c$a;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/b0;->a:Lg0/f0;

    iput-object p2, p0, Lg0/b0;->b:Landroid/content/Context;

    iput-object p3, p0, Lg0/b0;->c:Ljava/util/concurrent/Executor;

    iput p4, p0, Lg0/b0;->d:I

    iput-object p5, p0, Lg0/b0;->e:Ly1/c$a;

    iput-wide p6, p0, Lg0/b0;->f:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lg0/b0;->a:Lg0/f0;

    iget-object v1, p0, Lg0/b0;->b:Landroid/content/Context;

    iget-object v2, p0, Lg0/b0;->c:Ljava/util/concurrent/Executor;

    iget v3, p0, Lg0/b0;->d:I

    iget-object v4, p0, Lg0/b0;->e:Ly1/c$a;

    iget-wide v5, p0, Lg0/b0;->f:J

    invoke-static/range {v0 .. v6}, Lg0/f0;->a(Lg0/f0;Landroid/content/Context;Ljava/util/concurrent/Executor;ILy1/c$a;J)V

    return-void
.end method
