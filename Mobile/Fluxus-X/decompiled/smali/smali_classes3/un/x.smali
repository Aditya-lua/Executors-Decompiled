.class public final synthetic Lun/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lun/b0;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lun/b0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lun/x;->a:Lun/b0;

    iput p2, p0, Lun/x;->b:I

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lun/x;->a:Lun/b0;

    iget v1, p0, Lun/x;->b:I

    invoke-static {v0, v1}, Lun/b0;->c(Lun/b0;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
