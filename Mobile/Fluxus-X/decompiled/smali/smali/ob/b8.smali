.class public final Lob/b8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/i0;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lob/n8;


# direct methods
.method public constructor <init>(Lob/n8;Lob/i0;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Lob/b8;->a:Lob/i0;

    iput-object p3, p0, Lob/b8;->b:Ljava/lang/String;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/b8;->c:Lob/n8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lob/b8;->c:Lob/n8;

    invoke-virtual {v0}, Lob/n8;->z2()Lob/ve;

    move-result-object v1

    invoke-virtual {v1}, Lob/ve;->E()V

    invoke-virtual {v0}, Lob/n8;->z2()Lob/ve;

    move-result-object v0

    iget-object v1, p0, Lob/b8;->a:Lob/i0;

    iget-object v2, p0, Lob/b8;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lob/ve;->i(Lob/i0;Ljava/lang/String;)V

    return-void
.end method
