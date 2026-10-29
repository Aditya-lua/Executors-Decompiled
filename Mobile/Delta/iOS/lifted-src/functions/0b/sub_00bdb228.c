/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbdb228..0xbdb2fc (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bdb228_0 {
    char *field_0;
    struct st_bdb228_1 *field_8;
    struct st_bdb228_1 *field_10;
    struct st_bdb228_1 *field_18;
    char padding_20[8];
    unsigned long long field_28;
} st_bdb228_0;

typedef struct st_bdb228_1 {
    struct st_bdb228_1 *field_0;
    char padding_8[528];
    unsigned short field_218;
    unsigned short field_21a;
} st_bdb228_1;

extern long long g_efa598;
extern long long g_efa5c8;

char * sub_bdb228(st_bdb228_0 *a0)
{
    char *v2;  // x10
    char *v3;  // x11
    unsigned long v6;  // cc_dep2
    unsigned long v7;  // cc_ndep
    unsigned long long v8;  // 4110
    unsigned long long v9;  // 4102
    unsigned long v10;  // cc_op
    unsigned long v11;  // cc_dep1
    char *v12;  // x8
    char *v13;  // x9
    unsigned long v14;  // x11
    char *i;  // x8
    char *v16;  // x9
    char *v17;  // x8
    unsigned long long v4;  // 4110
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_0;
    if (v2)
    {
        v3 = a0->field_10;
        if (v2 == a0->field_18)
        {
            v4 = arm64g_calculate_condition(v10, v11, v6, v7);
            v5 = arm64g_calculate_condition(4, (v4 & 1 ? v3 : 0), (v4 & 1 ? a0->field_28 : 0), 0);
            if (!(v5 & 1))
                goto LABEL_bdb250;
        }
        else
        {
            v8 = arm64g_calculate_condition(v10, v11, v6, v7);
            v9 = arm64g_calculate_condition(0, (v8 & 1 ? v3 : 0), (v8 & 1 ? a0->field_28 : 0), 0);
            if (!(v9 & 1))
            {
LABEL_bdb250:
                v12 = a0->field_8;
                if (*(short *)&v2[538] > v3)
                {
                    v13 = v2;
                }
                else
                {
                    do
                    {
                        v13 = *(long long *)v2;
                        if (!v13)
                        {
                            sub_c73c64(&g_efa5c8);
                            __debugbreak();
                        }
                    } while ((v12 += 1, v3 = *(short *)&v2[536], v2 = v13, *(short *)&v2[538] <= (unsigned int)v3));
                }
                if (v12)
                {
                    v14 = v13 + 0x8 * v3 + 552;
                    do
                    {
                        i = v12;
                        v16 = *(long long *)v14;
                        v14 = *(long long *)v14 + 544;
                        v17 = i - 1;
                        v12 = v17;
                    } while (i != 1);
                }
                else
                {
                    v17 = v3 + 1;
                    v16 = v13;
                }
                a0->field_0 = v16;
                a0->field_8 = 0;
                a0->field_10 = v17;
                return v13 + 0x18 * v3 + 8;
            }
        }
    }
    else if (a0->field_18)
    {
        sub_c73c64(&g_efa598);
        __debugbreak();
    }
    return 0;
}
