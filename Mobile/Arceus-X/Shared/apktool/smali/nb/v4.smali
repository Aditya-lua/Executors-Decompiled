.class public final synthetic Lnb/v4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final synthetic a:Lnb/v4;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lnb/v4;

    invoke-direct {v0}, Lnb/v4;-><init>()V

    sput-object v0, Lnb/v4;->a:Lnb/v4;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/l9;->c()V

    return-void
.end method
