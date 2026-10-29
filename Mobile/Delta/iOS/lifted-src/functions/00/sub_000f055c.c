/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xf055c..0xf0640 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_f055c_1 {
    unsigned long long field_0;
    struct st_f055c_2 *field_8;
    char *field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    char padding_28[8];
    unsigned int field_30;
    unsigned int field_34;
} st_f055c_1;

typedef struct st_f055c_2 {
    unsigned long long field_0;
} st_f055c_2;

typedef struct st_f055c_0 {
    char field_0;
} st_f055c_0;


int sub_f055c(st_f055c_1 *a0, unsigned long long *a1)
{
    unsigned long long v4;  // x8
    unsigned long long v5;  // x11
    unsigned long v6;  // x9
    unsigned long long v7;  // x10
    unsigned long long v8;  // x1
    unsigned int v9;  // w13
    unsigned long long v10;  // x12
    st_f055c_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_f055c_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = *a1;
    v5 = a0->field_0 * (0xff51afd7ed558ccd * (v4 ^ v4 >> 33) ^ 0xff51afd7ed558ccd * (v4 ^ v4 >> 33) >> 33) ^ a0->field_0 * (0xff51afd7ed558ccd * (v4 ^ v4 >> 33) ^ 0xff51afd7ed558ccd * (v4 ^ v4 >> 33) >> 33) >> 33;
    v6 = a0->field_30;
    v7 = v6 + ((v5 & 31) >> ((char)a0->field_34 & 63));
    v8 = a0->field_20 & v5 >> 5;
    v9 = a0->field_10[v8];
    v10 = v8 * 16;
    while (1)
    {
        if ((unsigned int)v7 == v9 && v4 == *(long long *)((char *)a0->field_8 + v10))
        {
            sub_f1438();
            a0->field_18 = a0->field_18 - 1;
            return 1;
        }
        v9 = a0->field_10[1 + v8];
        v8 += 1;
        v7 += v6;
        v10 += 16;
        if (v9 < (unsigned int)v7)
            return 0;
    }
}
