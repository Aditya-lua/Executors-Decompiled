package p105ej;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

/* JADX INFO: renamed from: ej.l */
/* JADX INFO: loaded from: classes2.dex */
public class C5154l {
    /* JADX INFO: renamed from: a */
    public static String m23987a(int i10) {
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        DecimalFormat decimalFormat = (DecimalFormat) numberInstance;
        DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
        decimalFormatSymbols.setCurrencySymbol("");
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        numberInstance.setMaximumFractionDigits(0);
        return numberInstance.format(i10);
    }
}
