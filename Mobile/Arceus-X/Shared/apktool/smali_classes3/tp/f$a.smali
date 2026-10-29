.class public final Ltp/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltp/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Ltp/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltp/f;

    invoke-direct {v0}, Ltp/f;-><init>()V

    sput-object v0, Ltp/f$a;->a:Ltp/f;

    return-void
.end method
