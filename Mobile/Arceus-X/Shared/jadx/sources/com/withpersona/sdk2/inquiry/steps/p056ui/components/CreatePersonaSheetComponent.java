package com.withpersona.sdk2.inquiry.steps.p056ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import ar.C1147b;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.CreatePersonaSheet;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.steps.p056ui.UiComponentScreen;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b \b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0001\u001eBY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B)\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJj\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010\u0017J\u001a\u0010%\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010'\u001a\u0004\b(\u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\"\u0010\t\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b3\u00100\u001a\u0004\b4\u00102\"\u0004\b5\u00106R\"\u0010\n\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b7\u00100\u001a\u0004\b8\u00102\"\u0004\b9\u00106R\u001a\u0010\u000b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00100\u001a\u0004\b:\u00102R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010?\u001a\u0004\b@\u0010A¨\u0006C"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;", "", "name", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;", "ctaCard", "url", "", "autoCompleteOnDismiss", "shown", "showing", "hideWhenTappedOutside", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "screen", "", "lastValueUpdateTs", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;Ljava/lang/String;ZZZZLcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;J)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;Ljava/lang/String;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;Ljava/lang/String;ZZZZLcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;J)Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "b", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;", "i", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;", "c", "getUrl", "d", "Z", "g", "()Z", "e", "V2", "g1", "(Z)V", "f", "E1", "p2", "l1", "h", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "a1", "()Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "J", "R0", "()J", "j", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class CreatePersonaSheetComponent implements SheetComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final CreatePersonaSheet.CardCtaPage ctaCard;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final String url;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final boolean autoCompleteOnDismiss;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    public boolean shown;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public boolean showing;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    public final boolean hideWhenTappedOutside;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    public final UiComponentScreen screen;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    public final long lastValueUpdateTs;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<CreatePersonaSheetComponent> CREATOR = new C4034b();

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent$a;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet;", "config", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final CreatePersonaSheetComponent m20567a(@NotNull CreatePersonaSheet config) {
            CreatePersonaSheet.Pages pages;
            CreatePersonaSheet.CardCtaPage ctaCard;
            CreatePersonaSheet.Attributes attributes;
            String url;
            Boolean autoCompleteOnDismiss;
            Intrinsics.checkNotNullParameter(config, "config");
            CreatePersonaSheet.Attributes attributes2 = config.getAttributes();
            if (attributes2 == null || (pages = attributes2.getPages()) == null || (ctaCard = pages.getCtaCard()) == null || (attributes = config.getAttributes()) == null || (url = attributes.getUrl()) == null) {
                return null;
            }
            CreatePersonaSheet.Attributes attributes3 = config.getAttributes();
            return new CreatePersonaSheetComponent(config, ctaCard, url, (attributes3 == null || (autoCompleteOnDismiss = attributes3.getAutoCompleteOnDismiss()) == null) ? false : autoCompleteOnDismiss.booleanValue());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4034b implements Parcelable.Creator<CreatePersonaSheetComponent> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CreatePersonaSheetComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            CreatePersonaSheet.CardCtaPage cardCtaPage = (CreatePersonaSheet.CardCtaPage) parcel.readParcelable(CreatePersonaSheetComponent.class.getClassLoader());
            String string2 = parcel.readString();
            boolean z10 = false;
            boolean z11 = true;
            if (parcel.readInt() != 0) {
                z10 = true;
            }
            if (parcel.readInt() == 0) {
                z11 = z10;
            }
            if (parcel.readInt() == 0) {
                z11 = z10;
            }
            return new CreatePersonaSheetComponent(string, cardCtaPage, string2, z10, z11, z11, parcel.readInt() != 0, UiComponentScreen.CREATOR.createFromParcel(parcel), parcel.readLong());
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreatePersonaSheetComponent[] newArray(int i10) {
            return new CreatePersonaSheetComponent[i10];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CreatePersonaSheetComponent(@NotNull String name, @NotNull CreatePersonaSheet.CardCtaPage ctaCard, @NotNull String url, boolean z10, boolean z11, boolean z12, boolean z13, @NotNull UiComponentScreen screen, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(ctaCard, "ctaCard");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.name = name;
        this.ctaCard = ctaCard;
        this.url = url;
        this.autoCompleteOnDismiss = z10;
        this.shown = z11;
        this.showing = z12;
        this.hideWhenTappedOutside = z13;
        this.screen = screen;
        this.lastValueUpdateTs = j10;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ CreatePersonaSheetComponent m20557f(CreatePersonaSheetComponent createPersonaSheetComponent, String str, CreatePersonaSheet.CardCtaPage cardCtaPage, String str2, boolean z10, boolean z11, boolean z12, boolean z13, UiComponentScreen uiComponentScreen, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = createPersonaSheetComponent.name;
        }
        if ((i10 & 2) != 0) {
            cardCtaPage = createPersonaSheetComponent.ctaCard;
        }
        if ((i10 & 4) != 0) {
            str2 = createPersonaSheetComponent.url;
        }
        if ((i10 & 8) != 0) {
            z10 = createPersonaSheetComponent.autoCompleteOnDismiss;
        }
        if ((i10 & 16) != 0) {
            z11 = createPersonaSheetComponent.shown;
        }
        if ((i10 & 32) != 0) {
            z12 = createPersonaSheetComponent.showing;
        }
        if ((i10 & 64) != 0) {
            z13 = createPersonaSheetComponent.hideWhenTappedOutside;
        }
        if ((i10 & 128) != 0) {
            uiComponentScreen = createPersonaSheetComponent.screen;
        }
        if ((i10 & 256) != 0) {
            j10 = createPersonaSheetComponent.lastValueUpdateTs;
        }
        long j11 = j10;
        boolean z14 = z13;
        UiComponentScreen uiComponentScreen2 = uiComponentScreen;
        boolean z15 = z11;
        boolean z16 = z12;
        return createPersonaSheetComponent.m20560a(str, cardCtaPage, str2, z10, z15, z16, z14, uiComponentScreen2, j11);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.SheetComponent
    /* JADX INFO: renamed from: E1, reason: from getter */
    public boolean getShowing() {
        return this.showing;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent
    /* JADX INFO: renamed from: R0, reason: from getter */
    public long getLastValueUpdateTs() {
        return this.lastValueUpdateTs;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.SheetComponent
    /* JADX INFO: renamed from: V2, reason: from getter */
    public boolean getShown() {
        return this.shown;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final CreatePersonaSheetComponent m20560a(@NotNull String name, @NotNull CreatePersonaSheet.CardCtaPage ctaCard, @NotNull String url, boolean autoCompleteOnDismiss, boolean shown, boolean showing, boolean hideWhenTappedOutside, @NotNull UiComponentScreen screen, long lastValueUpdateTs) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(ctaCard, "ctaCard");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(screen, "screen");
        return new CreatePersonaSheetComponent(name, ctaCard, url, autoCompleteOnDismiss, shown, showing, hideWhenTappedOutside, screen, lastValueUpdateTs);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.SheetComponent
    @NotNull
    /* JADX INFO: renamed from: a1, reason: from getter */
    public UiComponentScreen getScreen() {
        return this.screen;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreatePersonaSheetComponent)) {
            return false;
        }
        CreatePersonaSheetComponent createPersonaSheetComponent = (CreatePersonaSheetComponent) other;
        return Intrinsics.m31980c(this.name, createPersonaSheetComponent.name) && Intrinsics.m31980c(this.ctaCard, createPersonaSheetComponent.ctaCard) && Intrinsics.m31980c(this.url, createPersonaSheetComponent.url) && this.autoCompleteOnDismiss == createPersonaSheetComponent.autoCompleteOnDismiss && this.shown == createPersonaSheetComponent.shown && this.showing == createPersonaSheetComponent.showing && this.hideWhenTappedOutside == createPersonaSheetComponent.hideWhenTappedOutside && Intrinsics.m31980c(this.screen, createPersonaSheetComponent.screen) && this.lastValueUpdateTs == createPersonaSheetComponent.lastValueUpdateTs;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getAutoCompleteOnDismiss() {
        return this.autoCompleteOnDismiss;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.SheetComponent
    /* JADX INFO: renamed from: g1 */
    public void mo20563g1(boolean z10) {
        this.shown = z10;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent
    @NotNull
    public String getName() {
        return this.name;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((((((((((((this.name.hashCode() * 31) + this.ctaCard.hashCode()) * 31) + this.url.hashCode()) * 31) + Boolean.hashCode(this.autoCompleteOnDismiss)) * 31) + Boolean.hashCode(this.shown)) * 31) + Boolean.hashCode(this.showing)) * 31) + Boolean.hashCode(this.hideWhenTappedOutside)) * 31) + this.screen.hashCode()) * 31) + Long.hashCode(this.lastValueUpdateTs);
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final CreatePersonaSheet.CardCtaPage getCtaCard() {
        return this.ctaCard;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.SheetComponent
    /* JADX INFO: renamed from: l1, reason: from getter */
    public boolean getHideWhenTappedOutside() {
        return this.hideWhenTappedOutside;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.components.SheetComponent
    /* JADX INFO: renamed from: p2 */
    public void mo20566p2(boolean z10) {
        this.showing = z10;
    }

    @NotNull
    public String toString() {
        return "CreatePersonaSheetComponent(name=" + this.name + ", ctaCard=" + this.ctaCard + ", url=" + this.url + ", autoCompleteOnDismiss=" + this.autoCompleteOnDismiss + ", shown=" + this.shown + ", showing=" + this.showing + ", hideWhenTappedOutside=" + this.hideWhenTappedOutside + ", screen=" + this.screen + ", lastValueUpdateTs=" + this.lastValueUpdateTs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeParcelable(this.ctaCard, flags);
        dest.writeString(this.url);
        dest.writeInt(this.autoCompleteOnDismiss ? 1 : 0);
        dest.writeInt(this.shown ? 1 : 0);
        dest.writeInt(this.showing ? 1 : 0);
        dest.writeInt(this.hideWhenTappedOutside ? 1 : 0);
        this.screen.writeToParcel(dest, flags);
        dest.writeLong(this.lastValueUpdateTs);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CreatePersonaSheetComponent(String str, CreatePersonaSheet.CardCtaPage cardCtaPage, String str2, boolean z10, boolean z11, boolean z12, boolean z13, UiComponentScreen uiComponentScreen, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        z11 = (i10 & 16) != 0 ? false : z11;
        z12 = (i10 & 32) != 0 ? false : z12;
        z13 = (i10 & 64) != 0 ? false : z13;
        if ((i10 & 128) != 0) {
            List<UiComponentConfig> components = cardCtaPage.getUiStep().getConfig().getComponents();
            List<UiComponent> listM20892i = components != null ? C4086b.m20892i(components) : null;
            List<UiComponentConfig> components2 = cardCtaPage.getUiStep().getConfig().getComponents();
            uiComponentScreen = C1147b.m6492a(new CtaCardPage(listM20892i, components2 == null ? C7699p.m31892k() : components2, cardCtaPage.getUiStep().getStyles()));
        }
        this(str, cardCtaPage, str2, z10, z11, z12, z13, uiComponentScreen, (i10 & 256) != 0 ? 0L : j10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePersonaSheetComponent(@NotNull CreatePersonaSheet config, @NotNull CreatePersonaSheet.CardCtaPage ctaCard, @NotNull String url, boolean z10) {
        this(config.getName(), ctaCard, url, z10, false, false, false, null, 0L, 496, null);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(ctaCard, "ctaCard");
        Intrinsics.checkNotNullParameter(url, "url");
    }
}
