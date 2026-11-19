.class public final synthetic Lun/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lun/s;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Lun/s;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lun/n;->a:Lun/s;

    iput-boolean p2, p0, Lun/n;->b:Z

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lun/n;->a:Lun/s;

    iget-boolean v1, p0, Lun/n;->b:Z

    invoke-static {v0, v1}, Lun/s;->g(Lun/s;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
