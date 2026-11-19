.class public final Lun/j0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lun/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lun/j0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lun/j0;

    invoke-direct {v0}, Lun/j0;-><init>()V

    sput-object v0, Lun/j0$a;->a:Lun/j0;

    return-void
.end method
