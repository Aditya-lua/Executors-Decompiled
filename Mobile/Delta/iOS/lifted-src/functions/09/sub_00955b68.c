/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x955b68..0x955bc8 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_f04c68;
extern long long g_f04e98;
extern long long g_f082c8;

unsigned long long sub_955b68(unsigned int a0)
{
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    char v0;  // [bp-0x60]
    unsigned int v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = a0;
    v4 = sub_96318c(&v0, &g_f04c68, 7);
    if (v4)
        return v4;
    v5 = sub_96318c(&v0, &g_f04e98, 167);
    if (v5)
        return v5;
    return sub_96318c(&v0, &g_f082c8, 2);
}
