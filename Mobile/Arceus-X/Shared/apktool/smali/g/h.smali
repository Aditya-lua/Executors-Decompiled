.class public final Lg/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg/h$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001:\u0001\u0006B\t\u0008\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R*\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@@X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000bR*\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r8\u0006@@X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R*\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158\u0006@@X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR*\u0010\"\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u001c8\u0006@@X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u000e\u0010\u001f\"\u0004\u0008 \u0010!R*\u0010%\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158\u0006@@X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010\u0016\u001a\u0004\u0008#\u0010\u0018\"\u0004\u0008$\u0010\u001aR*\u0010+\u001a\u00020&2\u0006\u0010\u0005\u001a\u00020&8\u0006@@X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008#\u0010\'\u001a\u0004\u0008\u0006\u0010(\"\u0004\u0008)\u0010*R.\u0010-\u001a\u0004\u0018\u00010,2\u0008\u0010\u0005\u001a\u0004\u0018\u00010,8\u0006@@X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008-\u0010.\u001a\u0004\u0008\u001d\u0010/\"\u0004\u00080\u00101\u00a8\u00062"
    }
    d2 = {
        "Lg/h;",
        "",
        "<init>",
        "()V",
        "Lh/f$h;",
        "value",
        "a",
        "Lh/f$h;",
        "e",
        "()Lh/f$h;",
        "m",
        "(Lh/f$h;)V",
        "mediaType",
        "",
        "b",
        "I",
        "c",
        "()I",
        "k",
        "(I)V",
        "maxItems",
        "",
        "Z",
        "g",
        "()Z",
        "n",
        "(Z)V",
        "isOrderedSelection",
        "Lh/f$b;",
        "d",
        "Lh/f$b;",
        "()Lh/f$b;",
        "j",
        "(Lh/f$b;)V",
        "defaultTab",
        "f",
        "i",
        "isCustomAccentColorApplied",
        "",
        "J",
        "()J",
        "h",
        "(J)V",
        "accentColor",
        "Lh/f$e;",
        "mediaCapabilitiesForTranscoding",
        "Lh/f$e;",
        "()Lh/f$e;",
        "l",
        "(Lh/f$e;)V",
        "activity"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public a:Lh/f$h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:I

.field public c:Z

.field public d:Lh/f$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public e:Z

.field public f:J


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lh/f$c;->a:Lh/f$c;

    iput-object v0, p0, Lg/h;->a:Lh/f$h;

    sget-object v0, Lh/e;->b:Lh/e$a;

    invoke-virtual {v0}, Lh/e$a;->a()I

    move-result v0

    iput v0, p0, Lg/h;->b:I

    sget-object v0, Lh/f$b$a;->a:Lh/f$b$a;

    iput-object v0, p0, Lg/h;->d:Lh/f$b;

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-wide v0, p0, Lg/h;->f:J

    return-wide v0
.end method

.method public final b()Lh/f$b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lg/h;->d:Lh/f$b;

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lg/h;->b:I

    return v0
.end method

.method public final d()Lh/f$e;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public final e()Lh/f$h;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lg/h;->a:Lh/f$h;

    return-object v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lg/h;->e:Z

    return v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lg/h;->c:Z

    return v0
.end method

.method public final h(J)V
    .locals 0

    iput-wide p1, p0, Lg/h;->f:J

    return-void
.end method

.method public final i(Z)V
    .locals 0

    iput-boolean p1, p0, Lg/h;->e:Z

    return-void
.end method

.method public final j(Lh/f$b;)V
    .locals 1
    .param p1    # Lh/f$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lg/h;->d:Lh/f$b;

    return-void
.end method

.method public final k(I)V
    .locals 0

    iput p1, p0, Lg/h;->b:I

    return-void
.end method

.method public final l(Lh/f$e;)V
    .locals 0
    .param p1    # Lh/f$e;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method public final m(Lh/f$h;)V
    .locals 1
    .param p1    # Lh/f$h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lg/h;->a:Lh/f$h;

    return-void
.end method

.method public final n(Z)V
    .locals 0

    iput-boolean p1, p0, Lg/h;->c:Z

    return-void
.end method
