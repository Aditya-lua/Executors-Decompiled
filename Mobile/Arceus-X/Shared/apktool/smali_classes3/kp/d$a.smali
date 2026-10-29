.class public final Lkp/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkp/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lkp/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkp/d;

    invoke-direct {v0}, Lkp/d;-><init>()V

    sput-object v0, Lkp/d$a;->a:Lkp/d;

    return-void
.end method
