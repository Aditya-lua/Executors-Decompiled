.class public Lth/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lth/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lth/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lth/i$a;

    invoke-direct {v0}, Lth/i$a;-><init>()V

    invoke-virtual {v0}, Lth/i$a;->a()Lth/i;

    move-result-object v0

    sput-object v0, Lth/h$a;->a:Lth/i;

    return-void
.end method
