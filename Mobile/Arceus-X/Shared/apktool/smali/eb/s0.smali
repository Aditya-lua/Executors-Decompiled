.class public final Leb/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leb/q0;


# static fields
.field public static final b:Leb/q0;


# instance fields
.field public volatile a:Leb/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Leb/r0;->a:Leb/r0;

    sput-object v0, Leb/s0;->b:Leb/q0;

    return-void
.end method

.method public constructor <init>(Leb/q0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leb/s0;->a:Leb/q0;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Leb/s0;->a:Leb/q0;

    sget-object v1, Leb/s0;->b:Leb/q0;

    if-ne v0, v1, :cond_0

    const-string v0, "<supplier that returned null>"

    :cond_0
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Suppliers.memoize("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zza()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method
