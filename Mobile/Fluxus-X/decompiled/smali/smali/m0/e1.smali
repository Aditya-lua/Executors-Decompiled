.class public final synthetic Lm0/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lm0/f1;


# direct methods
.method public synthetic constructor <init>(Lm0/f1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/e1;->a:Lm0/f1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lm0/e1;->a:Lm0/f1;

    invoke-virtual {v0}, Lm0/f1;->j()V

    return-void
.end method
