/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3ec98..0xb3ecf8 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_b3ec98(unsigned int a0, unsigned int a1)
{
    unsigned int v2;  // w0
    unsigned long long v3;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!a0)
    {
        return 0;
    }
    else if (!v2)
    {
        return 0;
    }
    else if (a1 & 3)
    {
        v3 = 80;
        if ((a1 & 3) == 2)
            v3 = 64;
        return *(long long *)(a0 + v3) != 0;
    }
    else
    {
        return 1;
    }
}
