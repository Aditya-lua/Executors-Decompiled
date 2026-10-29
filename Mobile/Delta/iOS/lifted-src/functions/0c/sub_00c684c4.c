/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc684c4..0xc685ac (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_c684c4(unsigned long a0, unsigned long long a1, unsigned long long *a2, unsigned long a3)
{
    unsigned int v3;  // w20
    unsigned long long v4;  // w0
    unsigned long long v5;  // w0
    unsigned long long v0;  // [bp-0x44]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    sub_a69cc4();
    v0 = 0;
    if (!(a1 >> 31 & 1))
    {
        if (30 >= v3)
        {
            v4 = (unsigned int)sub_a69c94();
            if (!v4)
                return v4;
        }
        else
        {
            return 0;
        }
    }
    v5 = (unsigned int)sub_a69c94();
    if (!v5)
        return v5;
    a2();
}
