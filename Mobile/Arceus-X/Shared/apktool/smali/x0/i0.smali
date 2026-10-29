.class public final synthetic Lx0/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lx0/n0;


# direct methods
.method public synthetic constructor <init>(Lx0/n0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx0/i0;->a:Lx0/n0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lx0/i0;->a:Lx0/n0;

    invoke-static {v0}, Lx0/n0;->b(Lx0/n0;)V

    return-void
.end method
