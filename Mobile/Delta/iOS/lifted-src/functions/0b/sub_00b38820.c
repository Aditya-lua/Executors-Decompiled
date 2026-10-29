/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb38820..0xb38860 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b38820(unsigned long long *a0, unsigned long a1)
{
    unsigned long long v2;  // w0
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (unsigned int)sub_a2f9e0();
    if (a1 != 8)
    {
        return 0;
    }
    else if (v2)
    {
        v3 = *a0;
        *a0 = 0;
        return v3;
    }
    else
    {
        return 0;
    }
}
