.class public final enum Lce/r0;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lce/j0;


# static fields
.field public static final enum a:Lce/r0;

.field public static final b:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final synthetic c:[Lce/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lce/r0;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lce/r0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lce/r0;->a:Lce/r0;

    filled-new-array {v0}, [Lce/r0;

    move-result-object v0

    sput-object v0, Lce/r0;->c:[Lce/r0;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lce/r0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    const-string p1, "INSTANCE"

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[Lce/r0;
    .locals 1

    sget-object v0, Lce/r0;->c:[Lce/r0;

    invoke-virtual {v0}, [Lce/r0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lce/r0;

    return-object v0
.end method


# virtual methods
.method public final a(Lce/k0;)V
    .locals 1

    sget-object v0, Lce/r0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final zza()Lce/k0;
    .locals 1

    sget-object v0, Lce/r0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lce/k0;

    return-object v0
.end method
