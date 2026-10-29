.class public Lvi/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvi/e;->b(Lvi/e$e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lvi/e$e;

.field public final synthetic b:Lvi/e;


# direct methods
.method public constructor <init>(Lvi/e;Lvi/e$e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lvi/e$a;->b:Lvi/e;

    iput-object p2, p0, Lvi/e$a;->a:Lvi/e$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lvi/e$a;->b:Lvi/e;

    invoke-static {v0}, Lvi/e;->a(Lvi/e;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lvi/e$a;->a:Lvi/e$e;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lvi/e$a;->b:Lvi/e;

    invoke-static {v0}, Lvi/e;->a(Lvi/e;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lvi/e$a;->a:Lvi/e$e;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
