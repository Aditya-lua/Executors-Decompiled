.class public final synthetic Lm1/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lm1/i0;


# direct methods
.method public synthetic constructor <init>(Lm1/i0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/p;->a:Lm1/i0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lm1/p;->a:Lm1/i0;

    invoke-static {v0}, Lm1/i0;->k(Lm1/i0;)V

    return-void
.end method
