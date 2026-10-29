/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a7218..0x9a72fc (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a7218_0 {
    char padding_0[28];
    unsigned int field_1c;
} st_9a7218_0;

typedef struct st_9a7218_1 {
    char padding_0[768];
    struct st_9a7218_0 *field_300;
    char padding_308[168];
    long long field_3b0;
} st_9a7218_1;


unsigned long long sub_9a7218(st_9a7218_1 *a0)
{
    long long v2;  // x21
    unsigned long long v3;  // x20
    unsigned long v8;  // cc_op
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long v11;  // cc_ndep
    unsigned long long v12;  // 4112
    unsigned long long v13;  // 4102
    unsigned long v4;  // x8
    unsigned long long *v14;  // x19
    unsigned int v5;  // w8
    unsigned long long v6;  // 4112
    unsigned long long v7;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_3b0;
    v3 = *(long long *)&a0[1].padding_0[0];
    v4 = a0->field_300->field_1c;
    if (!(v4 >> 5 & 1))
    {
        v5 = (unsigned int)v4 & 8;
        if (!v2)
        {
            v6 = arm64g_calculate_condition(v8, v9, v10, v11);
            v7 = arm64g_calculate_condition(3, (v6 & 1 ? v5 : 0), 0, 0);
            if (v7 & 1)
                goto LABEL_9a7290;
LABEL_9a7250:
            if (sub_9568f8(a0, v2, v3, 1))
                return 1;
            v2 = 0;
            v3 = 0;
        }
        else
        {
            v12 = arm64g_calculate_condition(v8, v9, v10, v11);
            v13 = arm64g_calculate_condition(0, (v12 & 1 ? v5 : 0), 0, 0);
            if (!(v13 & 1))
                goto LABEL_9a7250;
LABEL_9a7290:
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_clnt.c", 3653, "tls_client_key_exchange_post_work");
            sub_9a58a4(a0, 80, 0x80106, 0);
            v2 = 0;
        }
    }
    else if (sub_970e80(a0))
    {
        return 1;
    }
    v14 = &a0->field_3b0;
    sub_a6c4e8(v2, v3, "ssl/statem/statem_clnt.c", 3700);
    *v14 = 0;
    v14[1] = 0;
    return 0;
}
