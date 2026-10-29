/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fbe54..0x9fbec4 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_9fbe54(double *a0, unsigned int *a1, long long a2, long long a3)
{
    unsigned long long v4;  // x0
    double v0;  // [bp-0x30]
    unsigned long v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    v0 = *a0;
    v4 = sub_9f96d4(&v0, a2, a3);
    *a1 = *(unsigned int *)&v0;
    a1[1] = *(unsigned int *)((void*)&v0 + 4);
    if (*(long long *)&g_10002b0 == v1)
        return v4;
    ___stack_chk_fail();
}
