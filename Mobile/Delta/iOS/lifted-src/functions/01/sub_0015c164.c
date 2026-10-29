/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x15c164..0x15c2c4 (352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_15c164_1 {
    struct st_15c164_0 *field_0;
} st_15c164_1;

typedef struct st_15c164_0 {
    char field_0;
} st_15c164_0;

extern long long g_cc26e8;
extern char g_f0f980;
extern unsigned long long g_f0fb08;
extern unsigned long long g_f0fb10;
extern unsigned long long g_f0fb18;
extern char g_f0fb20;
extern uint128_t g_f0fb28;
extern unsigned long long g_f0fb38;
extern char g_10002b0;

long long sub_15c164(unsigned long a0)
{
    unsigned long long v9;  // x0
    long long v10;  // x0
    long long v11;  // x0
    st_15c164_0 **v0;  // [bp-0x2d0], Other Possible Types: char
    st_15c164_0 *v1;  // [bp-0x2c8]
    unsigned long v2;  // [bp-0x2c0]
    char *v3;  // [bp-0x2b8], Other Possible Types: char
    st_15c164_0 *v4;  // [bp-0x2b0], Other Possible Types: st_15c164_1 **
    st_15c164_0 **v5;  // [bp-0x2a8], Other Possible Types: char
    unsigned long v6;  // [bp-0x38]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    v1 = &v0;
    v2 = a0;
    v0 = &v1;
    /* unsupported instruction */;
    if (!(g_f0f980 & 1) && ___cxa_guard_acquire(&g_f0f980))
    {
        _memcpy(&v5, &g_cc26e8, 624);
        v4 = &v3;
        v3 = &v4;
        g_f0fb28 = __double_as_longlong(0) * 0x10000000000000000;
        g_f0fb08 = 0xc4ceb9fe1a85ec53;
        g_f0fb10 = &g_f0fb28;
        g_f0fb18 = &g_f0fb28;
        *(unsigned long long *)&g_f0fb20 = 0;
        g_f0fb38 = 32;
        sub_151e74(&g_f0fb08, &v5, &v6);
        ___cxa_atexit(0x159d74, &g_f0fb08, 0);
        ___cxa_guard_release(&g_f0f980);
    }
    v5 = &v4;
    v4 = &v5;
    v9 = sub_15a520(&g_f0fb08, &v2);
    if (*(long long *)&g_10002b0 == v6)
        return v9 == 1;
    v10 = ___stack_chk_fail(v9 == 1);
    ___cxa_guard_abort(&g_f0f980);
    v11 = __Unwind_Resume(v10);
    __Unwind_Resume(v11);
}
