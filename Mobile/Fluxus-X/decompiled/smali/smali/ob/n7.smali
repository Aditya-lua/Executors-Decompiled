.class public final Lob/n7;
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

    iput-object p2, p0, Lob/n7;->a:Lob/hf;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/n7;->b:Lob/n8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lob/n7;->b:Lob/n8;

    invoke-virtual {v0}, Lob/n8;->z2()Lob/ve;

    move-result-object v1

    invoke-virtual {v1}, Lob/ve;->E()V

    invoke-virtual {v0}, Lob/n8;->z2()Lob/ve;

    move-result-object v0

    iget-object v1, p0, Lob/n7;->a:Lob/hf;

    invoke-virtual {v0, v1}, Lob/ve;->h0(Lob/hf;)V

    return-void
.end method
