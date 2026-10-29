/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3c1d4..0xb3c234 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_b3c1d4(unsigned int a0, unsigned int a1, long long a2)
{
    unsigned int v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!(a1 & 3))
    {
        return 0;
    }
    else if (!a0)
    {
        return 0;
    }
    else if (v2)
    {
        return sub_a2a1c0(a0, a2, a1 & 1) != 0;
    }
    else
    {
        return 0;
    }
}
