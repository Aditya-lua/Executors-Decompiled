/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb944e8..0xb94628 (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b944e8_0 {
    char padding_0[8];
    long long field_8;
    long long field_10;
} st_b944e8_0;

extern unsigned long long g_b7233c;
extern unsigned long long g_be766c;
extern long long g_cb8c22;
extern long long g_cba67f;
extern long long g_ef82a0;
extern long long g_ef82e0;

unsigned long long sub_b944e8(st_b944e8_0 **a0, long long *a1)
{
    long long v6;  // x21
    long long v7;  // x22
    long long v8;  // x0
    unsigned long long v9;  // x0
    unsigned long v0;  // [bp-0x68]
    uint128_t v1;  // [bp-0x60], Other Possible Types: unsigned long long
    char *v2;  // [bp-0x50], Other Possible Types: uint128_t, unsigned long
    unsigned long v3;  // [bp-0x48], Other Possible Types: unsigned long long
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = *a0->field_8;
    v7 = *a0->field_10;
    if (sub_b7c6ec(v6, v7) & 1)
    {
        sub_be8f00(&v0, v6, v7);
        if (v0 != 1)
        {
            v2 = *(unsigned long long *)&v1;
            v3 = *(unsigned long long *)((void*)&v1 + 8);
            v0 = &v2;
            v1 = &g_be766c;
            return sub_be769c(*a1, a1[1], &g_cba67f, &v0);
        }
        v2 = v1;
        v8 = sub_c73d64("called `Result::unwrap()` on an `Err` valueContents/Resources/DWARFinvalid timestampfailed to create dispatch semaphore for thread synchronizationRUST_BACKTRACEpermission deniedconnection refusednetwork unreachableconnection abortednot connectedaddress in useaddress not availablenetwork downbroken pipeentity already existsoperation would blocknot a directoryis a directorydirectory not emptyread-only filesystem or storage mediumfilesystem loop or indirection limit (e.g. symlink loop)stale network file handleinvalid input parameterinvalid datatimed outwrite zeroseek on unseekable filequota exceededfile too largeresource busyexecutable file busycross-device link or renametoo many linksargument list too longoperation interruptedunsupportedunexpected end of fileout of memoryin progressother erroruncategorized error.debug_abbrev.debug_addr.debug_aranges.debug_info.debug_line.debug_line_str.debug_loc.debug_loclists.debug_macinfo.debug_macro.debug_ranges.debug_rnglists.debug_str.debug_str_offsets.debug_typeslock coun", 43, &v2, &g_ef82a0, &g_ef82e0);
        if ((long long)v0 >= 1)
            _free(*(unsigned long long *)&v1);
        __Unwind_Resume(v8);
    }
    else
    {
        sub_b7ccc0(&v0, v6, v7);
        v2 = &v0;
        v3 = &g_b7233c;
        v9 = sub_be769c(*a1, a1[1], &g_cb8c22, &v2);
        if ((long long)v0 < 1)
            return v9;
        _free(*(unsigned long long *)&v1);
        return v9;
    }
}
