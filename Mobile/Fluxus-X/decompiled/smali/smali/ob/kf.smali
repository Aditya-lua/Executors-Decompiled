.class public final synthetic Lob/kf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/nf;


# direct methods
.method public synthetic constructor <init>(Lob/nf;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lob/kf;->a:Lob/nf;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 1

    iget-object v0, p0, Lob/kf;->a:Lob/nf;

    invoke-virtual {v0}, Lob/nf;->a()V

    return-void
.end method
