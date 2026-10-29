/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa68024..0xa680ac (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a680ec;
extern long long g_f08ef0;
extern char g_f12a90;
extern unsigned int g_f12a98;
extern long long g_f12be0;
extern char g_f12be8;

long long sub_a68024(unsigned long a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned int v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return 1;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = 0;
    if (sub_a7c208(&g_f08ef0, &g_a680ec) && *(int *)&g_f12be8)
        v8 = sub_a7bbe0(&g_f12be0);
    if (!v8 & g_f12a90)
        v8 = (unsigned int)&g_f12a98;
    return v8 == a0;
}
