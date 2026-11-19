.class public final synthetic Lob/m8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/n8;

.field public final synthetic b:Lob/hf;


# direct methods
.method public synthetic constructor <init>(Lob/n8;Lob/hf;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lob/m8;->a:Lob/n8;

    iput-object p2, p0, Lob/m8;->b:Lob/hf;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 2

    iget-object v0, p0, Lob/m8;->a:Lob/n8;

    iget-object v1, p0, Lob/m8;->b:Lob/hf;

    invoke-virtual {v0, v1}, Lob/n8;->t2(Lob/hf;)V

    return-void
.end method
