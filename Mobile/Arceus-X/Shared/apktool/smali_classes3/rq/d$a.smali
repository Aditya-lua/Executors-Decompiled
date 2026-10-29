.class public final Lrq/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrq/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lrq/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrq/d;

    invoke-direct {v0}, Lrq/d;-><init>()V

    sput-object v0, Lrq/d$a;->a:Lrq/d;

    return-void
.end method
