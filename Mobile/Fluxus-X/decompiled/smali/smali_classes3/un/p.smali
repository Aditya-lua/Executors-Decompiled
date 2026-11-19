.class public final synthetic Lun/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lun/s;


# direct methods
.method public synthetic constructor <init>(Lun/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lun/p;->a:Lun/s;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lun/p;->a:Lun/s;

    invoke-static {v0}, Lun/s;->e(Lun/s;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
