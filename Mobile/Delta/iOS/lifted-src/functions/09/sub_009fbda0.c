/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fbda0..0x9fbe54 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_9fbda0(double *a0, char *a1, long long a2, long long a3, long long a4, unsigned int a5)
{
    unsigned long long v4;  // x0
    unsigned int v5;  // w8
    unsigned int v6;  // w9
    double v0;  // [bp-0x30]
    unsigned long v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    v0 = *a0;
    if (a5)
        v4 = sub_9fb3ec(&v0, a2, a3, a4);
    else
        v4 = sub_9fb4f0(&v0, a2, a3, a4);
    v5 = *(unsigned int *)&v0;
    v6 = *(unsigned int *)((void*)&v0 + 4);
    *a1 = v5;
    a1[1] = v5 >> 8;
    a1[2] = v5 >> 16;
    a1[3] = v5 >> 24;
    a1[4] = v6;
    a1[5] = v6 >> 8;
    a1[6] = v6 >> 16;
    a1[7] = v6 >> 24;
    if (*(long long *)&g_10002b0 == v1)
        return v4;
    ___stack_chk_fail();
}
