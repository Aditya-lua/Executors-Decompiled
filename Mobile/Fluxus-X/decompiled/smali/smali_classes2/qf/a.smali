.class public final synthetic Lqf/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lqf/c;


# direct methods
.method public synthetic constructor <init>(Lqf/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqf/a;->a:Lqf/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lqf/a;->a:Lqf/c;

    check-cast p1, Lu3/d;

    invoke-static {v0, p1}, Lqf/c;->b(Lqf/c;Lu3/d;)Ly3/f;

    move-result-object p1

    return-object p1
.end method
