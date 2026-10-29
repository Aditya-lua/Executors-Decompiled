/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb98350..0xb98414 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_ef8310;
extern long long g_ef8358;
extern long long g_efb3e0;

unsigned long long sub_b98350(long long a0, long long a1)
{
    unsigned long long v6;  // x0
    unsigned long v0;  // [bp-0x50]
    long long v1;  // [bp-0x48]
    unsigned long v2;  // [bp-0x40]
    char v3;  // [bp-0x31]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v0 = 0;
    v1 = 1;
    v2 = 0;
    if (!sub_b7e1f8(a1, &v0, &g_ef8310))
    {
        v6 = sub_b98414(a0, v1, v2);
        if (!v0)
            return v6;
        return _free(v1);
    }
    sub_c73d64("a Display implementation returned an error unexpectedly-- failed to decompileUtf8Errorvalid_up_toerror_lenunsupported types versionwe have debug infoinputTagMapResMapOptAltIsNotIsASeparatedListSeparatedNonEmptyListMany0Many1CountTakeUntilLengthValueTagClosureAlphaDigitAlphaNumericSpaceMultiSpaceLengthValueFnEofSwitchTagBitsOneOfNoneOfRegexpMatchRegexpMatchesRegexpFindRegexpCaptureRegexpCapturesTakeWhile1FixEscapedManyMNPermutationVerifyTakeTill1TakeWhileMNMany0CountMany1CountFloatSatisfy", 55, &v3, &g_ef8358, &g_efb3e0);
    __debugbreak();
}
