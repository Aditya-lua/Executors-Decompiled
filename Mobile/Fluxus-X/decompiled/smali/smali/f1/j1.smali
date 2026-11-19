.class public final synthetic Lf1/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lf1/p1;


# direct methods
.method public synthetic constructor <init>(Lf1/p1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/j1;->a:Lf1/p1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lf1/j1;->a:Lf1/p1;

    invoke-static {v0}, Lf1/p1;->k0(Lf1/p1;)V

    return-void
.end method
