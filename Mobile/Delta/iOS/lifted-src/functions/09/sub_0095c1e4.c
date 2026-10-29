/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95c1e4..0x95c238 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_96123c;

long long sub_95c1e4(long long *a0, long long a1)
{
    long long v2;  // x0
    long long v3;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_ad5f4c(a1);
    if (!v2)
        return v2;
    v3 = v2;
    sub_ad6020(*a0);
    *a0 = v3;
    sub_ad5f30(v3, &g_96123c);
    sub_ad6ae4(*a0);
    return 1;
}
