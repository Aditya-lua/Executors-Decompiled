.class public final Lfb/m4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfb/q0;


# static fields
.field public static final b:Lfb/m4;


# instance fields
.field public final a:Lfb/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfb/m4;

    invoke-direct {v0}, Lfb/m4;-><init>()V

    sput-object v0, Lfb/m4;->b:Lfb/m4;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lfb/o4;

    invoke-direct {v0}, Lfb/o4;-><init>()V

    invoke-static {v0}, Lfb/u0;->b(Ljava/lang/Object;)Lfb/q0;

    move-result-object v0

    iput-object v0, p0, Lfb/m4;->a:Lfb/q0;

    return-void
.end method

.method public static a()Z
    .locals 1

    sget-object v0, Lfb/m4;->b:Lfb/m4;

    iget-object v0, v0, Lfb/m4;->a:Lfb/q0;

    invoke-interface {v0}, Lfb/q0;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfb/n4;

    invoke-interface {v0}, Lfb/n4;->zza()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final bridge synthetic zza()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method
