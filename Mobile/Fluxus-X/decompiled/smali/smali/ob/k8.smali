.class public final synthetic Lob/k8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/n8;

.field public final synthetic b:Lob/hf;

.field public final synthetic c:Lob/g;


# direct methods
.method public synthetic constructor <init>(Lob/n8;Lob/hf;Lob/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lob/k8;->a:Lob/n8;

    iput-object p2, p0, Lob/k8;->b:Lob/hf;

    iput-object p3, p0, Lob/k8;->c:Lob/g;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 3

    iget-object v0, p0, Lob/k8;->a:Lob/n8;

    iget-object v1, p0, Lob/k8;->b:Lob/hf;

    iget-object v2, p0, Lob/k8;->c:Lob/g;

    invoke-virtual {v0, v1, v2}, Lob/n8;->x2(Lob/hf;Lob/g;)V

    return-void
.end method
