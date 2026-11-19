.class public final synthetic Lz/v4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ln0/u1;


# direct methods
.method public synthetic constructor <init>(Ln0/u1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/v4;->a:Ln0/u1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lz/v4;->a:Ln0/u1;

    invoke-static {v0}, Lz/z4;->k(Ln0/u1;)V

    return-void
.end method
