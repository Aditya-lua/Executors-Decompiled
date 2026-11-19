.class public final synthetic Lz/i5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lz/n5;

.field public final synthetic b:Lz/h5;


# direct methods
.method public synthetic constructor <init>(Lz/n5;Lz/h5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/i5;->a:Lz/n5;

    iput-object p2, p0, Lz/i5;->b:Lz/h5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lz/i5;->a:Lz/n5;

    iget-object v1, p0, Lz/i5;->b:Lz/h5;

    invoke-static {v0, v1}, Lz/n5;->x(Lz/n5;Lz/h5;)V

    return-void
.end method
