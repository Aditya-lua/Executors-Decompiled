.class public final synthetic Lf6/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf6/r;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lf6/r;->a:Ljava/lang/String;

    check-cast p1, Lf5/b;

    invoke-static {v0, p1}, Lf6/u;->g(Ljava/lang/String;Lf5/b;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
