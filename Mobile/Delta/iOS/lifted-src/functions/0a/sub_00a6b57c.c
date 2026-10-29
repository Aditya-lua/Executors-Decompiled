/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6b57c..0xa6b5d8 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_f12df8;
extern char g_f12e38;

unsigned long long sub_a6b57c(void)
{
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    long long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_a36378(&v0);
    v4 = v3;
    if ((unsigned int)v4)
    {
        sub_a04184(sub_a04724(&g_f12df8, 4), 4);
        v4 = sub_a36410(v0);
    }
    *(unsigned int *)&g_f12e38 = (unsigned int)v3 != 0;
    return v4;
}
