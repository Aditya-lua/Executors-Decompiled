.class public final Lob/ne;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lob/hf;

.field public final synthetic b:Lob/ve;


# direct methods
.method public constructor <init>(Lob/ve;Lob/hf;)V
    .locals 0

    iput-object p2, p0, Lob/ne;->a:Lob/hf;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/ne;->b:Lob/ve;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic call()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lob/ne;->a:Lob/hf;

    iget-object v1, v0, Lob/hf;->f:Ljava/lang/String;

    invoke-static {v1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lob/ne;->b:Lob/ve;

    invoke-virtual {v2, v1}, Lob/ve;->g(Ljava/lang/String;)Lob/v8;

    move-result-object v1

    sget-object v3, Lob/u8;->c:Lob/u8;

    invoke-virtual {v1, v3}, Lob/v8;->o(Lob/u8;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, v0, Lob/hf;->x:Ljava/lang/String;

    const/16 v4, 0x64

    invoke-static {v1, v4}, Lob/v8;->f(Ljava/lang/String;I)Lob/v8;

    move-result-object v1

    invoke-virtual {v1, v3}, Lob/v8;->o(Lob/u8;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v0}, Lob/ve;->o0(Lob/hf;)Lob/h6;

    move-result-object v0

    invoke-virtual {v0}, Lob/h6;->p0()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    invoke-virtual {v2}, Lob/ve;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->w()Lob/z5;

    move-result-object v0

    const-string v1, "Analytics storage consent denied. Returning null app instance id"

    invoke-virtual {v0, v1}, Lob/z5;->a(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method
