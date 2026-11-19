.class public final synthetic Lob/ra;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/va;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lob/va;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lob/ra;->a:Lob/va;

    iput-object p2, p0, Lob/ra;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 3

    iget-object v0, p0, Lob/ra;->a:Lob/va;

    iget-object v0, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->L()Lob/p5;

    move-result-object v1

    iget-object v2, p0, Lob/ra;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lob/p5;->x(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lob/l7;->L()Lob/p5;

    move-result-object v0

    invoke-virtual {v0}, Lob/p5;->p()V

    :cond_0
    return-void
.end method
