.class public Li1/n$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li1/p$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li1/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final synthetic a:Li1/n;


# direct methods
.method public constructor <init>(Li1/n;)V
    .locals 0

    iput-object p1, p0, Li1/n$d;->a:Li1/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 2

    iget-object v0, p0, Li1/n$d;->a:Li1/n;

    iput-boolean p1, v0, Li1/n;->q:Z

    iget-object p1, v0, Li1/n;->g:Li1/n$e;

    sget-object v1, Li1/n$e;->b:Li1/n$e;

    if-ne p1, v1, :cond_0

    invoke-virtual {v0}, Li1/n;->s()V

    :cond_0
    return-void
.end method
