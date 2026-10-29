/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc25220..0xc254ac (652 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c25220_0 {
    unsigned long long field_0;
    char padding_8[20];
    unsigned int field_1c;
} st_c25220_0;

extern long long g_efc130;
extern long long g_efc660;

long long sub_c25220(unsigned long long *a0, unsigned int a1)
{
    unsigned int v17;  // w20
    unsigned long long *v18;  // x19
    unsigned int i;  // w21
    unsigned int *v28;  // x9
    unsigned long long v29;  // 4127
    unsigned long long idx;  // x21
    unsigned int *v31;  // x8
    unsigned int j;  // w28
    unsigned int *v33;  // x8
    unsigned long long v34;  // 4127
    long long v35;  // x0
    unsigned long long *v36;  // x9
    unsigned long v19;  // x8
    unsigned long v37;  // x8
    st_c25220_0 *v20;  // x8
    unsigned long v21;  // x23
    unsigned long v22;  // x24
    unsigned long v23;  // x25
    unsigned long v24;  // x26
    unsigned long long ptr;  // x0
    unsigned int *v26;  // x9
    uint128_t v0;  // [bp-0x118]
    uint128_t v1;  // [bp-0x108]
    unsigned long long *v2;  // [bp-0xf8]
    uint128_t v3;  // [bp-0xf0]
    uint128_t v4;  // [bp-0xe0]
    unsigned long long *v5;  // [bp-0xd0]
    unsigned long v6;  // [bp-0xc0], Other Possible Types: unsigned long long
    unsigned long long v7;  // [bp-0xc0]
    unsigned int ptr1;  // [bp-0xb8], Other Possible Types: unsigned long long
    unsigned long long *v9;  // [bp-0xb0]
    unsigned int v10;  // [bp-0xa8]
    unsigned long long *v11;  // [bp-0xa0]
    uint128_t v12;  // [bp-0x98]
    uint128_t v13;  // [bp-0x88]
    unsigned long long *v14;  // [bp-0x78]
    char *v15;  // [bp-0x10]
    char v16;  // [bp+0x0]

    v15 = &v16;
    v17 = a1;
    v18 = a0;
    v19 = a1;
    if (a0[5] <= v19 || (v20 = v18[4] + v19 * 32, v20->field_0 == 0x8000000000000000))
        v21 = 0xffffffff;
    else
        v21 = v20->field_1c;
    v22 = v18[7];
    v23 = v18[8];
    v24 = 0xffffffff;
    ptr = 4;
    do
    {
        if (v23 > v24)
        {
            v26 = v22 + 48 * v24;
            v24 = v26[8];
            i = v26[11];
        }
        else
        {
            do
            {
                if (v23 <= v21)
                {
                    idx = 0;
                    v6 = 0;
                    goto LABEL_c25360;
                }
            } while ((v28 = v22 + 48 * v21, v21 = v28[9], i = v28[10], v29 = arm64g_calculate_condition(1, v28[10], 1, 0), v29 & 1));
        }
    } while (i == v17);
    ptr = _malloc(16);
    if (ptr)
    {
        *(unsigned int *)ptr = i;
        v6 = 4;
        ptr1 = ptr;
        idx = 1;
    }
    else
    {
        v35 = sub_c6b970(4, 16);
        if (v7)
            _free(ptr1);
        __Unwind_Resume(v35);
    }
    while (1)
    {
        v9 = idx;
        do
        {
            if (v23 > v24)
            {
                v31 = v22 + 48 * v24;
                v24 = v31[8];
                j = v31[11];
                goto LABEL_c2531c;
            }
            do
            {
                if (v23 <= v21)
                {
                    v7 = v6;
LABEL_c25360:
                    v0 = CONCAT(ptr, ptr);
                    v36 = ptr + idx * 4;
                    v1 = CONCAT(v36, v6);
                    v2 = v18;
                    sub_c387fc(&v7, &v0, v18);
                    v37 = (unsigned int)v7;
                    if (!(v37 & 1))
                    {
                        v3 = v0;
                        v4 = v1;
                        v5 = v2;
                        v6 = 2;
                        ptr1 = v17;
                        v9 = v18;
                        v10 = v37;
                        v12 = v3;
                        v13 = v4;
                        v11 = v36;
                        v14 = v5;
                        sub_c73d64("called `Result::unwrap()` on an `Err` valueContents/Resources/DWARFinvalid timestampfailed to create dispatch semaphore for thread synchronizationRUST_BACKTRACEpermission deniedconnection refusednetwork unreachableconnection abortednot connectedaddress in useaddress not availablenetwork downbroken pipeentity already existsoperation would blocknot a directoryis a directorydirectory not emptyread-only filesystem or storage mediumfilesystem loop or indirection limit (e.g. symlink loop)stale network file handleinvalid input parameterinvalid datatimed outwrite zeroseek on unseekable filequota exceededfile too largeresource busyexecutable file busycross-device link or renametoo many linksargument list too longoperation interruptedunsupportedunexpected end of fileout of memoryin progressother erroruncategorized error.debug_abbrev.debug_addr.debug_aranges.debug_info.debug_line.debug_line_str.debug_loc.debug_loclists.debug_macinfo.debug_macro.debug_ranges.debug_rnglists.debug_str.debug_str_offsets.debug_typeslock coun", 43, &v6, &g_efc660, &g_efc130);
                        __debugbreak();
                    }
                    sub_c387fc(&v7, &v0, v2);
                    if ((unsigned int)v7 & 1)
                    {
                        v3 = v0;
                        v4 = v1;
                        v5 = v2;
                        v6 = 0;
                        ptr1 = ptr1;
                        v10 = ptr1;
                        v12 = v3;
                        v13 = v4;
                        v11 = v9;
                        v14 = v5;
                        sub_c73d64("called `Result::unwrap()` on an `Err` valueContents/Resources/DWARFinvalid timestampfailed to create dispatch semaphore for thread synchronizationRUST_BACKTRACEpermission deniedconnection refusednetwork unreachableconnection abortednot connectedaddress in useaddress not availablenetwork downbroken pipeentity already existsoperation would blocknot a directoryis a directorydirectory not emptyread-only filesystem or storage mediumfilesystem loop or indirection limit (e.g. symlink loop)stale network file handleinvalid input parameterinvalid datatimed outwrite zeroseek on unseekable filequota exceededfile too largeresource busyexecutable file busycross-device link or renametoo many linksargument list too longoperation interruptedunsupportedunexpected end of fileout of memoryin progressother erroruncategorized error.debug_abbrev.debug_addr.debug_aranges.debug_info.debug_line.debug_line_str.debug_loc.debug_loclists.debug_macinfo.debug_macro.debug_ranges.debug_rnglists.debug_str.debug_str_offsets.debug_typeslock coun", 43, &v6, &g_efc660, &g_efc130);
                        __debugbreak();
                    }
                    else if ((unsigned long long)v1)
                    {
                        _free(*(unsigned long long *)&v0);
                    }
                    return (unsigned int)ptr1;
                }
            } while ((v33 = v22 + 48 * v21, v21 = v33[9], j = v33[10], v34 = arm64g_calculate_condition(1, j, 1, 0), v34 & 1));
LABEL_c2531c:
        } while (j == v17);
        if (idx == v6)
        {
            sub_c736c8(&v6, idx, 1, 4, 4);
            ptr = ptr1;
        }
        *(unsigned int *)(ptr + idx * 4) = j;
        idx += 1;
    }
}
