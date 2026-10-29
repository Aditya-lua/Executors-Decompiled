/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3b76c..0x3b84c (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3b76c_1 {
    long long field_0;
    char field_8;
    char padding_9[135];
    char field_90;
    char padding_91[1439];
    unsigned long long field_630;
    unsigned long long field_638;
} st_3b76c_1;

typedef struct st_3b76c_0 {
    char field_0;
} st_3b76c_0;


st_3b76c_1 * sub_3b76c(st_3b76c_1 *a0, long long i)
{
    unsigned long v4;  // x8
    st_3b76c_1 *v5;  // x0
    unsigned long long v6;  // x23
    unsigned long long v7;  // x22
    char v8;  // x21
    unsigned long long v9;  // x8
    unsigned int v10;  // w8
    unsigned int v11;  // w9
    st_3b76c_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_3b76c_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_630;
    v5 = a0;
    if ((long long)(v5->field_638 - v5->field_630) >> 3 > (unsigned long long)i)
    {
        v6 = 0;
        v7 = i * 8;
        v8 = 0xff;
        do
        {
            v5 = sub_34930(&a0->field_90, v4 + v7);
            v9 = &v5->field_8;
            if (!v5)
                v9 = 0;
            if (*(char *)(v9 + 2) == 1)
            {
                v10 = *(char *)v9;
                v11 = v8;
                if (v10 < v11)
                    v8 = v10;
                else
                    v8 = v11;
                v6 = 1;
            }
            i += 1;
            v4 = a0->field_630;
            v7 += 8;
        } while ((long long)(a0->field_638 - a0->field_630) >> 3 > (unsigned long long)i);
        if (v6 & 1)
            v5 = sub_2ad10(a0->field_0, 11, v8, 0, 0);
    }
    return v5;
}
