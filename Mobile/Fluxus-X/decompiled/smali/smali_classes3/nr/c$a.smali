.class public final Lnr/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnr/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lnr/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnr/c;

    invoke-direct {v0}, Lnr/c;-><init>()V

    sput-object v0, Lnr/c$a;->a:Lnr/c;

    return-void
.end method
