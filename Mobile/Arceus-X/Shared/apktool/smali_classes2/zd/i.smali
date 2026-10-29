.class public final Lzd/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzd/l;


# instance fields
.field public final synthetic a:Lzd/u;

.field public final synthetic b:Ljava/util/Set;

.field public final synthetic c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic d:Lzd/o;


# direct methods
.method public constructor <init>(Lzd/o;Lzd/u;Ljava/util/Set;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 0

    iput-object p1, p0, Lzd/i;->d:Lzd/o;

    iput-object p2, p0, Lzd/i;->a:Lzd/u;

    iput-object p3, p0, Lzd/i;->b:Ljava/util/Set;

    iput-object p4, p0, Lzd/i;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/zip/ZipFile;Ljava/util/Set;)V
    .locals 2

    iget-object p1, p0, Lzd/i;->d:Lzd/o;

    iget-object v0, p0, Lzd/i;->a:Lzd/u;

    new-instance v1, Lzd/h;

    invoke-direct {v1, p0}, Lzd/h;-><init>(Lzd/i;)V

    invoke-static {p1, v0, p2, v1}, Lzd/o;->d(Lzd/o;Lzd/u;Ljava/util/Set;Lzd/m;)V

    return-void
.end method
