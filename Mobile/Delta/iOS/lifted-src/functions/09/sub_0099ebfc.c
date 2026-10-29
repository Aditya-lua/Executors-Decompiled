/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99ebfc..0x99ed6c (368 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99ebfc_0 {
    struct st_99ebfc_1 *field_0;
    long long field_8;
} st_99ebfc_0;

typedef struct st_99ebfc_1 {
    char field_0;
} st_99ebfc_1;

typedef struct st_99ebfc_2 {
    char padding_0[1120];
    long long field_460;
    char field_468;
    char padding_469[63];
    long long field_4a8;
    unsigned int field_4b0;
} st_99ebfc_2;


long long sub_99ebfc(st_99ebfc_2 *a0, st_99ebfc_0 *a1)
{
    long long v2;  // x2
    long long v3;  // x20
    long long v12;  // x10
    char *v13;  // x0
    long long v14;  // x9
    char *v15;  // x21
    long long v16;  // x1
    st_99ebfc_2 *v17;  // x0
    long long v18;  // x1
    long long v19;  // x2
    long long v20;  // x1
    long long v4;  // x8
    unsigned long v5;  // cc_dep1
    unsigned long v6;  // cc_dep2
    unsigned long long v7;  // 4146
    unsigned long long v8;  // 4110
    unsigned long long v9;  // 4102
    unsigned long long v10;  // 4110
    unsigned long long v11;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_460;
    v3 = a0->field_4a8;
    v4 = v3 + v2;
    v5 = v3;
    v6 = v2;
    v7 = arm64g_calculate_condition(2, v3, v2, 0);
    if (!(v7 & 1))
    {
        if (v2)
        {
            v8 = arm64g_calculate_condition(18, v5, v6, 0);
            v9 = arm64g_calculate_condition(4, (v8 & 1 ? v3 : 0x40000000), 0, 0);
            if (v9 & 1)
            {
                sub_c65258(a0);
                return 0;
            }
        }
        else
        {
            v10 = arm64g_calculate_condition(18, v5, v6, 0);
            v11 = arm64g_calculate_condition(0, (v10 & 1 ? v3 : 0x40000000), 0, 0);
            if (v11 & 1)
            {
                sub_c65258(a0);
                return 0;
            }
        }
    }
    if (a1->field_8)
    {
        v12 = *(char *)a1->field_0;
        v13 = a1->field_0 + 1;
        v14 = a1->field_8 - 1;
        a1->field_0 = v13;
        a1->field_8 = v14;
        if (v14 == v12)
        {
            if (v4 != v14)
            {
                sub_a368c8();
                v16 = 1333;
            }
            else if ((unsigned long long)v4 < (unsigned long long)v2 || (v15 = &v13[v2], a1->field_0 = v15, a1->field_8 = v3, _memcmp()))
            {
                sub_a368c8();
                v16 = 1341;
            }
            else
            {
                a1->field_0 = &v15[v3];
                a1->field_8 = 0;
                if (!_memcmp(v15, &a0->field_468, v3))
                {
                    a0->field_4b0 = 1;
                    return 1;
                }
                sub_a368c8();
                v16 = 1349;
            }
            sub_a369bc("ssl/statem/extensions_clnt.c", v16, "tls_parse_stoc_renegotiate");
            v17 = a0;
            v18 = 47;
            v19 = 337;
        }
        else
        {
            sub_a368c8(v13);
            v20 = 1327;
LABEL_99ecc4:
            sub_a369bc("ssl/statem/extensions_clnt.c", v20, "tls_parse_stoc_renegotiate");
            v17 = a0;
            v18 = 50;
            v19 = 336;
        }
        sub_9a58a4(v17, v18, v19, 0);
        return 0;
    }
    sub_a368c8();
    v20 = 1321;
    goto LABEL_99ecc4;
}
