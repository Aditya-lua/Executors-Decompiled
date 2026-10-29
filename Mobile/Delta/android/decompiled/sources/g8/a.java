package g8;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes.dex */
public interface a<TInput, TResult, TException extends Throwable> {
    TResult apply(TInput tinput);
}
