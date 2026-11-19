.class public final synthetic Lyf/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lyf/p;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lyf/p;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyf/m;->a:Lyf/p;

    iput-object p2, p0, Lyf/m;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lyf/m;->a:Lyf/p;

    iget-object v1, p0, Lyf/m;->b:Ljava/lang/String;

    check-cast p1, Ly3/c;

    invoke-static {v0, v1, p1}, Lyf/p;->d(Lyf/p;Ljava/lang/String;Ly3/c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
