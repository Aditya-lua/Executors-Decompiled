/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ea14..0x1eaa4 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_1ea14(long long a0, long long a1)
{
    long long v4;  // x0
    long long v5;  // x0
    char v0;  // [bp-0x50]
    unsigned long v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    if (a0 != a1)
    {
        sub_183f8(&v0);
        sub_196b4(a0, &v0);
        sub_a070(&v0);
    }
    if (*(long long *)&g_10002b0 == v1)
        return a0;
    v4 = ___stack_chk_fail();
    sub_a070(&v0);
    v5 = __Unwind_Resume(v4);
    __Unwind_Resume(v5);
}
