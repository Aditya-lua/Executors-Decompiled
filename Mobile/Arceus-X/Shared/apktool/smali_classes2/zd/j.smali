.class public final Lzd/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzd/l;


# instance fields
.field public final synthetic a:Ljava/util/Set;

.field public final synthetic b:Lzd/u;

.field public final synthetic c:Lzd/o;


# direct methods
.method public constructor <init>(Lzd/o;Ljava/util/Set;Lzd/u;)V
    .locals 0

    iput-object p1, p0, Lzd/j;->c:Lzd/o;

    iput-object p2, p0, Lzd/j;->a:Ljava/util/Set;

    iput-object p3, p0, Lzd/j;->b:Lzd/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/zip/ZipFile;Ljava/util/Set;)V
    .locals 3

    iget-object v0, p0, Lzd/j;->a:Ljava/util/Set;

    iget-object v1, p0, Lzd/j;->c:Lzd/o;

    iget-object v2, p0, Lzd/j;->b:Lzd/u;

    invoke-static {v1, p2, v2, p1}, Lzd/o;->a(Lzd/o;Ljava/util/Set;Lzd/u;Ljava/util/zip/ZipFile;)Ljava/util/Set;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-void
.end method
