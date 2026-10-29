/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa34844..0xa348a4 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a348a4;
extern long long g_f0d560;

unsigned long long sub_a34844(unsigned long long *a0)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a7c198(g_f0d560);
    if (!(unsigned int)v2)
    {
        return v2;
    }
    else if (*a0)
    {
        sub_a66c58(*a0, &g_a348a4);
        sub_a66664(*a0);
        *a0 = 0;
    }
}
