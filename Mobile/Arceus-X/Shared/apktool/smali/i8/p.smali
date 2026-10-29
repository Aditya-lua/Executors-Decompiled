.class public final synthetic Li8/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk8/b$a;


# instance fields
.field public final synthetic a:Li8/r;

.field public final synthetic b:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Li8/r;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li8/p;->a:Li8/r;

    iput-object p2, p0, Li8/p;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Li8/p;->a:Li8/r;

    iget-object v1, p0, Li8/p;->b:Ljava/util/Map;

    invoke-static {v0, v1}, Li8/r;->h(Li8/r;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
