/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ad770..0x1ad850 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

char * sub_1ad770(void)
{
    long long v14;  // x0
    unsigned long v0;  // [bp-0xa0]
    unsigned long v1;  // [bp-0x98]
    unsigned long v2;  // [bp-0x90]
    unsigned long v3;  // [bp-0x88]
    unsigned long v4;  // [bp-0x80]
    unsigned long v5;  // [bp-0x78]
    uint128_t v6;  // [bp-0x70]
    uint128_t v7;  // [bp-0x60]
    unsigned int v8;  // [bp-0x50]
    char v9;  // [bp-0x48]
    unsigned long v10;  // [bp-0x30]
    unsigned long v11;  // [bp-0x28]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v11 = *(long long *)&g_10002b0;
    v3 = 0;
    v4 = 0;
    v5 = 0;
    v0 = 0;
    v1 = 0;
    v2 = 0;
    v6 = 0;
    v7 = 0;
    v8 = 0x3f800000;
    v10 = 0;
    sub_1a431c();
    sub_181a8(&v9);
    sub_1a42cc(&v6, *(unsigned long long *)&v7);
    sub_2219c(&v6, 0);
    if (*(long long *)&g_10002b0 == v11)
        return &v3;
    v14 = ___stack_chk_fail();
    sub_181a8(&v9);
    sub_1a711c(&v6);
    __Unwind_Resume(v14);
}
