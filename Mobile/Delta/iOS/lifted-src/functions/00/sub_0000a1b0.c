/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1b0..0xa20c (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1b0_0 {
    char field_0;
} st_a1b0_0;


unsigned long long sub_a1b0(unsigned long long *a0, unsigned long long a1)
{
    unsigned long long v5;  // x30
    unsigned long long v6;  // x8
    unsigned long long v7;  // x9
    st_a1b0_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_a1b0_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v2 = &v4;
    v3 = v5;
    v1 = &v0;
    v0 = &v1;
    if (a1 <= 0x3fffffffffffffff)
    {
        v6 = a0[2] - *a0;
        v7 = v6 >> 1;
        if (a1 < v7)
            a1 = v7;
        if (v6 >= 0x7ffffffffffffffc)
            return 0x3fffffffffffffff;
        return a1;
    }
    sub_ca34();
}
