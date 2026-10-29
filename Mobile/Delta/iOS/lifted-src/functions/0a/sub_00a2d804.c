/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2d804..0xa2d894 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a2d894;

long long sub_a2d804(unsigned long a0, unsigned long a1, unsigned long long a2)
{
    unsigned long v0;  // [bp-0x70]
    unsigned long long v1;  // [bp-0x68]
    unsigned long v2;  // [bp-0x60]
    long long v3;  // [bp-0x40]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v2 = a0;
    v3 = 0;
    sub_a2d41c(&v2, 0, 0);
    v0 = a1;
    v1 = a2;
    if (v3)
        sub_aa5618(v3, &g_a2d894, &v0);
    sub_aa5618(sub_a6820c(a0, 11), &g_a2d894, &v0);
    if (!v3)
        return v3;
    return sub_aa52b4(v3);
}
