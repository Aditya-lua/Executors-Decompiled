.class public final synthetic Lwj/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lxj/f;


# direct methods
.method public synthetic constructor <init>(Lxj/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwj/g;->a:Lxj/f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lwj/g;->a:Lxj/f;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lwj/j;->b(Lxj/f;Ljava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
