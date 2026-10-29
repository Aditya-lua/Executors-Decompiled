/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa39e84..0xa39eec (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a39e84(unsigned long a0, long long a1, unsigned int a2)
{
    long long v3;  // x0
    char v0;  // [bp-0x34], Other Possible Types: unsigned int
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_975ffc();
    if ((int)sub_a50c70(v3) > (int)a2)
    {
        return 0;
    }
    else if (1 <= (int)sub_a3ff7c(v3, a1, &v0))
    {
        return v0;
    }
    else
    {
        return 0xffffffff;
    }
}
