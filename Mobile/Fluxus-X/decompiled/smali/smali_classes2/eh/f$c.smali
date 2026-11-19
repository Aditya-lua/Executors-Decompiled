.class public Leh/f$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leh/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field public static final a:Leh/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Leh/f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Leh/f;-><init>(Leh/g;)V

    sput-object v0, Leh/f$c;->a:Leh/f;

    return-void
.end method

.method public static bridge synthetic a()Leh/f;
    .locals 1

    sget-object v0, Leh/f$c;->a:Leh/f;

    return-object v0
.end method
