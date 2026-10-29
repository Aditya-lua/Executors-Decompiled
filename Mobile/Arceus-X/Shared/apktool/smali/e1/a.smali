.class public final synthetic Le1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Le1/c;

.field public final synthetic b:Ljava/util/Map;

.field public final synthetic c:Landroidx/camera/core/d;

.field public final synthetic d:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Le1/c;Ljava/util/Map;Landroidx/camera/core/d;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le1/a;->a:Le1/c;

    iput-object p2, p0, Le1/a;->b:Ljava/util/Map;

    iput-object p3, p0, Le1/a;->c:Landroidx/camera/core/d;

    iput-object p4, p0, Le1/a;->d:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Le1/a;->a:Le1/c;

    iget-object v1, p0, Le1/a;->b:Ljava/util/Map;

    iget-object v2, p0, Le1/a;->c:Landroidx/camera/core/d;

    iget-object v3, p0, Le1/a;->d:Ljava/util/Map;

    invoke-static {v0, v1, v2, v3}, Le1/c;->b(Le1/c;Ljava/util/Map;Landroidx/camera/core/d;Ljava/util/Map;)V

    return-void
.end method
