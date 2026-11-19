.class public final synthetic Lnq/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Loq/c;


# direct methods
.method public synthetic constructor <init>(Loq/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnq/a;->a:Loq/c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lnq/a;->a:Loq/c;

    invoke-static {v0}, Lnq/q;->w(Loq/c;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
