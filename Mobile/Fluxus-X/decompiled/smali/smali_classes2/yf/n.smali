.class public final synthetic Lyf/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lyf/p;


# direct methods
.method public synthetic constructor <init>(Lyf/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyf/n;->a:Lyf/p;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lyf/n;->a:Lyf/p;

    check-cast p1, Ly3/c;

    invoke-static {v0, p1}, Lyf/p;->c(Lyf/p;Ly3/c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
