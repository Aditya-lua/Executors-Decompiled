.class public final synthetic Ly4/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ly4/p;


# direct methods
.method public synthetic constructor <init>(Ly4/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly4/o;->a:Ly4/p;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ly4/o;->a:Ly4/p;

    check-cast p1, Lh5/c;

    invoke-static {v0, p1}, Ly4/p;->C(Ly4/p;Lh5/c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
