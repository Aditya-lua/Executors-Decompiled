.class public final synthetic Lnq/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lnq/q;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lnq/q;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnq/h;->a:Lnq/q;

    iput-object p2, p0, Lnq/h;->b:Ljava/lang/String;

    iput-object p3, p0, Lnq/h;->c:Ljava/lang/String;

    iput-object p4, p0, Lnq/h;->d:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lnq/h;->a:Lnq/q;

    iget-object v1, p0, Lnq/h;->b:Ljava/lang/String;

    iget-object v2, p0, Lnq/h;->c:Ljava/lang/String;

    iget-object v3, p0, Lnq/h;->d:Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1, v2, v3}, Lnq/q;->y(Lnq/q;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
