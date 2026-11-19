.class public final synthetic Lz/a6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lz/b6;


# direct methods
.method public synthetic constructor <init>(Lz/b6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/a6;->a:Lz/b6;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lz/a6;->a:Lz/b6;

    invoke-static {v0}, Lz/b6;->b(Lz/b6;)V

    return-void
.end method
