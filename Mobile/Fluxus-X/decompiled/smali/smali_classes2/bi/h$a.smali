.class public Lbi/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbi/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lbi/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lbi/i$a;

    invoke-direct {v0}, Lbi/i$a;-><init>()V

    invoke-virtual {v0}, Lbi/i$a;->a()Lbi/i;

    move-result-object v0

    sput-object v0, Lbi/h$a;->a:Lbi/i;

    return-void
.end method
