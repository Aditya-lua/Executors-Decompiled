/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b385c..0x1b38e8 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b385c_2 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_1b385c_2;

typedef struct st_1b385c_1 {
    char padding_0[912];
    long long field_390;
} st_1b385c_1;

typedef struct st_1b385c_0 {
    char field_0;
} st_1b385c_0;


long long sub_1b385c(st_1b385c_1 *a0, st_1b385c_2 *a1, unsigned long long a2)
{
    unsigned long long v7;  // x0
    st_1b385c_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_1b385c_0 *v1;  // [bp-0x50]
    st_1b385c_1 *v2;  // [bp-0x48]
    unsigned long long v3;  // [bp-0x40]
    st_1b385c_2 *v4;  // [bp-0x38]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v2 = a0;
    v0 = &v1;
    v3 = a2;
    v4 = a1;
    v7 = sub_1c580c(a1->field_0, a0->field_390, a0 + 1, &v2, a0);
    if (v7)
    {
        a1->field_8 = v7;
    }
    else
    {
        sub_1ac7ec(a0, a1);
        sub_1b684c(a0, a1);
    }
    return v7 != 0;
}
