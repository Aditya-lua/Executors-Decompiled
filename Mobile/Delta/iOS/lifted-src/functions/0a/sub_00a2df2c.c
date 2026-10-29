/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2df2c..0xa2dfd4 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2df2c_0 {
    long long field_0;
    long long field_8;
    long long field_10;
    int field_18;
    char padding_1c[4];
    long long field_20;
} st_a2df2c_0;


long long sub_a2df2c(st_a2df2c_0 *a0)
{
    unsigned long long v2;  // x22
    long long v3;  // x0
    long long v4;  // x20
    long long v5;  // x0
    long long v6;  // x21
    long long v7;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_20)
    {
        v2 = 8993 + 23 * sub_a66dc4(a0->field_20);
        v3 = a0->field_8;
        if (!a0->field_8)
            goto LABEL_a2dfb8;
LABEL_a2df60:
        v4 = sub_a66dc4(v3);
        v5 = a0->field_0;
        if (!a0->field_0)
            goto LABEL_a2dfc4;
LABEL_a2df70:
        v6 = sub_a66dc4(v5);
        v7 = a0->field_10;
        if (v7)
            goto LABEL_a2df80;
    }
    else
    {
        v2 = 8993;
        v3 = a0->field_8;
        if (a0->field_8)
            goto LABEL_a2df60;
LABEL_a2dfb8:
        v4 = 0;
        v5 = a0->field_0;
        if (a0->field_0)
            goto LABEL_a2df70;
LABEL_a2dfc4:
        v6 = 0;
        v7 = a0->field_10;
        if (v7)
        {
LABEL_a2df80:
            v7 = sub_a66dc4(v7);
        }
    }
    return v7 + 23 * (v6 + 23 * (v4 + v2)) ^ a0->field_18;
}
