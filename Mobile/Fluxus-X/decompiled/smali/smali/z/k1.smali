.class public final synthetic Lz/k1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lz/g1$d;


# direct methods
.method public synthetic constructor <init>(Lz/g1$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/k1;->a:Lz/g1$d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lz/k1;->a:Lz/g1$d;

    invoke-virtual {v0}, Lz/g1$d;->j()V

    return-void
.end method
