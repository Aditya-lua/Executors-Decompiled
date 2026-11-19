.class public final synthetic Lz/f5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lz/g5;

.field public final synthetic b:Lz/g5$d;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Ljava/util/Map;

.field public final synthetic e:Ljava/util/List;

.field public final synthetic f:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lz/g5;Lz/g5$d;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/f5;->a:Lz/g5;

    iput-object p2, p0, Lz/f5;->b:Lz/g5$d;

    iput-object p3, p0, Lz/f5;->c:Ljava/util/List;

    iput-object p4, p0, Lz/f5;->d:Ljava/util/Map;

    iput-object p5, p0, Lz/f5;->e:Ljava/util/List;

    iput-object p6, p0, Lz/f5;->f:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lz/f5;->a:Lz/g5;

    iget-object v1, p0, Lz/f5;->b:Lz/g5$d;

    iget-object v2, p0, Lz/f5;->c:Ljava/util/List;

    iget-object v3, p0, Lz/f5;->d:Ljava/util/Map;

    iget-object v4, p0, Lz/f5;->e:Ljava/util/List;

    iget-object v5, p0, Lz/f5;->f:Ljava/util/List;

    invoke-static/range {v0 .. v5}, Lz/g5;->b(Lz/g5;Lz/g5$d;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
