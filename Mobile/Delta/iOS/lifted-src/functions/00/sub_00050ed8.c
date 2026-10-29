/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x50ed8..0x50fb0 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_50ed8_1 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_50ed8_1;

typedef struct st_50ed8_2 {
    char padding_0[7];
    unsigned long long field_7;
} st_50ed8_2;

typedef struct st_50ed8_3 {
    unsigned long long field_0;
    struct st_50ed8_2 *field_8;
    unsigned long long field_10;
} st_50ed8_3;

typedef struct st_50ed8_0 {
    unsigned long long field_0;
    char field_1;
    char padding_2[6];
    unsigned long long field_8;
} st_50ed8_0;

typedef struct st_50ed8_4 {
    char field_0;
} st_50ed8_4;


st_50ed8_0 * sub_50ed8(st_50ed8_3 *a0, st_50ed8_1 *a1)
{
    st_50ed8_0 *v4;  // x22
    unsigned long long v5;  // x8
    st_50ed8_0 *v6;  // x23
    unsigned long long v7;  // x8
    unsigned long long v8;  // x24
    st_50ed8_0 *v9;  // x21
    unsigned long long v10;  // x9
    st_50ed8_4 **v0;  // [bp-0x50], Other Possible Types: char
    st_50ed8_4 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = 0;
    v1 = &v0;
    v0 = &v1;
    v5 = 13787848793156543929 * a1->field_0;
    v6 = (char *)a0->field_8 - 1;
    v7 = a1->field_8 >> 4 ^ a1->field_8 >> 9 ^ v5 >> 31 ^ v5;
    while (1)
    {
        v8 = v7 & v6;
        v9 = a0->field_0 + v8 * 16;
        if (sub_51088(v9, a0 + 1))
        {
            v10 = a1->field_8;
            v9->field_0 = a1->field_0;
            *(unsigned long long *)&v9->field_1 = v10;
            a0->field_10 = a0->field_10 + 1;
            return v9;
        }
        else if (!sub_51088(v9, a1))
        {
            v4 = (char *)&v4->field_0 + 1;
            v7 = (char *)v4 + v8;
            if (v4 > v6)
                return 0;
        }
        else
        {
            return v9;
        }
    }
}
