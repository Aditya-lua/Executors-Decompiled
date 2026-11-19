.class public final synthetic Lun/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lun/c;


# direct methods
.method public synthetic constructor <init>(Lun/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lun/a;->a:Lun/c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lun/a;->a:Lun/c;

    invoke-static {v0}, Lun/c;->m(Lun/c;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
