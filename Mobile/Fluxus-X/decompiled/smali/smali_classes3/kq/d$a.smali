.class public final Lkq/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkq/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lkq/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkq/d;

    invoke-direct {v0}, Lkq/d;-><init>()V

    sput-object v0, Lkq/d$a;->a:Lkq/d;

    return-void
.end method
