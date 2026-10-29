/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x20b20..0x20b7c (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_20b20_0 {
    char field_0;
} st_20b20_0;


unsigned long long sub_20b20(unsigned long long *a0, unsigned long long a1)
{
    unsigned long long v5;  // x30
    unsigned long long v6;  // x8
    unsigned long long v7;  // x9
    st_20b20_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_20b20_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v2 = &v4;
    v3 = v5;
    v1 = &v0;
    v0 = &v1;
    if (a1 <= 0xfffffffffffffff)
    {
        v6 = a0[2] - *a0;
        v7 = v6 >> 3;
        if (a1 < v7)
            a1 = v7;
        if (v6 >= 0x7ffffffffffffff0)
            return 0xfffffffffffffff;
        return a1;
    }
    sub_ca34();
}
