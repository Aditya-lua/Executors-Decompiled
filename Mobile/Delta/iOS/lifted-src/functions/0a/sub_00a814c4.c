/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa814c4..0xa815c8 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_a814c4(long long a0, long long a1, long long a2, unsigned long long a3, long long a4, unsigned long a5)
{
    long long v4;  // x21
    unsigned long v5;  // x19
    char v0;  // [bp-0x2d8]
    unsigned long v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    if ((unsigned int)a3 == 0x80000)
        v4 = 640;
    else
        v4 = 576;
    if (sub_a3f7f0() == 1 && sub_a3fe10(a4, a1, a2) == 1 && sub_a403bc(a4, &v0, v4) == 1)
        v5 = sub_a7f670(a0, &v0, v4, a3) != 0;
    else
        v5 = 0;
    sub_a66ec0(&v0, 640);
    if (*(long long *)&g_10002b0 == v1)
        return v5;
    ___stack_chk_fail();
}
