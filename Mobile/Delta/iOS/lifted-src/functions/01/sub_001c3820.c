/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c3820..0x1c38ec (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_1c3820(unsigned long long a0, unsigned long a1, unsigned long a2, long long a3, unsigned long long a4, long long a5, long long a6)
{
    unsigned long long v10;  // x0
    long long v11;  // x0
    unsigned long v0;  // [bp-0x98]
    unsigned long long v1;  // [bp-0x90]
    char *v2;  // [bp-0x88]
    unsigned long long v3;  // [bp-0x80]
    long long v4;  // [bp-0x78]
    unsigned long v5;  // [bp-0x70]
    char v6;  // [bp-0x68]
    unsigned long v7;  // [bp-0x48]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v7 = *(long long *)&g_10002b0;
    v5 = a2;
    sub_1b1bcc(&v6, a5);
    v0 = a1;
    v1 = a0;
    v2 = &v5;
    v3 = a4;
    v4 = a3;
    v10 = sub_1b5b70(a1, a3, &v6, a6, &v0);
    sub_181a8(&v6);
    if (*(long long *)&g_10002b0 == v7)
        return v10;
    v11 = ___stack_chk_fail();
    sub_181a8(&v6);
    __Unwind_Resume(v11);
}
