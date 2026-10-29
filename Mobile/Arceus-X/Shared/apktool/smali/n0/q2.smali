.class public final synthetic Ln0/q2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/util/Map$Entry;

.field public final synthetic b:Ln0/u2$a;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map$Entry;Ln0/u2$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/q2;->a:Ljava/util/Map$Entry;

    iput-object p2, p0, Ln0/q2;->b:Ln0/u2$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ln0/q2;->a:Ljava/util/Map$Entry;

    iget-object v1, p0, Ln0/q2;->b:Ln0/u2$a;

    invoke-static {v0, v1}, Ln0/u2;->f(Ljava/util/Map$Entry;Ln0/u2$a;)V

    return-void
.end method
