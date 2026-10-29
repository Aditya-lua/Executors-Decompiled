/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e4b0..0x1e524 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1e4b0_0 {
    char field_0;
} st_1e4b0_0;


unsigned long long sub_1e4b0(unsigned long long *a0, unsigned long long a1)
{
    unsigned long long v5;  // x30
    unsigned long long v6;  // x9
    unsigned long long v7;  // x10
    st_1e4b0_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_1e4b0_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v2 = &v4;
    v3 = v5;
    v1 = &v0;
    v0 = &v1;
    if (768614336404564650 >= a1)
    {
        v6 = 12297829382473034411 * ((long long)(a0[2] - *a0) >> 3);
        v7 = v6 * 2;
        if (a1 < v7)
            a1 = v7;
        if (v6 >= 384307168202282325)
            return 768614336404564650;
        return a1;
    }
    sub_ca34();
}
