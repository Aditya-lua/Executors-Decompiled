.class public final synthetic Lhp/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lhp/j;


# direct methods
.method public synthetic constructor <init>(Lhp/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhp/i;->a:Lhp/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lhp/i;->a:Lhp/j;

    invoke-static {v0}, Lhp/j;->f(Lhp/j;)V

    return-void
.end method
