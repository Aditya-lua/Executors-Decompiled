/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6b5e8..0xa6b634 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f12e3c;

unsigned long long sub_a6b5e8(void)
{
    unsigned long long v3;  // x0
    unsigned int v4;  // w19
    long long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_a36378(&v0);
    if ((unsigned int)v3)
    {
        v4 = sub_a36794();
        v3 = sub_a36410(v0);
    }
    else
    {
        v4 = 0;
    }
    g_f12e3c = v4;
    return v3;
}
