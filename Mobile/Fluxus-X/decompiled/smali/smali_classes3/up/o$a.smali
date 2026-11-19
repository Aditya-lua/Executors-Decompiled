.class public final Lup/o$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lup/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lup/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lup/o;

    invoke-direct {v0}, Lup/o;-><init>()V

    sput-object v0, Lup/o$a;->a:Lup/o;

    return-void
.end method
