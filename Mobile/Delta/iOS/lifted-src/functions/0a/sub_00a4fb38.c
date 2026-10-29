/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4fb38..0xa4fbf0 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_a4fb38(long long a0, unsigned long long a1)
{
    unsigned long long v4;  // x0
    unsigned long long v5;  // x19
    char v0;  // [bp-0x48]
    unsigned long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    if (a1)
    {
        v4 = sub_a4fbf0();
        if (16 < (unsigned int)v4 || (v5 = v4, sub_9c95f8(a1, &v0, v5) != (unsigned int)v5 || !sub_a4c694(a0, 0, 0, 0, &v0, 0xffffffff)))
            v5 = 0xffffffff;
    }
    else
    {
        v5 = 0;
    }
    if (*(long long *)&g_10002b0 == v1)
        return v5;
    ___stack_chk_fail();
}
