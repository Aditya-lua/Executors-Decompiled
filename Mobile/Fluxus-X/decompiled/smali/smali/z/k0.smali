.class public final synthetic Lz/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lz/u0;


# direct methods
.method public synthetic constructor <init>(Lz/u0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/k0;->a:Lz/u0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lz/k0;->a:Lz/u0;

    invoke-static {v0}, Lz/u0;->I(Lz/u0;)V

    return-void
.end method
