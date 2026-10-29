.class public Ln0/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Ln0/a3$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/a3$a<",
            "-",
            "Ljava/util/List<",
            "Lg0/s;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Ln0/a3$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Ln0/a3$a<",
            "-",
            "Ljava/util/List<",
            "Lg0/s;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/b$a;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Ln0/b$a;->b:Ln0/a3$a;

    return-void
.end method
