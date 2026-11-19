.class public final Lkq/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkq/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lkq/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkq/h;

    invoke-direct {v0}, Lkq/h;-><init>()V

    sput-object v0, Lkq/h$a;->a:Lkq/h;

    return-void
.end method
