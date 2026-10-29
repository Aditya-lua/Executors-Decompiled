.class public final synthetic Lz/l5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lz/n5;


# direct methods
.method public synthetic constructor <init>(Lz/n5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/l5;->a:Lz/n5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lz/l5;->a:Lz/n5;

    invoke-static {v0}, Lz/n5;->B(Lz/n5;)V

    return-void
.end method
