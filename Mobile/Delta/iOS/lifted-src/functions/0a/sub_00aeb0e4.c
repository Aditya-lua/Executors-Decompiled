/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaeb0e4..0xaeb138 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern void g_f13288;

unsigned long long sub_aeb0e4(unsigned int a0)
{
    unsigned long long v3;  // x30
    unsigned int v4;  // w0
    unsigned long long v5;  // x0
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (a0 - 1 < 10)
    {
        return a0 - 1;
    }
    else if (*(long long *)&g_f13288)
    {
        v0 = &v2;
        v1 = v3;
        v4 = sub_ad66d4(*(long long *)&g_f13288, &a0);
        if (0 <= (int)v4)
            v5 = v4 + 10;
        else
            v5 = 0xffffffff;
        return v5;
    }
    else
    {
        return 0xffffffff;
    }
}
