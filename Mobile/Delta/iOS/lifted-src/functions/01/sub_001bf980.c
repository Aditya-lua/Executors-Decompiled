/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bf980..0x1bfa98 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_1bf980(long long a0, long long a1)
{
    long long v14;  // x0
    unsigned long long v16;  // x0
    long long v17;  // x0
    unsigned long v0;  // [bp-0xb0]
    unsigned long v1;  // [bp-0xa8]
    unsigned long v2;  // [bp-0xa0]
    unsigned long v3;  // [bp-0x98]
    unsigned long v4;  // [bp-0x90]
    unsigned long v5;  // [bp-0x88]
    uint128_t v6;  // [bp-0x80]
    uint128_t v7;  // [bp-0x70]
    unsigned int v8;  // [bp-0x60]
    char v9;  // [bp-0x58]
    unsigned long v10;  // [bp-0x40]
    unsigned long v11;  // [bp-0x38]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v11 = *(long long *)&g_10002b0;
    v6 = 0;
    v7 = 0;
    v8 = 0x3f800000;
    v3 = 0;
    v4 = 0;
    v5 = 0;
    v0 = 0;
    v1 = 0;
    v2 = 0;
    v14 = sub_a0c8(&v3);
    v10 = 0;
    sub_1a8070(a0, a1, &v6, v14, sub_6b08(&v3), &v0, &v9);
    sub_181a8(&v9);
    sub_1a42cc(&v6, *(unsigned long long *)&v7);
    v16 = sub_2219c(&v6, 0);
    if (*(long long *)&g_10002b0 == v11)
        return v16;
    v17 = ___stack_chk_fail();
    sub_181a8(&v9);
    sub_1a711c(&v6);
    __Unwind_Resume(v17);
}
