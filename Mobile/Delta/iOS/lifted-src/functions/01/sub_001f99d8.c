/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f99d8..0x1f9a9c (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f99d8_1 {
    char padding_0[40];
    unsigned long long field_28;
    char padding_30[88];
    char *field_88;
    char padding_90[16];
    unsigned long long field_a0;
    unsigned long long field_a8;
} st_1f99d8_1;

typedef struct st_1f99d8_2 {
    char padding_0[24];
    struct st_1f99d8_3 *field_18;
    char padding_20[16];
    char *field_30;
    unsigned long long field_38;
} st_1f99d8_2;

typedef struct st_1f99d8_3 {
    unsigned long long field_0;
} st_1f99d8_3;

typedef struct st_1f99d8_0 {
    char field_0;
} st_1f99d8_0;


unsigned long long sub_1f99d8(st_1f99d8_2 *a0, st_1f99d8_1 *a1)
{
    char *v2;  // x10
    unsigned long long v3;  // x9
    char *v12;  // x17
    char *v4;  // x11
    unsigned long long v5;  // x14
    char *v6;  // x15
    unsigned int v7;  // w16
    char *v8;  // x17
    unsigned long long v9;  // x2
    char *v10;  // x3
    unsigned long long v11;  // x2
    st_1f99d8_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1f99d8_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a1->field_88;
    v3 = a0->field_38 - 1;
    if (a1->field_a8 - a1->field_88 <= v3)
        return 0;
    v4 = a0->field_30 + 1;
    v5 = v3;
    do
    {
        v6 = &v2[v5];
        v7 = *v6;
        if (v7 == *a0->field_30)
        {
            v8 = v6 - 1;
            v9 = v3;
            v10 = v4;
            while (1)
            {
                v11 = v9;
                v12 = v8 - 1;
                if (*v10 != *v8)
                    break;
                v10 += 1;
                v9 = v11 - 1;
                v8 = v12;
                if (v11 == 1)
                {
                    a1->field_28 = &v2[1 + -1 * a0->field_38 + v5];
                    a1->field_a0 = v6 + 1;
                    return 1;
                }
            }
        }
    } while ((v5 = *(long long *)&a0->field_18[v7 & 0xff], v2 = v6, a1->field_a8 - v2 > (unsigned long long)*(long long *)&a0->field_18[v7 & 0xff]));
    return 0;
}
