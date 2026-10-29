/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6b728..0xa6b75c (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_f12e20;
extern unsigned int g_f12e58;

void sub_a6b728(void)
{
    unsigned int v2;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_9d0824())
    {
        v2 = 1;
        g_f12e20 = 1;
    }
    else
    {
        v2 = 0;
    }
    g_f12e58 = v2;
    return;
}
