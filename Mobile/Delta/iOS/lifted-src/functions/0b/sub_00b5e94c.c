/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5e94c..0xb5ea64 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5e94c_2 {
    char padding_0[16];
    unsigned long long field_10;
    struct st_b5e94c_3 *field_18;
    char padding_20[44];
    char field_4c;
    char padding_4d[67];
    unsigned long long field_90;
} st_b5e94c_2;

typedef struct st_b5e94c_0 {
    char padding_0[32];
    char field_20;
    char padding_21[15];
    long long field_30;
    struct st_b5e94c_1 *field_38;
    char padding_40[44];
    char field_6c;
    char padding_6d[67];
    long long field_b0;
} st_b5e94c_0;

typedef struct st_b5e94c_3 {
    unsigned long long field_0;
} st_b5e94c_3;

typedef struct st_b5e94c_1 {
    char field_0;
} st_b5e94c_1;


int sub_b5e94c(st_b5e94c_0 *a0, long long a1, long long a2, long long a3)
{
    long long i;  // x19
    long long v3;  // x21
    long long v4;  // x20
    st_b5e94c_2 *v5;  // x4
    long long v6;  // x0
    long long v7;  // x1
    st_b5e94c_2 *v8;  // x4
    long long v9;  // x0
    long long v10;  // x1
    long long v11;  // x2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    i = a3;
    v3 = a2;
    v4 = a1;
    if ((unsigned long long)a3 > 0x3fffffff)
    {
        do
        {
            if (a0->field_38)
                a0->field_38();
            v5 = &a0->field_20;
            v6 = v3;
            v7 = v4;
            if (!(a0->field_6c >> 1 & 1))
                sub_a92eec(v6, v7, 0x40000000, a0->field_b0, v5, a0->field_30);
            else
                sub_a92d00(v6, v7, 0x40000000, a0->field_b0, v5, a0->field_30);
            i += 0xffffffffc0000000;
            v3 += 0x40000000;
            v4 += 0x40000000;
        } while ((unsigned long long)i > 0x3fffffff);
    }
    if (!i)
    {
        return 1;
    }
    else if (a0->field_38)
    {
        a0->field_38();
    }
    else
    {
        v8 = &a0->field_20;
        v9 = v3;
        v10 = v4;
        v11 = i;
        if (a0->field_6c >> 1 & 1)
        {
            sub_a92d00(v9, v10, v11, a0->field_b0, v8, a0->field_30);
            return 1;
        }
        sub_a92eec(v9, v10, v11, a0->field_b0, v8, a0->field_30);
        return 1;
    }
}
