/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb83f40..0xb844a0 (1376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b83f40_0 {
    char padding_0[24];
    long long field_18;
} st_b83f40_0;

typedef struct st_b83f40_1 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
    char padding_18[8];
    unsigned long long field_20;
    unsigned long long field_28;
    struct st_b83f40_0 *field_30;
} st_b83f40_1;

extern long long g_b7a7fc;
extern unsigned long long g_b7e018;
extern long long g_cb8bad;
extern long long g_cba67f;
extern long long g_ef8270;
extern long long g_ef82c0;
extern long long g_ef8310;
extern long long g_ef8340;
extern long long g_ef8358;
extern long long g_ef8378;

unsigned long long sub_b83f40(st_b83f40_1 **a0, long long *a1)
{
    st_b83f40_1 *v25;  // x24
    long long v26;  // x20
    unsigned long long v35;  // x1
    st_b83f40_0 *v36;  // x22
    unsigned long long v37;  // x24
    unsigned long long v38;  // x8
    unsigned long long i;  // x27
    unsigned long long v40;  // x23
    unsigned long long ptr;  // x0
    unsigned long v42;  // x22
    unsigned long long v43;  // x27
    unsigned long long v44;  // x1
    long long v27;  // x21
    unsigned long long v45;  // x0
    unsigned long long v28;  // x23
    unsigned long long v29;  // x8
    unsigned long long v30;  // x25
    unsigned long long v31;  // x19
    unsigned long long ptr1;  // x0
    unsigned long v33;  // x27
    unsigned long long v34;  // x25
    char v0;  // [bp-0x158]
    long long v1;  // [bp-0x150]
    unsigned long v2;  // [bp-0x140]
    unsigned long long v3;  // [bp-0x138]
    uint128_t v4;  // [bp-0x130]
    unsigned long long v5;  // [bp-0x120]
    uint128_t v6;  // [bp-0x110], Other Possible Types: unsigned long long *
    long long v7;  // [bp-0x108]
    unsigned long long v8;  // [bp-0x100]
    char *v9;  // [bp-0xf8], Other Possible Types: uint128_t, unsigned long long
    long long v10;  // [bp-0xf0]
    char *v11;  // [bp-0xe8], Other Possible Types: unsigned long long
    long long v12;  // [bp-0xe0]
    char *v13;  // [bp-0xd8]
    long long v14;  // [bp-0xd0]
    uint128_t v15;  // [bp-0xc8]
    unsigned long long v16;  // [bp-0xb8]
    uint128_t v17;  // [bp-0xb0], Other Possible Types: unsigned long
    unsigned long long v18;  // [bp-0xa0]
    uint128_t v19;  // [bp-0x90], Other Possible Types: char *
    unsigned long long v20;  // [bp-0x88]
    unsigned long long v21;  // [bp-0x80]
    char v22;  // [bp-0x71]
    char *v23;  // [bp-0x10]
    char v24;  // [bp+0x0]

    v23 = &v24;
    v25 = *a0;
    v26 = *a1;
    v27 = a1[1];
    v2 = v25->field_8;
    v3 = v25->field_8 + v25->field_10 * 8;
    sub_b9475c(&v0, &v2, 0x202c);
    v28 = v25->field_28;
    if (v28)
    {
        v29 = v28 * 64;
        *(unsigned long long *)&v15 = v25->field_20;
        v30 = v29 - 64;
        if (v29 != 64)
        {
            v31 = v30 >> 5;
            ptr1 = _malloc(v31);
            if (ptr1)
                goto LABEL_b83fd8;
            sub_c6b970(1, v31);
        }
        else
        {
            v31 = 0;
            ptr1 = 1;
LABEL_b83fd8:
            v9 = CONCAT(ptr1, v31);
            v11 = 0;
            v19 = &v15;
            v20 = &g_b7e018;
            if (!(sub_be769c(&v9, &g_ef8270, &g_cba67f, &v19) & 1))
            {
                if (v28 != 1)
                {
                    v33 = v25->field_20 + 64;
                    do
                    {
                        v34 = v30;
                        v17 = v33;
                        v35 = v11;
                        if (*(unsigned long long *)&v9 - v35 <= 1)
                        {
                            sub_c6c0cc(&v9);
                            v35 = v11;
                        }
                        *(unsigned short *)(*(unsigned long long *)((void*)&v9 + 8) + v35) = 8236;
                        v11 += 2;
                        v19 = &v17;
                        v20 = &g_b7e018;
                        if (sub_be769c(&v9, &g_ef8270, &g_cba67f, &v19))
                            goto LABEL_b84320;
                    } while ((v33 += 64, v30 = v34 - 64, v34 != 64));
                }
                v4 = v9;
                v5 = v11;
LABEL_b84028:
                v36 = v25->field_30;
                /* unsupported instruction */;
                /* unsupported instruction */;
                if (!/* unsupported instruction */)
                {
                    /* unsupported instruction */;
                    if (!(/* unsupported instruction */ ^ 1))
                        goto LABEL_b84044;
                }
                else
                {
                    /* unsupported instruction */;
                }
                sub_c7573c(&v36->padding_0[8]);
LABEL_b84044:
                v37 = *(long long *)&v36[1].padding_0[0];
                if (!v37 || (sub_b98350(&v15, v36->field_18), *(unsigned long long *)&v15 == 0x8000000000000000))
                {
                    v6 = CONCAT(1, 0);
                    v8 = 0;
                    goto LABEL_b841d0;
                }
                v38 = v37 * 264;
                v17 = v15;
                v18 = v16;
                i = v38 - 264;
                if (v38 != 264)
                {
                    v40 = 2235968978631460802 * (i >> 3);
                    ptr = _malloc(v40);
                    if (ptr)
                        goto LABEL_b84174;
                    sub_c6b970(1, v40);
                }
                else
                {
                    v40 = 0;
                    ptr = 1;
LABEL_b84174:
                    v19 = CONCAT(ptr, v40);
                    v21 = 0;
                    v9 = &v17;
                    v10 = &g_b7a7fc;
                    if (!sub_be769c(&v19, &g_ef8310, &g_cba67f, &v9))
                    {
                        if (v37 != 1)
                        {
                            v42 = v36->field_18 + 264;
                            do
                            {
                                v43 = i;
                                sub_b98350(&v9, v42);
                                v44 = v21;
                                if (*(unsigned long long *)&v19 - v44 <= 1)
                                {
                                    sub_c6c0cc(&v19);
                                    v44 = v21;
                                }
                                *(unsigned short *)(*(unsigned long long *)((void*)&v19 + 8) + v44) = 2314;
                                v21 += 2;
                                v6 = &v9;
                                v7 = &g_b7a7fc;
                                if (sub_be769c(&v19, &g_ef8310, &g_cba67f, &v6))
                                {
                                    sub_c73d64("called `Result::unwrap()` on an `Err` valueContents/Resources/DWARFinvalid timestampfailed to create dispatch semaphore for thread synchronizationRUST_BACKTRACEpermission deniedconnection refusednetwork unreachableconnection abortednot connectedaddress in useaddress not availablenetwork downbroken pipeentity already existsoperation would blocknot a directoryis a directorydirectory not emptyread-only filesystem or storage mediumfilesystem loop or indirection limit (e.g. symlink loop)stale network file handleinvalid input parameterinvalid datatimed outwrite zeroseek on unseekable filequota exceededfile too largeresource busyexecutable file busycross-device link or renametoo many linksargument list too longoperation interruptedunsupportedunexpected end of fileout of memoryin progressother erroruncategorized error.debug_abbrev.debug_addr.debug_aranges.debug_info.debug_line.debug_line_str.debug_loc.debug_loclists.debug_macinfo.debug_macro.debug_ranges.debug_rnglists.debug_str.debug_str_offsets.debug_typeslock coun", 43, &v22, &g_ef8358, &g_ef8340);
                                    __debugbreak();
                                }
                                if (v9)
                                    _free(v10);
                                v42 += 264;
                                i = v43 - 264;
                            } while (i);
                        }
                        v6 = v19;
                        v8 = v21;
                        if (*(unsigned long long *)&v17)
                            _free(*(unsigned long long *)((void*)&v17 + 8));
LABEL_b841d0:
                        v9 = &v0;
                        v10 = &g_b7a7fc;
                        v11 = &v4;
                        v12 = &g_b7a7fc;
                        v13 = &v6;
                        v14 = &g_b7a7fc;
                        v45 = sub_be769c(v26, v27, &g_cb8bad, &v9);
                        if (*(unsigned long long *)&v6)
                            _free(*(unsigned long long *)((void*)&v6 + 8));
                        do
                        {
                            /* unsupported instruction */;
                            if (/* unsupported instruction */ != 1)
                            {
                                /* unsupported instruction */;
                                sub_c75418(&v36->padding_0[8]);
                                break;
                            }
                        } while ((/* unsupported instruction */, /* unsupported instruction */, /* unsupported instruction */ ^ 1));
                        if (*(unsigned long long *)&v4)
                            _free(*(unsigned long long *)((void*)&v4 + 8));
                        if (!v0)
                            return v45;
                        _free(v1);
                        return v45;
                    }
                    sub_c73d64("called `Result::unwrap()` on an `Err` valueContents/Resources/DWARFinvalid timestampfailed to create dispatch semaphore for thread synchronizationRUST_BACKTRACEpermission deniedconnection refusednetwork unreachableconnection abortednot connectedaddress in useaddress not availablenetwork downbroken pipeentity already existsoperation would blocknot a directoryis a directorydirectory not emptyread-only filesystem or storage mediumfilesystem loop or indirection limit (e.g. symlink loop)stale network file handleinvalid input parameterinvalid datatimed outwrite zeroseek on unseekable filequota exceededfile too largeresource busyexecutable file busycross-device link or renametoo many linksargument list too longoperation interruptedunsupportedunexpected end of fileout of memoryin progressother erroruncategorized error.debug_abbrev.debug_addr.debug_aranges.debug_info.debug_line.debug_line_str.debug_loc.debug_loclists.debug_macinfo.debug_macro.debug_ranges.debug_rnglists.debug_str.debug_str_offsets.debug_typeslock coun", 43, &v22, &g_ef8358, &g_ef8378);
                }
            }
            else
            {
LABEL_b84320:
                sub_c73d64("called `Result::unwrap()` on an `Err` valueContents/Resources/DWARFinvalid timestampfailed to create dispatch semaphore for thread synchronizationRUST_BACKTRACEpermission deniedconnection refusednetwork unreachableconnection abortednot connectedaddress in useaddress not availablenetwork downbroken pipeentity already existsoperation would blocknot a directoryis a directorydirectory not emptyread-only filesystem or storage mediumfilesystem loop or indirection limit (e.g. symlink loop)stale network file handleinvalid input parameterinvalid datatimed outwrite zeroseek on unseekable filequota exceededfile too largeresource busyexecutable file busycross-device link or renametoo many linksargument list too longoperation interruptedunsupportedunexpected end of fileout of memoryin progressother erroruncategorized error.debug_abbrev.debug_addr.debug_aranges.debug_info.debug_line.debug_line_str.debug_loc.debug_loclists.debug_macinfo.debug_macro.debug_ranges.debug_rnglists.debug_str.debug_str_offsets.debug_typeslock coun", 43, &v22, &g_ef82c0);
            }
        }
        __debugbreak();
    }
    else
    {
        v4 = CONCAT(1, 0);
        v5 = 0;
        goto LABEL_b84028;
    }
}
