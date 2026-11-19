.class public final synthetic Lmo/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lmo/z;


# direct methods
.method public synthetic constructor <init>(Lmo/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmo/w;->a:Lmo/z;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lmo/w;->a:Lmo/z;

    check-cast p1, Ly8/c;

    invoke-static {v0, p1}, Lmo/z;->c(Lmo/z;Ly8/c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
