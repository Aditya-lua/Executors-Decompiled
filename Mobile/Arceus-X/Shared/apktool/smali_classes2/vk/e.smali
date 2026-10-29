.class public Lvk/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvk/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvk/e$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvk/e;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lvk/e;->b:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lvk/e;->b:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public b()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lvk/e;->a:Ljava/util/concurrent/Executor;

    return-object v0
.end method
