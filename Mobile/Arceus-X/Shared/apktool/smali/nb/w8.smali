.class public final Lnb/w8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnb/o5;


# instance fields
.field public final synthetic a:Lnb/g7;


# direct methods
.method public constructor <init>(Lnb/x8;Lnb/g7;)V
    .locals 0

    iput-object p2, p0, Lnb/w8;->a:Lnb/g7;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()Z
    .locals 2

    iget-object v0, p0, Lnb/w8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->z()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    return v0
.end method
