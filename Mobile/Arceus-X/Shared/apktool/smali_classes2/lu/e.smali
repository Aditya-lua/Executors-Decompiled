.class public final synthetic Llu/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lku/i1;


# instance fields
.field public final synthetic a:Llu/f;

.field public final synthetic b:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Llu/f;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llu/e;->a:Llu/f;

    iput-object p2, p0, Llu/e;->b:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Llu/e;->a:Llu/f;

    iget-object v1, p0, Llu/e;->b:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Llu/f;->a0(Llu/f;Ljava/lang/Runnable;)V

    return-void
.end method
