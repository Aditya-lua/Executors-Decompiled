.class public final synthetic Lnf/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lnf/o;

.field public final synthetic b:Ljava/util/concurrent/Callable;

.field public final synthetic c:Lnf/p$b;


# direct methods
.method public synthetic constructor <init>(Lnf/o;Ljava/util/concurrent/Callable;Lnf/p$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnf/k;->a:Lnf/o;

    iput-object p2, p0, Lnf/k;->b:Ljava/util/concurrent/Callable;

    iput-object p3, p0, Lnf/k;->c:Lnf/p$b;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lnf/k;->a:Lnf/o;

    iget-object v1, p0, Lnf/k;->b:Ljava/util/concurrent/Callable;

    iget-object v2, p0, Lnf/k;->c:Lnf/p$b;

    invoke-static {v0, v1, v2}, Lnf/o;->j(Lnf/o;Ljava/util/concurrent/Callable;Lnf/p$b;)Ljava/util/concurrent/Future;

    move-result-object v0

    return-object v0
.end method
