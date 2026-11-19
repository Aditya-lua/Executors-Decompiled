.class public final synthetic Lk3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/Executor;

.field public final synthetic b:Le3/p;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;Le3/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk3/i;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lk3/i;->b:Le3/p;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lk3/i;->a:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lk3/i;->b:Le3/p;

    check-cast p1, Lf3/n;

    invoke-static {v0, v1, p1}, Landroidx/credentials/playservices/controllers/ResponseUtils$Companion;->$r8$lambda$2hPUcRRLnLX8WPITG566SK6PERA(Ljava/util/concurrent/Executor;Le3/p;Lf3/n;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
