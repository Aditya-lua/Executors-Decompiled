.class public final Lob/oc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/sc;


# direct methods
.method public constructor <init>(Lob/sc;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/oc;->a:Lob/sc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lob/oc;->a:Lob/sc;

    iget-object v0, v0, Lob/sc;->c:Lob/yc;

    new-instance v1, Landroid/content/ComponentName;

    iget-object v2, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v2}, Lob/l7;->d()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v2}, Lob/l7;->c()Lob/f;

    const-string v2, "com.google.android.gms.measurement.AppMeasurementService"

    invoke-direct {v1, v3, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lob/yc;->K(Landroid/content/ComponentName;)V

    return-void
.end method
