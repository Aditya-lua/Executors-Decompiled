.class public Log/p$t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llg/b0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Log/p;->c(Lsg/a;Llg/a0;)Llg/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lsg/a;

.field public final synthetic b:Llg/a0;


# direct methods
.method public constructor <init>(Lsg/a;Llg/a0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Log/p$t;->a:Lsg/a;

    iput-object p2, p0, Log/p$t;->b:Llg/a0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Llg/f;Lsg/a;)Llg/a0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Llg/f;",
            "Lsg/a<",
            "TT;>;)",
            "Llg/a0<",
            "TT;>;"
        }
    .end annotation

    iget-object p1, p0, Log/p$t;->a:Lsg/a;

    invoke-virtual {p2, p1}, Lsg/a;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Log/p$t;->b:Llg/a0;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
