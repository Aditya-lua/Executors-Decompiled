/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb79b20..0xb79d0c (492 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b79b20_2 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_b79b20_2;

typedef struct st_b79b20_5 {
    long long field_0;
    struct st_b79b20_3 *field_8;
} st_b79b20_5;

typedef struct st_b79b20_1 {
    struct st_b79b20_2 *field_0;
    struct st_b79b20_0 *field_8;
} st_b79b20_1;

typedef struct st_b79b20_3 {
    char padding_0[24];
    struct st_b79b20_4 *field_18;
} st_b79b20_3;

typedef struct st_b79b20_0 {
    unsigned long long field_0;
    long long field_8;
    long long field_10;
    long long field_18;
} st_b79b20_0;

typedef struct st_b79b20_4 {
    unsigned long long field_0;
} st_b79b20_4;

extern unsigned long long g_be766c;
extern long long g_cb89c1;
extern long long g_ef7f50;
extern long long g_ef7f90;

long long sub_b79b20(st_b79b20_5 **a0, st_b79b20_1 *a1)
{
    unsigned long long v6;  // x8
    st_b79b20_0 *v7;  // x20
    char v0;  // [bp-0x58], Other Possible Types: unsigned long
    uint128_t v1;  // [bp-0x50], Other Possible Types: unsigned long long
    uint128_t v2;  // [bp-0x40], Other Possible Types: unsigned long
    unsigned long v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    if (a1->field_0->field_0 < 2)
        goto LABEL_b79b5c;
    switch (v6)
    {
    case 11:
        if (a1->field_0->field_8 == 0x8000000000000000)
            *a0->field_8->field_18();
    case 7:
LABEL_b79b5c:
        if (sub_b79024(a0) & 1)
            return 1;
        v7 = a1->field_8;
        if (v7->field_0 == 6 && v7->field_8 >= 0 && sub_b7c6ec(v7->field_10, v7->field_18))
        {
            sub_be8f00(&v0, v7->field_10, v7->field_18);
            if (v0 != 1)
            {
                v2 = *(unsigned long long *)&v1;
                v3 = *(unsigned long long *)((void*)&v1 + 8);
                v0 = &v2;
                v1 = &g_be766c;
                return sub_be769c(*a0->field_0, *a0->field_8, &g_cb89c1, &v0);
            }
            v2 = v1;
            sub_c73d64("called `Result::unwrap()` on an `Err` valueContents/Resources/DWARFinvalid timestampfailed to create dispatch semaphore for thread synchronizationRUST_BACKTRACEpermission deniedconnection refusednetwork unreachableconnection abortednot connectedaddress in useaddress not availablenetwork downbroken pipeentity already existsoperation would blocknot a directoryis a directorydirectory not emptyread-only filesystem or storage mediumfilesystem loop or indirection limit (e.g. symlink loop)stale network file handleinvalid input parameterinvalid datatimed outwrite zeroseek on unseekable filequota exceededfile too largeresource busyexecutable file busycross-device link or renametoo many linksargument list too longoperation interruptedunsupportedunexpected end of fileout of memoryin progressother erroruncategorized error.debug_abbrev.debug_addr.debug_aranges.debug_info.debug_line.debug_line_str.debug_loc.debug_loclists.debug_macinfo.debug_macro.debug_ranges.debug_rnglists.debug_str.debug_str_offsets.debug_typeslock coun", 43, &v2, &g_ef7f50, &g_ef7f90);
        }
        *a0->field_8->field_18();
    default:
        *a0->field_8->field_18();
    }
}
