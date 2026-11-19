.class public final Lxq/y$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxq/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lxq/y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxq/y;

    invoke-direct {v0}, Lxq/y;-><init>()V

    sput-object v0, Lxq/y$a;->a:Lxq/y;

    return-void
.end method
