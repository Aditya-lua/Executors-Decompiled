/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xf18c..0xf234 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_f18c_1 {
    char padding_0[8];
    long long field_8;
} st_f18c_1;

typedef struct st_f18c_0 {
    char field_0;
} st_f18c_0;


long long sub_f18c(st_f18c_1 *a0, long long a1, unsigned long a2, char a3)
{
    long long v8;  // x21
    st_f18c_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_f18c_0 *v1;  // [bp-0x58]
    st_f18c_1 *v2;  // [bp-0x50]
    char v3;  // [bp-0x48]
    st_f18c_0 **v4;  // [bp-0x40], Other Possible Types: char
    st_f18c_0 *v5;  // [bp-0x38]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v2 = a0;
    v0 = &v1;
    v3 = 0;
    if (a3)
    {
        sub_ff14();
        v5 = &v4;
        v4 = &v5;
        v8 = a2 - a1;
        sub_13bbc(a0->field_8, a1, v8 >> 3);
        a0->field_8 = a0->field_8 + v8;
    }
    v3 = 1;
    return sub_1d5a0(&v2);
}
