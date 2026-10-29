/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2ae3b0..0x2ae450 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_2ae3b0(unsigned long a0, unsigned long long i, unsigned long long a2, unsigned long a3)
{
    unsigned long v0;  // [bp-0x50]
    char *v1;  // [bp-0x48]
    char *v2;  // [bp-0x40]
    char v3;  // [bp-0x38]
    unsigned long v4;  // [bp-0x30]
    unsigned long v5;  // [bp-0x28]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = a3;
    v4 = a3;
    v0 = a0;
    v1 = &v4;
    v2 = &v5;
    v3 = 0;
    if (i != a2)
    {
        do
        {
            sub_2aff80();
            a3 = v5 + 16;
            v5 = a3;
            i += 16;
        } while (i != a2);
    }
    v3 = 1;
    sub_2ac4e4(&v0);
    return a3;
}
