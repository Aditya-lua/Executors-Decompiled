/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2aa03c..0x2aa0a8 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2aa03c_1 {
    char padding_0[16];
    unsigned long long field_10;
} st_2aa03c_1;

typedef struct st_2aa03c_0 {
    char field_0;
} st_2aa03c_0;


unsigned long long sub_2aa03c(st_2aa03c_1 *a0, unsigned long long a1)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    unsigned long long v10;  // x0
    unsigned long long v11;  // x8
    unsigned long long v12;  // x10
    st_2aa03c_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_2aa03c_0 *v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v2 = v7;
    v3 = v8;
    v4 = &v6;
    v5 = v9;
    v1 = &v0;
    v0 = &v1;
    v10 = sub_2aec50();
    if (v10 >= a1)
    {
        v11 = a0->field_10 * 128;
        v12 = a1 + 63 & 0xffffffffffffffc0;
        if (v12 >= v11)
            v11 = v12;
        if (v10 >> 1 > a0->field_10 * 64)
            return v11;
        return v10;
    }
    sub_ca34();
}
