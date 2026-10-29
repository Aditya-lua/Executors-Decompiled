/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9af678..0x9af7c4 (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9af678_3 {
    char padding_0[24];
    struct st_9af678_1 *field_18;
    char padding_20[40];
    unsigned int field_48;
    char padding_4c[364];
    unsigned int field_1b8;
    char padding_1bc[324];
    unsigned long long field_300;
    char padding_308[488];
    struct st_9af678_2 *field_4f0;
} st_9af678_3;

typedef struct st_9af678_1 {
    char padding_0[216];
    struct st_9af678_0 *field_d8;
} st_9af678_1;

typedef struct st_9af678_2 {
    char padding_0[272];
    unsigned short field_110;
} st_9af678_2;

typedef struct st_9af678_0 {
    char padding_0[80];
    char field_50;
} st_9af678_0;


char sub_9af678(st_9af678_3 *a0, unsigned long a1)
{
    st_9af678_3 *v2;  // x19
    char v3;  // x8
    unsigned long v8;  // cc_dep2
    unsigned long long v9;  // 4102
    unsigned long v10;  // cc_op
    unsigned long v11;  // cc_dep1
    unsigned long v12;  // cc_dep2
    unsigned long v13;  // cc_ndep
    unsigned long v14;  // 4110
    unsigned long long v15;  // 4102
    unsigned long long v16;  // 4110
    unsigned long long v17;  // 4102
    unsigned long long v18;  // 4110
    unsigned long long v19;  // 4102
    unsigned long v5;  // 4110
    unsigned long v6;  // cc_op
    unsigned long v7;  // cc_dep1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    v3 = *(long long *)(a1 + 8);
    if (!(a0->field_18->field_d8->field_50 >> 3 & 1))
    {
        if (v3)
        {
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_lib.c", 808, "tls_process_change_cipher_spec");
            sub_9a58a4(v2, 50, 103, 0);
            return 0;
        }
LABEL_9af6d8:
        if (!v2->field_300)
        {
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_lib.c", 815, "tls_process_change_cipher_spec");
            sub_9a58a4(v2, 10, 133, 0);
            return 0;
        }
        v2->field_1b8 = 1;
        if (!sub_957564(v2))
        {
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_lib.c", 821, "tls_process_change_cipher_spec");
            sub_9a58a4(v2, 80, 0xc0103, 0);
            return 0;
        }
        if (!(v2->field_18->field_d8->field_50 >> 3 & 1) || v2->field_48 != 0x100)
            return 3;
        v2->field_4f0->field_110 = v2->field_4f0->field_110 + 1;
        return 3;
    }
    else
    {
        if (v2->field_48 == 0x100)
        {
            v5 = arm64g_calculate_condition(v10, v11, v12, v13);
            v6 = 4;
            v7 = (v5 & 1 ? v3 : 0x40000000);
            v8 = (v5 & 1 ? 2 : 0);
            v9 = arm64g_calculate_condition(20, v7, v8, 0);
            if (!(v9 & 1))
                goto LABEL_9af6cc;
        }
        else
        {
            v14 = arm64g_calculate_condition(v10, v11, v12, v13);
            v6 = 0;
            v7 = (v14 & 1 ? v3 : 0x40000000);
            v8 = (v14 & 1 ? 2 : 0);
            v15 = arm64g_calculate_condition(16, v7, v8, 0);
            if (!(v15 & 1))
            {
LABEL_9af6cc:
                if (v2->field_48 != 0x100)
                {
                    v16 = arm64g_calculate_condition(v6 | 16, v7, v8, 0);
                    v17 = arm64g_calculate_condition(20, (v16 & 1 ? v3 : 0x40000000), 0, 0);
                    if (!(v17 & 1))
                        goto LABEL_9af6d8;
                }
                else
                {
                    v18 = arm64g_calculate_condition(v6 | 16, v7, v8, 0);
                    v19 = arm64g_calculate_condition(16, (v18 & 1 ? v3 : 0x40000000), 0, 0);
                    if (!(v19 & 1))
                        goto LABEL_9af6d8;
                }
            }
        }
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_lib.c", 803, "tls_process_change_cipher_spec");
        sub_9a58a4(v2, 50, 103, 0);
        return 0;
    }
}
