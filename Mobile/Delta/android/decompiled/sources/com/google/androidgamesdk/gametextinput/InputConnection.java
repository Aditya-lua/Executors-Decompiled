package com.google.androidgamesdk.gametextinput;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Selection;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.Keep;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.c1;
import androidx.core.view.o0;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class InputConnection extends BaseInputConnection implements View.OnKeyListener {
    private static int INVALID_INDEX = -1;
    private static final int MAX_LENGTH_FOR_SINGLE_LINE_EDIT_TEXT = 5000;
    private static final String TAG = "gti.InputConnection";
    private final InputMethodManager imm;
    private fe.a listener;
    private final Editable mEditable;
    private boolean mSoftKeyboardActive;
    private final fe.b settings;
    private final View targetView;

    public class b implements InputFilter {
        public b() {
        }

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
            StringBuilder sb2 = new StringBuilder(i11 - i10);
            boolean z10 = true;
            for (int i14 = i10; i14 < i11; i14++) {
                char cCharAt = charSequence.charAt(i14);
                if (cCharAt == '\n') {
                    z10 = false;
                } else {
                    sb2.append(cCharAt);
                }
            }
            if (z10) {
                return null;
            }
            if (!(charSequence instanceof Spanned)) {
                return sb2;
            }
            SpannableString spannableString = new SpannableString(sb2);
            TextUtils.copySpansFrom((Spanned) charSequence, i10, sb2.length(), null, spannableString, 0);
            return spannableString;
        }
    }

    public InputConnection(Context context, View view, fe.b bVar) {
        super(view, bVar.f16601a.inputType != 0);
        Log.d(TAG, "InputConnection created");
        this.targetView = view;
        this.settings = bVar;
        Object systemService = context.getSystemService("input_method");
        if (systemService == null) {
            throw new RuntimeException("Can't get IMM");
        }
        this.imm = (InputMethodManager) systemService;
        this.mEditable = new SpannableStringBuilder();
        c1.b(((Activity) view.getContext()).getWindow(), false);
        view.setOnKeyListener(this);
        setEditorInfo(bVar.f16601a);
    }

    private static int findIndexBackward(CharSequence charSequence, int i10, int i11) {
        int length = charSequence.length();
        if (i10 < 0 || length < i10) {
            return INVALID_INDEX;
        }
        if (i11 < 0) {
            return INVALID_INDEX;
        }
        while (true) {
            boolean z10 = false;
            while (i11 != 0) {
                i10--;
                if (i10 < 0) {
                    if (z10) {
                        return INVALID_INDEX;
                    }
                    return 0;
                }
                char cCharAt = charSequence.charAt(i10);
                if (z10) {
                    if (!Character.isHighSurrogate(cCharAt)) {
                        return INVALID_INDEX;
                    }
                    i11--;
                } else if (!Character.isSurrogate(cCharAt)) {
                    i11--;
                } else {
                    if (Character.isHighSurrogate(cCharAt)) {
                        return INVALID_INDEX;
                    }
                    z10 = true;
                }
            }
            return i10;
        }
    }

    private static int findIndexForward(CharSequence charSequence, int i10, int i11) {
        int length = charSequence.length();
        if (i10 < 0 || length < i10) {
            return INVALID_INDEX;
        }
        if (i11 < 0) {
            return INVALID_INDEX;
        }
        while (true) {
            boolean z10 = false;
            while (i11 != 0) {
                if (i10 >= length) {
                    return z10 ? INVALID_INDEX : length;
                }
                char cCharAt = charSequence.charAt(i10);
                if (z10) {
                    if (!Character.isLowSurrogate(cCharAt)) {
                        return INVALID_INDEX;
                    }
                    i11--;
                    i10++;
                } else if (!Character.isSurrogate(cCharAt)) {
                    i11--;
                    i10++;
                } else {
                    if (Character.isLowSurrogate(cCharAt)) {
                        return INVALID_INDEX;
                    }
                    i10++;
                    z10 = true;
                }
            }
            return i10;
        }
    }

    private com.google.androidgamesdk.gametextinput.a.C0125a getComposingRegion() {
        return new com.google.androidgamesdk.gametextinput.a.C0125a(BaseInputConnection.getComposingSpanStart(this.mEditable), BaseInputConnection.getComposingSpanEnd(this.mEditable));
    }

    private com.google.androidgamesdk.gametextinput.a.C0125a getSelection() {
        return new com.google.androidgamesdk.gametextinput.a.C0125a(Selection.getSelectionStart(this.mEditable), Selection.getSelectionEnd(this.mEditable));
    }

    private void immUpdateSelection() {
        com.google.androidgamesdk.gametextinput.a.C0125a selection = getSelection();
        com.google.androidgamesdk.gametextinput.a.C0125a composingRegion = getComposingRegion();
        Log.d(TAG, "immUpdateSelection: " + selection.f8387a + "," + selection.b + ". " + composingRegion.f8387a + "," + composingRegion.b);
        EditorInfo editorInfo = this.settings.f16601a;
        int i10 = selection.f8387a;
        editorInfo.initialSelStart = i10;
        int i11 = selection.b;
        editorInfo.initialSelEnd = i11;
        this.imm.updateSelection(this.targetView, i10, i11, composingRegion.f8387a, composingRegion.b);
    }

    private boolean processKeyEvent(KeyEvent keyEvent) {
        if (keyEvent == null) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        Log.d(TAG, String.format("processKeyEvent(key=%d) text=%s", Integer.valueOf(keyCode), this.mEditable.toString()));
        if ((this.settings.f16601a.inputType & 131072) == 0 && ((keyCode == 66 || keyCode == 160) && keyEvent.hasNoModifiers())) {
            sendEditorAction(this.settings.f16601a.actionId);
            return true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        com.google.androidgamesdk.gametextinput.a.C0125a selection = getSelection();
        if (selection.f8387a == -1) {
            selection.f8387a = this.mEditable.length();
            selection.b = this.mEditable.length();
        }
        if (keyCode == 21) {
            int i10 = selection.f8387a;
            if (i10 == selection.b) {
                int iFindIndexBackward = findIndexBackward(this.mEditable, i10, 1);
                setSelection(iFindIndexBackward, iFindIndexBackward);
            } else {
                setSelection(i10, i10);
            }
            return true;
        }
        if (keyCode == 22) {
            int i11 = selection.f8387a;
            int i12 = selection.b;
            if (i11 == i12) {
                int iFindIndexForward = findIndexForward(this.mEditable, i12, 1);
                setSelection(iFindIndexForward, iFindIndexForward);
            } else {
                setSelection(i12, i12);
            }
            return true;
        }
        if (keyCode == 122) {
            setSelection(0, 0);
            return true;
        }
        if (keyCode == 123) {
            setSelection(this.mEditable.length(), this.mEditable.length());
            return true;
        }
        if (keyCode == 67 || keyCode == 112) {
            int i13 = selection.f8387a;
            int i14 = selection.b;
            if (i13 != i14) {
                this.mEditable.delete(i13, i14);
                return true;
            }
            if (keyCode == 67 && i13 > 0) {
                finishComposingText();
                deleteSurroundingTextInCodePoints(1, 0);
                return true;
            }
            if (keyCode != 112 || i13 >= this.mEditable.length()) {
                return false;
            }
            finishComposingText();
            deleteSurroundingTextInCodePoints(0, 1);
            return true;
        }
        if (keyEvent.getUnicodeChar() == 0) {
            return false;
        }
        if (selection.f8387a != selection.b) {
            Log.d(TAG, String.format("processKeyEvent: deleting selection", new Object[0]));
            this.mEditable.delete(selection.f8387a, selection.b);
        }
        String string = Character.toString((char) keyEvent.getUnicodeChar());
        this.mEditable.insert(selection.f8387a, string);
        int length = this.mEditable.length();
        com.google.androidgamesdk.gametextinput.a.C0125a composingRegion = getComposingRegion();
        if (composingRegion.f8387a == -1) {
            composingRegion = getSelection();
            if (composingRegion.f8387a == -1) {
                composingRegion = new com.google.androidgamesdk.gametextinput.a.C0125a(0, 0);
            }
        }
        int i15 = composingRegion.f8387a;
        int i16 = length + i15;
        composingRegion.b = i16;
        setComposingRegion(i15, i16);
        int length2 = selection.f8387a + string.length();
        setSelection(length2, length2);
        Log.d(TAG, String.format("processKeyEvent: exit, text=%s", this.mEditable.toString()));
        return true;
    }

    private boolean sendEditorAction(int i10) {
        fe.a aVar = this.listener;
        if (aVar == null) {
            return false;
        }
        aVar.H(i10);
        return true;
    }

    private final void stateUpdated() {
        com.google.androidgamesdk.gametextinput.a.C0125a selection = getSelection();
        com.google.androidgamesdk.gametextinput.a.C0125a composingRegion = getComposingRegion();
        State state = new State(this.mEditable.toString(), selection.f8387a, selection.b, composingRegion.f8387a, composingRegion.b);
        EditorInfo editorInfo = this.settings.f16601a;
        editorInfo.initialSelStart = selection.f8387a;
        editorInfo.initialSelEnd = selection.b;
        fe.a aVar = this.listener;
        if (aVar != null) {
            aVar.B(state, false);
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public void closeConnection() {
        Log.d(TAG, "closeConnection");
        super.closeConnection();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        Log.d(TAG, "commitCompletion");
        return super.commitCompletion(completionInfo);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        Log.d(TAG, "commitCompletion");
        return super.commitCorrection(correctionInfo);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i10) {
        Log.d(TAG, "commitText: " + charSequence + ", new pos = " + i10);
        return super.commitText(charSequence, i10);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        Log.d(TAG, "deleteSurroundingText: " + i10 + ":" + i11);
        return super.deleteSurroundingText(i10, i11);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        Log.d(TAG, "deleteSurroundingTextInCodePoints: " + i10 + ":" + i11);
        return super.deleteSurroundingTextInCodePoints(i10, i11);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        Log.d(TAG, "endBatchEdit");
        stateUpdated();
        return super.endBatchEdit();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        Log.d(TAG, "finishComposingText");
        return super.finishComposingText();
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public Editable getEditable() {
        Log.d(TAG, "getEditable");
        return this.mEditable;
    }

    public final EditorInfo getEditorInfo() {
        return this.settings.f16601a;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        Log.d(TAG, "getExtractedText");
        return super.getExtractedText(extractedTextRequest, i10);
    }

    public Insets getImeInsets() {
        WindowInsetsCompat windowInsetsCompatF;
        View view = this.targetView;
        if (view != null && (windowInsetsCompatF = o0.F(view)) != null) {
            return windowInsetsCompatF.getInsets(WindowInsetsCompat.Type.ime());
        }
        return Insets.NONE;
    }

    public final fe.a getListener() {
        return this.listener;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i10) {
        CharSequence selectedText = super.getSelectedText(i10);
        if (selectedText == null) {
            selectedText = "";
        }
        Log.d(TAG, "getSelectedText: " + i10 + ", result: " + ((Object) selectedText));
        return selectedText;
    }

    public final boolean getSoftKeyboardActive() {
        return this.mSoftKeyboardActive;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i10, int i11) {
        Log.d(TAG, "getTextAfterCursor: " + i10 + ":" + i11);
        if (i10 >= 0) {
            return super.getTextAfterCursor(i10, i11);
        }
        Log.i(TAG, "getTextAfterCursor: returning null to due to an invalid length=" + i10);
        return null;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i10, int i11) {
        Log.d(TAG, "getTextBeforeCursor: " + i10 + ", flags=" + i11);
        if (i10 >= 0) {
            return super.getTextBeforeCursor(i10, i11);
        }
        Log.i(TAG, "getTextBeforeCursor: returning null to due to an invalid length=" + i10);
        return null;
    }

    public boolean isSoftwareKeyboardVisible() {
        WindowInsetsCompat windowInsetsCompatF;
        View view = this.targetView;
        if (view == null || (windowInsetsCompatF = o0.F(view)) == null) {
            return false;
        }
        return windowInsetsCompatF.isVisible(WindowInsetsCompat.Type.ime());
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        Log.d(TAG, "onKey: " + keyEvent);
        if (!getSoftKeyboardActive() || !processKeyEvent(keyEvent)) {
            return false;
        }
        stateUpdated();
        immUpdateSelection();
        restartInput();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i10) {
        Log.d(TAG, "performEditorAction, action=" + i10);
        return i10 == 0 ? super.performEditorAction(i10) : sendEditorAction(i10);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        Log.d(TAG, "performPrivateCommand");
        return super.performPrivateCommand(str, bundle);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i10) {
        Log.d(TAG, "Request cursor updates: " + i10);
        return super.requestCursorUpdates(i10);
    }

    public void restartInput() {
        this.imm.restartInput(this.targetView);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        Log.d(TAG, "sendKeyEvent: " + keyEvent);
        return super.sendKeyEvent(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i10, int i11) {
        Log.d(TAG, "setComposingRegion: " + i10 + ":" + i11);
        return super.setComposingRegion(i10, i11);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i10) {
        Log.d(TAG, String.format("setComposingText='%s' newCursorPosition=%d", charSequence, Integer.valueOf(i10)));
        if (charSequence == null) {
            return false;
        }
        return super.setComposingText(charSequence, i10);
    }

    public final void setEditorInfo(EditorInfo editorInfo) {
        Log.d(TAG, "setEditorInfo");
        this.settings.f16601a = editorInfo;
        if ((editorInfo.inputType & 131072) == 0) {
            this.mEditable.setFilters(new InputFilter[]{new InputFilter.LengthFilter(5000), new b()});
        } else {
            this.mEditable.setFilters(new InputFilter[0]);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setImeConsumesInput(boolean z10) {
        Log.d(TAG, "setImeConsumesInput: " + z10);
        if (Build.VERSION.SDK_INT >= 31) {
            return super.setImeConsumesInput(z10);
        }
        return false;
    }

    public final InputConnection setListener(fe.a aVar) {
        this.listener = aVar;
        return this;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setSelection(int i10, int i11) {
        Log.d(TAG, "setSelection: " + i10 + ":" + i11);
        return super.setSelection(i10, i11);
    }

    public final void setSoftKeyboardActive(boolean z10, int i10) {
        Log.d(TAG, "setSoftKeyboardActive, active: " + z10);
        this.mSoftKeyboardActive = z10;
        if (z10) {
            this.targetView.setFocusableInTouchMode(true);
            this.targetView.requestFocus();
            this.imm.showSoftInput(this.targetView, i10);
        } else {
            this.imm.hideSoftInputFromWindow(this.targetView.getWindowToken(), i10);
        }
        restartInput();
    }

    public final void setState(State state) {
        if (state == null) {
            return;
        }
        Log.d(TAG, "setState: '" + state.text + "', selection=(" + state.selectionStart + "," + state.selectionEnd + "), composing region=(" + state.composingRegionStart + "," + state.composingRegionEnd + ")");
        this.mEditable.clear();
        this.mEditable.clearSpans();
        this.mEditable.insert(0, state.text);
        setSelection(state.selectionStart, state.selectionEnd);
        int i10 = state.composingRegionStart;
        int i11 = state.composingRegionEnd;
        if (i10 != i11) {
            setComposingRegion(i10, i11);
        }
        restartInput();
    }
}
