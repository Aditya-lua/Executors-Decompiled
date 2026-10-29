/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fede0..0x9feec8 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_9fede0(long long a0, long long a1, long long a2, long long a3, long long a4, long long a5, long long a6, long long a7)
{
    long long v4;  // x0
    long long v5;  // x0
    char v0;  // [bp-0x9a]
    unsigned long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    v4 = sub_a7a42c(sub_9ffde0(a7));
    if ((int)sub_a99b48(&v0, 50, a4, 0) >= 1)
        v5 = sub_9fec1c(a0, a1, a2, a3, &v0, a5, a6, a7, v4, 0);
    else
        v5 = 0;
    if (*(long long *)&g_10002b0 == v1)
        return v5;
    ___stack_chk_fail();
}
