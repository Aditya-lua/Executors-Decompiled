.class public final Lzn/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzn/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lzn/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lzn/h;

    invoke-direct {v0}, Lzn/h;-><init>()V

    sput-object v0, Lzn/h$a;->a:Lzn/h;

    return-void
.end method
