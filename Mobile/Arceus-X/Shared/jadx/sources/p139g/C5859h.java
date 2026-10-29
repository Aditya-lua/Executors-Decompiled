package p139g;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p154h.C6252e;
import p154h.C6253f;

/* JADX INFO: renamed from: g.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0006B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010\"\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u001c8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u000e\u0010\u001f\"\u0004\b \u0010!R*\u0010%\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0016\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR*\u0010+\u001a\u00020&2\u0006\u0010\u0005\u001a\u00020&8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010'\u001a\u0004\b\u0006\u0010(\"\u0004\b)\u0010*R.\u0010-\u001a\u0004\u0018\u00010,2\b\u0010\u0005\u001a\u0004\u0018\u00010,8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b\u001d\u0010/\"\u0004\b0\u00101¨\u00062"}, m31665d2 = {"Lg/h;", "", "<init>", "()V", "Lh/f$h;", "value", "a", "Lh/f$h;", "e", "()Lh/f$h;", "m", "(Lh/f$h;)V", "mediaType", "", "b", "I", "c", "()I", "k", "(I)V", "maxItems", "", "Z", "g", "()Z", "n", "(Z)V", "isOrderedSelection", "Lh/f$b;", "d", "Lh/f$b;", "()Lh/f$b;", "j", "(Lh/f$b;)V", "defaultTab", "f", "i", "isCustomAccentColorApplied", "", "J", "()J", "h", "(J)V", "accentColor", "Lh/f$e;", "mediaCapabilitiesForTranscoding", "Lh/f$e;", "()Lh/f$e;", "l", "(Lh/f$e;)V", "activity"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C5859h {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean isOrderedSelection;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean isCustomAccentColorApplied;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public long accentColor;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public C6253f.h mediaType = C6253f.c.f23772a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int maxItems = C6252e.INSTANCE.m27461a();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public C6253f.b defaultTab = C6253f.b.a.f23770a;

    /* JADX INFO: renamed from: g.h$a */
    @Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, m31665d2 = {"Lg/h$a;", "", "<init>", "()V", "Lh/f$h;", "mediaType", "d", "(Lh/f$h;)Lg/h$a;", "", "maxItems", "c", "(I)Lg/h$a;", "", "isOrderedSelection", "e", "(Z)Lg/h$a;", "Lh/f$b;", "defaultTab", "b", "(Lh/f$b;)Lg/h$a;", "Lg/h;", "a", "()Lg/h;", "Lh/f$h;", "I", "Z", "Lh/f$b;", "isCustomAccentColorApplied", "", "f", "J", "accentColor", "activity"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public boolean isOrderedSelection;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public boolean isCustomAccentColorApplied;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public long accentColor;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public C6253f.h mediaType = C6253f.c.f23772a;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int maxItems = C6252e.INSTANCE.m27461a();

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public C6253f.b defaultTab = C6253f.b.a.f23770a;

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C5859h m26276a() {
            C5859h c5859h = new C5859h();
            c5859h.m26274m(this.mediaType);
            c5859h.m26272k(this.maxItems);
            c5859h.m26275n(this.isOrderedSelection);
            c5859h.m26271j(this.defaultTab);
            c5859h.m26270i(this.isCustomAccentColorApplied);
            c5859h.m26269h(this.accentColor);
            c5859h.m26273l(null);
            return c5859h;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final a m26277b(@NotNull C6253f.b defaultTab) {
            Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
            this.defaultTab = defaultTab;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final a m26278c(int maxItems) {
            this.maxItems = maxItems;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final a m26279d(@NotNull C6253f.h mediaType) {
            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
            this.mediaType = mediaType;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final a m26280e(boolean isOrderedSelection) {
            this.isOrderedSelection = isOrderedSelection;
            return this;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getAccentColor() {
        return this.accentColor;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final C6253f.b getDefaultTab() {
        return this.defaultTab;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMaxItems() {
        return this.maxItems;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final C6253f.e m26265d() {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final C6253f.h getMediaType() {
        return this.mediaType;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsCustomAccentColorApplied() {
        return this.isCustomAccentColorApplied;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsOrderedSelection() {
        return this.isOrderedSelection;
    }

    /* JADX INFO: renamed from: h */
    public final void m26269h(long j10) {
        this.accentColor = j10;
    }

    /* JADX INFO: renamed from: i */
    public final void m26270i(boolean z10) {
        this.isCustomAccentColorApplied = z10;
    }

    /* JADX INFO: renamed from: j */
    public final void m26271j(@NotNull C6253f.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.defaultTab = bVar;
    }

    /* JADX INFO: renamed from: k */
    public final void m26272k(int i10) {
        this.maxItems = i10;
    }

    /* JADX INFO: renamed from: l */
    public final void m26273l(@Nullable C6253f.e eVar) {
    }

    /* JADX INFO: renamed from: m */
    public final void m26274m(@NotNull C6253f.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<set-?>");
        this.mediaType = hVar;
    }

    /* JADX INFO: renamed from: n */
    public final void m26275n(boolean z10) {
        this.isOrderedSelection = z10;
    }
}
