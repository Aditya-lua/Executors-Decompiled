/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99f3dc..0x99f580 (420 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99f3dc_3 {
    struct st_99f3dc_4 *field_0;
    struct st_99f3dc_1 *field_8;
} st_99f3dc_3;

typedef struct st_99f3dc_5 {
    char padding_0[1];
    unsigned long long field_1;
} st_99f3dc_5;

typedef struct st_99f3dc_2 {
    char padding_0[8];
    struct st_99f3dc_0 *field_8;
    char padding_10[592];
    struct st_99f3dc_1 *field_260;
    char padding_268[128];
    struct st_99f3dc_1 *field_2e8;
} st_99f3dc_2;

typedef struct st_99f3dc_0 {
    char padding_0[752];
    struct st_99f3dc_1 *field_2f0;
} st_99f3dc_0;

typedef struct st_99f3dc_1 {
    unsigned long long field_0;
} st_99f3dc_1;

typedef struct st_99f3dc_4 {
    char field_0;
} st_99f3dc_4;


unsigned long long * sub_99f3dc(st_99f3dc_2 *a0, st_99f3dc_3 *a1)
{
    char *v2;  // x3
    unsigned long long *v3;  // x4
    unsigned long v12;  // 4110
    unsigned long long v13;  // 4102
    unsigned long v4;  // cc_op
    unsigned long v5;  // cc_dep1
    unsigned long v6;  // cc_dep2
    unsigned long v7;  // cc_ndep
    unsigned long long *v8;  // x12
    st_99f3dc_5 *v9;  // x13
    unsigned long v10;  // 4110
    unsigned long long v11;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_260 && a0->field_2e8)
        return 1;
    if (a0->field_8->field_2f0)
    {
        v2 = a1->field_0;
        v3 = a1->field_8;
        while (1)
        {
            if (!v3)
                a0->field_8->field_2f0();
            v8 = *v2;
            v9 = (char *)v3 - 1;
            v2 = v2 + v8 + 1;
            v3 = v9 - v8;
            if (v8)
            {
                v10 = arm64g_calculate_condition(v4 | 16, v5, v6, v7);
                v4 = 4;
                v5 = (v10 & 1 ? v9 : 0);
                v6 = (v10 & 1 ? v8 : 0);
                v7 = 0;
                v11 = arm64g_calculate_condition(36, v5, v6, 0);
                if (!(v11 & 1))
                    break;
            }
            else
            {
                v12 = arm64g_calculate_condition(v4 | 16, v5, v6, v7);
                v4 = 0;
                v5 = (v12 & 1 ? v9 : 0);
                v6 = 0;
                v7 = 0;
                v13 = arm64g_calculate_condition(32, v5, 0, 0);
                if (!(v13 & 1))
                    break;
            }
        }
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_clnt.c", 1609, "ssl_next_proto_validate");
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_clnt.c", 1631, "tls_parse_stoc_npn");
    }
    sub_9a58a4();
    return 0;
}
