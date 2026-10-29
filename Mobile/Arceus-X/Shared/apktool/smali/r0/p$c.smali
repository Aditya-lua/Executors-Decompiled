.class public Lr0/p$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr0/p;->f(Ljava/util/concurrent/Executor;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lne/x;

.field public final synthetic c:Lr0/p;


# direct methods
.method public constructor <init>(Lr0/p;ILne/x;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lr0/p$c;->c:Lr0/p;

    iput p2, p0, Lr0/p$c;->a:I

    iput-object p3, p0, Lr0/p$c;->b:Lne/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lr0/p$c;->c:Lr0/p;

    iget v1, p0, Lr0/p$c;->a:I

    iget-object v2, p0, Lr0/p$c;->b:Lne/x;

    invoke-virtual {v0, v1, v2}, Lr0/p;->g(ILjava/util/concurrent/Future;)V

    return-void
.end method
