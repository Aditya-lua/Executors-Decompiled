.class public final Lob/q7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/i;

.field public final synthetic b:Lob/hf;

.field public final synthetic c:Lob/n8;


# direct methods
.method public constructor <init>(Lob/n8;Lob/i;Lob/hf;)V
    .locals 0

    iput-object p2, p0, Lob/q7;->a:Lob/i;

    iput-object p3, p0, Lob/q7;->b:Lob/hf;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/q7;->c:Lob/n8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lob/q7;->c:Lob/n8;

    invoke-virtual {v0}, Lob/n8;->z2()Lob/ve;

    move-result-object v1

    invoke-virtual {v1}, Lob/ve;->E()V

    iget-object v1, p0, Lob/q7;->a:Lob/i;

    iget-object v2, v1, Lob/i;->h:Lob/bf;

    invoke-virtual {v2}, Lob/bf;->zza()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lob/q7;->b:Lob/hf;

    invoke-virtual {v0}, Lob/n8;->z2()Lob/ve;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Lob/ve;->m0(Lob/i;Lob/hf;)V

    return-void

    :cond_0
    iget-object v2, p0, Lob/q7;->b:Lob/hf;

    invoke-virtual {v0}, Lob/n8;->z2()Lob/ve;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Lob/ve;->k0(Lob/i;Lob/hf;)V

    return-void
.end method
