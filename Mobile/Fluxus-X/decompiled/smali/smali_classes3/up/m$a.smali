.class public final Lup/m$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lup/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lup/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lup/m;

    invoke-direct {v0}, Lup/m;-><init>()V

    sput-object v0, Lup/m$a;->a:Lup/m;

    return-void
.end method
