/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb84984..0xb84bf4 (624 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b84984_0 {
    char padding_0[64];
    char field_40;
    char padding_41[71];
    unsigned long long field_88;
    unsigned long long field_90;
} st_b84984_0;

typedef struct st_b84984_3 {
    long long field_0;
    unsigned long long field_8;
} st_b84984_3;

extern unsigned long long g_b7a7fc;
extern unsigned long long g_b7df84;
extern unsigned long long g_b7df8c;
extern unsigned long long g_b7e020;
extern long long g_cb8b3f;
extern long long g_cba67f;
extern long long g_ef8098;
extern long long g_ef8270;
extern long long g_ef82c0;

unsigned long long sub_b84984(st_b84984_0 **a0, st_b84984_3 *a1)
{
    st_b84984_0 *v19;  // x25
    unsigned long long v20;  // x22
    unsigned long long v29;  // x1
    unsigned long long v30;  // x0
    long long v21;  // x20
    unsigned long v22;  // x24
    unsigned long long v23;  // x8
    unsigned long long v24;  // x26
    unsigned long long v25;  // x21
    unsigned long long ptr;  // x0
    unsigned long v27;  // x28
    unsigned long long v28;  // x26
    unsigned long v0;  // [bp-0xe8]
    uint128_t v1;  // [bp-0xe0], Other Possible Types: char *, unsigned long long
    unsigned long long v2;  // [bp-0xd8]
    unsigned long long v3;  // [bp-0xd0]
    char *v4;  // [bp-0xc8], Other Possible Types: uint128_t
    unsigned long long v5;  // [bp-0xc0]
    st_b84984_0 *iter;  // [bp-0xb8], Other Possible Types: unsigned long long
    unsigned long long v7;  // [bp-0xb0]
    unsigned long long *v8;  // [bp-0xa8]
    unsigned long long v9;  // [bp-0xa0]
    unsigned long v10;  // [bp-0x98]
    unsigned long long v11;  // [bp-0x90]
    unsigned long v12;  // [bp-0x88]
    unsigned long long v13;  // [bp-0x80]
    unsigned long v14;  // [bp-0x78]
    unsigned long v15;  // [bp-0x70]
    char v16;  // [bp-0x61]
    char *v17;  // [bp-0x10]
    char v18;  // [bp+0x0]

    v17 = &v18;
    v19 = *a0;
    v20 = v19->field_90;
    if (v20)
    {
        v21 = a1->field_0;
        v22 = v19->field_88;
        v23 = v20 * 24;
        v14 = v22;
        v24 = v23 - 24;
        v0 = a1->field_8;
        if (v23 != 24)
        {
            v25 = 6148914691236517206 * (v24 >> 3);
            ptr = _malloc(v25);
            if (ptr)
                goto LABEL_b84a00;
            sub_c6b970(1, v25);
        }
        v25 = 0;
        ptr = 1;
LABEL_b84a00:
        v4 = CONCAT(ptr, v25);
        iter = 0;
        v1 = &v14;
        v2 = &g_b7df84;
        if (!(sub_be769c(&v4, &g_ef8270, &g_cba67f, &v1) & 1))
        {
            if (v20 != 1)
            {
                v27 = v22 + 24;
                do
                {
                    v28 = v24;
                    v15 = v27;
                    v29 = iter;
                    if (*(unsigned long long *)&v4 - v29 <= 1)
                    {
                        sub_c6c0cc(&v4);
                        v29 = iter;
                    }
                    *(unsigned short *)(*(unsigned long long *)((void*)&v4 + 8) + v29) = 8236;
                    iter += 2;
                    v1 = &v15;
                    v2 = &g_b7df84;
                    if (sub_be769c(&v4, &g_ef8270, &g_cba67f, &v1))
                        goto LABEL_b84b70;
                } while ((v27 += 24, v24 = v28 - 24, v28 != 24));
            }
            v1 = v4;
            v3 = iter;
            v4 = &v1;
            v5 = &g_b7a7fc;
            iter = v19;
            v7 = &g_b7e020;
            v8 = &v19->field_40;
            v9 = &g_b7e020;
            v10 = v22;
            v11 = &g_b7df8c;
            v12 = v22;
            v13 = &g_b7df8c;
            v30 = sub_be769c(v21, v0, &g_cb8b3f, &v4);
            if (!*(unsigned long long *)&v1)
                return v30;
            _free(*(unsigned long long *)((void*)&v1 + 8));
            return v30;
        }
LABEL_b84b70:
        sub_c73d64("called `Result::unwrap()` on an `Err` valueContents/Resources/DWARFinvalid timestampfailed to create dispatch semaphore for thread synchronizationRUST_BACKTRACEpermission deniedconnection refusednetwork unreachableconnection abortednot connectedaddress in useaddress not availablenetwork downbroken pipeentity already existsoperation would blocknot a directoryis a directorydirectory not emptyread-only filesystem or storage mediumfilesystem loop or indirection limit (e.g. symlink loop)stale network file handleinvalid input parameterinvalid datatimed outwrite zeroseek on unseekable filequota exceededfile too largeresource busyexecutable file busycross-device link or renametoo many linksargument list too longoperation interruptedunsupportedunexpected end of fileout of memoryin progressother erroruncategorized error.debug_abbrev.debug_addr.debug_aranges.debug_info.debug_line.debug_line_str.debug_loc.debug_loclists.debug_macinfo.debug_macro.debug_ranges.debug_rnglists.debug_str.debug_str_offsets.debug_typeslock coun", 43, &v16, &g_ef82c0);
    }
    else
    {
        v1 = 0;
        v2 = 1;
        v3 = 0;
        sub_c73c94(0, 0, &g_ef8098);
    }
    __debugbreak();
}
