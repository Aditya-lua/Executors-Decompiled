/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad7b44..0xad7b8c (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_ad7b44(unsigned long a0)
{
    unsigned long long v4;  // x0
    unsigned long v0;  // [bp-0x50]
    long long v1;  // [bp-0x30]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = a0;
    v1 = 0;
    v4 = sub_ad7b8c(&v0);
    if (!v1)
        return v4;
    sub_aa52b4(v1);
    return v4;
}
