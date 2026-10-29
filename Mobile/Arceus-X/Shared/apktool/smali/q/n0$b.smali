.class public Lq/n0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq/n0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Lq/n0;


# direct methods
.method public constructor <init>(Lq/n0;)V
    .locals 0

    iput-object p1, p0, Lq/n0$b;->a:Lq/n0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lq/n0$b;->a:Lq/n0;

    invoke-virtual {v0}, Lq/n0;->e()V

    return-void
.end method
