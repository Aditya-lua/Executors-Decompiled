/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb7a80c..0xb7ade4 (1496 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b7a80c_4 {
    char padding_0[16];
    unsigned long long field_10;
    unsigned long long field_18;
    char padding_20[48];
    char field_50;
} st_b7a80c_4;

typedef struct st_b7a80c_0 {
    char padding_0[8];
    char field_8;
    char padding_9[15];
    long long field_18;
    unsigned long long field_20;
    char padding_28[48];
    char field_58;
} st_b7a80c_0;

extern unsigned long long g_b7a7fc;
extern long long g_cba67f;
extern long long g_ef8140;
extern long long g_ef8170;
extern long long g_ef8270;
extern long long g_ef82c0;
extern unsigned long long g_ef8310;
extern long long g_ef8340;
extern long long g_ef8358;
extern long long g_ef8378;
extern long long g_efb3e0;

unsigned long long sub_b7a80c(long long *a0, st_b7a80c_0 *a1)
{
    long long *v20;  // x22
    st_b7a80c_4 *v21;  // x21
    unsigned long long v30;  // 4105
    unsigned long long v31;  // 4105
    unsigned long long v32;  // x28
    unsigned long long i;  // x23
    unsigned long long v34;  // x25
    unsigned long long ptr;  // x0
    unsigned long long v36;  // x28
    unsigned long long v37;  // x1
    unsigned long long v38;  // x1
    unsigned long long v39;  // x0
    st_b7a80c_0 *v22;  // x1
    st_b7a80c_0 *v23;  // x1
    unsigned long v24;  // x24
    unsigned long long v25;  // x19
    unsigned long long v26;  // x20
    unsigned long long ptr1;  // x0
    unsigned long v28;  // cc_dep1
    unsigned long long v29;  // x26
    unsigned long long v0;  // [bp-0x110]
    unsigned long long v1;  // [bp-0x100]
    unsigned long long v2;  // [bp-0xf0]
    unsigned long long ptr2;  // [bp-0xe8]
    unsigned long long v4;  // [bp-0xe0]
    uint128_t v5;  // [bp-0xd8]
    unsigned long long iter;  // [bp-0xc8]
    uint128_t v7;  // [bp-0xc0]
    unsigned long long v8;  // [bp-0xb0]
    unsigned long long *v9;  // [bp-0xa8], Other Possible Types: char *, long long, unsigned long long
    unsigned long long v10;  // [bp-0xa0]
    unsigned int v11;  // [bp-0x98], Other Possible Types: unsigned long long
    unsigned long long v12;  // [bp-0x94]
    uint128_t v13;  // [bp-0x90], Other Possible Types: unsigned long long *, unsigned long long
    long long v14;  // [bp-0x88], Other Possible Types: unsigned long long
    unsigned int v15;  // [bp-0x80], Other Possible Types: unsigned long long
    unsigned long long v16;  // [bp-0x7c]
    char v17;  // [bp-0x69]
    char *v18;  // [bp-0x10]
    char v19;  // [bp+0x0]

    v18 = &v19;
    v20 = a0;
    v21 = &a1->field_8;
    /* unsupported instruction */;
    /* unsupported instruction */;
    if (!/* unsupported instruction */)
    {
        /* unsupported instruction */;
        if (/* unsupported instruction */ ^ 1)
            goto LABEL_b7ac00;
        v22 = a1;
        v23 = a1;
        if (!(v22->field_58 & 1))
            goto LABEL_b7ac18;
    }
    else
    {
        /* unsupported instruction */;
LABEL_b7ac00:
        sub_c7573c(&a1->field_8);
        v22 = a1;
        v23 = v22;
        if (!(a1->field_58 & 1))
        {
LABEL_b7ac18:
            v9 = v23->field_18;
            v10 = v23->field_18 + v23->field_20 * 8;
            sub_b9475c(&v13, &v9, 0x202c);
LABEL_b7ac34:
            v9 = &v13;
            v10 = &g_b7a7fc;
            v39 = sub_be769c(*v20, v20[1], &g_cba67f, &v9);
            if (*(unsigned long long *)&v13)
                _free(*(unsigned long long *)((void*)&v13 + 8));
            while (1)
            {
                /* unsupported instruction */;
                if (/* unsupported instruction */ != 1)
                {
                    /* unsupported instruction */;
                    sub_c75418(v21);
                    return v39;
                }
                /* unsupported instruction */;
                /* unsupported instruction */;
                if (!(/* unsupported instruction */ ^ 1))
                    return v39;
            }
        }
    }
    v24 = v22->field_18;
    v25 = v22->field_20;
    v26 = 3;
    ptr1 = _malloc(3);
    v28 = ptr1;
    if (!ptr1)
    {
        v29 = 3;
        v30 = arm64g_calculate_condition(20, v28, 0, 0);
        if (!(v30 & 1))
            goto LABEL_b7a86a;
LABEL_b7a869:
    }
    else
    {
        v29 = ptr1;
        v31 = arm64g_calculate_condition(20, v28, 0, 0);
        if (v31 & 1)
            goto LABEL_b7a869;
LABEL_b7a86a:
        v26 = 1;
    }
    if (ptr1)
    {
        v32 = v25 * 8;
        *(char *)(v29 + 2) = 46;
        *(unsigned short *)v29 = 0x2e2e;
        if (v25)
        {
            v9 = 0;
            v10 = 1;
            v15 = 1610612768;
            v16 = 0;
            v11 = 0;
            v13 = &v9;
            v14 = &g_ef8140;
            if (!sub_b86e9c(v24, &v13))
            {
                if (v9 == 0x8000000000000000)
                    goto LABEL_b7a8cc;
                i = v24 + 8;
                v2 = v9;
                ptr2 = v10;
                v4 = v11;
                v34 = (v32 - 8 >> 2) + 2;
                ptr = _malloc(v34);
                if (ptr)
                {
LABEL_b7a914:
                    v5 = CONCAT(ptr, v34);
                    iter = 0;
                    v13 = &v2;
                    v14 = &g_b7a7fc;
                    if (!sub_be769c(&v5, &g_ef8140, &g_cba67f, &v13))
                    {
                        v1 = v26;
                        v0 = v29;
                        if (i)
                        {
                            v36 = v24 + v32;
                            if (i != v36)
                            {
                                do
                                {
                                    v7 = CONCAT(1, 0);
                                    v8 = 0;
                                    v9 = &v7;
                                    v11 = 1610612768;
                                    v12 = 0;
                                    v10 = &g_ef8310;
                                    if (sub_b86e9c(i, &v9))
                                    {
                                        sub_c73d64("a Display implementation returned an error unexpectedly-- failed to decompileUtf8Errorvalid_up_toerror_lenunsupported types versionwe have debug infoinputTagMapResMapOptAltIsNotIsASeparatedListSeparatedNonEmptyListMany0Many1CountTakeUntilLengthValueTagClosureAlphaDigitAlphaNumericSpaceMultiSpaceLengthValueFnEofSwitchTagBitsOneOfNoneOfRegexpMatchRegexpMatchesRegexpFindRegexpCaptureRegexpCapturesTakeWhile1FixEscapedManyMNPermutationVerifyTakeTill1TakeWhileMNMany0CountMany1CountFloatSatisfy", 55, &v17, &g_ef8358, &g_efb3e0);
                                        __debugbreak();
                                    }
                                    v13 = v7;
                                    v15 = v8;
                                    v37 = iter;
                                    if (*(unsigned long long *)&v5 - v37 <= 1)
                                    {
                                        sub_c6c0cc(&v5);
                                        v37 = iter;
                                    }
                                    *(unsigned short *)(*(unsigned long long *)((void*)&v5 + 8) + v37) = 8236;
                                    iter += 2;
                                    v9 = &v13;
                                    v10 = &g_b7a7fc;
                                    if (sub_be769c(&v5, &g_ef8270, &g_cba67f, &v9))
                                    {
                                        sub_c73d64("called `Result::unwrap()` on an `Err` valueContents/Resources/DWARFinvalid timestampfailed to create dispatch semaphore for thread synchronizationRUST_BACKTRACEpermission deniedconnection refusednetwork unreachableconnection abortednot connectedaddress in useaddress not availablenetwork downbroken pipeentity already existsoperation would blocknot a directoryis a directorydirectory not emptyread-only filesystem or storage mediumfilesystem loop or indirection limit (e.g. symlink loop)stale network file handleinvalid input parameterinvalid datatimed outwrite zeroseek on unseekable filequota exceededfile too largeresource busyexecutable file busycross-device link or renametoo many linksargument list too longoperation interruptedunsupportedunexpected end of fileout of memoryin progressother erroruncategorized error.debug_abbrev.debug_addr.debug_aranges.debug_info.debug_line.debug_line_str.debug_loc.debug_loclists.debug_macinfo.debug_macro.debug_ranges.debug_rnglists.debug_str.debug_str_offsets.debug_typeslock coun", 43, &v17, &g_ef82c0, &g_ef8340);
                                        __debugbreak();
                                    }
                                    if (*(unsigned long long *)&v13)
                                        _free(*(unsigned long long *)((void*)&v13 + 8));
                                    i += 8;
                                } while (i != v36);
                            }
                        }
                        if (v1 != 0x8000000000000000)
                        {
                            v13 = v1;
                            v14 = v0;
                            v15 = 3;
                            v38 = iter;
                            if (*(unsigned long long *)&v5 - v38 <= 1)
                            {
                                sub_c6c0cc(&v5);
                                v38 = iter;
                            }
                            *(unsigned short *)(*(unsigned long long *)((void*)&v5 + 8) + v38) = 8236;
                            iter += 2;
                            v9 = &v13;
                            v10 = &g_b7a7fc;
                            if (!(sub_be769c(&v5, &g_ef8140, &g_cba67f, &v9) & 1))
                            {
                                if (v13)
                                    _free(v14);
                                goto LABEL_b7aae4;
                            }
                            else
                            {
                                sub_c73d64("called `Result::unwrap()` on an `Err` valueContents/Resources/DWARFinvalid timestampfailed to create dispatch semaphore for thread synchronizationRUST_BACKTRACEpermission deniedconnection refusednetwork unreachableconnection abortednot connectedaddress in useaddress not availablenetwork downbroken pipeentity already existsoperation would blocknot a directoryis a directorydirectory not emptyread-only filesystem or storage mediumfilesystem loop or indirection limit (e.g. symlink loop)stale network file handleinvalid input parameterinvalid datatimed outwrite zeroseek on unseekable filequota exceededfile too largeresource busyexecutable file busycross-device link or renametoo many linksargument list too longoperation interruptedunsupportedunexpected end of fileout of memoryin progressother erroruncategorized error.debug_abbrev.debug_addr.debug_aranges.debug_info.debug_line.debug_line_str.debug_loc.debug_loclists.debug_macinfo.debug_macro.debug_ranges.debug_rnglists.debug_str.debug_str_offsets.debug_typeslock coun", 43, &v17, &g_ef8170, &g_ef8340);
                            }
                        }
                        else
                        {
LABEL_b7aae4:
                            v13 = v5;
                            v15 = iter;
                            if (v2)
                            {
                                _free(ptr2);
                                goto LABEL_b7ac34;
                            }
                        }
                    }
                    else
                    {
                        sub_c73d64("called `Result::unwrap()` on an `Err` valueContents/Resources/DWARFinvalid timestampfailed to create dispatch semaphore for thread synchronizationRUST_BACKTRACEpermission deniedconnection refusednetwork unreachableconnection abortednot connectedaddress in useaddress not availablenetwork downbroken pipeentity already existsoperation would blocknot a directoryis a directorydirectory not emptyread-only filesystem or storage mediumfilesystem loop or indirection limit (e.g. symlink loop)stale network file handleinvalid input parameterinvalid datatimed outwrite zeroseek on unseekable filequota exceededfile too largeresource busyexecutable file busycross-device link or renametoo many linksargument list too longoperation interruptedunsupportedunexpected end of fileout of memoryin progressother erroruncategorized error.debug_abbrev.debug_addr.debug_aranges.debug_info.debug_line.debug_line_str.debug_loc.debug_loclists.debug_macinfo.debug_macro.debug_ranges.debug_rnglists.debug_str.debug_str_offsets.debug_typeslock coun", 43, &v17, &g_ef8170, &g_ef8378);
                    }
                }
                else
                {
                    sub_c6b970(1, v34);
                }
            }
            else
            {
                sub_c73d64("a Display implementation returned an error unexpectedly-- failed to decompileUtf8Errorvalid_up_toerror_lenunsupported types versionwe have debug infoinputTagMapResMapOptAltIsNotIsASeparatedListSeparatedNonEmptyListMany0Many1CountTakeUntilLengthValueTagClosureAlphaDigitAlphaNumericSpaceMultiSpaceLengthValueFnEofSwitchTagBitsOneOfNoneOfRegexpMatchRegexpMatchesRegexpFindRegexpCaptureRegexpCapturesTakeWhile1FixEscapedManyMNPermutationVerifyTakeTill1TakeWhileMNMany0CountMany1CountFloatSatisfy", 55, &v17, &g_ef8170, &g_efb3e0);
            }
        }
        else
        {
LABEL_b7a8cc:
            i = 0;
            v34 = 0;
            v2 = v26;
            ptr2 = v29;
            v4 = 3;
            v26 = 0x8000000000000000;
            ptr = 1;
            goto LABEL_b7a914;
        }
    }
    else
    {
        sub_c6b970(v26, v29);
    }
    __debugbreak();
}
