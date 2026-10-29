.class public final synthetic Lxu/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lxu/n;


# direct methods
.method public synthetic constructor <init>(Lxu/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxu/m;->a:Lxu/n;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lxu/m;->a:Lxu/n;

    check-cast p1, Lxu/h0;

    invoke-static {v0, p1}, Lxu/n;->a(Lxu/n;Lxu/h0;)Lxu/h0;

    move-result-object p1

    return-object p1
.end method
