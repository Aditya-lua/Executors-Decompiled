.class public final Lfq/w1$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfq/w1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lfq/w1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfq/w1;

    invoke-direct {v0}, Lfq/w1;-><init>()V

    sput-object v0, Lfq/w1$a;->a:Lfq/w1;

    return-void
.end method
