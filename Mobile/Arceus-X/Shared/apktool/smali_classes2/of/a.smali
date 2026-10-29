.class public final synthetic Lof/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lof/c;


# direct methods
.method public synthetic constructor <init>(Lof/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lof/a;->a:Lof/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lof/a;->a:Lof/c;

    check-cast p1, Lt3/d;

    invoke-static {v0, p1}, Lof/c;->b(Lof/c;Lt3/d;)Lx3/f;

    move-result-object p1

    return-object p1
.end method
