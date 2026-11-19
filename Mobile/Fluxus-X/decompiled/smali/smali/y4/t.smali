.class public final synthetic Ly4/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly4/t;->a:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ly4/t;->a:Lkotlin/jvm/functions/Function0;

    check-cast p1, Lg5/b;

    invoke-static {v0, p1}, Ly4/u;->a(Lkotlin/jvm/functions/Function0;Lg5/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
