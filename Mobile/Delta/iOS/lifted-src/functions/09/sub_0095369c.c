/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95369c..0x953764 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95369c_3 {
    char padding_0[8];
    struct st_95369c_2 *field_8;
} st_95369c_3;

typedef struct st_95369c_1 {
    char padding_0[280];
    long long field_118;
    long long field_120;
} st_95369c_1;

typedef struct st_95369c_0 {
    char padding_0[1264];
    struct st_95369c_1 *field_4f0;
    char padding_4f8[1936];
    unsigned long long field_c88;
} st_95369c_0;

typedef struct st_95369c_2 {
    unsigned long long field_0;
    char padding_8[32];
    struct st_95369c_3 *field_28;
    struct st_95369c_3 *field_30;
    unsigned long long field_38;
} st_95369c_2;


st_95369c_3 * sub_95369c(st_95369c_0 *a0)
{
    long long *v2;  // x8
    st_95369c_3 *v3;  // x0
    st_95369c_3 *v4;  // x0
    st_95369c_2 *v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_4f0;
    while (1)
    {
        v3 = sub_954348(v2[35]);
        if (!v3)
            break;
        sub_9aca2c(v3->field_8);
        sub_954264(v3);
        v2 = a0->field_4f0;
    }
    v4 = sub_954348(a0->field_4f0->field_120);
    if (!v4)
        return v4;
    while (1)
    {
        v5 = v4->field_8;
        if ((int)v5->field_28 && v5->field_30 && a0->field_c88 != v5->field_38)
            v5->field_30->field_8();
        sub_9aca2c(v5);
        sub_954264(v4);
        v4 = sub_954348(a0->field_4f0->field_120);
        if (!v4)
            return v4;
    }
}
