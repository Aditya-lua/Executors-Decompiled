.class public final synthetic Lrr/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lrr/n;


# direct methods
.method public synthetic constructor <init>(Lrr/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrr/k;->a:Lrr/n;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lrr/k;->a:Lrr/n;

    invoke-static {v0}, Lrr/n;->j(Lrr/n;)V

    return-void
.end method
