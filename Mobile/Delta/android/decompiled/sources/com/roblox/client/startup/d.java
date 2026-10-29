package com.roblox.client.startup;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import gk.p;
import sg.q0;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    public interface a {
        void a();
    }

    public static /* synthetic */ void b(a aVar, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        aVar.a();
    }

    public void c(Context context, final a aVar) {
        p.h("LeaveAppHelper", "show: Leave-App dialog");
        new AlertDialog.Builder(context).setMessage(q0.f30924e).setPositiveButton(q0.f30921d, new DialogInterface.OnClickListener() { // from class: ak.p0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                com.roblox.client.startup.d.b(aVar, dialogInterface, i10);
            }
        }).setNegativeButton(q0.f30963r, new DialogInterface.OnClickListener() { // from class: ak.q0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                dialogInterface.dismiss();
            }
        }).setCancelable(true).create().show();
    }
}
