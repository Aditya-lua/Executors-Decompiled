.class public final synthetic Lf1/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf1/r0$j$d;


# instance fields
.field public final synthetic a:Lf1/u;

.field public final synthetic b:Landroid/os/ParcelFileDescriptor;


# direct methods
.method public synthetic constructor <init>(Lf1/u;Landroid/os/ParcelFileDescriptor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/u0;->a:Lf1/u;

    iput-object p2, p0, Lf1/u0;->b:Landroid/os/ParcelFileDescriptor;

    return-void
.end method


# virtual methods
.method public final a(ILx2/a;)Landroid/media/MediaMuxer;
    .locals 2

    iget-object v0, p0, Lf1/u0;->a:Lf1/u;

    iget-object v1, p0, Lf1/u0;->b:Landroid/os/ParcelFileDescriptor;

    invoke-static {v0, v1, p1, p2}, Lf1/r0$j;->f(Lf1/u;Landroid/os/ParcelFileDescriptor;ILx2/a;)Landroid/media/MediaMuxer;

    move-result-object p1

    return-object p1
.end method
