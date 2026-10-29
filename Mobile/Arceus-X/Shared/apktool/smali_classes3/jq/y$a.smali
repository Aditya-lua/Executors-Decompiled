.class public final Ljq/y$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljq/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Ljq/y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljq/y;

    invoke-direct {v0}, Ljq/y;-><init>()V

    sput-object v0, Ljq/y$a;->a:Ljq/y;

    return-void
.end method
