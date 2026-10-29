/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ac05c..0x9ac1cc (368 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ac05c_2 {
    char padding_0[8];
    long long field_8;
    char padding_10[752];
    struct st_9ac05c_0 *field_300;
    char padding_308[1528];
    struct st_9ac05c_1 *field_900;
} st_9ac05c_2;

typedef struct st_9ac05c_0 {
    char padding_0[28];
    unsigned int field_1c;
    unsigned int field_20;
} st_9ac05c_0;

typedef struct st_9ac05c_1 {
    char padding_0[704];
    long long field_2c0;
} st_9ac05c_1;


unsigned int sub_9ac05c(st_9ac05c_2 *a0)
{
    unsigned int v3;  // w21
    st_9ac05c_2 *v4;  // x19
    unsigned long long v13;  // 4110
    unsigned long long v14;  // 4102
    long long v15;  // x1
    long long v16;  // x2
    unsigned long v5;  // x20
    long long v6;  // x0
    unsigned int v7;  // x0
    unsigned long v8;  // x8
    unsigned long v9;  // cc_dep1
    unsigned long long v10;  // x10
    unsigned long long v11;  // 4110
    unsigned long long v12;  // 4102
    unsigned long long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0->field_300->field_20;
    if (!(v3 & 171))
        return 1;
    v4 = a0;
    v5 = a0->field_300->field_1c;
    v6 = sub_9af2b4();
    v7 = sub_959f90(v6, &v0, v4->field_8);
    if (v7 && !(v8 = *(int *)(v7 + 4), v9 = (unsigned int)v8 & v3, !((unsigned int)v8 & v3)))
    {
        v10 = v0;
        if (v5 & 65)
        {
            v11 = arm64g_calculate_condition(25, v9, 0, 0);
            v12 = arm64g_calculate_condition(20, (v11 & 1 ? v10 : 0x40000000), 0, 0);
            if (v12 & 1)
                goto LABEL_9ac128;
LABEL_9ac0c4:
            if (v5 >> 1 & 1 && !*(long long *)&v4->padding_308[472])
            {
                sub_a368c8();
                sub_a369bc("ssl/statem/statem_clnt.c", 4005, "ssl3_check_cert_and_algorithm");
                v15 = 80;
                v16 = 786691;
            }
            else if (!(v8 >> 3 & 1))
            {
                return 1;
            }
            else if (!*(long long *)&v4->field_900->padding_0[696])
            {
                if (sub_962378(v4->field_900->field_2c0, v4))
                    return 1;
                sub_a368c8();
                sub_a369bc("ssl/statem/statem_clnt.c", 4016, "ssl3_check_cert_and_algorithm");
                v15 = 40;
                v16 = 304;
            }
            else
            {
                return 1;
            }
        }
        else
        {
            v13 = arm64g_calculate_condition(25, v9, 0, 0);
            v14 = arm64g_calculate_condition(16, (v13 & 1 ? v10 : 0x40000000), 0, 0);
            if (!(v14 & 1))
                goto LABEL_9ac0c4;
LABEL_9ac128:
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_clnt.c", 4000, "ssl3_check_cert_and_algorithm");
            v15 = 40;
            v16 = 169;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_clnt.c", 3994, "ssl3_check_cert_and_algorithm");
        v15 = 40;
        v16 = 0xdd;
    }
    sub_9a58a4(v4, v15, v16, 0);
    return 0;
}
