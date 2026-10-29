/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1097c..0x10a00 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1097c_1 {
    char padding_0[64];
    unsigned long long field_40;
    char field_48;
} st_1097c_1;

typedef struct st_1097c_0 {
    char padding_0[40];
    long long field_28;
    long long field_30;
    char padding_38[8];
    unsigned long long field_40;
    char field_48;
} st_1097c_0;

typedef struct st_1097c_2 {
    char field_0;
} st_1097c_2;


st_1097c_1 * sub_1097c(st_1097c_1 *a0, st_1097c_0 *a1)
{
    unsigned long long *v4;  // x0
    unsigned long long *v5;  // x0
    st_1097c_1 *v6;  // x0
    st_1097c_2 **v0;  // [bp-0x30], Other Possible Types: char
    st_1097c_2 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (a1->field_48 != 1)
        return a0;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_183f8();
    v4[5] = 0;
    v4[6] = 0;
    v5 = v4 + 5;
    v5[2] = 0;
    v6 = sub_f18c(v5, a1->field_28, a1->field_30, a1->field_30 - a1->field_28 >> 3);
    a0->field_40 = a1->field_40;
    a0->field_48 = 1;
    return v6;
}
