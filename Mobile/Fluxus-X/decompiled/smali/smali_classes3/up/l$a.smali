.class public final Lup/l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lup/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lup/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lup/l;

    invoke-direct {v0}, Lup/l;-><init>()V

    sput-object v0, Lup/l$a;->a:Lup/l;

    return-void
.end method
