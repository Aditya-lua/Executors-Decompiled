.class public final synthetic Lwf/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lwf/p;


# direct methods
.method public synthetic constructor <init>(Lwf/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwf/n;->a:Lwf/p;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lwf/n;->a:Lwf/p;

    check-cast p1, Lx3/c;

    invoke-static {v0, p1}, Lwf/p;->c(Lwf/p;Lx3/c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
