/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf8b00..0xaf8b74 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_af8b74;
extern long long g_eba1f0;
extern long long g_f13298;

long long sub_af8b00(unsigned long a0)
{
    unsigned long long v3;  // x0
    unsigned long v0;  // [bp-0x90]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a0;
    if (g_f13298)
    {
        sub_ad6ae4(g_f13298);
        v3 = sub_ad66d4(g_f13298, &v0);
        if (!(v3 >> 31 & 1))
            return sub_ad69f8(g_f13298, v3);
    }
    return sub_a99ef4(&v0, &g_eba1f0, 6, 112, &g_af8b74);
}
