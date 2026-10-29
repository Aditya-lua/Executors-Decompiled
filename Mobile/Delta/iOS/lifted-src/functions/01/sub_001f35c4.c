/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f35c4..0x1f36b8 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f35c4_0 {
    unsigned long long field_0;
    long long field_8;
    char field_10;
} st_1f35c4_0;

typedef struct st_1f35c4_1 {
    char padding_0[40];
    long long field_28;
    unsigned long long field_30;
    char padding_38[80];
    unsigned long long field_88;
    unsigned long long field_90;
    unsigned long long field_98;
    char padding_a0[8];
    long long field_a8;
    char padding_b0[16];
    unsigned int field_c0;
    char padding_c4[4];
    struct st_1f35c4_0 *field_c8;
    char padding_d0[16];
    unsigned long long field_e0;
    unsigned long long field_e8;
    char field_f0;
    char padding_f1[7];
    long long field_f8;
    long long field_100;
    char field_108;
    char padding_109[31];
    unsigned long long field_128;
} st_1f35c4_1;

typedef struct st_1f35c4_2 {
    char field_0;
} st_1f35c4_2;


int sub_1f35c4(st_1f35c4_1 *a0, unsigned int a1, long long a2)
{
    unsigned long v4;  // x21
    st_1f35c4_0 *v5;  // x8
    unsigned long long i;  // x22
    unsigned long long v7;  // x10
    unsigned long v8;  // x9
    long long v9;  // x10
    unsigned long v10;  // x8
    st_1f35c4_2 **v0;  // [bp-0x50], Other Possible Types: char
    st_1f35c4_2 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a1;
    sub_1f4274(&a0->field_c8, v4);
    v5 = a0->field_c8;
    v5->field_10 = 1;
    if (a1 >= 2)
    {
        i = 24;
        do
        {
            sub_1f4240((char *)a0->field_c8 + i, a0->field_30 + i, a0->field_a8);
            i += 24;
        } while (v4 * 24 != i);
        v5 = a0->field_c8;
    }
    v7 = a0->field_88;
    a0->field_128 = a0->field_90;
    v8 = a0->field_98;
    a0->field_e0 = v7;
    a0->field_e8 = v8;
    v9 = a0->field_28;
    v5->field_0 = v8;
    v5->field_8 = v9;
    v10 = a0->field_a8;
    a0->field_f8 = v9;
    a0->field_100 = v10;
    a0->field_f0 = a0->field_e0 != a0->field_e8;
    a0->field_108 = v9 != v10;
    sub_1eca24(a0 + 1, a2);
    a0->field_c0 = 1;
    return 1;
}
