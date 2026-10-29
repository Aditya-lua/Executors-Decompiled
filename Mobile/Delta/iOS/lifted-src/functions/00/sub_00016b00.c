/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x16b00..0x16d1c (540 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_16b00_0 {
    char field_0;
} st_16b00_0;

extern char g_10002b0;

unsigned long long sub_16b00(unsigned long a0, unsigned long a1, long long a2, long long a3, long long a4)
{
    unsigned long v20;  // x1
    unsigned long long v21;  // x0
    long long v30;  // x20
    unsigned long v22;  // x10
    void* ptr;  // x8
    unsigned long long v24;  // x0
    long long v25;  // x20
    unsigned long v27;  // x2
    unsigned long long v28;  // x3
    long long v29;  // x0
    st_16b00_0 **v0;  // [bp-0x518], Other Possible Types: char
    st_16b00_0 *v1;  // [bp-0x510]
    char v2;  // [bp-0x500]
    unsigned int v3;  // [bp-0x474]
    uint128_t v4;  // [bp-0x420], Other Possible Types: unsigned long
    unsigned long v5;  // [bp-0x418]
    unsigned long v6;  // [bp-0x410]
    unsigned long v7;  // [bp-0x410]
    uint128_t v8;  // [bp-0x408], Other Possible Types: unsigned long
    unsigned long v9;  // [bp-0x400]
    unsigned long v10;  // [bp-0x3f8]
    uint128_t v11;  // [bp-0x330], Other Possible Types: unsigned long
    unsigned long v12;  // [bp-0x328]
    unsigned long v13;  // [bp-0x320]
    unsigned long v14;  // [bp-0x60]
    uint128_t v15;  // [bp-0x58]
    unsigned long v16;  // [bp-0x48]
    unsigned long v17;  // [bp-0x38]
    char *v18;  // [bp-0x10]
    char v19;  // [bp+0x0]

    v18 = &v19;
    v17 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v20 = a0;
    sub_1bee0(&v2, v20, a1, a2, a3, a4);
    v21 = sub_14f64(&v2);
    if (a1)
        v22 = *(char *)(a0 + a1 - 1) != 10;
    else
        v22 = 0;
    *(unsigned long long *)ptr = v21;
    *(unsigned long long *)&ptr[8] = v22 + v3;
    *(uint128_t *)&ptr[16] = v8;
    *(unsigned long *)&ptr[32] = v10;
    v9 = 0;
    v10 = 0;
    *(uint128_t *)&ptr[40] = v11;
    *(unsigned long *)&ptr[56] = v13;
    v11 = 0;
    v12 = 0;
    *(uint128_t *)&ptr[64] = v4;
    v4 = 0;
    v5 = 0;
    v6 = 0;
    v8 = 0;
    *(unsigned long *)&ptr[80] = v7;
    *(unsigned long *)&ptr[88] = v14;
    *(uint128_t *)&ptr[96] = v15;
    *(unsigned long *)&ptr[112] = v16;
    v13 = 0;
    v14 = 0;
    v15 = 0;
    while (1)
    {
        v24 = sub_2463c(&v2);
        if (*(long long *)&g_10002b0 == v17)
            return v24;
        v25 = ___stack_chk_fail();
        if ((unsigned int)v20 != 1)
            break;
        sub_1e820(&v11, ___cxa_begin_catch(v25));
        memset(ptr, 0, 64);
        v20 = v11;
        v27 = v12;
        v28 = 12297829382473034411 * ((long long)(v27 - v20) >> 4);
        v29 = sub_1449c(ptr + 40, v20, v27, v28);
        *(unsigned long long *)&ptr[64] = 0;
        *(unsigned long long *)&ptr[72] = 0;
        *(unsigned long long *)&ptr[80] = 0;
        *(unsigned long *)&ptr[88] = v14;
        *(uint128_t *)&ptr[96] = v15;
        *(unsigned long *)&ptr[112] = v16;
        v14 = 0;
        v15 = 0;
        ___cxa_end_catch(v29, v20, v27, v28);
    }
    sub_2463c(&v2);
    v30 = __Unwind_Resume(v25);
    if ((unsigned int)v20)
        v30 = sub_6138(v30);
    __Unwind_Resume(v30);
}
