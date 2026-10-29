/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5f828..0xc5f940 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_efd1e8;
extern char g_efd208;
extern long long g_efd220;
extern long long g_efd238;

long long sub_c5f828(void)
{
    unsigned long long v5;  // 4112
    unsigned long long v6;  // x10
    unsigned long long v7;  // 4174
    unsigned long long v8;  // x1
    unsigned long v0;  // [bp-0x38]
    unsigned long long v1;  // [bp-0x30]
    unsigned long v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = arm64g_calculate_condition(1, _clock_gettime(8, &v0) & 0xffffffff, 1, 0);
    if (!(v5 & 1))
    {
        v6 = v1;
        v7 = arm64g_calculate_condition(210, v0 + 0x7fffffffffffffff, 1, 0);
        if (!((unsigned int)!(v7 & 1) & v6 > 0xffffffffc4653600))
            v8 = v6;
        else
            v8 = v6 + 1000000000;
        if (0x3b9ac9ff >= v8)
            return v0 - ((unsigned int)!(v7 & 1) & v6 > 0xffffffffc4653600 & 1);
        v2 = &g_efd208;
        sub_c73d64("called `Result::unwrap()` on an `Err` valueContents/Resources/DWARFinvalid timestampfailed to create dispatch semaphore for thread synchronizationRUST_BACKTRACEpermission deniedconnection refusednetwork unreachableconnection abortednot connectedaddress in useaddress not availablenetwork downbroken pipeentity already existsoperation would blocknot a directoryis a directorydirectory not emptyread-only filesystem or storage mediumfilesystem loop or indirection limit (e.g. symlink loop)stale network file handleinvalid input parameterinvalid datatimed outwrite zeroseek on unseekable filequota exceededfile too largeresource busyexecutable file busycross-device link or renametoo many linksargument list too longoperation interruptedunsupportedunexpected end of fileout of memoryin progressother erroruncategorized error.debug_abbrev.debug_addr.debug_aranges.debug_info.debug_line.debug_line_str.debug_loc.debug_loclists.debug_macinfo.debug_macro.debug_ranges.debug_rnglists.debug_str.debug_str_offsets.debug_typeslock coun", 43, &v2, &g_efd1e8, &g_efd238);
    }
    else
    {
        v2 = 2 | *(int *)___error() * 0x100000000;
        sub_c73d64("called `Result::unwrap()` on an `Err` valueContents/Resources/DWARFinvalid timestampfailed to create dispatch semaphore for thread synchronizationRUST_BACKTRACEpermission deniedconnection refusednetwork unreachableconnection abortednot connectedaddress in useaddress not availablenetwork downbroken pipeentity already existsoperation would blocknot a directoryis a directorydirectory not emptyread-only filesystem or storage mediumfilesystem loop or indirection limit (e.g. symlink loop)stale network file handleinvalid input parameterinvalid datatimed outwrite zeroseek on unseekable filequota exceededfile too largeresource busyexecutable file busycross-device link or renametoo many linksargument list too longoperation interruptedunsupportedunexpected end of fileout of memoryin progressother erroruncategorized error.debug_abbrev.debug_addr.debug_aranges.debug_info.debug_line.debug_line_str.debug_loc.debug_loclists.debug_macinfo.debug_macro.debug_ranges.debug_rnglists.debug_str.debug_str_offsets.debug_typeslock coun", 43, &v2, &g_efd1e8, &g_efd220);
    }
    __debugbreak();
}
