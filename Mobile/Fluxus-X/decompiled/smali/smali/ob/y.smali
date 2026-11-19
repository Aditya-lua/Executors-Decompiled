.class public final Lob/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/q8;

.field public final synthetic b:Lob/z;


# direct methods
.method public constructor <init>(Lob/z;Lob/q8;)V
    .locals 0

    iput-object p2, p0, Lob/y;->a:Lob/q8;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/y;->b:Lob/z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lob/y;->a:Lob/q8;

    invoke-interface {v0}, Lob/q8;->c()Lob/f;

    invoke-static {}, Lob/f;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Lob/q8;->b()Lob/h7;

    move-result-object v0

    invoke-virtual {v0, p0}, Lob/h7;->t(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lob/y;->b:Lob/z;

    invoke-virtual {v0}, Lob/z;->c()Z

    move-result v1

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v2, v3}, Lob/z;->e(J)V

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lob/z;->a()V

    :cond_1
    return-void
.end method
