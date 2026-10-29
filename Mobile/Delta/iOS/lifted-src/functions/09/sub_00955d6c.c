/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x955d6c..0x955ddc (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_f04c68;
extern long long g_f04e98;
extern long long g_f082c8;

unsigned long long sub_955d6c(unsigned short *a0)
{
    unsigned long v4;  // x8
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    char v0;  // [bp-0x60]
    unsigned int v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = *a0;
    v1 = 0x3000000 | __ROL__((unsigned int)((((((v4 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v4 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v4 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v4 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32), 16) & 0xffff;
    v5 = sub_96318c(&v0, &g_f04c68, 7);
    if (v5)
        return v5;
    v6 = sub_96318c(&v0, &g_f04e98, 167);
    if (v6)
        return v6;
    return sub_96318c(&v0, &g_f082c8, 2);
}
