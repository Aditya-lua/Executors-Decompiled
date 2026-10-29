/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb10fc4..0xb11028 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b10fc4(long long a0, long long a1, unsigned long long *a2, unsigned long a3)
{
    unsigned long long v2;  // w0
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (unsigned int)sub_a2f9e0();
    if (a3 < 64)
    {
        return 0;
    }
    else if (v2)
    {
        v3 = sub_ac2460(a1, a0);
        if (!(unsigned int)v3)
            return v3;
        *a2 = 64;
        return 1;
    }
    else
    {
        return 0;
    }
}
