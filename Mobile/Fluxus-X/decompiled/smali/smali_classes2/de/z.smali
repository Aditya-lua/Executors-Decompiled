.class public final Lde/z;
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

.method public static c(Ljava/lang/ClassLoader;Ljava/util/Set;)V
    .locals 1

    new-instance v0, Lde/x;

    invoke-direct {v0}, Lde/x;-><init>()V

    invoke-static {p0, p1, v0}, Lde/v;->c(Ljava/lang/ClassLoader;Ljava/util/Set;Lde/u;)V

    return-void
.end method

.method public static d(Ljava/lang/ClassLoader;Ljava/io/File;Ljava/io/File;Z)Z
    .locals 7

    new-instance v4, Lde/t;

    invoke-direct {v4}, Lde/t;-><init>()V

    new-instance v6, Lde/y;

    invoke-direct {v6}, Lde/y;-><init>()V

    const-string v5, "path"

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    invoke-static/range {v0 .. v6}, Lde/s;->d(Ljava/lang/ClassLoader;Ljava/io/File;Ljava/io/File;ZLde/r;Ljava/lang/String;Lde/q;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final a(Ljava/lang/ClassLoader;Ljava/io/File;Ljava/io/File;Z)Z
    .locals 0

    invoke-static {p1, p2, p3, p4}, Lde/z;->d(Ljava/lang/ClassLoader;Ljava/io/File;Ljava/io/File;Z)Z

    move-result p1

    return p1
.end method

.method public final b(Ljava/lang/ClassLoader;Ljava/util/Set;)V
    .locals 0

    invoke-static {p1, p2}, Lde/z;->c(Ljava/lang/ClassLoader;Ljava/util/Set;)V

    return-void
.end method
