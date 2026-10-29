.class public final synthetic Lm1/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lm1/m;


# direct methods
.method public synthetic constructor <init>(Lm1/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/z0;->a:Lm1/m;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lm1/z0;->a:Lm1/m;

    invoke-interface {v0}, Lm1/m;->e()V

    return-void
.end method
