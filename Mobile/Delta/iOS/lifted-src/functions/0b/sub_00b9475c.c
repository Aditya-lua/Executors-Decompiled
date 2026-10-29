/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb9475c..0xb94938 (476 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_b86fc0;
extern long long g_cba67f;
extern long long g_ef8270;
extern long long g_ef82c0;
extern long long g_ef8340;
extern long long g_ef8378;

double sub_b9475c(uint128_t *a0, unsigned long long *a1, unsigned short a2)
{
    unsigned long long v9;  // x8
    unsigned long long v10;  // x25
    unsigned long long v11;  // x19
    unsigned long long v12;  // x22
    unsigned long long ptr;  // x0
    unsigned long long i;  // x27
    unsigned long long v16;  // x1
    unsigned long v17;  // d0
    unsigned long v18;  // d0
    unsigned long long v0;  // [bp-0xa0]
    uint128_t v1;  // [bp-0x98]
    unsigned long long v2;  // [bp-0x88]
    unsigned long long v3;  // [bp-0x80]
    unsigned long long *v4;  // [bp-0x78]
    unsigned long long v5;  // [bp-0x70]
    char v6;  // [bp-0x61]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v9 = *a1;
    v10 = a1[1];
    if (v9 != v10)
    {
        v11 = v9 + 8;
        *a1 = v11;
        v0 = v9;
        if (v10 != v11)
        {
            v12 = v10 - v11 >> 2;
            ptr = _malloc(v12);
            if (ptr)
                goto LABEL_b947dc;
            sub_c6b970(1, v12);
        }
        else
        {
            v12 = 0;
            ptr = 1;
LABEL_b947dc:
            v1 = CONCAT(ptr, v12);
            v2 = 0;
            v4 = &v0;
            v5 = &g_b86fc0;
            if (!(sub_be769c(&v1, &g_ef8270, &g_cba67f, &v4) & 1))
            {
                if (v10 != v11)
                {
                    do
                    {
                        i = v11 + 8;
                        *a1 = i;
                        v3 = v11;
                        v16 = v2;
                        if (*(unsigned long long *)&v1 - v16 <= 1)
                        {
                            sub_c6c0cc(&v1);
                            v16 = v2;
                        }
                        *(unsigned short *)(*(unsigned long long *)((void*)&v1 + 8) + v16) = a2;
                        v2 += 2;
                        v4 = &v3;
                        v5 = &g_b86fc0;
                        if (sub_be769c(&v1, &g_ef8270, &g_cba67f, &v4))
                        {
                            sub_c73d64("called `Result::unwrap()` on an `Err` valueContents/Resources/DWARFinvalid timestampfailed to create dispatch semaphore for thread synchronizationRUST_BACKTRACEpermission deniedconnection refusednetwork unreachableconnection abortednot connectedaddress in useaddress not availablenetwork downbroken pipeentity already existsoperation would blocknot a directoryis a directorydirectory not emptyread-only filesystem or storage mediumfilesystem loop or indirection limit (e.g. symlink loop)stale network file handleinvalid input parameterinvalid datatimed outwrite zeroseek on unseekable filequota exceededfile too largeresource busyexecutable file busycross-device link or renametoo many linksargument list too longoperation interruptedunsupportedunexpected end of fileout of memoryin progressother erroruncategorized error.debug_abbrev.debug_addr.debug_aranges.debug_info.debug_line.debug_line_str.debug_loc.debug_loclists.debug_macinfo.debug_macro.debug_ranges.debug_rnglists.debug_str.debug_str_offsets.debug_typeslock coun", 43, &v6, &g_ef82c0, &g_ef8340);
                            __debugbreak();
                        }
                        v11 = i;
                    } while (i != v10);
                }
                *a0 = v1;
                *(unsigned long long *)&a0[1] = v2;
                return v17;
            }
            sub_c73d64("called `Result::unwrap()` on an `Err` valueContents/Resources/DWARFinvalid timestampfailed to create dispatch semaphore for thread synchronizationRUST_BACKTRACEpermission deniedconnection refusednetwork unreachableconnection abortednot connectedaddress in useaddress not availablenetwork downbroken pipeentity already existsoperation would blocknot a directoryis a directorydirectory not emptyread-only filesystem or storage mediumfilesystem loop or indirection limit (e.g. symlink loop)stale network file handleinvalid input parameterinvalid datatimed outwrite zeroseek on unseekable filequota exceededfile too largeresource busyexecutable file busycross-device link or renametoo many linksargument list too longoperation interruptedunsupportedunexpected end of fileout of memoryin progressother erroruncategorized error.debug_abbrev.debug_addr.debug_aranges.debug_info.debug_line.debug_line_str.debug_loc.debug_loclists.debug_macinfo.debug_macro.debug_ranges.debug_rnglists.debug_str.debug_str_offsets.debug_typeslock coun", 43, &v6, &g_ef82c0, &g_ef8378);
            __debugbreak();
        }
    }
    *(unsigned long long *)a0 = 0;
    *(unsigned long long *)((char *)a0 + 8) = 1;
    *(unsigned long long *)&a0[1] = 0;
    return v18;
}
