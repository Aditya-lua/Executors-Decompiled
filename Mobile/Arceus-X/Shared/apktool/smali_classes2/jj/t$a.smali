.class public final Ljj/t$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljj/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Ljj/t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljj/t;

    invoke-direct {v0}, Ljj/t;-><init>()V

    sput-object v0, Ljj/t$a;->a:Ljj/t;

    return-void
.end method

.method public static bridge synthetic a()Ljj/t;
    .locals 1

    sget-object v0, Ljj/t$a;->a:Ljj/t;

    return-object v0
.end method
