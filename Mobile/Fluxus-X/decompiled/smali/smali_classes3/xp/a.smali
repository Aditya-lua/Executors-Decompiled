.class public final synthetic Lxp/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lxp/b;


# direct methods
.method public synthetic constructor <init>(Lxp/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxp/a;->a:Lxp/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lxp/a;->a:Lxp/b;

    invoke-static {v0}, Lxp/b;->g2(Lxp/b;)V

    return-void
.end method
