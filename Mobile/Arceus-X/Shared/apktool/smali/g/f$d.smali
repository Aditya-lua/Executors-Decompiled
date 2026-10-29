.class public final Lg/f$d;
.super Lg/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg/f;->n(Ljava/lang/String;Landroidx/lifecycle/s;Lh/a;Lg/a;)Lg/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lg/c<",
        "TI;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\u0008\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u001e\u0010\r\u001a\u000c\u0012\u0004\u0012\u00028\u0000\u0012\u0002\u0008\u00030\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "g/f$d",
        "Lg/c;",
        "input",
        "Lk2/c;",
        "options",
        "",
        "c",
        "(Ljava/lang/Object;Lk2/c;)V",
        "d",
        "()V",
        "Lh/a;",
        "a",
        "()Lh/a;",
        "contract",
        "activity"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lg/f;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lh/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh/a<",
            "TI;TO;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lg/f;Ljava/lang/String;Lh/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg/f;",
            "Ljava/lang/String;",
            "Lh/a<",
            "TI;TO;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lg/f$d;->a:Lg/f;

    iput-object p2, p0, Lg/f$d;->b:Ljava/lang/String;

    iput-object p3, p0, Lg/f$d;->c:Lh/a;

    invoke-direct {p0}, Lg/c;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lh/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lh/a<",
            "TI;*>;"
        }
    .end annotation

    iget-object v0, p0, Lg/f$d;->c:Lh/a;

    return-object v0
.end method

.method public c(Ljava/lang/Object;Lk2/c;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TI;",
            "Lk2/c;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lg/f$d;->a:Lg/f;

    invoke-static {v0}, Lg/f;->c(Lg/f;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lg/f$d;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lg/f$d;->c:Lh/a;

    if-eqz v0, :cond_0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget-object v1, p0, Lg/f$d;->a:Lg/f;

    invoke-static {v1}, Lg/f;->d(Lg/f;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lg/f$d;->b:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :try_start_0
    iget-object v1, p0, Lg/f$d;->a:Lg/f;

    iget-object v2, p0, Lg/f$d;->c:Lh/a;

    invoke-virtual {v1, v0, v2, p1, p2}, Lg/f;->k(ILh/a;Ljava/lang/Object;Lk2/c;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p0, Lg/f$d;->a:Lg/f;

    invoke-static {p2}, Lg/f;->d(Lg/f;)Ljava/util/List;

    move-result-object p2

    iget-object v0, p0, Lg/f$d;->b:Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    throw p1

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Attempting to launch an unregistered ActivityResultLauncher with contract "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " and input "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ". You must ensure the ActivityResultLauncher is registered before calling launch()."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Lg/f$d;->a:Lg/f;

    iget-object v1, p0, Lg/f$d;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lg/f;->r(Ljava/lang/String;)V

    return-void
.end method
