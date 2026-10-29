package com.roblox.client.startup;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.roblox.client.startup.C3275d;
import p151gk.C6124q;
import sg.C11347q0;

/* JADX INFO: renamed from: com.roblox.client.startup.d */
/* JADX INFO: loaded from: classes2.dex */
public class C3275d {

    /* JADX INFO: renamed from: com.roblox.client.startup.d$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo1336a();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m15747b(a aVar, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        aVar.mo1336a();
    }

    /* JADX INFO: renamed from: c */
    public void m15748c(Context context, final a aVar) {
        C6124q.m27063h("LeaveAppHelper", "show: Leave-App dialog");
        new AlertDialog.Builder(context).setMessage(C11347q0.f39965e).setPositiveButton(C11347q0.f39962d, new DialogInterface.OnClickListener() { // from class: ak.p0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                C3275d.m15747b(aVar, dialogInterface, i10);
            }
        }).setNegativeButton(C11347q0.f40004r, new DialogInterface.OnClickListener() { // from class: ak.q0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                dialogInterface.dismiss();
            }
        }).setCancelable(true).create().show();
    }
}
