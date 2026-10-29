.class public final synthetic Lrp/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Z


# direct methods
.method public synthetic constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lrp/e1;->a:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-boolean v0, p0, Lrp/e1;->a:Z

    check-cast p1, Lym/r$c;

    invoke-static {v0, p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->w(ZLym/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
