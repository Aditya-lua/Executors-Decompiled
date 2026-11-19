.class public final Lob/nb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/ob;


# direct methods
.method public constructor <init>(Lob/ob;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/nb;->a:Lob/ob;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lob/nb;->a:Lob/ob;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lob/ob;->E(Lob/gb;)V

    return-void
.end method
