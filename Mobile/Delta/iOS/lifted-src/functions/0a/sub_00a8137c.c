/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa8137c..0xa814c4 (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_a8137c(long long a0, unsigned long a1, unsigned long long *a2, long long a3, unsigned long a4)
{
    char v0;  // [bp-0xe0]
    unsigned long v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    if (sub_a3f7f0() == 1 && sub_a3fe10(a0, a3, 66) == 1 && sub_a403bc(a0, &v0, 0x88) == 1)
        a2();
    sub_a66ec0(&v0, 0x88);
    if (*(long long *)&g_10002b0 == v1)
        return 0;
    ___stack_chk_fail();
}
