.class public Lr0/p$b;
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
.field public final synthetic a:Lr0/p;


# direct methods
.method public constructor <init>(Lr0/p;)V
    .locals 0

    iput-object p1, p0, Lr0/p$b;->a:Lr0/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lr0/p$b;->a:Lr0/p;

    const/4 v1, 0x0

    iput-object v1, v0, Lr0/p;->b:Ljava/util/List;

    iput-object v1, v0, Lr0/p;->a:Ljava/util/List;

    return-void
.end method
