.class public final synthetic Lmf/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/util/Map$Entry;

.field public final synthetic b:Lvf/a;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map$Entry;Lvf/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmf/u;->a:Ljava/util/Map$Entry;

    iput-object p2, p0, Lmf/u;->b:Lvf/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lmf/u;->a:Ljava/util/Map$Entry;

    iget-object v1, p0, Lmf/u;->b:Lvf/a;

    invoke-static {v0, v1}, Lmf/v;->d(Ljava/util/Map$Entry;Lvf/a;)V

    return-void
.end method
