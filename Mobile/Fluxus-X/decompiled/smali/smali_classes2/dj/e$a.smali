.class public Ldj/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldj/e;->b(Ldj/e$e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ldj/e$e;

.field public final synthetic b:Ldj/e;


# direct methods
.method public constructor <init>(Ldj/e;Ldj/e$e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Ldj/e$a;->b:Ldj/e;

    iput-object p2, p0, Ldj/e$a;->a:Ldj/e$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Ldj/e$a;->b:Ldj/e;

    invoke-static {v0}, Ldj/e;->a(Ldj/e;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Ldj/e$a;->a:Ldj/e$e;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ldj/e$a;->b:Ldj/e;

    invoke-static {v0}, Ldj/e;->a(Ldj/e;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Ldj/e$a;->a:Ldj/e$e;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
