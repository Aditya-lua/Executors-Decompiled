.class public final synthetic Ldr/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ldr/n;


# direct methods
.method public synthetic constructor <init>(Ldr/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldr/k;->a:Ldr/n;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ldr/k;->a:Ldr/n;

    invoke-static {v0}, Ldr/n;->j(Ldr/n;)V

    return-void
.end method
