/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x190d4..0x19204 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_190d4_1 {
    char padding_0[128];
    long long field_80;
    unsigned long long field_84;
    char padding_8c[28];
    unsigned long long field_a8;
    char padding_b0[40];
    long long field_d8;
} st_190d4_1;

typedef struct st_190d4_0 {
    char field_0;
} st_190d4_0;


long long sub_190d4(st_190d4_1 *a0)
{
    long long v9;  // x0
    long long v10;  // x0
    st_190d4_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_190d4_0 *v1;  // [bp-0x70]
    unsigned long v2;  // [bp-0x68]
    unsigned long long v3;  // [bp-0x60]
    char v4;  // [bp-0x58], Other Possible Types: unsigned long
    char v5;  // [bp-0x50], Other Possible Types: unsigned long
    unsigned long long v6;  // [bp-0x48]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v1 = &v0;
    v0 = &v1;
    v9 = sub_1d794();
    if ((int)a0->field_80 == 91)
    {
        sub_f8d0(a0);
        v10 = sub_18934(a0, 0);
        sub_1f3d4(a0, 93, "class reference expression");
        v4 = *(long long *)((char *)&a0->field_80 + 4);
        v5 = *(long long *)&a0->padding_8c[24];
        return sub_7088(sub_404c(*(long long *)&a0->padding_b0[32], 48), &v4, v9, v10);
    }
    else if ((int)a0->field_80 == 46)
    {
        sub_f8d0(a0);
        sub_2207c(a0, "class reference expression", (char *)&a0->field_80 + 4);
        v2 = *(long long *)((char *)&a0->field_80 + 4);
        v3 = v6;
        return sub_6148(sub_404c(*(long long *)&a0->padding_b0[32], 80), &v2, v9, &v4, &v5, (char *)&a0->field_80 + 4, 46);
    }
    else
    {
        return v9;
    }
}
