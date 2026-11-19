.class public final Lob/w7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/hf;

.field public final synthetic b:Lob/n8;


# direct methods
.method public constructor <init>(Lob/n8;Lob/hf;)V
    .locals 0

    iput-object p2, p0, Lob/w7;->a:Lob/hf;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/w7;->b:Lob/n8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lob/w7;->b:Lob/n8;

    invoke-virtual {v0}, Lob/n8;->z2()Lob/ve;

    move-result-object v1

    invoke-virtual {v1}, Lob/ve;->E()V

    invoke-virtual {v0}, Lob/n8;->z2()Lob/ve;

    move-result-object v0

    invoke-virtual {v0}, Lob/ve;->b()Lob/h7;

    move-result-object v1

    invoke-virtual {v1}, Lob/o8;->h()V

    invoke-virtual {v0}, Lob/ve;->O0()V

    iget-object v1, p0, Lob/w7;->a:Lob/hf;

    iget-object v2, v1, Lob/hf;->f:Ljava/lang/String;

    invoke-static {v2}, Lo9/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v0, v1}, Lob/ve;->o0(Lob/hf;)Lob/h6;

    return-void
.end method
