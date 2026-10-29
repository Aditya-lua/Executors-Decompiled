/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a1d9c..0x9a1f28 (396 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a1d9c_1 {
    struct st_9a1d9c_0 *field_0;
    long long field_8;
} st_9a1d9c_1;

typedef struct st_9a1d9c_0 {
    unsigned short field_0;
    char field_2;
} st_9a1d9c_0;


int sub_9a1d9c(void* a0, st_9a1d9c_1 *a1)
{
    unsigned long v2;  // x10
    long long v3;  // x20
    unsigned long long v12;  // 4102
    unsigned long long v13;  // 4110
    unsigned long long v14;  // 4102
    void* v15;  // x23
    unsigned long v16;  // x0
    void* v17;  // x0
    long long v18;  // x1
    long long v19;  // x2
    long long v20;  // x1
    char *v4;  // x21
    unsigned long v5;  // cc_dep2
    char *v6;  // x8
    unsigned long v7;  // cc_dep1
    unsigned long v8;  // x9
    unsigned long v9;  // x10
    unsigned long v10;  // x9
    unsigned long long v11;  // 4110
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((long long)a0[608] && (long long)a0[744])
        return 1;
    if ((unsigned long long)a1->field_8 < 2 || (v2 = a1->field_0->field_0, v3 = (unsigned int)((v2 & 0xff00) >> 8) | (unsigned int)v2 * 0x100 & 0xff00ff00, a1->field_8 - 2 != v3 || (v4 = &a1->field_0->field_2, a1->field_0 = &v4[v3], a1->field_8 = 0, v5 = 2, 2 > (unsigned long long)v3)))
    {
        sub_a368c8();
        v20 = 461;
LABEL_9a1e18:
        sub_a369bc("ssl/statem/extensions_srvr.c", v20, "tls_parse_ctos_alpn");
        v17 = a0;
        v18 = 50;
        v19 = 110;
    }
    else
    {
        v6 = v4;
        v7 = v3;
        v8 = v3;
        do
        {
            v9 = *v6;
            v10 = v8 - 1;
            if (v9)
            {
                v11 = arm64g_calculate_condition(20, v7, v5, 0);
                v12 = arm64g_calculate_condition(52, (v11 & 1 ? v10 : 0), (v11 & 1 ? v9 : 0), 0);
                if (!(v12 & 1))
                    continue;
                goto LABEL_9a1edc;
            }
            else
            {
                v13 = arm64g_calculate_condition(20, v7, v5, 0);
                v14 = arm64g_calculate_condition(48, (v13 & 1 ? v10 : 0), 0, 0);
                if (v14 & 1)
                {
LABEL_9a1edc:
                    sub_a368c8();
                    v20 = 470;
                    goto LABEL_9a1e18;
                }
            }
        } while ((v6 = &v6[v9 + 1], v8 = v10 - v9, v7 = v10, v5 = v9, v10 != v9));
        v15 = a0 + 1224;
        sub_a6c2e4((long long)a0[1224], "ssl/statem/extensions_srvr.c", 475);
        *(uint128_t *)v15 = 0;
        sub_a6c2e4(0, "include/internal/packet.h", 454);
        *(uint128_t *)v15 = 0;
        v16 = sub_a6dac4(v4, v3, "include/internal/packet.h", 463);
        *(unsigned long *)&a0[1224] = v16;
        if (v16)
        {
            *(long long *)&a0[1232] = v3;
            return 1;
        }
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_srvr.c", 480, "tls_parse_ctos_alpn");
        v17 = a0;
        v18 = 80;
        v19 = 786691;
    }
    sub_9a58a4(v17, v18, v19, 0);
    return 0;
}
