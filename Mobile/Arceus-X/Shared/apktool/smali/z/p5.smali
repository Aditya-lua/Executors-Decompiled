.class public final synthetic Lz/p5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lz/r5;


# direct methods
.method public synthetic constructor <init>(Lz/r5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/p5;->a:Lz/r5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lz/p5;->a:Lz/r5;

    invoke-static {v0}, Lz/r5;->I(Lz/r5;)V

    return-void
.end method
