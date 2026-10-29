/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb8456c..0xb84914 (936 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b8456c_7 {
    char padding_0[136];
    struct st_b8456c_0 *field_88;
} st_b8456c_7;

typedef struct st_b8456c_2 {
    char padding_0[8];
    struct st_b8456c_0 *field_8;
} st_b8456c_2;

typedef struct st_b8456c_3 {
    long long field_0;
    unsigned long long field_8;
} st_b8456c_3;

typedef struct st_b8456c_1 {
    char padding_0[200];
    struct st_b8456c_0 *field_c8;
} st_b8456c_1;

typedef struct st_b8456c_0 {
    char padding_0[8];
    char field_8;
    char padding_9[15];
    long long field_18;
    unsigned long long field_20;
} st_b8456c_0;

typedef struct st_b8456c_6 {
    char padding_0[72];
    struct st_b8456c_0 *field_48;
} st_b8456c_6;

extern long long g_b7a7fc;
extern unsigned long long g_b7e020;
extern unsigned long long g_b86e9c;
extern long long g_cb8adc;
extern long long g_cba67f;
extern long long g_ef8310;
extern long long g_ef8340;
extern long long g_ef8358;
extern long long g_ef8378;

unsigned long long sub_b8456c(st_b8456c_1 **a0, st_b8456c_3 *a1)
{
    st_b8456c_1 *v23;  // x25
    long long v24;  // x21
    unsigned long long v33;  // x1
    unsigned long long v34;  // x0
    st_b8456c_0 *v25;  // x20
    unsigned long v26;  // x24
    unsigned long long v27;  // x8
    unsigned long long i;  // x27
    unsigned long long v29;  // x23
    unsigned long long ptr;  // x0
    unsigned long v31;  // x22
    unsigned long long v32;  // x27
    unsigned long v0;  // [bp-0x128]
    uint128_t v1;  // [bp-0x120], Other Possible Types: unsigned long long *
    long long v2;  // [bp-0x118]
    unsigned long long v3;  // [bp-0x110]
    st_b8456c_2 *v4;  // [bp-0x108], Other Possible Types: unsigned long long
    long long v5;  // [bp-0x100], Other Possible Types: unsigned long long
    st_b8456c_1 *v6;  // [bp-0xf8]
    unsigned long long v7;  // [bp-0xf0]
    st_b8456c_7 *v8;  // [bp-0xe8]
    unsigned long long v9;  // [bp-0xe0]
    st_b8456c_6 *v10;  // [bp-0xd8]
    unsigned long long v11;  // [bp-0xd0]
    char *v12;  // [bp-0xc8]
    long long v13;  // [bp-0xc0]
    char v14;  // [bp-0xb8]
    unsigned long long v15;  // [bp-0xa8]
    uint128_t v16;  // [bp-0xa0]
    unsigned long long v17;  // [bp-0x90]
    uint128_t v18;  // [bp-0x88]
    unsigned long long v19;  // [bp-0x78]
    char v20;  // [bp-0x69]
    char *v21;  // [bp-0x10]
    char v22;  // [bp+0x0]

    v21 = &v22;
    v23 = *a0;
    v24 = a1->field_0;
    v25 = v23->field_c8;
    /* unsupported instruction */;
    /* unsupported instruction */;
    v0 = a1->field_8;
    if (!/* unsupported instruction */)
    {
        /* unsupported instruction */;
        if (/* unsupported instruction */ ^ 1)
            goto LABEL_b84844;
        v26 = v25->field_20;
        if (v25->field_20)
            goto LABEL_b845c4;
    }
    else
    {
        /* unsupported instruction */;
LABEL_b84844:
        sub_c7573c(&v25->field_8);
        v26 = v25->field_20;
        if (v25->field_20)
        {
LABEL_b845c4:
            sub_b98350(&v14, v25->field_18);
            if (*(unsigned long long *)&v14 != 0x8000000000000000)
            {
                v27 = v26 * 264;
                v16 = v14;
                v17 = v15;
                i = v27 - 264;
                if (v27 != 264)
                {
                    v29 = 2235968978631460802 * (i >> 3);
                    ptr = _malloc(v29);
                    if (!ptr)
                    {
                        sub_c6b970(1, v29);
                        __debugbreak();
                    }
                }
                else
                {
                    v29 = 0;
                    ptr = 1;
                }
                v18 = CONCAT(ptr, v29);
                v19 = 0;
                v4 = &v16;
                v5 = &g_b7a7fc;
                if (sub_be769c(&v18, &g_ef8310, &g_cba67f, &v4))
                {
                    sub_c73d64("called `Result::unwrap()` on an `Err` valueContents/Resources/DWARFinvalid timestampfailed to create dispatch semaphore for thread synchronizationRUST_BACKTRACEpermission deniedconnection refusednetwork unreachableconnection abortednot connectedaddress in useaddress not availablenetwork downbroken pipeentity already existsoperation would blocknot a directoryis a directorydirectory not emptyread-only filesystem or storage mediumfilesystem loop or indirection limit (e.g. symlink loop)stale network file handleinvalid input parameterinvalid datatimed outwrite zeroseek on unseekable filequota exceededfile too largeresource busyexecutable file busycross-device link or renametoo many linksargument list too longoperation interruptedunsupportedunexpected end of fileout of memoryin progressother erroruncategorized error.debug_abbrev.debug_addr.debug_aranges.debug_info.debug_line.debug_line_str.debug_loc.debug_loclists.debug_macinfo.debug_macro.debug_ranges.debug_rnglists.debug_str.debug_str_offsets.debug_typeslock coun", 43, &v20, &g_ef8358, &g_ef8378);
                    __debugbreak();
                }
                if (v26 != 1)
                {
                    v31 = v25->field_18 + 264;
                    do
                    {
                        v32 = i;
                        sub_b98350(&v4, v31);
                        v33 = v19;
                        if (*(unsigned long long *)&v18 - v33 <= 1)
                        {
                            sub_c6c0cc(&v18);
                            v33 = v19;
                        }
                        *(unsigned short *)(*(unsigned long long *)((void*)&v18 + 8) + v33) = 2314;
                        v19 += 2;
                        v1 = &v4;
                        v2 = &g_b7a7fc;
                        if (sub_be769c(&v18, &g_ef8310, &g_cba67f, &v1))
                        {
                            sub_c73d64("called `Result::unwrap()` on an `Err` valueContents/Resources/DWARFinvalid timestampfailed to create dispatch semaphore for thread synchronizationRUST_BACKTRACEpermission deniedconnection refusednetwork unreachableconnection abortednot connectedaddress in useaddress not availablenetwork downbroken pipeentity already existsoperation would blocknot a directoryis a directorydirectory not emptyread-only filesystem or storage mediumfilesystem loop or indirection limit (e.g. symlink loop)stale network file handleinvalid input parameterinvalid datatimed outwrite zeroseek on unseekable filequota exceededfile too largeresource busyexecutable file busycross-device link or renametoo many linksargument list too longoperation interruptedunsupportedunexpected end of fileout of memoryin progressother erroruncategorized error.debug_abbrev.debug_addr.debug_aranges.debug_info.debug_line.debug_line_str.debug_loc.debug_loclists.debug_macinfo.debug_macro.debug_ranges.debug_rnglists.debug_str.debug_str_offsets.debug_typeslock coun", 43, &v20, &g_ef8358, &g_ef8340);
                            __debugbreak();
                        }
                        if (v4)
                            _free(v5);
                        v31 += 264;
                        i = v32 - 264;
                    } while (i);
                }
                v1 = v18;
                v3 = v19;
                if (*(unsigned long long *)&v16)
                    _free(*(unsigned long long *)((void*)&v16 + 8));
LABEL_b846a8:
                v4 = &v23->padding_0[192];
                v5 = &g_b86e9c;
                v6 = v23;
                v7 = &g_b7e020;
                v8 = &v23->padding_0[64];
                v9 = &g_b7e020;
                v10 = &v23->padding_0[128];
                v11 = &g_b7e020;
                v12 = &v1;
                v13 = &g_b7a7fc;
                v34 = sub_be769c(v24, v0, &g_cb8adc, &v4);
                if (*(unsigned long long *)&v1)
                    _free(*(unsigned long long *)((void*)&v1 + 8));
                while (1)
                {
                    /* unsupported instruction */;
                    if (/* unsupported instruction */ != 1)
                    {
                        /* unsupported instruction */;
                        sub_c75418(&v25->field_8);
                        return v34;
                    }
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    if (!(/* unsupported instruction */ ^ 1))
                        return v34;
                }
            }
        }
    }
    v1 = CONCAT(1, 0);
    v3 = 0;
    goto LABEL_b846a8;
}
