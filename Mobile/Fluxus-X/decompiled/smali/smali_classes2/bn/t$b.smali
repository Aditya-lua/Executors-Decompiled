.class public Lbn/t$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbn/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final a:Lbn/t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lbn/t;

    invoke-direct {v0}, Lbn/t;-><init>()V

    sput-object v0, Lbn/t$b;->a:Lbn/t;

    return-void
.end method

.method public static bridge synthetic a()Lbn/t;
    .locals 1

    sget-object v0, Lbn/t$b;->a:Lbn/t;

    return-object v0
.end method
