/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf1738..0xaf17c0 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_af9564;

long long sub_af1738(long long a0)
{
    unsigned int v3;  // w0
    unsigned long v4;  // x21
    unsigned long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_ad69e4();
    v0 = 0;
    if ((int)v3 >= 1)
    {
        v4 = 0;
        while (sub_af160c(&v0, sub_ad69f8(a0, v4)))
        {
            if (v3 == (unsigned int)v4 + 1)
                return v0;
        }
        sub_ad6958(v0, &g_af9564);
    }
    return 0;
}
