.class public final Lz/u0$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/g1$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/u0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "f"
.end annotation


# instance fields
.field public final synthetic a:Lz/u0;


# direct methods
.method public constructor <init>(Lz/u0;)V
    .locals 0

    iput-object p1, p0, Lz/u0$f;->a:Lz/u0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lz/u0$f;->a:Lz/u0;

    iget-object v0, v0, Lz/u0;->e:Lz/u0$i;

    sget-object v1, Lz/u0$i;->j:Lz/u0$i;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lz/u0$f;->a:Lz/u0;

    invoke-virtual {v0}, Lz/u0;->v0()V

    :cond_0
    return-void
.end method
