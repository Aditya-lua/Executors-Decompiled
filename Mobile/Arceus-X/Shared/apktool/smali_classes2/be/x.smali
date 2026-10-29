.class public final Lbe/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbe/u;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/util/List;Ljava/io/File;Ljava/util/List;)[Ljava/lang/Object;
    .locals 1

    const-class p3, [Ljava/lang/Object;

    const-class p4, Ljava/util/List;

    const-string v0, "makePathElements"

    invoke-static {p1, v0, p3, p4, p2}, Lbe/g0;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    return-object p1
.end method
