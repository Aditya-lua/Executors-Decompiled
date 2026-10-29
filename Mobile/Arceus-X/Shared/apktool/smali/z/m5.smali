.class public final synthetic Lz/m5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/c$c;


# instance fields
.field public final synthetic a:Lz/n5;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:La0/d0;

.field public final synthetic d:Lb0/o;


# direct methods
.method public synthetic constructor <init>(Lz/n5;Ljava/util/List;La0/d0;Lb0/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/m5;->a:Lz/n5;

    iput-object p2, p0, Lz/m5;->b:Ljava/util/List;

    iput-object p3, p0, Lz/m5;->c:La0/d0;

    iput-object p4, p0, Lz/m5;->d:Lb0/o;

    return-void
.end method


# virtual methods
.method public final a(Ly1/c$a;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lz/m5;->a:Lz/n5;

    iget-object v1, p0, Lz/m5;->b:Ljava/util/List;

    iget-object v2, p0, Lz/m5;->c:La0/d0;

    iget-object v3, p0, Lz/m5;->d:Lb0/o;

    invoke-static {v0, v1, v2, v3, p1}, Lz/n5;->y(Lz/n5;Ljava/util/List;La0/d0;Lb0/o;Ly1/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
