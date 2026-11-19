.class public final Lvo/b0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvo/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lvo/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvo/b0;

    invoke-direct {v0}, Lvo/b0;-><init>()V

    sput-object v0, Lvo/b0$a;->a:Lvo/b0;

    return-void
.end method
