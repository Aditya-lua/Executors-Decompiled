.class public final synthetic Lun/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lun/b0;


# direct methods
.method public synthetic constructor <init>(Lun/b0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lun/z;->a:Lun/b0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lun/z;->a:Lun/b0;

    invoke-static {v0}, Lun/b0;->b(Lun/b0;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
