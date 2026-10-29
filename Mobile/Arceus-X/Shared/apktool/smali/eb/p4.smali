.class public final Leb/p4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leb/q0;


# static fields
.field public static final b:Leb/p4;


# instance fields
.field public final a:Leb/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Leb/p4;

    invoke-direct {v0}, Leb/p4;-><init>()V

    sput-object v0, Leb/p4;->b:Leb/p4;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Leb/r4;

    invoke-direct {v0}, Leb/r4;-><init>()V

    invoke-static {v0}, Leb/u0;->b(Ljava/lang/Object;)Leb/q0;

    move-result-object v0

    iput-object v0, p0, Leb/p4;->a:Leb/q0;

    return-void
.end method

.method public static b()Z
    .locals 1

    sget-object v0, Leb/p4;->b:Leb/p4;

    invoke-virtual {v0}, Leb/p4;->a()Leb/q4;

    move-result-object v0

    invoke-interface {v0}, Leb/q4;->zza()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final a()Leb/q4;
    .locals 1

    iget-object v0, p0, Leb/p4;->a:Leb/q0;

    invoke-interface {v0}, Leb/q0;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/q4;

    return-object v0
.end method

.method public final bridge synthetic zza()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method
