/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a1314..0x9a1520 (524 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a1314_4 {
    struct st_9a1314_3 *field_0;
    unsigned long long field_8;
} st_9a1314_4;

typedef struct st_9a1314_1 {
    int field_0;
    char padding_4[212];
    struct st_9a1314_0 *field_d8;
} st_9a1314_1;

typedef struct st_9a1314_2 {
    char padding_0[24];
    struct st_9a1314_1 *field_18;
    char padding_20[2272];
    unsigned long long field_900;
    char padding_908[280];
    long long field_a20;
    char padding_a28[312];
    char field_b60;
} st_9a1314_2;

typedef struct st_9a1314_3 {
    unsigned short field_0;
    char field_2;
    char field_3;
    char field_4;
} st_9a1314_3;

typedef struct st_9a1314_0 {
    char padding_0[80];
    char field_50;
} st_9a1314_0;


char sub_9a1314(st_9a1314_2 *a0, st_9a1314_4 *a1)
{
    char v4;  // x10
    st_9a1314_3 *v5;  // x9
    unsigned long long v14;  // 4102
    unsigned long v15;  // x8
    char v16;  // x20
    char v17;  // x22
    char v18;  // w8
    long long v19;  // x1
    long long v20;  // x1
    unsigned long v6;  // x8
    char v7;  // x8
    unsigned long v8;  // cc_dep1
    unsigned long v9;  // cc_dep2
    char *v10;  // x10
    unsigned long long v11;  // 4112
    unsigned long long v12;  // 4102
    unsigned long long v13;  // 4112
    unsigned long v0;  // [bp-0x40]
    long long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a1->field_8 - 2;
    if (a1->field_8 >= 2)
    {
        v5 = a1->field_0;
        v6 = v5->field_0;
        v7 = (unsigned int)((v6 & 0xff00) >> 8) | (unsigned int)v6 * 0x100 & 0xff00ff00;
        v8 = v4;
        v9 = v7;
        if (v4 != v7 || (v10 = &v5->field_2, a1->field_0 = &v10[v7], a1->field_8 = 0, !v7))
            goto LABEL_9a13d4;
        if (3 <= v7)
        {
            v11 = arm64g_calculate_condition(36, v8, v9, 0);
            v12 = arm64g_calculate_condition(19, (v11 & 1 ? *v10 : 0), 0, 0);
LABEL_9a141c:
            sub_a368c8();
            v20 = 132;
LABEL_9a13ec:
            sub_a369bc("ssl/statem/extensions_srvr.c", v20, "tls_parse_ctos_server_name");
        }
        else
        {
            v13 = arm64g_calculate_condition(36, v8, v9, 0);
            v14 = arm64g_calculate_condition(16, (v13 & 1 ? *v10 : 0), 0, 0);
            if (v14 & 1 || (v15 = v5->field_3, v16 = v5->field_4 | v15 * 0x100, v7 - 3 != v16))
                goto LABEL_9a141c;
            v0 = v5 + 1;
            v1 = v16;
            if (*(int *)&a0->padding_20[1256] && (a0->field_18->field_d8->field_50 >> 3 & 1 || a0->field_18->field_0 < 772 || a0->field_18->field_0 == 0x10000))
            {
                v17 = *(long long *)(a0->field_900 + 800);
                if (v17 && v1 == _strlen(v17))
                    v18 = !sub_a66f20(v0, v17, v1);
                else
                    v18 = 0;
                *(unsigned int *)&a0->field_b60 = v18;
                return 1;
            }
            if ((unsigned int)v15)
            {
                sub_a368c8();
                v19 = 142;
            }
            else if (_memchr(v0, 0, v1))
            {
                sub_a368c8();
                v19 = 147;
            }
            else
            {
                sub_a6c2e4(a0->field_a20, "ssl/statem/extensions_srvr.c", 155);
                a0->field_a20 = 0;
                if (!sub_9a1520(&v0, &a0->field_a20))
                {
                    sub_a368c8();
                    sub_a369bc("ssl/statem/extensions_srvr.c", 158, "tls_parse_ctos_server_name");
                    sub_9a58a4();
                    return 0;
                }
                *(unsigned int *)&a0->field_b60 = 1;
                return 1;
            }
            sub_a369bc("ssl/statem/extensions_srvr.c", v19, "tls_parse_ctos_server_name");
        }
        sub_9a58a4();
        return 0;
    }
LABEL_9a13d4:
    sub_a368c8();
    v20 = 114;
    goto LABEL_9a13ec;
}
