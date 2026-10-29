.class public final synthetic Lm1/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lm1/i0$g;


# direct methods
.method public synthetic constructor <init>(Lm1/i0$g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/c0;->a:Lm1/i0$g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lm1/c0;->a:Lm1/i0$g;

    invoke-virtual {v0}, Lm1/i0$g;->l()V

    return-void
.end method
