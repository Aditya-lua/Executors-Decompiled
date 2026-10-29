/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xabe2cc..0xabe350 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_f12f9c;

long long sub_abe2cc(unsigned long a0, unsigned long a1, long long a2)
{
    long long v3;  // x19
    char v0;  // [bp-0x90]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a2;
    if (!sub_aac61c(&v0))
        return 0;
    if (!v3)
        v3 = &g_f12f9c;
    sub_abe350();
    sub_abe458(v3, &v0);
    sub_a66ec0(&v0, 96);
    return v3;
}
