/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb402c0..0xb40328 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_b402c0(unsigned int a0, unsigned int a1)
{
    unsigned int v2;  // w0
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
    else if (!(a1 & 3))
    {
        return 1;
    }
    else if ((a1 & 3) == 2)
    {
        return *(int *)(a0 + 48) != 0;
    }
    else
    {
        return (unsigned int)*(int *)(a0 + 48) > 1;
    }
}
