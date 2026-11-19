.class public Lq/p0$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation


# instance fields
.field public final synthetic a:Lq/p0;


# direct methods
.method public constructor <init>(Lq/p0;)V
    .locals 0

    iput-object p1, p0, Lq/p0$e;->a:Lq/p0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lq/p0$e;->a:Lq/p0;

    invoke-virtual {v0}, Lq/p0;->q()V

    return-void
.end method
