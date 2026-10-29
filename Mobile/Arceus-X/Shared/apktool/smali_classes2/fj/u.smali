.class public final synthetic Lfj/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:Lfj/a0;

.field public final synthetic b:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lfj/a0;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfj/u;->a:Lfj/a0;

    iput-object p2, p0, Lfj/u;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lfj/u;->a:Lfj/a0;

    iget-object v1, p0, Lfj/u;->b:Ljava/util/Map;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, p1}, Lfj/a0;->s(Lfj/a0;Ljava/util/Map;Ljava/util/List;)V

    return-void
.end method
