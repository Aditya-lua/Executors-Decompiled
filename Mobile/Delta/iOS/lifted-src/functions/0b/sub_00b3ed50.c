/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3ed50..0xb3edd4 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_b3ed50(unsigned int a0, unsigned int a1)
{
    unsigned int v2;  // w0
    unsigned int v3;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!a0)
    {
        return 0;
    }
    else if (v2)
    {
        v3 = a1 & 3;
        if (!(a1 & 3))
            return 1;
        if (v3 == 2)
        {
            return *(long long *)(a0 + 64) != 0;
        }
        else if (!*(long long *)(a0 + 80))
        {
            return 0;
        }
        return 1;
    }
    else
    {
        return 0;
    }
}
