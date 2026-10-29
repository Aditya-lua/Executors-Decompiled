/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xf0b0c..0xf0c14 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_f0b0c_1 {
    unsigned long long field_0;
    struct st_f0b0c_2 *field_8;
    struct st_f0b0c_0 *field_10;
    char padding_18[8];
    unsigned long long field_20;
    char padding_28[8];
    unsigned int field_30;
    unsigned int field_34;
} st_f0b0c_1;

typedef struct st_f0b0c_2 {
    unsigned long long field_0;
} st_f0b0c_2;

typedef struct st_f0b0c_0 {
    char field_0;
} st_f0b0c_0;


unsigned long long sub_f0b0c(st_f0b0c_1 *a0, unsigned long long *a1)
{
    unsigned long long v2;  // x9
    unsigned long long v3;  // x8
    unsigned long long v12;  // x16
    char *v13;  // x17
    unsigned long v4;  // x10
    unsigned long v5;  // x16
    unsigned long long v6;  // x13
    unsigned long long v7;  // x8
    char *v8;  // x12
    unsigned int i;  // w17
    unsigned long long v10;  // x14
    unsigned long v11;  // x15
    st_f0b0c_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_f0b0c_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = *a1;
    v3 = a0->field_0 * (0xff51afd7ed558ccd * (v2 ^ v2 >> 33) ^ 0xff51afd7ed558ccd * (v2 ^ v2 >> 33) >> 33) ^ a0->field_0 * (0xff51afd7ed558ccd * (v2 ^ v2 >> 33) ^ 0xff51afd7ed558ccd * (v2 ^ v2 >> 33) >> 33) >> 33;
    v4 = a0->field_30;
    v5 = (v3 & 31) >> ((char)a0->field_34 & 63);
    v6 = v4 + v5;
    v7 = a0->field_20 & v3 >> 5;
    v8 = a0->field_10;
    i = v8[v7];
    v10 = v7 * 16;
    v11 = (unsigned int)v4 * 2;
    v12 = v11 + v5;
    do
    {
        if ((unsigned int)v6 == i && v2 == *(long long *)((char *)a0->field_8 + v10))
            return v7;
        v13 = &v8[v7];
        if ((unsigned int)v12 == v13[1] && v2 == *(long long *)((char *)a0->field_8 + v10 + 16))
            return v7 + 1;
        v7 += 2;
        v6 = v6 + v4 + v4;
        i = v13[2];
        v10 += 32;
        v12 += v11;
    } while (i >= (unsigned int)v6);
    if (!a0->field_20)
        return 0;
    return (long long)(v8 - a0->field_8) >> 4;
}
