.class public final Lep/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lep/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lep/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lep/e;

    invoke-direct {v0}, Lep/e;-><init>()V

    sput-object v0, Lep/e$a;->a:Lep/e;

    return-void
.end method
