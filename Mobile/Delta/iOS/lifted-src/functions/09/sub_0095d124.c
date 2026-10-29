/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95d124..0x95d24c (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95d124_0 {
    unsigned int field_0;
    char padding_4[2172];
    unsigned long long field_880;
} st_95d124_0;

typedef struct st_95d124_1 {
    char padding_0[344];
    struct st_95d124_2 *field_158;
} st_95d124_1;

typedef struct st_95d124_2 {
    unsigned long long field_0;
    char padding_8[24];
    unsigned long long field_20;
} st_95d124_2;

typedef struct st_95d124_3 {
    char field_0;
    char padding_1[23];
    struct st_95d124_1 *field_18;
    struct st_95d124_0 *field_20;
    char padding_28[8];
    struct st_95d124_4 *field_30;
    unsigned long long field_38;
} st_95d124_3;

typedef struct st_95d124_4 {
    unsigned long long field_0;
} st_95d124_4;


long long sub_95d124(st_95d124_3 *a0, long long a1)
{
    unsigned long long v2;  // x0
    unsigned long long *v3;  // x9
    st_95d124_0 *v4;  // x8
    unsigned long v5;  // x9
    st_95d124_0 *v6;  // x8
    unsigned long long idx;  // x21
    unsigned long long v9;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_18)
    {
        v2 = sub_964ea8(a0->field_18, a1);
        v3 = &a0->field_18->field_158->field_0;
        v4 = a0->field_20;
        if (a0->field_20)
            goto LABEL_95d174;
    }
    else
    {
        v3 = 0;
        v2 = 1;
        v4 = a0->field_20;
        if (a0->field_20)
        {
LABEL_95d174:
            v5 = v4->field_0;
            if ((unsigned int)v5)
            {
                if (!(v5 >> 7 & 1))
                    goto LABEL_95d22c;
                v4 = sub_980dc8(v4);
                v2 = v4;
                if (!v2)
                    return (int)v2 > 0;
                v6 = a0->field_20;
            }
            else
            {
                v6 = v4;
            }
            v2 = sub_96521c(v6, a1);
            v3 = v4->field_880;
        }
    }
    if ((int)v2 >= 1 && v3 && a0->field_0 >> 6 & 1)
    {
        idx = 14757395258967641293 * ((long long)(*v3 - v3[4]) >> 3);
        if (a0->field_38 > idx)
        {
            sub_a6c2e4(*(long long *)&a0->field_30[idx], "ssl/ssl_conf.c", 463);
            v9 = sub_a6d9b4(a1, "ssl/ssl_conf.c", 464);
            *(unsigned long long *)&a0->field_30[idx] = v9;
            if (!v9)
                v2 = 0;
            else
                v2 &= 0xffffffff;
        }
        else
        {
LABEL_95d22c:
            v2 = 0;
        }
    }
    return (int)v2 > 0;
}
