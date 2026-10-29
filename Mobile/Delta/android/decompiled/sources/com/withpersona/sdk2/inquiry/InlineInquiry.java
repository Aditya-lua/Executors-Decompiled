package com.withpersona.sdk2.inquiry;

import android.os.Bundle;
import androidx.fragment.app.c;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BC\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InlineInquiry;", "", "Lcom/withpersona/sdk2/inquiry/Inquiry;", "inquiry", "", "requestKey", "", "isNavBarEnabled", "controlNavigationBar", "controlStatusBar", "handleBackPress", "<init>", "(Lcom/withpersona/sdk2/inquiry/Inquiry;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "Landroid/os/Bundle;", "bundle", "", "addArgumentsToBundle", "(Landroid/os/Bundle;)V", "Landroidx/fragment/app/c;", "createFragment", "()Landroidx/fragment/app/c;", "Lcom/withpersona/sdk2/inquiry/Inquiry;", "Ljava/lang/String;", "Ljava/lang/Boolean;", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InlineInquiry {

    @Nullable
    private final Boolean controlNavigationBar;

    @Nullable
    private final Boolean controlStatusBar;

    @Nullable
    private final Boolean handleBackPress;

    @NotNull
    private final Inquiry inquiry;

    @Nullable
    private final Boolean isNavBarEnabled;

    @Nullable
    private final String requestKey;

    public InlineInquiry(@NotNull Inquiry inquiry, @Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4) {
        Intrinsics.checkNotNullParameter(inquiry, "inquiry");
        this.inquiry = inquiry;
        this.requestKey = str;
        this.isNavBarEnabled = bool;
        this.controlNavigationBar = bool2;
        this.controlStatusBar = bool3;
        this.handleBackPress = bool4;
    }

    private final void addArgumentsToBundle(Bundle bundle) {
        String str = this.requestKey;
        if (str != null) {
            bundle.putString("REQUEST_KEY", str);
        }
        Boolean bool = this.isNavBarEnabled;
        if (bool != null) {
            bundle.putBoolean("IS_NAV_BAR_ENABLED", bool.booleanValue());
        }
        Boolean bool2 = this.controlNavigationBar;
        if (bool2 != null) {
            bundle.putBoolean("CONTROL_NAVIGATION_BAR", bool2.booleanValue());
        }
        Boolean bool3 = this.controlStatusBar;
        if (bool3 != null) {
            bundle.putBoolean("CONTROL_STATUS_BAR", bool3.booleanValue());
        }
        Boolean bool4 = this.handleBackPress;
        if (bool4 != null) {
            bundle.putBoolean("HANDLE_BACK_PRESS", bool4.booleanValue());
        }
    }

    @ExperimentalInlineApi
    @Nullable
    public final c createFragment() throws IllegalAccessException, InstantiationException, InvocationTargetException {
        c cVar;
        try {
            Object objNewInstance = Class.forName("com.withpersona.sdk2.inquiry.internal.i").getDeclaredConstructor(null).newInstance(null);
            cVar = objNewInstance instanceof c ? (c) objNewInstance : null;
        } catch (ClassNotFoundException unused) {
        }
        if (cVar == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        this.inquiry.addArgumentsToBundle$inquiry_dynamic_feature_release(bundle);
        addArgumentsToBundle(bundle);
        cVar.O1(bundle);
        return cVar;
    }
}
