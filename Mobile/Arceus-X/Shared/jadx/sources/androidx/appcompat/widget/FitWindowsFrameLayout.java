package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import p365q.InterfaceC10388m0;

/* JADX INFO: loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public InterfaceC10388m0 f1453a;

    public FitWindowsFrameLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        InterfaceC10388m0 interfaceC10388m0 = this.f1453a;
        if (interfaceC10388m0 != null) {
            interfaceC10388m0.m39923a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(InterfaceC10388m0 interfaceC10388m0) {
        this.f1453a = interfaceC10388m0;
    }
}
