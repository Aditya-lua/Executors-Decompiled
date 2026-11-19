.class public final Lde/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lde/o;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/ClassLoader;Ljava/io/File;Ljava/io/File;Z)Z
    .locals 7

    new-instance v4, Lde/t;

    invoke-direct {v4}, Lde/t;-><init>()V

    new-instance v6, Lde/b0;

    invoke-direct {v6}, Lde/b0;-><init>()V

    const-string v5, "path"

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move v3, p4

    invoke-static/range {v0 .. v6}, Lde/s;->d(Ljava/lang/ClassLoader;Ljava/io/File;Ljava/io/File;ZLde/r;Ljava/lang/String;Lde/q;)Z

    move-result p1

    return p1
.end method

.method public final b(Ljava/lang/ClassLoader;Ljava/util/Set;)V
    .locals 0

    invoke-static {p1, p2}, Lde/z;->c(Ljava/lang/ClassLoader;Ljava/util/Set;)V

    return-void
.end method
