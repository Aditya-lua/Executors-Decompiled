.class public final Lpe/b$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpe/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# static fields
.field public static final d:Lpe/b$e;


# instance fields
.field public final a:Ljava/lang/Runnable;

.field public final b:Ljava/util/concurrent/Executor;

.field public c:Lpe/b$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpe/b$e;

    invoke-direct {v0}, Lpe/b$e;-><init>()V

    sput-object v0, Lpe/b$e;->d:Lpe/b$e;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lpe/b$e;->a:Ljava/lang/Runnable;

    .line 6
    iput-object v0, p0, Lpe/b$e;->b:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lpe/b$e;->a:Ljava/lang/Runnable;

    .line 3
    iput-object p2, p0, Lpe/b$e;->b:Ljava/util/concurrent/Executor;

    return-void
.end method
