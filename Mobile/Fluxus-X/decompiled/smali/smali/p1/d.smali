.class public final synthetic Lp1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lp1/i$b;


# direct methods
.method public synthetic constructor <init>(Lp1/i$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/d;->a:Lp1/i$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lp1/d;->a:Lp1/i$b;

    invoke-virtual {v0}, Lp1/i$b;->c()V

    return-void
.end method
