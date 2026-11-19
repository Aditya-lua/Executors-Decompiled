.class public final Lcq/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcq/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lcq/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcq/f;

    invoke-direct {v0}, Lcq/f;-><init>()V

    sput-object v0, Lcq/f$a;->a:Lcq/f;

    return-void
.end method
