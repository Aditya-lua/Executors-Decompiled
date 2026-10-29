.class public final Leb/m4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leb/q0;


# static fields
.field public static final b:Leb/m4;


# instance fields
.field public final a:Leb/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Leb/m4;

    invoke-direct {v0}, Leb/m4;-><init>()V

    sput-object v0, Leb/m4;->b:Leb/m4;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Leb/o4;

    invoke-direct {v0}, Leb/o4;-><init>()V

    invoke-static {v0}, Leb/u0;->b(Ljava/lang/Object;)Leb/q0;

    move-result-object v0

    iput-object v0, p0, Leb/m4;->a:Leb/q0;

    return-void
.end method

.method public static a()Z
    .locals 1

    sget-object v0, Leb/m4;->b:Leb/m4;

    iget-object v0, v0, Leb/m4;->a:Leb/q0;

    invoke-interface {v0}, Leb/q0;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/n4;

    invoke-interface {v0}, Leb/n4;->zza()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final bridge synthetic zza()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method
