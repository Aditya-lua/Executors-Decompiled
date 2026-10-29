/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x66adc..0x66bd0 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_e6a390;
extern char g_10002b0;

unsigned long long sub_66adc(unsigned long a0, long long a1, unsigned int *a2)
{
    unsigned long long *v7;  // x1
    unsigned long long **v8;  // x8
    unsigned long long v9;  // x0
    long long v10;  // x0
    long long v11;  // x0
    char v0;  // [bp-0x60]
    long long v1;  // [bp-0x58]
    unsigned long long *v2;  // [bp-0x50]
    unsigned long v3;  // [bp-0x50]
    unsigned long v4;  // [bp-0x48]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    v1 = 1;
    v2 = sub_66d80(&v0, 1);
    v2[1] = 0;
    v2[2] = 0;
    *v2 = &g_e6a390;
    sub_61370(v2 + 3, a1, *a2, 1);
    v3 = 0;
    v7 = v2 + 3;
    *v8 = v7;
    v8[1] = v2;
    sub_66bf0(v8, v7, v7);
    v9 = sub_60c14(&v0);
    if (*(long long *)&g_10002b0 == v4)
        return v9;
    v10 = ___stack_chk_fail();
    sub_60c14(&v0);
    v11 = __Unwind_Resume(v10);
    __Unwind_Resume(v11);
}
