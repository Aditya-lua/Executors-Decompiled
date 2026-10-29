/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99f830..0x99f9b0 (384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99f830_2 {
    char padding_0[8];
    unsigned long long field_8;
} st_99f830_2;

typedef struct st_99f830_1 {
    struct st_99f830_0 *field_0;
    unsigned long long field_8;
} st_99f830_1;

typedef struct st_99f830_3 {
    char padding_0[2968];
    struct st_99f830_2 *field_b98;
} st_99f830_3;

typedef struct st_99f830_0 {
    unsigned short field_0;
    unsigned short field_2;
    char field_4;
} st_99f830_0;


int sub_99f830(st_99f830_3 *a0, st_99f830_1 *a1)
{
    unsigned long long v2;  // x8
    unsigned long v3;  // x10
    unsigned long v12;  // x22
    unsigned int v13;  // w10
    st_99f830_3 *v14;  // x0
    long long v15;  // x1
    long long v16;  // x2
    unsigned long v17;  // x0
    long long v18;  // x20
    unsigned long v19;  // x21
    st_99f830_2 *v20;  // x0
    long long v21;  // x1
    unsigned long v4;  // cc_dep1
    st_99f830_0 *v5;  // x9
    st_99f830_0 *v6;  // x11
    unsigned long v7;  // x12
    unsigned long long v8;  // 4110
    unsigned long long v9;  // 4102
    unsigned long long v10;  // 4110
    unsigned long long v11;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_8;
    v3 = v2 - 2;
    v4 = v2;
    if (v2 >= 2)
    {
        v5 = a1->field_0;
        v6 = v5;
        v7 = v6->field_0;
        a1->field_0 = &v6->field_2;
        a1->field_8 = v3;
        if (((unsigned int)((v7 & 0xff00) >> 8) | (unsigned int)v7 * 0x100 & 0xff00ff00) == 2)
        {
            v8 = arm64g_calculate_condition(4, v4, 2, 0);
            v9 = arm64g_calculate_condition(52, (v8 & 1 ? v3 : 0), (v8 & 1 ? 2 : 0), 0);
            goto LABEL_99f898;
        }
        else
        {
            v10 = arm64g_calculate_condition(4, v4, 2, 0);
            v11 = arm64g_calculate_condition(48, (v10 & 1 ? v3 : 0), (v10 & 1 ? 2 : 0), 0);
            if (v11 & 1 || (v12 = v5->field_2, a1->field_0 = &v5->field_4, a1->field_8 = v2 - 4, v2 == 4 || (v13 = v5->field_4, a1->field_0 = &v5[1], a1->field_8 = v2 - 5, v2 != 5)))
                goto LABEL_99f898;
            if (v5->field_4)
            {
                sub_a368c8();
                sub_a369bc("ssl/statem/extensions_clnt.c", 1778, "tls_parse_stoc_use_srtp");
                v14 = a0;
                v15 = 47;
                v16 = 352;
            }
            else
            {
                v17 = sub_954120(a0);
                if (v17)
                {
                    v18 = v17;
                    if ((int)sub_ad69e4() >= 1)
                    {
                        v19 = 0;
                        do
                        {
                            v20 = sub_ad69f8(v18, v19);
                            if (v20->field_8 == ((unsigned int)((v12 & 0xff00) >> 8) | (unsigned int)v12 * 0x100 & 0xff00ff00))
                            {
                                a0->field_b98 = v20;
                                return 1;
                            }
                        } while ((v19 = (unsigned int)v19 + 1, (int)v19 < (int)sub_ad69e4(v18)));
                    }
                    sub_a368c8();
                    v21 = 1803;
LABEL_99f8b0:
                    sub_a369bc("ssl/statem/extensions_clnt.c", v21, "tls_parse_stoc_use_srtp");
                    v14 = a0;
                    v15 = 50;
                    v16 = 353;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("ssl/statem/extensions_clnt.c", 1785, "tls_parse_stoc_use_srtp");
                    v14 = a0;
                    v15 = 50;
                    v16 = 359;
                }
            }
        }
    }
    else
    {
LABEL_99f898:
        sub_a368c8();
        v21 = 1772;
        goto LABEL_99f8b0;
    }
    sub_9a58a4(v14, v15, v16, 0);
    return 0;
}
