/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe6788..0xbe6e0c (1668 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_e06830;

void sub_be6788(unsigned long long *a0)
{
    unsigned long long v2;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 9;
    if (11 < a0[3])
        v2 = a0[3] - 12;
    if (19 >= v2)
    {
        goto *((void *)(sub_be67d4 + (&g_e06830)[v2] * 4));
    }
    else if (*a0)
    {
        _free();
        return;
    }
    else
    {
        return;
    }
}
