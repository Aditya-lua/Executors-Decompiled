/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaddd10..0xadde58 (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_addd10_1 {
    struct st_addd10_0 *field_0;
    unsigned long long field_8;
} st_addd10_1;

typedef struct st_addd10_3 {
    long long field_0;
    struct st_addd10_0 *field_8;
} st_addd10_3;

typedef struct st_addd10_2 {
    char padding_0[264];
    struct st_addd10_1 *field_108;
} st_addd10_2;

typedef struct st_addd10_0 {
    unsigned int field_0;
    char padding_4[12];
    unsigned long long field_10;
    long long field_18;
} st_addd10_0;

extern long long g_aea72c;

st_addd10_0 * sub_addd10(st_addd10_2 *a0, long long a1)
{
    st_addd10_1 *v2;  // x20
    st_addd10_0 *v3;  // x21
    st_addd10_3 *v4;  // x22
    st_addd10_0 *v5;  // x0
    st_addd10_0 *v6;  // x0
    unsigned long v7;  // x8
    st_addd10_0 *v8;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_108;
    if (!sub_ad69e4(a1))
    {
LABEL_adde1c:
        sub_ad6958(a1, &g_aea72c);
        return 0xffffffff;
    }
    if ((int)sub_ad69e4(a1) >= 1)
    {
        v3 = 0;
        do
        {
            v4 = sub_ad69f8(a1, v3);
            if (sub_a99eac(v4->field_8) == 746 || sub_a99eac(v4->field_0) == 746)
                goto LABEL_adde1c;
            v5 = sub_addb20(v2, v4->field_0);
            if (v5)
            {
                v5->field_0 = v5->field_0 | 1;
            }
            else
            {
                if (!v2->field_0)
                    continue;
                v6 = sub_addbd8(0, v4->field_0, v2->field_0->field_0 & 16);
                if (!v6)
                {
                    sub_ad6958(a1, &g_aea72c);
                    return 0;
                }
                v7 = v2->field_8;
                v6->field_10 = v2->field_0->field_10;
                v6->field_0 = v6->field_0 | 6;
                v8 = v6;
                if (!sub_ad68a0(v7, v8))
                {
                    sub_addb74(v8);
                    sub_ad6958(a1, &g_aea72c);
                    return 0;
                }
                v5 = v8;
            }
            if (!sub_ad68a0(v5->field_18, v4->field_8))
            {
                sub_ad6958(a1, &g_aea72c);
                return 0;
            }
            v4->field_8 = 0;
        } while ((v3 = (unsigned int)v3 + 1, (int)(unsigned int)v3 < (int)sub_ad69e4(a1)));
        goto LABEL_adde1c;
    }
    sub_ad6958(a1, &g_aea72c);
    return 1;
}
