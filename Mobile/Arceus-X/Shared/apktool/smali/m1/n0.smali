.class public final synthetic Lm1/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/util/Map$Entry;

.field public final synthetic b:Lh1/c$a;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map$Entry;Lh1/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/n0;->a:Ljava/util/Map$Entry;

    iput-object p2, p0, Lm1/n0;->b:Lh1/c$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lm1/n0;->a:Ljava/util/Map$Entry;

    iget-object v1, p0, Lm1/n0;->b:Lh1/c$a;

    invoke-static {v0, v1}, Lm1/i0$e;->g(Ljava/util/Map$Entry;Lh1/c$a;)V

    return-void
.end method
