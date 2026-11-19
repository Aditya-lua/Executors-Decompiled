.class public final synthetic Lus/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lus/e;


# direct methods
.method public synthetic constructor <init>(Lus/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lus/d;->a:Lus/e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lus/d;->a:Lus/e;

    check-cast p1, Lts/b;

    check-cast p2, Lms/l;

    invoke-static {v0, p1, p2}, Lus/e;->d(Lus/e;Lts/b;Lms/l;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
