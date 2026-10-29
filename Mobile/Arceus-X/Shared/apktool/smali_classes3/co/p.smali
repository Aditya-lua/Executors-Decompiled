.class public final synthetic Lco/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->y(Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
