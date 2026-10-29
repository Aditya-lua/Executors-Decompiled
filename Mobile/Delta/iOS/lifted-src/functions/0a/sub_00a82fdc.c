/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa82fdc..0xa830a4 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a82fdc_1 {
    unsigned short field_0;
} st_a82fdc_1;

typedef struct st_a82fdc_3 {
    uint128_t field_0;
    uint128_t field_10;
} st_a82fdc_3;

typedef struct st_a82fdc_2 {
    struct st_a82fdc_0 *field_0;
    char padding_8[40];
    struct st_a82fdc_3 *field_30;
    char padding_38[8];
    struct st_a82fdc_1 *field_40;
} st_a82fdc_2;

typedef struct st_a82fdc_0 {
    char padding_0[24];
    unsigned long long field_18;
    char padding_20[16];
    unsigned long long field_30;
    char padding_38[16];
    struct st_a82fdc_1 *field_48;
} st_a82fdc_0;


unsigned short * sub_a82fdc(unsigned long long *a0, unsigned long a1, st_a82fdc_2 *a2)
{
    unsigned short *v0;  // x8
    st_a82fdc_0 *v1;  // x9
    unsigned long v10;  // x1
    unsigned short *v11;  // w17
    unsigned long v12;  // cc_dep1
    unsigned long long v13;  // 4106
    unsigned long long v14;  // 4106
    uint128_t *v15;  // x8
    uint128_t v16;  // q1
    uint128_t *v2;  // x10
    unsigned short *v3;  // w11
    unsigned long long *v4;  // x12
    unsigned short *i;  // w11
    unsigned short *v6;  // x13
    unsigned short *v7;  // x16
    unsigned short *v8;  // w15
    unsigned long long *iter;  // x14

    v0 = a2->field_40;
    if (!v0)
        return 0;
    v1 = a2->field_0;
    if (v1->field_18 != a1)
        return 0;
    v2 = &a2->field_30->field_0;
    v3 = (unsigned short *)(int)v1->field_48;
    if (v3 >= 1)
    {
        v4 = a0;
        do
        {
            i = v3;
            v6 = 0;
            v7 = 0;
            v8 = (unsigned short *)0;
            iter = v4;
            do
            {
                v10 = *(short *)(v0 + v6);
                v11 = v8 + 6;
                if (0x33 < v8)
                {
                    *iter = v10 << ((char)v8 & 63) | v7;
                    iter += 1;
                    v12 = v11;
                    if (v11 == 64)
                    {
                        v7 = 0;
                        v13 = arm64g_calculate_condition(3, v12, 64, 0);
                        if (!(v13 & 1))
                            goto LABEL_a83052;
                    }
                    else
                    {
                        v7 = v10 >> ((char)-v8 & 63);
                        v14 = arm64g_calculate_condition(3, v12, 64, 0);
                        if (!(v14 & 1))
                        {
LABEL_a83052:
                            v8 = (char *)v8 - 52;
                            continue;
                        }
                    }
                    v8 = (unsigned short *)0;
                    continue;
                }
                else
                {
                    v7 |= v10 << ((char)v8 & 63);
                    v8 = v11;
                }
            } while ((v6 += 1, 0x1fe > (char *)v6 - 2));
            v0 += 0x100;
            v4 += 48;
            v3 = (char *)i - 1;
        } while (i > 1);
    }
    v15 = (char *)a0 + v1->field_30;
    v16 = v2[1];
    *v15 = *v2;
    v15[1] = v16;
    return 1;
}
