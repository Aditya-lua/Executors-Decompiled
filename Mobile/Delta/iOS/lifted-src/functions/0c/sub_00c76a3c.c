/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc76a3c..0xc76c78 (572 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c76a3c_0 {
    uint128_t field_0;
    struct st_c76a3c_0 *field_10;
    char padding_18[8];
    struct st_c76a3c_0 *field_20;
    char padding_28[8];
    struct st_c76a3c_0 *field_30;
} st_c76a3c_0;

extern long long g_efd1e8;
extern long long g_efd250;
extern long long g_efd268;
extern long long g_efd280;
extern long long g_efd6d0;

st_c76a3c_0 * sub_c76a3c(unsigned long a0)
{
    st_c76a3c_0 *ptr;  // x0
    st_c76a3c_0 *ptr1;  // x19
    unsigned long long count;  // x0
    unsigned long long count1;  // x0
    unsigned long long count2;  // x0
    st_c76a3c_0 *v0;  // [bp-0xc0]
    st_c76a3c_0 *v1;  // [bp-0xb0]
    st_c76a3c_0 *v2;  // [bp-0xa0]
    uint128_t v3;  // [bp-0x90]
    uint128_t v4;  // [bp-0x80]
    st_c76a3c_0 *v5;  // [bp-0x70]
    st_c76a3c_0 *v6;  // [bp-0x60]
    st_c76a3c_0 *v7;  // [bp-0x50]
    st_c76a3c_0 *v8;  // [bp-0x38], Other Possible Types: unsigned long
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v3 = 850045863;
    v4 = 850045863;
    v2 = (st_c76a3c_0 *)0;
    v0 = (st_c76a3c_0 *)0;
    v1 = (st_c76a3c_0 *)0;
    v5 = (st_c76a3c_0 *)0;
    v6 = (st_c76a3c_0 *)0;
    v7 = (st_c76a3c_0 *)0;
    ptr = _malloc(64);
    if (ptr)
    {
        ptr1 = ptr;
        ptr->field_0 = v3;
        *(uint128_t *)&ptr->field_10 = (uint128_t)v2;
        *(uint128_t *)&ptr->field_20 = (uint128_t)v1;
        *(uint128_t *)&ptr->field_30 = (uint128_t)v0;
        count = _pthread_mutexattr_init(&v4);
        if (!(unsigned int)count)
        {
            count1 = _pthread_mutexattr_settype(&v4, 0);
            if (!(unsigned int)count1)
            {
                count2 = _pthread_mutex_init(ptr1, &v4);
                if (!(unsigned int)count2)
                {
                    v8 = (st_c76a3c_0 *)(unsigned int)_pthread_mutexattr_destroy(&v4);
                    if (!v8)
                    {
                        do
                        {
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                            if (/* unsupported instruction */)
                            {
                                /* unsupported instruction */;
                                _pthread_mutex_destroy(ptr1);
                                _free(ptr1);
                                return /* unsupported instruction */;
                            }
                        } while ((/* unsupported instruction */, /* unsupported instruction */, /* unsupported instruction */ ^ 1));
                        if (0)
                        {
                            _pthread_mutex_destroy(ptr1);
                            _free(ptr1);
                            return /* unsupported instruction */;
                        }
                        return ptr1;
                    }
                    sub_c76cd8(&v8, 0, &g_efd6d0);
                }
                else
                {
                    v8 = 2 | count2 * 0x100000000;
                    sub_c73d64("called `Result::unwrap()` on an `Err` valueContents/Resources/DWARFinvalid timestampfailed to create dispatch semaphore for thread synchronizationRUST_BACKTRACEpermission deniedconnection refusednetwork unreachableconnection abortednot connectedaddress in useaddress not availablenetwork downbroken pipeentity already existsoperation would blocknot a directoryis a directorydirectory not emptyread-only filesystem or storage mediumfilesystem loop or indirection limit (e.g. symlink loop)stale network file handleinvalid input parameterinvalid datatimed outwrite zeroseek on unseekable filequota exceededfile too largeresource busyexecutable file busycross-device link or renametoo many linksargument list too longoperation interruptedunsupportedunexpected end of fileout of memoryin progressother erroruncategorized error.debug_abbrev.debug_addr.debug_aranges.debug_info.debug_line.debug_line_str.debug_loc.debug_loclists.debug_macinfo.debug_macro.debug_ranges.debug_rnglists.debug_str.debug_str_offsets.debug_typeslock coun", 43, &v8, &g_efd1e8, &g_efd280);
                }
            }
            else
            {
                v8 = 2 | count1 * 0x100000000;
                sub_c73d64("called `Result::unwrap()` on an `Err` valueContents/Resources/DWARFinvalid timestampfailed to create dispatch semaphore for thread synchronizationRUST_BACKTRACEpermission deniedconnection refusednetwork unreachableconnection abortednot connectedaddress in useaddress not availablenetwork downbroken pipeentity already existsoperation would blocknot a directoryis a directorydirectory not emptyread-only filesystem or storage mediumfilesystem loop or indirection limit (e.g. symlink loop)stale network file handleinvalid input parameterinvalid datatimed outwrite zeroseek on unseekable filequota exceededfile too largeresource busyexecutable file busycross-device link or renametoo many linksargument list too longoperation interruptedunsupportedunexpected end of fileout of memoryin progressother erroruncategorized error.debug_abbrev.debug_addr.debug_aranges.debug_info.debug_line.debug_line_str.debug_loc.debug_loclists.debug_macinfo.debug_macro.debug_ranges.debug_rnglists.debug_str.debug_str_offsets.debug_typeslock coun", 43, &v8, &g_efd1e8, &g_efd268);
            }
        }
        else
        {
            v8 = 2 | count * 0x100000000;
            sub_c73d64("called `Result::unwrap()` on an `Err` valueContents/Resources/DWARFinvalid timestampfailed to create dispatch semaphore for thread synchronizationRUST_BACKTRACEpermission deniedconnection refusednetwork unreachableconnection abortednot connectedaddress in useaddress not availablenetwork downbroken pipeentity already existsoperation would blocknot a directoryis a directorydirectory not emptyread-only filesystem or storage mediumfilesystem loop or indirection limit (e.g. symlink loop)stale network file handleinvalid input parameterinvalid datatimed outwrite zeroseek on unseekable filequota exceededfile too largeresource busyexecutable file busycross-device link or renametoo many linksargument list too longoperation interruptedunsupportedunexpected end of fileout of memoryin progressother erroruncategorized error.debug_abbrev.debug_addr.debug_aranges.debug_info.debug_line.debug_line_str.debug_loc.debug_loclists.debug_macinfo.debug_macro.debug_ranges.debug_rnglists.debug_str.debug_str_offsets.debug_typeslock coun", 43, &v8, &g_efd1e8, &g_efd250);
        }
    }
    else
    {
        sub_c6ba70(8, 64);
    }
    __debugbreak();
}
