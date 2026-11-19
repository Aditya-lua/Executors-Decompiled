.class public final Lbe/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbe/l;


# instance fields
.field public final synthetic a:Lbe/u;

.field public final synthetic b:Ljava/util/Set;

.field public final synthetic c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic d:Lbe/o;


# direct methods
.method public constructor <init>(Lbe/o;Lbe/u;Ljava/util/Set;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 0

    iput-object p1, p0, Lbe/i;->d:Lbe/o;

    iput-object p2, p0, Lbe/i;->a:Lbe/u;

    iput-object p3, p0, Lbe/i;->b:Ljava/util/Set;

    iput-object p4, p0, Lbe/i;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/zip/ZipFile;Ljava/util/Set;)V
    .locals 2

    iget-object p1, p0, Lbe/i;->d:Lbe/o;

    iget-object v0, p0, Lbe/i;->a:Lbe/u;

    new-instance v1, Lbe/h;

    invoke-direct {v1, p0}, Lbe/h;-><init>(Lbe/i;)V

    invoke-static {p1, v0, p2, v1}, Lbe/o;->d(Lbe/o;Lbe/u;Ljava/util/Set;Lbe/m;)V

    return-void
.end method
