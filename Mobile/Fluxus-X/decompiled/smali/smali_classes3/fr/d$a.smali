.class public final Lfr/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfr/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lfr/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfr/d;

    invoke-direct {v0}, Lfr/d;-><init>()V

    sput-object v0, Lfr/d$a;->a:Lfr/d;

    return-void
.end method
