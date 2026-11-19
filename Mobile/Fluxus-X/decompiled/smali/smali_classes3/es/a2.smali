.class public final synthetic Les/a2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Les/f2;


# direct methods
.method public synthetic constructor <init>(Les/f2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/a2;->a:Les/f2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Les/a2;->a:Les/f2;

    invoke-static {v0}, Les/f2;->d(Les/f2;)V

    return-void
.end method
