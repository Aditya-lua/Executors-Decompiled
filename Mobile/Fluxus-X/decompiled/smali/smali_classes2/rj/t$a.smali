.class public final Lrj/t$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrj/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lrj/t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrj/t;

    invoke-direct {v0}, Lrj/t;-><init>()V

    sput-object v0, Lrj/t$a;->a:Lrj/t;

    return-void
.end method

.method public static bridge synthetic a()Lrj/t;
    .locals 1

    sget-object v0, Lrj/t$a;->a:Lrj/t;

    return-object v0
.end method
