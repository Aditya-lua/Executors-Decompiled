/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae81b0..0xae8248 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_ae83e8;
extern long long g_f09760;
extern char g_f13280;

unsigned long long sub_ae81b0(void)
{
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    long long v6;  // x0
    char *v0;  // [bp-0x90]
    char v1;  // [bp-0x88], Other Possible Types: unsigned int
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = sub_a99eac(sub_a2d030());
    if ((unsigned int)v4)
    {
        v0 = &v1;
        if (!(v4 >> 31 & 1))
        {
            v1 = v4;
            v5 = sub_a99ef4(&v0, &g_f09760, 73, 8, &g_ae83e8);
            if (v5)
            {
                return *(long long *)v5;
            }
            else if (!*(long long *)&g_f13280)
            {
                return *(long long *)&g_f13280;
            }
            else
            {
                sub_ad6ae4(*(long long *)&g_f13280);
                v6 = sub_ad66d4(*(long long *)&g_f13280, &v1);
                return sub_ad69f8(*(long long *)&g_f13280, v6);
            }
        }
    }
    return 0;
}
