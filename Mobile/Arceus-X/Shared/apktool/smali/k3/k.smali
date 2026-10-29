.class public final synthetic Lk3/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/Executor;

.field public final synthetic b:Le3/p;

.field public final synthetic c:Le3/l0;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;Le3/p;Le3/l0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk3/k;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lk3/k;->b:Le3/p;

    iput-object p3, p0, Lk3/k;->c:Le3/l0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lk3/k;->a:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lk3/k;->b:Le3/p;

    iget-object v2, p0, Lk3/k;->c:Le3/l0;

    invoke-static {v0, v1, v2}, Landroidx/credentials/playservices/controllers/ResponseUtils$Companion;->$r8$lambda$YP4ZQ9JLCp3HyecrcwWw0iX1oz8(Ljava/util/concurrent/Executor;Le3/p;Le3/l0;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
