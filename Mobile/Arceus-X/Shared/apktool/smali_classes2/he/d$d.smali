.class public final Lhe/d$d;
.super Lhe/d$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhe/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final b:Lhe/d$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhe/d$d;

    invoke-direct {v0}, Lhe/d$d;-><init>()V

    sput-object v0, Lhe/d$d;->b:Lhe/d$d;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const-string v0, "CharMatcher.none()"

    invoke-direct {p0, v0}, Lhe/d$c;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/CharSequence;I)I
    .locals 0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    invoke-static {p2, p1}, Lhe/n;->o(II)I

    const/4 p1, -0x1

    return p1
.end method

.method public d(C)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
