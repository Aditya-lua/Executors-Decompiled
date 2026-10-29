.class public Lz/u0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz/u0;-><init>(Landroid/content/Context;La0/p0;Ljava/lang/String;Lz/z0;Lh0/a;Ln0/g1;Ljava/util/concurrent/Executor;Landroid/os/Handler;Lz/q3;JLg0/g0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lz/u0;


# direct methods
.method public constructor <init>(Lz/u0;)V
    .locals 0

    iput-object p1, p0, Lz/u0$a;->a:Lz/u0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(II)Landroid/media/CamcorderProfile;
    .locals 0

    invoke-static {p1, p2}, Landroid/media/CamcorderProfile;->get(II)Landroid/media/CamcorderProfile;

    move-result-object p1

    return-object p1
.end method

.method public b(II)Z
    .locals 0

    invoke-static {p1, p2}, Landroid/media/CamcorderProfile;->hasProfile(II)Z

    move-result p1

    return p1
.end method
