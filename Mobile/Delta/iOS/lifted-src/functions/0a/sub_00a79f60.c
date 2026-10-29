/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa79f60..0xa7a0b4 (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a79f60_3 {
    struct st_a79f60_2 *field_0;
    char padding_8[8];
    long long field_10;
    char padding_18[8];
    char field_20;
} st_a79f60_3;

typedef struct st_a79f60_0 {
    unsigned long long field_0;
    long long field_8;
    char padding_10[16];
    long long field_20;
    char padding_28[8];
    struct st_a79f60_1 *field_30;
    unsigned long long field_38;
    char padding_40[8];
    char field_48;
} st_a79f60_0;

typedef struct st_a79f60_1 {
    long long field_0;
} st_a79f60_1;

typedef struct st_a79f60_2 {
    char padding_0[80];
    unsigned long long field_50;
    struct st_a79f60_0 *field_58;
    unsigned int field_60;
} st_a79f60_2;

extern st_a79f60_3 g_ea0508;

unsigned long long sub_a79f60(st_a79f60_0 *a0)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned long long idx;  // x20
    unsigned long long v5;  // w21
    st_a79f60_3 *v6;  // x22
    st_a79f60_3 *v7;  // x22
    unsigned long v8;  // x23
    long long *v9;  // x24
    unsigned long v10;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a7c17c(a0->field_20);
    if (!(unsigned int)v2)
        return v2;
    sub_a7c1b4(a0->field_20);
    if (!(a0->field_48 & 1))
        return 1;
    v3 = sub_a7c198(a0->field_20);
    if (!(unsigned int)v3)
        return v3;
    if (!(a0->field_48 & 1))
    {
LABEL_a79fb0:
        idx = 1;
    }
    else
    {
        idx = g_ea0508.field_0;
        if (!g_ea0508.field_0)
        {
            sub_a7c1b4(a0->field_20);
            return g_ea0508.field_0;
        }
        v5 = 0;
        v6 = &g_ea0508.field_0;
        while (1)
        {
            v7 = v6;
            if (v7->field_20 & 1)
            {
                v8 = a0->field_38;
                if (a0->field_38)
                {
                    v9 = a0->field_30;
                    do
                    {
                        v10 = v8;
                        if (!_strcmp(*v9, idx))
                            goto LABEL_a7a01c;
                    } while ((v9 += 5, v8 = v10 - 1, v10 != 1));
                }
LABEL_a7a01c:
                idx = sub_a79128(idx, v7->field_10);
                if (!idx)
                    break;
                *(unsigned long long *)(idx + 80) = a0->field_0;
                *(unsigned int *)(idx + 96) = sub_a3642c();
                if (!(sub_a79808(idx, 0, 0) >> 31 & 1) && !(*(st_a79f60_0 **)(idx + 88) = a0, !sub_ad68a0(a0->field_8, idx)))
                {
                    v5 += 1;
                }
                else
                {
                    sub_a78ccc(idx);
LABEL_a7a090:
                    idx = 0;
                    break;
                }
            }
            idx = *(long long *)((char *)&v7[1].field_0 + 7);
            v6 = (char *)&v7[1].field_0 + 7;
            if (!*(long long *)((char *)&v7[1].field_0 + 7))
            {
                if (v5 < 1)
                    goto LABEL_a7a090;
                a0->field_48 = a0->field_48 & 254;
                goto LABEL_a79fb0;
            }
        }
    }
    sub_a7c1b4(a0->field_20);
    return idx;
}
