.class public final Lhq/n$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhq/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lhq/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhq/n;

    invoke-direct {v0}, Lhq/n;-><init>()V

    sput-object v0, Lhq/n$a;->a:Lhq/n;

    return-void
.end method
