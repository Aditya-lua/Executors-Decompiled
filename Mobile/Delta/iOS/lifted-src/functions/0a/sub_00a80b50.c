/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa80b50..0xa80bf4 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_7e6c7f;
extern char g_800000;

unsigned int sub_a80b50(unsigned int a0, unsigned int a1, unsigned int a2)
{
    unsigned int v0;  // w10
    unsigned int v1;  // w11
    unsigned int v2;  // w10
    unsigned long v3;  // x0
    int v4;  // w10
    unsigned int v5;  // w11
    int v6;  // w8
    unsigned int v7;  // w8

    v0 = a1 + 127;
    v1 = v0 >> 7;
    if (&g_7e6c7f < v0)
        v2 = 0;
    else
        v2 = &(&g_800000)[11275 * v1] >> 24;
    if (a2 != 0x3ff00)
        v3 = v2;
    else
        v3 = ((v1 * 1025 + 0x200000) * 0x400 | v1 * 1025 + 0x200000 >> 22) & 0xfffffc0f & 15;
    v4 = a1 - (unsigned int)v3 * a2 * 2;
    if (0x3ff000 < v4)
        v5 = 0xff801fff;
    else
        v5 = 0;
    if (!a0)
        return v3;
    v6 = v5 + v4;
    if (a2 == 0x3ff00)
    {
        if (v6 < 1)
            v7 = (unsigned int)v3 + 15;
        else
            v7 = (unsigned int)v3 + 1;
        return v7 & 15;
    }
    else if (v6 >= 1)
    {
        if ((unsigned int)v3 == 43)
            return 0;
        return (unsigned int)v3 + 1;
    }
    else
    {
        if (!(unsigned int)v3)
            return 43;
        return (unsigned int)v3 - 1;
    }
}
