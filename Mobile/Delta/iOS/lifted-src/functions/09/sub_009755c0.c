/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9755c0..0x975738 (376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9755c0_2 {
    char padding_0[264];
    struct st_9755c0_0 *field_108;
    char padding_110[8];
    unsigned int field_118;
    char padding_11c[52];
    unsigned long long field_150;
    char padding_158[56];
    unsigned long long field_190;
    unsigned long long field_198;
    unsigned long long field_1a0;
    unsigned long long field_1a8;
    char padding_1b0[36];
    char field_1d4;
    char padding_1d5[3];
    unsigned int field_1d8;
} st_9755c0_2;

typedef struct st_9755c0_3 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
    char padding_18[8];
    char field_20;
    char padding_21[7];
    struct st_9755c0_1 *field_28;
} st_9755c0_3;

typedef struct st_9755c0_1 {
    unsigned long long field_0;
} st_9755c0_1;

typedef struct st_9755c0_0 {
    char padding_0[80];
    struct st_9755c0_1 *field_50;
} st_9755c0_0;


int sub_9755c0(st_9755c0_2 *a0)
{
    unsigned long long v5;  // x8
    unsigned long long v6;  // x9
    unsigned long long v7;  // x0
    st_9755c0_3 *v8;  // x20
    unsigned long v9;  // x8
    unsigned long v10;  // x9
    unsigned long long v11;  // 4123
    unsigned int *v12;  // x10
    unsigned int v0;  // [bp-0x64]
    unsigned long v1;  // [bp-0x60], Other Possible Types: unsigned long long
    unsigned long v2;  // [bp-0x58], Other Possible Types: unsigned long long
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = *(long long *)&a0->padding_158[0];
    if (v5 > a0->field_150 - 1)
    {
        v5 = a0->field_150;
        goto LABEL_9755fc;
    }
    else
    {
        if (v5)
        {
LABEL_9755fc:
            v6 = *(long long *)&a0->padding_158[8];
            if ((unsigned long long)*(long long *)&a0->padding_158[8] >= v5)
                goto LABEL_97561c;
        }
        else
        {
            v6 = *(long long *)&a0->padding_158[8];
        }
        v0 = 2;
        if (v6)
        {
LABEL_97561c:
            v7 = sub_9752f4(a0);
            if (v7)
            {
                v8 = v7;
                v1 = 0;
                v2 = 0;
                if (!(v8->field_20 >> 2 & 1))
                    v8->field_28();
                v9 = v8->field_8;
                a0->field_190 = a0->field_190 - v9;
                v10 = v8->field_20;
                if (v10 >> 3 & 1)
                    (&a0->field_198)[v10 & 3] = (&a0->field_198)[v10 & 3] - v9;
                v1 = v8->field_10;
                v2 = v9;
                a0->field_108->field_50();
            }
        }
        else
        {
            v11 = arm64g_calculate_condition(18, a0->field_1a8, a0->field_198 + a0->field_1a0, 0);
            if (!(v11 & 1))
            {
                v12 = &a0->field_1d8;
                if (!a0->padding_1b0[27])
                    v12 = &a0->field_1d4;
            }
            else
            {
                sub_975738(a0, &v0);
                v12 = &a0->padding_0[4 * v0 + 476];
            }
            *v12 = *v12 + 1;
            a0->field_118 = a0->field_118 + 1;
        }
        sub_974dcc(a0);
        return 1;
    }
}
