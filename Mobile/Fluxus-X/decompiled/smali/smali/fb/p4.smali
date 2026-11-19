.class public final Lfb/p4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfb/q0;


# static fields
.field public static final b:Lfb/p4;


# instance fields
.field public final a:Lfb/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfb/p4;

    invoke-direct {v0}, Lfb/p4;-><init>()V

    sput-object v0, Lfb/p4;->b:Lfb/p4;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lfb/r4;

    invoke-direct {v0}, Lfb/r4;-><init>()V

    invoke-static {v0}, Lfb/u0;->b(Ljava/lang/Object;)Lfb/q0;

    move-result-object v0

    iput-object v0, p0, Lfb/p4;->a:Lfb/q0;

    return-void
.end method

.method public static b()Z
    .locals 1

    sget-object v0, Lfb/p4;->b:Lfb/p4;

    invoke-virtual {v0}, Lfb/p4;->a()Lfb/q4;

    move-result-object v0

    invoke-interface {v0}, Lfb/q4;->zza()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final a()Lfb/q4;
    .locals 1

    iget-object v0, p0, Lfb/p4;->a:Lfb/q0;

    invoke-interface {v0}, Lfb/q0;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfb/q4;

    return-object v0
.end method

.method public final bridge synthetic zza()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method
