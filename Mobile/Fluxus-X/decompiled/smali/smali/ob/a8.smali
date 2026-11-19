.class public final Lob/a8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/i0;

.field public final synthetic b:Lob/hf;

.field public final synthetic c:Lob/n8;


# direct methods
.method public constructor <init>(Lob/n8;Lob/i0;Lob/hf;)V
    .locals 0

    iput-object p2, p0, Lob/a8;->a:Lob/i0;

    iput-object p3, p0, Lob/a8;->b:Lob/hf;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/a8;->c:Lob/n8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lob/a8;->a:Lob/i0;

    iget-object v1, p0, Lob/a8;->b:Lob/hf;

    iget-object v2, p0, Lob/a8;->c:Lob/n8;

    invoke-virtual {v2, v0, v1}, Lob/n8;->E2(Lob/i0;Lob/hf;)Lob/i0;

    move-result-object v0

    invoke-virtual {v2, v0, v1}, Lob/n8;->D2(Lob/i0;Lob/hf;)V

    return-void
.end method
