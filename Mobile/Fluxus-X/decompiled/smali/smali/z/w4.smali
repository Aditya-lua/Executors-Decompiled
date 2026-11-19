.class public final synthetic Lz/w4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lz/z4;


# direct methods
.method public synthetic constructor <init>(Lz/z4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/w4;->a:Lz/z4;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lz/w4;->a:Lz/z4;

    invoke-static {v0}, Lz/z4;->n(Lz/z4;)V

    return-void
.end method
