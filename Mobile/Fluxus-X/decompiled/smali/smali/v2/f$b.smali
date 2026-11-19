.class public Lv2/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv2/f;->d(Landroid/content/Context;Ljava/util/List;ILjava/util/concurrent/Executor;Lv2/a;)Landroid/graphics/Typeface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lx2/a<",
        "Lv2/f$e;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lv2/a;


# direct methods
.method public constructor <init>(Lv2/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lv2/f$b;->a:Lv2/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lv2/f$e;)V
    .locals 1

    if-nez p1, :cond_0

    new-instance p1, Lv2/f$e;

    const/4 v0, -0x3

    invoke-direct {p1, v0}, Lv2/f$e;-><init>(I)V

    :cond_0
    iget-object v0, p0, Lv2/f$b;->a:Lv2/a;

    invoke-virtual {v0, p1}, Lv2/a;->b(Lv2/f$e;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lv2/f$e;

    invoke-virtual {p0, p1}, Lv2/f$b;->a(Lv2/f$e;)V

    return-void
.end method
