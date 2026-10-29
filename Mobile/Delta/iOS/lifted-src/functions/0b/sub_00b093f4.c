/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb093f4..0xb09474 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_ed2140;
extern unsigned int g_ed2150;
extern unsigned int g_ed2160;

unsigned int sub_b093f4(long long a0)
{
    unsigned int *v2;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a6e200())
    {
        v2 = &g_ed2140;
    }
    else if (sub_a6e200(a0, "CS2"))
    {
        if (sub_a6e200(a0, "CS3"))
            return 0xffffffff;
        v2 = &g_ed2160;
    }
    else
    {
        v2 = &g_ed2150;
    }
    return *v2;
}
