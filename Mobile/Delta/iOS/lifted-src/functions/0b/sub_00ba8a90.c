/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xba8a90..0xba9178 (1768 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_e06431;

void sub_ba8a90(unsigned long long *a0)
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
        goto *((void *)(sub_ba8ae0 + (&g_e06431)[v2] * 4));
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
