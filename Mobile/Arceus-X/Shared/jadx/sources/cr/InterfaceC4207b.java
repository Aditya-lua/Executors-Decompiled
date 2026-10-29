package cr;

import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputAddressComponent;
import er.C5207p;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.InterfaceC0389r;

/* JADX INFO: renamed from: cr.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\r\u0010\nJ\u0019\u0010\u000e\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\u000e\u0010\nR\u001a\u0010\u0014\u001a\u00020\u000f8&X¦\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0019\u001a\u00020\u00158&X¦\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00158&X¦\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001f\u001a\u00020\u00158&X¦\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001d\u0010\u0017R\u001a\u0010\"\u001a\u00020\u00158&X¦\u0004¢\u0006\f\u0012\u0004\b!\u0010\u0013\u001a\u0004\b \u0010\u0017R\u001a\u0010%\u001a\u00020\u00158&X¦\u0004¢\u0006\f\u0012\u0004\b$\u0010\u0013\u001a\u0004\b#\u0010\u0017¨\u0006&À\u0006\u0003"}, m31665d2 = {"Lcr/b;", "", "", "newState", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "o", "(Ljava/lang/Boolean;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "", "newString", "q", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "j", "k", "s", "p", "Ler/p;", "r", "()Ler/p;", "isAddressFieldCollapsed$annotations", "()V", "isAddressFieldCollapsed", "Lan/r;", "m", "()Lan/r;", "getTextControllerForAddressStreet1$annotations", "textControllerForAddressStreet1", "n", "getTextControllerForAddressStreet2$annotations", "textControllerForAddressStreet2", "a", "getTextControllerForAddressCity$annotations", "textControllerForAddressCity", "g", "getTextControllerForAddressSubdivision$annotations", "textControllerForAddressSubdivision", "f", "getTextControllerForAddressPostalCode$annotations", "textControllerForAddressPostalCode", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC4207b {
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC0389r getTextControllerForAddressCity();

    @NotNull
    /* JADX INFO: renamed from: f */
    InterfaceC0389r getTextControllerForAddressPostalCode();

    @NotNull
    /* JADX INFO: renamed from: g */
    InterfaceC0389r getTextControllerForAddressSubdivision();

    @NotNull
    /* JADX INFO: renamed from: j */
    InputAddressComponent mo20632j(@Nullable String newString);

    @NotNull
    /* JADX INFO: renamed from: k */
    InputAddressComponent mo20633k(@Nullable String newString);

    @NotNull
    /* JADX INFO: renamed from: m */
    InterfaceC0389r getTextControllerForAddressStreet1();

    @NotNull
    /* JADX INFO: renamed from: n */
    InterfaceC0389r getTextControllerForAddressStreet2();

    @NotNull
    /* JADX INFO: renamed from: o */
    InputAddressComponent mo20636o(@Nullable Boolean newState);

    @NotNull
    /* JADX INFO: renamed from: p */
    InputAddressComponent mo20637p(@Nullable String newString);

    @NotNull
    /* JADX INFO: renamed from: q */
    InputAddressComponent mo20638q(@Nullable String newString);

    @NotNull
    /* JADX INFO: renamed from: r */
    C5207p getIsAddressFieldCollapsed();

    @NotNull
    /* JADX INFO: renamed from: s */
    InputAddressComponent mo20640s(@Nullable String newString);
}
