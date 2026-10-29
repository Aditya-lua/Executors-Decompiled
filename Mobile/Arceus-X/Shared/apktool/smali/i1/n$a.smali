.class public Li1/n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/a3$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li1/n;->x(Lh1/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ln0/a3$a<",
        "Lh1/c$a;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lh1/c;

.field public final synthetic b:Li1/n;


# direct methods
.method public constructor <init>(Li1/n;Lh1/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Li1/n$a;->b:Li1/n;

    iput-object p2, p0, Li1/n$a;->a:Lh1/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lh1/c$a;

    invoke-virtual {p0, p1}, Li1/n$a;->b(Lh1/c$a;)V

    return-void
.end method

.method public b(Lh1/c$a;)V
    .locals 2

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Li1/n$a;->b:Li1/n;

    iget-object v0, v0, Li1/n;->l:Lh1/c;

    iget-object v1, p0, Li1/n$a;->a:Lh1/c;

    if-ne v0, v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Receive BufferProvider state change: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Li1/n$a;->b:Li1/n;

    iget-object v1, v1, Li1/n;->h:Lh1/c$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AudioSource"

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Li1/n$a;->b:Li1/n;

    iget-object v1, v0, Li1/n;->h:Lh1/c$a;

    if-eq v1, p1, :cond_0

    iput-object p1, v0, Li1/n;->h:Lh1/c$a;

    invoke-virtual {v0}, Li1/n;->H()V

    :cond_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, Li1/n$a;->b:Li1/n;

    iget-object v1, v0, Li1/n;->l:Lh1/c;

    iget-object v2, p0, Li1/n$a;->a:Lh1/c;

    if-ne v1, v2, :cond_0

    invoke-virtual {v0, p1}, Li1/n;->r(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method
