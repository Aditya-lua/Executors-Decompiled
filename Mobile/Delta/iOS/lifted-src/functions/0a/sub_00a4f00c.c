/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4f00c..0xa4f0b8 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a4f00c(unsigned long a0, long long a1, unsigned long long a2, unsigned long long a3, long long a4, long long a5, long long a6)
{
    unsigned long long v0;  // [bp-0x88]
    unsigned long long v1;  // [bp-0x80]
    unsigned long v2;  // [bp-0x78]
    long long v3;  // [bp-0x58]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v2 = a0;
    v3 = 0;
    sub_a4e750(&v2, 0, a1, 0, 0, a4, a5, a6);
    v0 = a2;
    v1 = a3;
    if (v3)
        sub_aa5618(v3, "H", &(int)a1);
    sub_aa5618(sub_a6820c(a0, 0), "H", &(int)a1);
    if (!v3)
        return v3;
    return sub_aa52b4(v3);
}
